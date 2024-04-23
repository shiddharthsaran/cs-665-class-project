package edu.bu.met.cs665.SF90ConfigOptions.ExhaustPipes;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class StandardExhaustPipe implements SF90OptionsStrategyInterface {
    private String optionType = "Standard";
    private String optionInfo = "Default configuration provided by the manufacturer for exhaust system.";
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
