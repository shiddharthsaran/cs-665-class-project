/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: SF90Manual.java
 * Description: SF90Manual class represents a manual for SF90 car configuration, providing details of various options.
 */
package edu.bu.met.cs665.SF90Car;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class SF90Manual {
    // Attributes to store different components of the car configuration
    private final SF90OptionsStrategyInterface startingConfig;
    private final SF90OptionsStrategyInterface paintWork;
    private final SF90OptionsStrategyInterface roof;
    private final SF90OptionsStrategyInterface engineBay;
    private final SF90OptionsStrategyInterface wheels;
    private final SF90OptionsStrategyInterface calipers;
    private final SF90OptionsStrategyInterface bodyWorkElements;
    private final SF90OptionsStrategyInterface exhaustPipes;
    private final SF90OptionsStrategyInterface seatsType;
    private final SF90OptionsStrategyInterface interiorColor;
    private final SF90OptionsStrategyInterface interiorDetail;
    private final SF90OptionsStrategyInterface carpets;
    /**
     * Constructor to initialize SF90Manual object with the configured options.
     * @param startingConfig The starting configuration option.
     * @param paintWork The paint work option.
     * @param roof The roof option.
     * @param engineBay The engine bay option.
     * @param wheels The wheels option.
     * @param calipers The calipers option.
     * @param bodyWorkElements The body work elements option.
     * @param exhaustPipes The exhaust pipes option.
     * @param seatsType The seats type option.
     * @param interiorColor The interior color option.
     * @param interiorDetail The interior detail option.
     * @param carpets The carpets option.
     */
    public SF90Manual(SF90OptionsStrategyInterface startingConfig, SF90OptionsStrategyInterface paintWork,
                   SF90OptionsStrategyInterface roof, SF90OptionsStrategyInterface engineBay,
                   SF90OptionsStrategyInterface wheels, SF90OptionsStrategyInterface calipers,
                   SF90OptionsStrategyInterface bodyWorkElements, SF90OptionsStrategyInterface exhaustPipes,
                   SF90OptionsStrategyInterface seatsType, SF90OptionsStrategyInterface interiorColor,
                   SF90OptionsStrategyInterface interiorDetail, SF90OptionsStrategyInterface carpets){
        this.startingConfig = startingConfig;
        this.paintWork = paintWork;
        this.roof = roof;
        this.engineBay = engineBay;
        this.wheels = wheels;
        this.calipers = calipers;
        this.bodyWorkElements = bodyWorkElements;
        this.exhaustPipes = exhaustPipes;
        this.seatsType = seatsType;
        this.interiorColor = interiorColor;
        this.interiorDetail = interiorDetail;
        this.carpets = carpets;
    }
    /**
     * Method to generate and return a string containing the manual information.
     * @return A string containing the manual information.
     */
    public String printManual(){
        // Construct the manual information with details of various car components
        String sf90ConfigInfo = "";
        sf90ConfigInfo += "Starting Configuration: " + startingConfig.getOptionDetails() + "\n";
        sf90ConfigInfo += "Paint Work: " + paintWork.getOptionDetails() + "\n";
        sf90ConfigInfo += "Roof: " + roof.getOptionDetails() + "\n";
        sf90ConfigInfo += "Engine Bay: " + engineBay.getOptionDetails() + "\n";
        sf90ConfigInfo += "Wheels: " + wheels.getOptionDetails() + "\n";
        sf90ConfigInfo += "Calipers: " + calipers.getOptionDetails() + "\n";
        sf90ConfigInfo += "Body Work Elements: " + bodyWorkElements.getOptionDetails() + "\n";
        sf90ConfigInfo += "Exhaust Pipes: " + exhaustPipes.getOptionDetails() + "\n";
        sf90ConfigInfo += "Seats Type: " + seatsType.getOptionDetails() + "\n";
        sf90ConfigInfo += "Interior Color: " + interiorColor.getOptionDetails() + "\n";
        sf90ConfigInfo += "Interior Detail: " + interiorDetail.getOptionDetails() + "\n";
        sf90ConfigInfo += "Carpets: " + carpets.getOptionDetails() + "\n";
        return sf90ConfigInfo;
    }
}
