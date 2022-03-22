package com.example.bs.entity;

public class Camera {
    private Integer cameraId;

    private String cameraAdder;

    private Integer cameraNember;

    private Integer videoId;

    public Integer getCameraId() {
        return cameraId;
    }

    public void setCameraId(Integer cameraId) {
        this.cameraId = cameraId;
    }

    public String getCameraAdder() {
        return cameraAdder;
    }

    public void setCameraAdder(String cameraAdder) {
        this.cameraAdder = cameraAdder == null ? null : cameraAdder.trim();
    }

    public Integer getCameraNember() {
        return cameraNember;
    }

    public void setCameraNember(Integer cameraNember) {
        this.cameraNember = cameraNember;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }
}