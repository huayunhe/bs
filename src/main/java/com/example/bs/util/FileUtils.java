package com.example.bs.util;

import org.springframework.util.ClassUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 文件上传工具包
 */
public class FileUtils {
    /**
     * @param file     文件
     * @param path     文件存放路径
     *
     * @return
     */
    public static String uploadPicture(MultipartFile file, String path) throws Exception{
        //获得文件原始文件名
        String fileName = file.getOriginalFilename();

        //判断是否是图片
        if(!fileName.matches("^.*(png|jpg)$")){
            //不是图片类型
            throw new Exception("请确认上传的照片为png、jpg格式");
        }

        //输出目录为classes/static的目录
        //String basePath = ClassUtils.getDefaultClassLoader().getResource("").getPath()+"static";
        //绝对路径
        String basePath = "G:/ssd/pictureWaterLevel";

        //存放数据库的文件夹路径
        String serviceName = path + "/" + fileName;
        String serviceUrl = "localhost:8084/";//服务器地址

        String realPath = basePath + "/" + serviceName;
        File dest = new File(realPath);
        //判断文件父目录是否存在
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }
        try {
            //保存文件
            file.transferTo(dest);
            return serviceUrl+serviceName;
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * @param file     文件
     * @param path     文件存放路径
     *
     * @return
     */
    public static String uploadVideoFloater(MultipartFile file, String path) throws Exception{
        //获得文件原始文件名
        String fileName = file.getOriginalFilename();

        //判断是否是图片
        if(!fileName.matches("^.*(avi|mp4|wmv)$")){
            //不是图片类型
            throw new Exception("请确认上传的照片为avi、mp4、wmv格式");
        }

        //输出目录为classes/static的目录
        //String basePath = ClassUtils.getDefaultClassLoader().getResource("").getPath()+"static";
        //绝对路径
        String basePath = "G:/Flow/video";

        //存放数据库的文件夹路径
        String serviceName = path + "/" + fileName;
        String serviceUrl = "localhost:8084/";//服务器地址

        String realPath = basePath + "/" + serviceName;
        File dest = new File(realPath);
        //判断文件父目录是否存在
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }
        try {
            //保存文件
            file.transferTo(dest);
            return serviceUrl+serviceName;
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * @param file     文件
     * @param path     文件存放路径
     *
     * @return
     */
    public static String uploadVideoWaterLevel(MultipartFile file, String path) throws Exception{
        //获得文件原始文件名
        String fileName = file.getOriginalFilename();

        //判断是否是图片
        if(!fileName.matches("^.*(avi|mp4|wmv)$")){
            //不是图片类型
            throw new Exception("请确认上传的照片为avi、mp4、wmv格式");
        }

        //输出目录为classes/static的目录
        //String basePath = ClassUtils.getDefaultClassLoader().getResource("").getPath()+"static";
        //绝对路径
        String basePath = "G:/ssd/videoWaterLevel";

        //存放数据库的文件夹路径
        String serviceName = path + "/" + fileName;
        String serviceUrl = "localhost:8084/";//服务器地址

        String realPath = basePath + "/" + fileName;
        File dest = new File(realPath);
        //判断文件父目录是否存在
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }
        try {
            //保存文件
            file.transferTo(dest);
            return serviceUrl+serviceName;
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}

