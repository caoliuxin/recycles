package com.aaa.controller;

import com.aaa.comm.util.FileUtil;
import com.aaa.entity.CollectorAuthenticate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

@RestController
public class TestFileUploadController {

    //上传文件代码
    @RequestMapping("uploadImage")
    public void uploadImage(CollectorAuthenticate collectorAuthenticate, MultipartFile [] file) throws IOException {
        if(file.length != 3){
            //图片没有选择完
        }
        for(int i=0;i<file.length;i++){
            if (file[i] != null) {
                InputStream uploadInputStream = file[i].getInputStream();
                //bucketName 这个时  上传到存储桶中哪个文件夹
                String bucketName = "caoliuxin-1259531972";
                String key = "testImage/" + FileUtil.getRandomFileName() + ".png";
                URL url = FileUtil.imageUpload(bucketName, key, uploadInputStream);
                if (url != null) {
                    String fileName = "https://" + url.getHost() + url.getPath();
                    //  filename  就是上传之后  的文件名字  也就时图片名字
                    if(i == 0){
                        System.out.println("头像："+fileName);
                        collectorAuthenticate.setHeadurl(fileName);
                    }
                    if(i == 1){
                        System.out.println("身份证正面："+fileName);
                        collectorAuthenticate.setIdcardfront(fileName);
                    }
                    if(i == 2){
                        System.out.println("身份证反面："+fileName);
                        collectorAuthenticate.setIdcardreverse(fileName);
                    }
                }
            }
        }

    }
}
