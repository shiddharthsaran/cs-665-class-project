package edu.bu.met.cs665.SF90ConfigOptions.Calipers;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class RossoCorsaBrakeCalipers implements SF90OptionsStrategyInterface {
    private String optionType = "Rosso Corsa";
    private String optionInfo = "Rossa Corsa brake calipers refers to brake calipers finished in a vibrant racing red color, adding a bold and sporty accent to the vehicle's braking system with a nod to Ferrari's racing heritage.";
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
