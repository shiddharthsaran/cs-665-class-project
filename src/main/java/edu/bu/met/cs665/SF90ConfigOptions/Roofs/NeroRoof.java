package edu.bu.met.cs665.SF90ConfigOptions.Roofs;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class NeroRoof implements SF90OptionsStrategyInterface {
    private String optionType = "Nero";
    private String optionInfo = "Roof option featuring a black color (Nero) finish, adding a sleek and sporty contrast to the Ferrari SF90's exterior while providing a bold and distinctive appearance.";
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
