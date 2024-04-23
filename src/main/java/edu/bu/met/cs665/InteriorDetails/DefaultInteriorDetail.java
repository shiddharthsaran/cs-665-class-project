package edu.bu.met.cs665.InteriorDetails;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class DefaultInteriorDetail implements SF90OptionsStrategyInterface {
    private String optionType = "Default";
    private String optionInfo = "The standard configuration of interior features provided by the manufacturer for the Ferrari SF90, including materials, finishes, and design elements.";
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
