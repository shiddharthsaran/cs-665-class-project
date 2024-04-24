/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: SF90Builder.java
 * Description: SF90Builder class implements the SF90BuilderInterface and is responsible for building SF90Car objects
 *              with different configurations using the SF90OptionsStrategyInterface.
 */
package edu.bu.met.cs665.SF90Builders;

import edu.bu.met.cs665.SF90Car.SF90Car;
import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class SF90Builder implements SF90BuilderInterface{
    // Attributes to store different components of the car configuration
    private SF90OptionsStrategyInterface startingConfig;
    private SF90OptionsStrategyInterface paintWork;
    private SF90OptionsStrategyInterface roof;
    private SF90OptionsStrategyInterface engineBay;
    private SF90OptionsStrategyInterface wheels;
    private SF90OptionsStrategyInterface calipers;
    private SF90OptionsStrategyInterface bodyWorkElements;
    private SF90OptionsStrategyInterface exhaustPipes;
    private SF90OptionsStrategyInterface seatsType;
    private SF90OptionsStrategyInterface interiorColor;
    private SF90OptionsStrategyInterface interiorDetail;
    private SF90OptionsStrategyInterface carpets;
    /**
     * Setter method for setting the starting configuration option.
     * @param startingConfig The starting configuration option.
     */
    @Override
    public void setStartingConfig(SF90OptionsStrategyInterface startingConfig) {
        this.startingConfig = startingConfig;
    }
    /**
     * Setter method for setting the paint work option.
     * @param paintWork The paint work option.
     */
    @Override
    public void setPaintWork(SF90OptionsStrategyInterface paintWork) {
        this.paintWork = paintWork;

    }
    /**
     * Setter method for setting the roof option.
     * @param roof The roof option.
     */
    @Override
    public void setRoof(SF90OptionsStrategyInterface roof) {
        this.roof = roof;

    }
    /**
     * Setter method for setting the engine bay option.
     * @param engineBay The engine bay option.
     */
    @Override
    public void setEngineBay(SF90OptionsStrategyInterface engineBay) {
        this.engineBay = engineBay;

    }
    /**
     * Setter method for setting the wheels option.
     * @param wheels The wheels option.
     */
    @Override
    public void setWheels(SF90OptionsStrategyInterface wheels) {
        this.wheels = wheels;
    }
    /**
     * Setter method for setting the calipers option.
     * @param calipers The calipers option.
     */
    @Override
    public void setCalipers(SF90OptionsStrategyInterface calipers) {
        this.calipers = calipers;
    }
    /**
     * Setter method for setting the body work elements option.
     * @param bodyWorkElements The body work elements option.
     */
    @Override
    public void setBodyWorkElements(SF90OptionsStrategyInterface bodyWorkElements) {
        this.bodyWorkElements = bodyWorkElements;
    }
    /**
     * Setter method for setting the exhaust pipes option.
     * @param exhaustPipes The exhaust pipes option.
     */
    @Override
    public void setExhaustPipes(SF90OptionsStrategyInterface exhaustPipes) {
        this.exhaustPipes = exhaustPipes;
    }
    /**
     * Setter method for setting the seats type option.
     * @param seatsType The seats type option.
     */
    @Override
    public void setSeatsType(SF90OptionsStrategyInterface seatsType) {
        this.seatsType = seatsType;
    }
    /**
     * Setter method for setting the interior color option.
     * @param interiorColor The interior color option.
     */
    @Override
    public void setInteriorColor(SF90OptionsStrategyInterface interiorColor) {
        this.interiorColor = interiorColor;
    }
    /**
     * Setter method for setting the interior detail option.
     * @param interiorDetail The interior detail option.
     */
    @Override
    public void setInteriorDetail(SF90OptionsStrategyInterface interiorDetail) {
        this.interiorDetail = interiorDetail;
    }
    /**
     * Setter method for setting the carpets option.
     * @param carpets The carpets option.
     */
    @Override
    public void setCarpets(SF90OptionsStrategyInterface carpets) {
        this.carpets = carpets;
    }
    /**
     * Method to construct and return a SF90Car object with the configured options.
     * @return A SF90Car object with the configured options.
     */
    public SF90Car getSF90ConfigCar(){
        return new SF90Car(startingConfig, paintWork, roof, engineBay, wheels, calipers, bodyWorkElements, exhaustPipes, seatsType, interiorColor, interiorDetail, carpets);
    }
}
