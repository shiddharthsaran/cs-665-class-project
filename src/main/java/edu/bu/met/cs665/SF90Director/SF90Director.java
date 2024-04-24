/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: SF90Director.java
 * Description: SF90Director class directs the construction of SF90Car objects with predefined configurations.
 */
package edu.bu.met.cs665.SF90Director;
import edu.bu.met.cs665.SF90Builders.SF90Builder;
import edu.bu.met.cs665.SF90Builders.SF90BuilderInterface;
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



public class SF90Director {
    /**
     * Method to construct a basic SF90Car configuration.
     * @param basicSF90 The builder for the basic SF90Car configuration.
     */
    public void BasicSF90Car(SF90BuilderInterface basicSF90){
        basicSF90.setStartingConfig(new BasicStartingConfiguration());
        basicSF90.setPaintWork(new GialloModenaPaintWork());
        basicSF90.setRoof(new DefaultRoof());
        basicSF90.setEngineBay(new DefaultEngineBay());
        basicSF90.setWheels(new StandardRimsWheels());
        basicSF90.setCalipers(new AluminiumBrakeCalipers());
        basicSF90.setBodyWorkElements(new DefaultBodyWorkElement());
        basicSF90.setExhaustPipes(new StandardExhaustPipe());
        basicSF90.setSeatsType(new StandardSeatType());
        basicSF90.setInteriorColor(new CharcoalInteriorColor());
        basicSF90.setInteriorDetail(new DefaultInteriorDetail());
        basicSF90.setCarpets(new NeroCarpet());
    }
    /**
     * Method to construct an ultimate SF90Car configuration.
     * @param ultimateSF90 The builder for the ultimate SF90Car configuration.
     */
    public void UltimateSF90(SF90BuilderInterface ultimateSF90){
        ultimateSF90.setStartingConfig(new AssettoFioranoStartingConfiguration());
        ultimateSF90.setPaintWork(new RossoFerrariPaintWork());
        ultimateSF90.setRoof(new NeroRoof());
        ultimateSF90.setEngineBay(new CarbonEngineBay());
        ultimateSF90.setWheels(new CarbonFibreWheels());
        ultimateSF90.setCalipers(new RossoCorsaBrakeCalipers());
        ultimateSF90.setBodyWorkElements(new CarbonExteriorBodyWorkElement());
        ultimateSF90.setExhaustPipes(new BlackCeramicExhaustPipe());
        ultimateSF90.setSeatsType(new DaytonaRacingCarbonSeatType());
        ultimateSF90.setInteriorColor(new NeroInteriorColor());
        ultimateSF90.setInteriorDetail(new CarbonInteriorDetail());
        ultimateSF90.setCarpets(new AlcantaraInsertsCarpet());
    }
}
