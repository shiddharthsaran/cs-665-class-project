package edu.bu.met.cs665.EngineBay;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class CarbonEngineBay implements SF90OptionsStrategyInterface {
    private String optionType = "Carbon Fibre";
    private String optionInfo = "Engine bay components, such as the engine cover, intake manifold, and other elements, are made from lightweight carbon fibre.";
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
