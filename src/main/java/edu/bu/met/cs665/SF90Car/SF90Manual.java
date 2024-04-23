package edu.bu.met.cs665.SF90Car;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class SF90Manual {
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

    public SF90Manual(SF90OptionsStrategyInterface startingConfig, SF90OptionsStrategyInterface paintWork,
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

    public String printManual(){
        String sf90ConfigInfo = "";
        sf90ConfigInfo += "Starting Configuration: " + startingConfig.getOptionDetails() + "\n";
        sf90ConfigInfo += "Paint Work: " + paintWork.getOptionDetails() + "\n";
        sf90ConfigInfo += "Roof: " + roof.getOptionDetails() + "\n";
        sf90ConfigInfo += "Engine Bay: " + engineBay.getOptionDetails() + "\n";
        sf90ConfigInfo += "Wheels: " + wheels.getOptionDetails() + "\n";
        sf90ConfigInfo += "Calipers: " + calipers.getOptionDetails() + "\n";
        sf90ConfigInfo += "Exhaust Pipes: " + exhaustPipes.getOptionDetails() + "\n";
        sf90ConfigInfo += "Seats Type: " + seatsType.getOptionDetails() + "\n";
        sf90ConfigInfo += "Interior Color: " + interiorColor.getOptionDetails() + "\n";
        sf90ConfigInfo += "Carpets: " + carpets.getOptionDetails() + "\n";
        return sf90ConfigInfo;
    }
}
