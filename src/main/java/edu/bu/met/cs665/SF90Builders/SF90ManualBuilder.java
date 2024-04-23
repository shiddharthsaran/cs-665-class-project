package edu.bu.met.cs665.SF90Builders;

import edu.bu.met.cs665.SF90Car.SF90Manual;
import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class SF90ManualBuilder implements SF90BuilderInterface{
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

    @Override
    public void setStartingConfig(SF90OptionsStrategyInterface startingConfig) {
        this.startingConfig = startingConfig;
    }

    @Override
    public void setPaintWork(SF90OptionsStrategyInterface paintWork) {
        this.paintWork = paintWork;

    }

    @Override
    public void setRoof(SF90OptionsStrategyInterface roof) {
        this.roof = roof;

    }

    @Override
    public void setEngineBay(SF90OptionsStrategyInterface engineBay) {
        this.engineBay = engineBay;

    }

    @Override
    public void setWheels(SF90OptionsStrategyInterface wheels) {
        this.wheels = wheels;
    }

    @Override
    public void setCalipers(SF90OptionsStrategyInterface calipers) {
        this.calipers = calipers;
    }

    @Override
    public void setBodyWorkElements(SF90OptionsStrategyInterface bodyWorkElements) {
        this.bodyWorkElements = bodyWorkElements;
    }

    @Override
    public void setExhaustPipes(SF90OptionsStrategyInterface exhaustPipes) {
        this.exhaustPipes = exhaustPipes;
    }

    @Override
    public void setSeatsType(SF90OptionsStrategyInterface seatsType) {
        this.seatsType = seatsType;
    }

    @Override
    public void setInteriorColor(SF90OptionsStrategyInterface interiorColor) {
        this.interiorColor = interiorColor;
    }

    @Override
    public void setInteriorDetail(SF90OptionsStrategyInterface interiorDetail) {
        this.interiorDetail = interiorDetail;
    }

    @Override
    public void setCarpets(SF90OptionsStrategyInterface carpets) {
        this.carpets = carpets;
    }

    public SF90Manual getSF90Manual(){
        return new SF90Manual(startingConfig, paintWork, roof, engineBay, wheels, calipers, bodyWorkElements, exhaustPipes, seatsType, interiorColor, interiorDetail,carpets);
    }
}
