package edu.bu.met.cs665.SF90Builders;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public interface SF90BuilderInterface {
    void setStartingConfig(SF90OptionsStrategyInterface startingConfig);
    void setPaintWork(SF90OptionsStrategyInterface paintWork);
    void setRoof(SF90OptionsStrategyInterface roof);
    void setEngineBay(SF90OptionsStrategyInterface engineBay);
    void setWheels(SF90OptionsStrategyInterface wheels);
    void setCalipers(SF90OptionsStrategyInterface calipers);
    void setBodyWorkElements(SF90OptionsStrategyInterface bodyWorkElements);
    void setExhaustPipes(SF90OptionsStrategyInterface exhaustPipes);
    void setSeatsType(SF90OptionsStrategyInterface seatsType);
    void setInteriorColor(SF90OptionsStrategyInterface interiorColor);
    void setCarpets(SF90OptionsStrategyInterface carpets);
}
