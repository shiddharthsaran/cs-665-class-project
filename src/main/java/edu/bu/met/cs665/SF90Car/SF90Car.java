package edu.bu.met.cs665.SF90Car;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class SF90Car {
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
    private final SF90OptionsStrategyInterface carpets;

    public SF90Car(SF90OptionsStrategyInterface startingConfig, SF90OptionsStrategyInterface paintWork,
                   SF90OptionsStrategyInterface roof, SF90OptionsStrategyInterface engineBay,
                   SF90OptionsStrategyInterface wheels, SF90OptionsStrategyInterface calipers,
                   SF90OptionsStrategyInterface bodyWorkElements, SF90OptionsStrategyInterface exhaustPipes,
                   SF90OptionsStrategyInterface seatsType, SF90OptionsStrategyInterface interiorColor,
                   SF90OptionsStrategyInterface carpets){
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
        this.carpets = carpets;
    }
    public String getStartingConfig(){
        return startingConfig.getOptionDetails();
    }
    public String getPaintWork(){
        return paintWork.getOptionDetails();
    }
    public String getRoof(){
        return roof.getOptionDetails();
    }
    public String getEngineBay(){
        return engineBay.getOptionDetails();
    }
    public String getWheels(){
        return wheels.getOptionDetails();
    }
    public String getCalipers(){
        return calipers.getOptionDetails();
    }
    public String getBodyWorkElements(){
        return bodyWorkElements.getOptionDetails();
    }
    public String getExhaustPipes(){
        return exhaustPipes.getOptionDetails();
    }
    public String getSeatsType(){
        return seatsType.getOptionDetails();
    }
    public String getInteriorColor(){
        return interiorColor.getOptionDetails();
    }
    public String getCarpets(){
        return carpets.getOptionDetails();
    }

}
