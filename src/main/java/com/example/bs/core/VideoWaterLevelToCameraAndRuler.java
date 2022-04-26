package com.example.bs.core;

import com.example.bs.entity.Camera;
import com.example.bs.entity.VideoWaterLevel;

public class VideoWaterLevelToCameraAndRuler {
    private Integer videoId;

    private String videoUrl;

    private Integer cameraId;

    private Integer rulerId;

    private String cameraAdder;

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Integer getCameraId() {
        return cameraId;
    }

    public void setCameraId(Integer cameraId) {
        this.cameraId = cameraId;
    }

    public Integer getRulerId() {
        return rulerId;
    }

    public void setRulerId(Integer rulerId) {
        this.rulerId = rulerId;
    }

    public String getCameraAdder() {
        return cameraAdder;
    }

    public void setCameraAdder(String cameraAdder) {
        this.cameraAdder = cameraAdder;
    }

    public void setVideoWaterLevelToCameraAndRuler(VideoWaterLevel videoWaterLevel, Camera camera) {
        this.videoId = videoWaterLevel.getVideoId();
        this.videoUrl = videoWaterLevel.getVideoUrl();
        this.cameraId = videoWaterLevel.getCameraId();
        this.rulerId = videoWaterLevel.getRulerId();
        this.cameraAdder = camera.getCameraAdder();
    }
}
