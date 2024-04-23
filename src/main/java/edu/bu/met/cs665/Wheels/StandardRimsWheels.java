package edu.bu.met.cs665.Wheels;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class StandardRimsWheels implements SF90OptionsStrategyInterface {
    private String optionType = "Standard";
    private String optionInfo = "Default wheel design that comes with the vehicle when purchased from the factory";
    @Override
    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    @Override
    public void setOptionInfo(String optionInfo) {
        this.optionInfo = optionInfo;
    }

    @Override
    public String getOptionDetails() {
        return String.format("Type: %s, Information: %s",optionType, optionInfo);
    }
}
