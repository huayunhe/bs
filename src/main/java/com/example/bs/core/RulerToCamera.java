package com.example.bs.core;

import com.example.bs.entity.Camera;
import com.example.bs.entity.Ruler;

public class RulerToCamera {
    private Integer rulerId;

    private String rulerAdder;

    private Double rulerFortification;

    private Double rulerAlert;

    private Double rulerGuarantee;

    private Double rulerAverage;

    private Integer cameraId;

    public Integer getRulerId() {
        return rulerId;
    }

    public void setRulerId(Integer rulerId) {
        this.rulerId = rulerId;
    }

    public String getRulerAdder() {
        return rulerAdder;
    }

    public void setRulerAdder(String rulerAdder) {
        this.rulerAdder = rulerAdder;
    }

    public Double getRulerFortification() {
        return rulerFortification;
    }

    public void setRulerFortification(Double rulerFortification) {
        this.rulerFortification = rulerFortification;
    }

    public Double getRulerAlert() {
        return rulerAlert;
    }

    public void setRulerAlert(Double rulerAlert) {
        this.rulerAlert = rulerAlert;
    }

    public Double getRulerGuarantee() {
        return rulerGuarantee;
    }

    public void setRulerGuarantee(Double rulerGuarantee) {
        this.rulerGuarantee = rulerGuarantee;
    }

    public Double getRulerAverage() {
        return rulerAverage;
    }

    public void setRulerAverage(Double rulerAverage) {
        this.rulerAverage = rulerAverage;
    }

    public Integer getCameraId() {
        return cameraId;
    }

    public void setCameraId(Integer cameraId) {
        this.cameraId = cameraId;
    }

    public void setRulerToCamera(Ruler ruler, Camera camera) {
        this.rulerId = ruler.getRulerId();
        this.rulerAdder = camera.getCameraAdder();
        this.rulerFortification = ruler.getRulerFortification();
        this.rulerAlert = ruler.getRulerAlert();
        this.rulerGuarantee = ruler.getRulerGuarantee();
        this.rulerAverage = ruler.getRulerAverage();
        this.cameraId = camera.getCameraId();
    }

    @Override
    public String toString() {
        return "RulerToCamera{" +
                "rulerId=" + rulerId +
                ", rulerAdder='" + rulerAdder + '\'' +
                ", rulerFortification=" + rulerFortification +
                ", rulerAlert=" + rulerAlert +
                ", rulerGuarantee=" + rulerGuarantee +
                ", rulerAverage=" + rulerAverage +
                ", cameraId=" + cameraId +
                '}';
    }
}
