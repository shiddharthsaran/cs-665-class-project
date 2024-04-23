package edu.bu.met.cs665.SF90ConfigOptions.Wheels;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class CarbonFibreWheels implements SF90OptionsStrategyInterface {
    private String optionType = "Carbon Fibre";
    private String optionInfo = "Carbon fibre wheels represent a top-tier option for enthusiasts and drivers seeking the ultimate in performance, lightweight construction, and cutting-edge technology for their vehicle.";
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
