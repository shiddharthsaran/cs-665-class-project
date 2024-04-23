package edu.bu.met.cs665.BodyWorkElements;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class CarbonExteriorBodyWorkElement implements SF90OptionsStrategyInterface {
    private String optionType = "Carbon Fibre";
    private String optionInfo = "Certain body parts constructed from lightweight and high-strength carbon fiber, offering enhanced performance and a premium aesthetic";
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
