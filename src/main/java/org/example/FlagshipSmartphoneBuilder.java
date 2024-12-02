package org.example;

public class FlagshipSmartphoneBuilder implements SmartphoneBuilder {

    private Smartphone smartphone;

    public FlagshipSmartphoneBuilder() {
        this.smartphone = new Smartphone();
    }

    @Override
    public void setProcessor(String processor) {
        smartphone.setProcessor(processor);
    }

    @Override
    public void setScreen(String screen) {
        smartphone.setScreen(screen);
    }

    @Override
    public void setBattery(String battery) {
        smartphone.setBattery(battery);
    }

    @Override
    public void setCamera(String camera) {
        smartphone.setCamera(camera);
    }

    @Override
    public void setOperatingSystem(String operatingSystem) {
        smartphone.setOperatingSystem(operatingSystem);
    }

    @Override
    public Smartphone build() {
        return this.smartphone;
    }
}
