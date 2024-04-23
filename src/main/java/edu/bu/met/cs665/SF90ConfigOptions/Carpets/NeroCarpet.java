package edu.bu.met.cs665.SF90ConfigOptions.Carpets;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class NeroCarpet implements SF90OptionsStrategyInterface {
    private String optionType = "Standard";
    private String optionInfo = "Carpets in the default color option of black (Nero), offering a classic and sleek appearance that coordinates well with various interior color schemes while providing a timeless and sophisticated look.";
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
