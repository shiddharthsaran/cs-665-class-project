/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: Main.java
 * Description: Main class to interactively build custom SF90 cars and print their configurations.
 */
package edu.bu.met.cs665;
import java.util.Scanner;
import edu.bu.met.cs665.SF90Builders.SF90Builder;
import edu.bu.met.cs665.SF90Builders.SF90ManualBuilder;
import edu.bu.met.cs665.SF90Car.SF90Car;
import edu.bu.met.cs665.SF90Car.SF90Manual;
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

public class Main {
    /**
     * Gets user input within a specified range.
     * @param min The minimum allowed input value.
     * @param max The maximum allowed input value.
     * @param usrQues The question to prompt the user.
     * @return The user's validated input.
     */
    public static int getUserInp(int min, int max, String usrQues){
        Scanner inpObj = new Scanner(System.in);
        while (true){
            System.out.println(usrQues);
            int usrInp = inpObj.nextInt();
            if (usrInp >= min && usrInp <=max){
                return usrInp;
            }

        }
    }
    public static void main(String[] args){
        // Create instances of SF90Builder and SF90ManualBuilder
        SF90Builder customSF90Builder = new SF90Builder();
        SF90ManualBuilder customSF90ManualBuilder = new SF90ManualBuilder();
        // Let the user choose starting configuration

        int staringConfigUsrOpt = getUserInp(1, 2, "Choose SF90 Stradale Starting Configuration:\n1. Basic Starting Configuration\n2. Assetto Fiorano\n");
        if (staringConfigUsrOpt == 1){
            customSF90Builder.setStartingConfig(new BasicStartingConfiguration());
            customSF90ManualBuilder.setStartingConfig(new BasicStartingConfiguration());
        } else if (staringConfigUsrOpt == 2) {
            customSF90Builder.setStartingConfig(new AssettoFioranoStartingConfiguration());
            customSF90ManualBuilder.setStartingConfig(new AssettoFioranoStartingConfiguration());
        }
        // Repeat the process for all configurable options
        int paintWorkUsrOpt = getUserInp(1, 4, "Choose SF90 Stradale Paint Work:\n1. Giallo Modena\n2. Grigio Ingrid\n3. Rosso Dino\n4. Rosso Ferrari F1-75\n");
        if (paintWorkUsrOpt == 1){
            customSF90Builder.setPaintWork(new GialloModenaPaintWork());
            customSF90ManualBuilder.setPaintWork(new GialloModenaPaintWork());
        } else if (paintWorkUsrOpt == 2) {
            customSF90Builder.setPaintWork(new GrigioIngridPaintWork());
            customSF90ManualBuilder.setPaintWork(new GrigioIngridPaintWork());
        } else if (paintWorkUsrOpt == 3){
            customSF90Builder.setPaintWork(new RossoDinoPaintWork());
            customSF90ManualBuilder.setPaintWork(new RossoDinoPaintWork());
        } else if (paintWorkUsrOpt == 4) {
            customSF90Builder.setPaintWork(new RossoFerrariPaintWork());
            customSF90ManualBuilder.setPaintWork(new RossoFerrariPaintWork());
        }

        int roofUsrOpt = getUserInp(1, 2, "Choose SF90 Stradale Roof:\n1. Default\n2. Nero");
        if (roofUsrOpt == 1){
            customSF90Builder.setRoof(new DefaultRoof());
            customSF90ManualBuilder.setRoof(new DefaultRoof());
        } else if (roofUsrOpt == 2) {
            customSF90Builder.setRoof(new NeroRoof());
            customSF90ManualBuilder.setRoof(new NeroRoof());
        }

        int engineBayUsrOpt = getUserInp(1, 2, "Choose SF90 Stradale Engine Bay:\n1. Default\n2. Carbon");
        if (engineBayUsrOpt == 1){
            customSF90Builder.setEngineBay(new DefaultEngineBay());
            customSF90ManualBuilder.setEngineBay(new DefaultEngineBay());
        } else if (engineBayUsrOpt == 2) {
            customSF90Builder.setEngineBay(new CarbonEngineBay());
            customSF90ManualBuilder.setEngineBay(new CarbonEngineBay());
        }

        int wheelsUsrOpt = getUserInp(1, 3, "Choose SF90 Stradale Wheels:\n1. Standard Rims\n2. Forged Silver Rims\n3. Carbon Fibre");
        if (wheelsUsrOpt == 1){
            customSF90Builder.setWheels(new StandardRimsWheels());
            customSF90ManualBuilder.setWheels(new StandardRimsWheels());
        } else if (wheelsUsrOpt == 2) {
            customSF90Builder.setWheels(new ForgedSilverRimsWheels());
            customSF90ManualBuilder.setWheels(new ForgedSilverRimsWheels());
        } else if (wheelsUsrOpt == 3) {
            customSF90Builder.setWheels(new CarbonFibreWheels());
            customSF90ManualBuilder.setWheels(new CarbonFibreWheels());
        }

        int calipersUsrOpt = getUserInp(1, 2, "Choose SF90 Stradale Calipers:\n1. Aluminium Brake Calipers\n2. Rosso Corsa Brake Calipers");
        if (calipersUsrOpt == 1){
            customSF90Builder.setCalipers(new AluminiumBrakeCalipers());
            customSF90ManualBuilder.setCalipers(new AluminiumBrakeCalipers());
        } else if (calipersUsrOpt == 2) {
            customSF90Builder.setCalipers(new RossoCorsaBrakeCalipers());
            customSF90ManualBuilder.setCalipers(new RossoCorsaBrakeCalipers());
        }

        int bodyWorkElementsUsrOpt = getUserInp(1, 2, "Choose SF90 Stradale Body Work Elements:\n1. Default\n2. Carbon Exterior");
        if (bodyWorkElementsUsrOpt == 1){
            customSF90Builder.setBodyWorkElements(new DefaultBodyWorkElement());
            customSF90ManualBuilder.setBodyWorkElements(new DefaultBodyWorkElement());
        } else if (bodyWorkElementsUsrOpt == 2) {
            customSF90Builder.setBodyWorkElements(new CarbonExteriorBodyWorkElement());
            customSF90ManualBuilder.setBodyWorkElements(new CarbonExteriorBodyWorkElement());
        }

        int exhaustPipesUsrOpt = getUserInp(1, 3, "Choose SF90 Stradale Exhaust Pipe:\n1. Standard\n2. Titanium\n3. Black Ceramic");
        if (exhaustPipesUsrOpt == 1){
            customSF90Builder.setExhaustPipes(new StandardExhaustPipe());
            customSF90ManualBuilder.setExhaustPipes(new StandardExhaustPipe());
        } else if (exhaustPipesUsrOpt == 2) {
            customSF90Builder.setExhaustPipes(new TitaniumExhaustPipe());
            customSF90ManualBuilder.setExhaustPipes(new TitaniumExhaustPipe());
        } else if (exhaustPipesUsrOpt == 3) {
            customSF90Builder.setExhaustPipes(new BlackCeramicExhaustPipe());
            customSF90ManualBuilder.setExhaustPipes(new BlackCeramicExhaustPipe());
        }

        int seatTypeUsrOpt = getUserInp(1, 4, "Choose SF90 Stradale Seat Type:\n1. Standard\n2. Daytona\n3. Standard Racing Carbon\n4. Daytona Racing Carbon");
        if (seatTypeUsrOpt == 1){
            customSF90Builder.setSeatsType(new StandardSeatType());
            customSF90ManualBuilder.setSeatsType(new StandardSeatType());
        } else if (seatTypeUsrOpt == 2) {
            customSF90Builder.setSeatsType(new DaytonaSeatType());
            customSF90ManualBuilder.setSeatsType(new DaytonaSeatType());
        } else if (seatTypeUsrOpt == 3) {
            customSF90Builder.setSeatsType(new StandardRacingCarbonSeatType());
            customSF90ManualBuilder.setSeatsType(new StandardRacingCarbonSeatType());
        } else if (seatTypeUsrOpt == 4) {
            customSF90Builder.setSeatsType(new DaytonaRacingCarbonSeatType());
            customSF90ManualBuilder.setSeatsType(new DaytonaRacingCarbonSeatType());
        }

        int interiorColorUsrOpt = getUserInp(1, 3, "Choose SF90 Stradale Interior Color:\n1. Tortora\n2. Nero\n3. Charcoal");
        if (interiorColorUsrOpt == 1){
            customSF90Builder.setInteriorColor(new TortoraInteriorColor());
            customSF90ManualBuilder.setInteriorColor(new TortoraInteriorColor());
        } else if (interiorColorUsrOpt == 2) {
            customSF90Builder.setInteriorColor(new NeroInteriorColor());
            customSF90ManualBuilder.setInteriorColor(new NeroInteriorColor());
        } else if (interiorColorUsrOpt == 3) {
            customSF90Builder.setInteriorColor(new CharcoalInteriorColor());
            customSF90ManualBuilder.setInteriorColor(new CharcoalInteriorColor());
        }

        int interiorDetailUsrOpt = getUserInp(1, 2, "Choose SF90 Stradale Interior Detail:\n1. Default\n2. Carbon");
        if (interiorDetailUsrOpt == 1){
            customSF90Builder.setInteriorDetail(new DefaultInteriorDetail());
            customSF90ManualBuilder.setInteriorDetail(new DefaultInteriorDetail());
        } else if (interiorDetailUsrOpt == 2) {
            customSF90Builder.setInteriorColor(new CarbonInteriorDetail());
            customSF90ManualBuilder.setInteriorColor(new CarbonInteriorDetail());
        }

        int carpetsUsrOpt = getUserInp(1, 2, "Choose SF90 Stradale Carpet:\n1. Nero\n2. Alcantara Inserts");
        if (carpetsUsrOpt == 1){
            customSF90Builder.setCarpets(new NeroCarpet());
            customSF90ManualBuilder.setCarpets(new NeroCarpet());
        } else if (carpetsUsrOpt == 2) {
            customSF90Builder.setCarpets(new AlcantaraInsertsCarpet());
            customSF90ManualBuilder.setCarpets(new AlcantaraInsertsCarpet());
        }
        // Finally, get the constructed SF90Car and SF90Manual objects and print their configurations
        SF90Car customSF90Car = customSF90Builder.getSF90ConfigCar();
        System.out.println(customSF90Car.getStartingConfig());

        SF90Manual customSF90CarManual = customSF90ManualBuilder.getSF90Manual();
        System.out.println(customSF90CarManual.printManual());


    }
}
