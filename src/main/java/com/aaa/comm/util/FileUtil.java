package com.aaa.comm.util;


import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.exception.CosClientException;
import com.qcloud.cos.exception.CosServiceException;
import com.qcloud.cos.model.ObjectMetadata;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.model.StorageClass;
import com.qcloud.cos.region.Region;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Company:AnXun
 * Author:wjw
 * Date: 2018/7/13
 * Description:文件（图片）上传工具类（腾讯云COS对象存储）
 */
public class FileUtil {
    /**
     * 上传图片
     * @param bucketName：存储桶名称
     * @param key：对象名称
     */
    public static URL imageUpload(String bucketName,String key,InputStream inputStream) throws IOException {
        COSClient cosclient = creatCOSClient();
        ObjectMetadata objectMetadata = new ObjectMetadata();
        // 从输入流上传必须制定content length, 否则http客户端可能会缓存所有数据，存在内存OOM的情况
        //取inputStream的长度作为上传文件的长度
        objectMetadata.setContentLength(inputStream.available());
        // 默认下载时根据cos路径key的后缀返回响应的contenttype, 上传时设置contenttype会覆盖默认值
        objectMetadata.setContentType("image/jpeg");
        PutObjectRequest putObjectRequest =
                new PutObjectRequest(bucketName, key, inputStream,objectMetadata);
        // 设置存储类型, 默认是标准(Standard), 低频(standard_ia)
        putObjectRequest.setStorageClass(StorageClass.Standard_IA);
        String etag = null;
        try {
            PutObjectResult putObjectResult = cosclient.putObject(putObjectRequest);
            // putobjectResult会返回文件的etag
            etag = putObjectResult.getETag();
        } catch (CosServiceException e) {
            e.printStackTrace();
        } catch (CosClientException e) {
            e.printStackTrace();
        }

        // 关闭客户端
        cosclient.shutdown();
        Date expiration = new Date(new Date().getTime() + 5 * 60 * 10000);
        URL url = cosclient.generatePresignedUrl(bucketName, key, expiration);
        return url;
    }

    /**
     * 随机生成图片名称
     * @return
     */
    public static String getRandomFileName() {

        SimpleDateFormat simpleDateFormat;

        simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

        Date date = new Date();

        String str = simpleDateFormat.format(date);

        Random random = new Random();

        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数

        return rannum + str;// 当前时间
    }


    private static COSClient creatCOSClient(){
        // 1 初始化用户身份信息(secretId, secretKey)
        COSCredentials cred = new BasicCOSCredentials("AKIDrUxCC4ue5JJ5bsvkNp4jHwDF1YeV3MhW", "pQmAbCeuvmPnSs3zg8MODrHTRirqCLHx");
        // 2 设置bucket的区域, COS地域的简称请参照 https://www.qcloud.com/document/product/436/6224
        ClientConfig clientConfig = new ClientConfig(new Region("ap-chengdu"));
        // 3 生成cos客户端
        COSClient cosclient = new COSClient(cred, clientConfig);
        return cosclient;
    }
}
