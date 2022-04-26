package com.example.bs.core;

import com.example.bs.entity.Camera;
import com.example.bs.entity.VideoFloater;

public class VideoFloaterToCamera {
    private Integer videoFloaterId;

    private String videoFloaterUrl;

    private Integer cameraId;

    private String cameraAdder;

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
        this.videoFloaterUrl = videoFloaterUrl;
    }

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
        this.cameraAdder = cameraAdder;
    }

    public void setVideoFloaterToCamera(VideoFloater videoFloater, Camera camera) {
        this.videoFloaterId = videoFloater.getVideoFloaterId();
        this.videoFloaterUrl = videoFloater.getVideoFloaterUrl();
        this.cameraId = videoFloater.getCameraId();
        this.cameraAdder = camera.getCameraAdder();
    }
}
