package edu.bu.met.cs665.SeatTypes;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class DaytonaSeatType implements SF90OptionsStrategyInterface {
    private String optionType = "Daytona";
    private String optionInfo = "Racing-inspired seats available for the Ferrari SF90, featuring contoured shapes and additional bolstering for increased lateral support during spirited driving.";
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
