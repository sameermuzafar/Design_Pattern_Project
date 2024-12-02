package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    public void testFlagshipSmartphoneBuilder() {
        SmartphoneBuilder flagshipBuilder = new FlagshipSmartphoneBuilder();
        SmartphoneDirector director = new SmartphoneDirector(flagshipBuilder);
        Smartphone smartphone = director.constructSmartphone();

        System.out.println(smartphone.toString());


        assertEquals("Smartphone [Processor=Snapdragon 8 Gen 3, Screen=6.8-inch OLED Display, " +
                        "Battery=5000mAh, Camera=108MP Quad Camera, Operating System=Android]",
                smartphone.toString());
    }
    @Test
    public void testComponentUpdate() {
        SmartphoneBuilder budgetBuilder = new BudgetSmartphoneBuilder();
        SmartphoneDirector director = new SmartphoneDirector(budgetBuilder);
        Smartphone smartphone = director.constructSmartphone();

        System.out.println(smartphone.toString());

        smartphone.setOperatingSystem("iOS");
        assertEquals("Smartphone [Processor=Snapdragon 8 Gen 3, Screen=6.8-inch OLED Display, " +
                        "Battery=5000mAh, Camera=108MP Quad Camera, Operating System=iOS]",
                smartphone.toString());
    }
}