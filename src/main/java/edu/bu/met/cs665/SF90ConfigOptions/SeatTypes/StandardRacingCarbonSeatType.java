package edu.bu.met.cs665.SF90ConfigOptions.SeatTypes;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class StandardRacingCarbonSeatType implements SF90OptionsStrategyInterface {
    private String optionType = "Standard Racing Carbon";
    private String optionInfo = "Lightweight carbon fiber racing seats offered as an option for the Ferrari SF90, providing maximum support and minimal weight for high-performance driving.";
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
