package org.example;

public class SmartphoneDirector {

    private SmartphoneBuilder smartphoneBuilder;

    public SmartphoneDirector(SmartphoneBuilder smartphoneBuilder) {
        this.smartphoneBuilder = smartphoneBuilder;
    }

    public Smartphone constructSmartphone() {
        smartphoneBuilder.setProcessor("Snapdragon 8 Gen 3");
        smartphoneBuilder.setScreen("6.8-inch OLED Display");
        smartphoneBuilder.setBattery("5000mAh");
        smartphoneBuilder.setCamera("108MP Quad Camera");
        smartphoneBuilder.setOperatingSystem("Android");
        return smartphoneBuilder.build();
    }
}