package edu.bu.met.cs665.InteriorColors;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class CharcoalInteriorColor implements SF90OptionsStrategyInterface {
    private String optionType = "Charcoal";
    private String optionInfo = "A dark, sophisticated interior color choice for the Ferrari SF90, typically featuring deep gray tones, lending a modern and luxurious ambiance to the cabin.";
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
