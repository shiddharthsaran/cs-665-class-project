/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: SF90Car.java
 * Description: SF90Car class represents an SF90 car with various configurable options.
 */

package edu.bu.met.cs665.SF90Car;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class SF90Car {
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
     * Constructor to initialize SF90Car object with the configured options.
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
    public SF90Car(SF90OptionsStrategyInterface startingConfig, SF90OptionsStrategyInterface paintWork,
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
     * Getter method to retrieve details of the starting configuration.
     * @return Details of the starting configuration.
     */
    public String getStartingConfig(){
        return startingConfig.getOptionDetails();
    }
    /**
     * Getter method to retrieve details of the paint work.
     * @return Details of the paint work.
     */
    public String getPaintWork(){
        return paintWork.getOptionDetails();
    }
    /**
     * Getter method to retrieve details of the roof.
     * @return Details of the roof.
     */
    public String getRoof(){
        return roof.getOptionDetails();
    }
    /**
     * Getter method to retrieve details of the engine bay.
     * @return Details of the engine bay.
     */
    public String getEngineBay(){
        return engineBay.getOptionDetails();
    }
    /**
     * Getter method to retrieve details of the wheels.
     * @return Details of the wheels.
     */
    public String getWheels(){
        return wheels.getOptionDetails();
    }
    /**
     * Getter method to retrieve details of the calipers.
     * @return Details of the calipers.
     */
    public String getCalipers(){
        return calipers.getOptionDetails();
    }
    /**
     * Getter method to retrieve details of the body work elements.
     * @return Details of the body work elements.
     */
    public String getBodyWorkElements(){
        return bodyWorkElements.getOptionDetails();
    }
    /**
     * Getter method to retrieve details of the exhaust pipes.
     * @return Details of the exhaust pipes.
     */
    public String getExhaustPipes(){
        return exhaustPipes.getOptionDetails();
    }
    /**
     * Getter method to retrieve details of the seats type.
     * @return Details of the seats type.
     */
    public String getSeatsType(){
        return seatsType.getOptionDetails();
    }
    /**
     * Getter method to retrieve details of the interior color.
     * @return Details of the interior color.
     */
    public String getInteriorColor(){
        return interiorColor.getOptionDetails();
    }
    /**
     * Getter method to retrieve details of the interior detail.
     * @return Details of the interior detail.
     */
    public String getInteriorDetail(){ return interiorDetail.getOptionDetails(); }
    /**
     * Getter method to retrieve details of the carpets.
     * @return Details of the carpets.
     */
    public String getCarpets(){
        return carpets.getOptionDetails();
    }

}
