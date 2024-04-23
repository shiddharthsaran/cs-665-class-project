package edu.bu.met.cs665.SF90ConfigOptions.SeatTypes;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class DaytonaRacingCarbonSeatType implements SF90OptionsStrategyInterface {
    private String optionType = "Daytona Racing Carbon";
    private String optionInfo = "Combines the Daytona design with lightweight carbon fiber construction, offering enhanced support and aesthetics tailored for the Ferrari SF90, ideal for track-focused driving experiences.";
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
