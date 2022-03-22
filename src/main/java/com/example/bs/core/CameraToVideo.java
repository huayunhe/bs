package com.example.bs.core;

import com.example.bs.entity.Camera;
import com.example.bs.entity.Video;

public class CameraToVideo {
    private String cameraAdder;
    private Integer cameraNumber;
    private String videoName;
    private Integer videoId;
    private Integer cameraId;
    private String videoUrl;

    public String getCameraAdder() {
        return cameraAdder;
    }

    public void setCameraAdder(String cameraAdder) {
        this.cameraAdder = cameraAdder;
    }

    public Integer getCameraNumber() {
        return cameraNumber;
    }

    public void setCameraNumber(Integer cameraNumber) {
        this.cameraNumber = cameraNumber;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getCameraId() {
        return cameraId;
    }

    public void setCameraId(Integer cameraId) {
        this.cameraId = cameraId;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public void setCameraToVideo(Camera camera, Video video){
        this.cameraAdder=camera.getCameraAdder();
        this.cameraId=camera.getCameraId();
        this.cameraNumber=camera.getCameraNumber();
        this.videoId=video.getVideoId();
        this.videoName=video.getVideoName();
        this.videoUrl=video.getVideoUrl();
    }
}
