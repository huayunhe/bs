package com.example.bs.entity;

public class PictureWaterLevel {
    private Integer pictureId;

    private String pictureUrl;

    private Integer cameraId;

    private Integer rulerId;

    public Integer getPictureId() {
        return pictureId;
    }

    public void setPictureId(Integer pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
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