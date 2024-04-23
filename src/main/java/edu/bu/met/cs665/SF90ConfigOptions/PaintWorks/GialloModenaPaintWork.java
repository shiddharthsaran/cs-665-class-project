package edu.bu.met.cs665.SF90ConfigOptions.PaintWorks;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class GialloModenaPaintWork implements SF90OptionsStrategyInterface {
    private String optionType = "Solid";
    private String optionInfo = "Paintwork option featuring a solid finish in Giallo Modena, a vibrant and classic yellow hue, adding a bold and eye-catching element to the Ferrari SF90's exterior.";
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
