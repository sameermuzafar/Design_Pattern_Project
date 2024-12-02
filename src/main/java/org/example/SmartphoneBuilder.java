package org.example;

public interface SmartphoneBuilder {

    void setProcessor(String processor);
    void setScreen(String screen);
    void setBattery(String battery);
    void setCamera(String camera);
    void setOperatingSystem(String operatingSystem);
    Smartphone build();
}