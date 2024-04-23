package edu.bu.met.cs665.SeatTypes;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class StandardSeatType implements SF90OptionsStrategyInterface {
    private String optionType = "Standard";
    private String optionInfo = "Default seating option provided with the Ferrari SF90, balancing comfort and support for everyday driving.";
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
