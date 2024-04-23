package edu.bu.met.cs665.SF90ConfigOptions.ExhaustPipes;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class BlackCeramicExhaustPipe implements SF90OptionsStrategyInterface {
    private String optionType = "Black Ceramic";
    private String optionInfo = "Exhaust system coated with black ceramic for enhanced heat resistance and sleek appearance.";
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
