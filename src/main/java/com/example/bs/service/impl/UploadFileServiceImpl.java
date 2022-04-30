package com.example.bs.service.impl;

import com.example.bs.service.UploadFileService;
import com.example.bs.util.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
@Transactional
public class UploadFileServiceImpl implements UploadFileService {
    @Override
    public String uploadPicture(MultipartFile file, Integer pictureId) throws Exception {
        String path = pictureId + "_check";
        return FileUtils.uploadPicture(file,path);
    }
    @Override
    public String uploadVideoFloater(MultipartFile file, Integer videoFloaterId) throws Exception {
        String path = videoFloaterId + "_check";
        return FileUtils.uploadVideoFloater(file,path);
    }
    @Override
    public String uploadVideoWaterLevel(MultipartFile file, Integer videoId) throws Exception {
        String path = videoId + "_check";
        return FileUtils.uploadVideoWaterLevel(file,path);
    }
}
