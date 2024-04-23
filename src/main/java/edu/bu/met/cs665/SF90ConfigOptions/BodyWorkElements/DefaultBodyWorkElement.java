package edu.bu.met.cs665.SF90ConfigOptions.BodyWorkElements;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class DefaultBodyWorkElement implements SF90OptionsStrategyInterface {
    private String optionType = "Default";
    private String optionInfo = "Default bodywork elements refers to the standard configuration or materials used.";
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
