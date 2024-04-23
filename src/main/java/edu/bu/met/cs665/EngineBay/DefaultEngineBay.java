package edu.bu.met.cs665.EngineBay;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class DefaultEngineBay implements SF90OptionsStrategyInterface {
    private String optionType = "Default";
    private String optionInfo = "Standard engine bay configuration, features components made from materials such as aluminum and other alloys commonly used in automotive manufacturing.";
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
