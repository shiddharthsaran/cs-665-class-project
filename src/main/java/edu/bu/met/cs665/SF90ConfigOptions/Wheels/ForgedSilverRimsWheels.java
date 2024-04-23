package edu.bu.met.cs665.SF90ConfigOptions.Wheels;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class ForgedSilverRimsWheels implements SF90OptionsStrategyInterface {
    private String optionType = "Forged";
    private String optionInfo = "Forged for enhanced strength and reduced weight, with a shiny, reflective silver finish that adds a touch of sophistication and style to the vehicle.";
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
