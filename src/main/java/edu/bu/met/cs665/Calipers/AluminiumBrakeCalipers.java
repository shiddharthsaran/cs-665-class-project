package edu.bu.met.cs665.Calipers;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class AluminiumBrakeCalipers implements SF90OptionsStrategyInterface {
    private String optionType = "Aluminium";
    private String optionInfo = "Aluminum-colored brake calipers typically have a metallic silver appearance resembling the natural color of aluminum metal.";
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
