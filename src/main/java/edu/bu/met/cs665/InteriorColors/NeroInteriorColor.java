package edu.bu.met.cs665.InteriorColors;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class NeroInteriorColor implements SF90OptionsStrategyInterface {
    private String optionType = "Nero";
    private String optionInfo = "A classic and timeless interior color option for the Ferrari SF90, featuring a rich black hue, exuding a sense of sophistication and sportiness while offering a sleek and premium look to the cabin.";
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
