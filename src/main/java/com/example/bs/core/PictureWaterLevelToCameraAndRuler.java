package com.example.bs.core;

import com.example.bs.entity.Camera;
import com.example.bs.entity.PictureWaterLevel;

public class PictureWaterLevelToCameraAndRuler {
    private Integer pictureId;

    private String pictureUrl;

    private Integer cameraId;

    private Integer rulerId;

    private String cameraAdder;

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
        this.pictureUrl = pictureUrl;
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

    public void setPictureWaterLevelToCameraAndRuler(PictureWaterLevel pictureWaterLevel, Camera camera) {
        this.pictureId = pictureWaterLevel.getPictureId();
        this.pictureUrl = pictureWaterLevel.getPictureUrl();
        this.cameraId = pictureWaterLevel.getCameraId();
        this.rulerId = pictureWaterLevel.getRulerId();
        this.cameraAdder = camera.getCameraAdder();
    }
}
