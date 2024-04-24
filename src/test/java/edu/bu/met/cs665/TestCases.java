/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: TestCases.java
 * Description: TestCases class contains unit tests for the SF90Builder, SF90Director, and SF90OptionsStrategyInterface.
 */
package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.SF90Builders.SF90Builder;
import edu.bu.met.cs665.SF90Car.SF90Car;
import edu.bu.met.cs665.SF90Director.SF90Director;
import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;
import edu.bu.met.cs665.SF90ConfigOptions.StartingConfigurations.*;
import edu.bu.met.cs665.SF90ConfigOptions.PaintWorks.*;
import edu.bu.met.cs665.SF90ConfigOptions.Roofs.*;
import edu.bu.met.cs665.SF90ConfigOptions.EngineBay.*;
import edu.bu.met.cs665.SF90ConfigOptions.Wheels.*;
import edu.bu.met.cs665.SF90ConfigOptions.Calipers.*;
import edu.bu.met.cs665.SF90ConfigOptions.BodyWorkElements.*;
import edu.bu.met.cs665.SF90ConfigOptions.ExhaustPipes.*;
import edu.bu.met.cs665.SF90ConfigOptions.SeatTypes.*;
import edu.bu.met.cs665.SF90ConfigOptions.InteriorColors.*;
import edu.bu.met.cs665.SF90ConfigOptions.InteriorDetails.*;
import edu.bu.met.cs665.SF90ConfigOptions.Carpets.*;

import org.junit.Test;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestCases {

    public TestCases() {
    }
    /**
     * Test method to verify the configuration of an Ultimate SF90 Car using the SF90Builder.
     */
    @Test
    public void testSF90Dictator() {

        SF90Director director = new SF90Director();
        SF90Builder builder = new SF90Builder();
        director.UltimateSF90(builder);
        SF90Car SF90UltimateCar = builder.getSF90ConfigCar();
        assertEquals(SF90UltimateCar.getSeatsType(),"Type: Daytona Racing Carbon, Information: Combines the Daytona design with lightweight carbon fiber construction, offering enhanced support and aesthetics tailored for the Ferrari SF90, ideal for track-focused driving experiences.");

    }

    /**
     * Test method to validate setting and getting option details using SF90OptionsStrategyInterface.
     */
    @Test
    public void testSetOption() {
        SF90OptionsStrategyInterface defaultEngineBay = new DefaultEngineBay();
        assertEquals(defaultEngineBay.getOptionDetails(),"Type: Default, Information: Standard engine bay configuration, features components made from materials such as aluminum and other alloys commonly used in automotive manufacturing.");
        defaultEngineBay.setOptionType("SuperDefault");
        defaultEngineBay.setOptionInfo("Default Info.");
        assertEquals(defaultEngineBay.getOptionDetails(),"Type: SuperDefault, Information: Default Info.");

    }
    /**
     * Test method to validate the customization of an SF90 Car using the SF90Builder.
     */

    @Test
    public void testSF90Builder() {
        SF90Builder customSF90Builder = new SF90Builder();
        customSF90Builder.setStartingConfig(new AssettoFioranoStartingConfiguration());
        customSF90Builder.setPaintWork(new RossoFerrariPaintWork());
        customSF90Builder.setRoof(new NeroRoof());
        customSF90Builder.setEngineBay(new CarbonEngineBay());
        customSF90Builder.setWheels(new CarbonFibreWheels());
        customSF90Builder.setCalipers(new RossoCorsaBrakeCalipers());
        customSF90Builder.setBodyWorkElements(new CarbonExteriorBodyWorkElement());
        customSF90Builder.setExhaustPipes(new TitaniumExhaustPipe());
        customSF90Builder.setSeatsType(new DaytonaRacingCarbonSeatType());
        customSF90Builder.setInteriorColor(new NeroInteriorColor());
        customSF90Builder.setInteriorColor(new CarbonInteriorDetail());
        customSF90Builder.setCarpets(new AlcantaraInsertsCarpet());
        SF90Car customSF90Car = customSF90Builder.getSF90ConfigCar();
        assertEquals(customSF90Car.getSeatsType(),"Type: Daytona Racing Carbon, Information: Combines the Daytona design with lightweight carbon fiber construction, offering enhanced support and aesthetics tailored for the Ferrari SF90, ideal for track-focused driving experiences.");
        SF90OptionsStrategyInterface customSeatType = new DaytonaRacingCarbonSeatType();
        customSeatType.setOptionInfo("Daytona New Racing Seat.");
        customSeatType.setOptionType("Racing");
        customSF90Builder.setSeatsType(customSeatType);
        SF90Car updatedCustomSF90Car = customSF90Builder.getSF90ConfigCar();
        assertEquals(updatedCustomSF90Car.getSeatsType(),"Type: Racing, Information: Daytona New Racing Seat.");


    }





}
