package org.example;

public class Smartphone {

    private String processor;
    private String screen;
    private String battery;
    private String camera;
    private String operatingSystem;

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Smartphone [Processor=" + processor + ", Screen=" + screen +
                ", Battery=" + battery + ", Camera=" + camera +
                ", Operating System=" + operatingSystem + "]";
    }
}

