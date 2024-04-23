package edu.bu.met.cs665.SF90ConfigOptions.InteriorColors;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class TortoraInteriorColor implements SF90OptionsStrategyInterface {
    private String optionType = "Tortora";
    private String optionInfo = "A light, neutral interior color option for the Ferrari SF90, often resembling a shade of taupe or light beige, adding a sense of elegance and spaciousness to the cabin.";
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
