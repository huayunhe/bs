package com.example.bs.entity;

public class VideoWaterLevel {
    private Integer videoId;

    private String videoUrl;

    private Integer cameraId;

    private Integer rulerId;

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
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
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
}