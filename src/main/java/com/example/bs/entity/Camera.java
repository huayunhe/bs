package com.example.bs.entity;

public class Camera {
    private Integer cameraId;

    private String cameraAdder;

    private Boolean cameraType;

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

    public Boolean getCameraType() {
        return cameraType;
    }

    public void setCameraType(Boolean cameraType) {
        this.cameraType = cameraType;
    }
}