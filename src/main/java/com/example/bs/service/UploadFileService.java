package com.example.bs.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadFileService {
    String uploadPicture(MultipartFile file, Integer pictureId) throws Exception;
    String uploadVideoFloater(MultipartFile file, Integer videoFloaterId) throws Exception;
    String uploadVideoWaterLevel(MultipartFile file, Integer videoId) throws Exception;
}
