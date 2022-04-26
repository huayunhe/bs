package com.example.bs.entity;

public class VideoFloater {
    private Integer videoFloaterId;

    private String videoFloaterUrl;

    private Integer cameraId;

    public Integer getVideoFloaterId() {
        return videoFloaterId;
    }

    public void setVideoFloaterId(Integer videoFloaterId) {
        this.videoFloaterId = videoFloaterId;
    }

    public String getVideoFloaterUrl() {
        return videoFloaterUrl;
    }

    public void setVideoFloaterUrl(String videoFloaterUrl) {
        this.videoFloaterUrl = videoFloaterUrl == null ? null : videoFloaterUrl.trim();
    }

    public Integer getCameraId() {
        return cameraId;
    }

    public void setCameraId(Integer cameraId) {
        this.cameraId = cameraId;
    }
}