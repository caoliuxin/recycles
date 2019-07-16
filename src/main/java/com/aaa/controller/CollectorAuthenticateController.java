package com.aaa.controller;

import com.aaa.comm.util.FileUtil;
import com.aaa.entity.CollectorAuthenticate;
import com.aaa.entity.User;
import com.aaa.service.CollectorAuthenticateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

@Controller
public class CollectorAuthenticateController {
    @Resource
    private CollectorAuthenticateService service;

    /**
     * 回收员身份认证
     * @return
     */
    @RequestMapping("upoladAuthenticate")
    public String upoladAuthenticate(HttpSession session,CollectorAuthenticate collectorAuthenticate, MultipartFile[] file) throws IOException {
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
        User users= (User) session.getAttribute("user");
        //根据用户id查询身份认证记录
        Map<String,Object> auth=service.checkAuthenticate(users.getId());
        if(auth != null){
            collectorAuthenticate.setId((int)auth.get("id"));
            //如果已经有认证记录，就修改认证
            service.updateCollectorAuthen(collectorAuthenticate);
        }else{
            service.collectorAuthenticate(collectorAuthenticate);
        }
        return "redirect:/checkAuthenticate";
    }

    /**
     * 根据用户id查询是否已有认证记录
     * @param session
     * @param request
     * @return
     */
    @RequestMapping("checkAuthenticate")
    public  String checkAuthenticate(HttpSession session,HttpServletRequest request){
        User users= (User) session.getAttribute("user");
        //根据用户id查询身份认证记录
        Map<String,Object> auth=service.checkAuthenticate(users.getId());
        request.setAttribute("checkAuth",auth);
        return "collectorAuthenticate";
    }

}
