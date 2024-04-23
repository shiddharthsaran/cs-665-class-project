package edu.bu.met.cs665.Roofs;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class DefaultRoof implements SF90OptionsStrategyInterface {
    private String optionType = "Default";
    private String optionInfo = "The standard roof configuration provided by the manufacturer for the Ferrari SF90, typically matching the body color or featuring a traditional material such as carbon fiber or aluminum.";
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
