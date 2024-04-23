package edu.bu.met.cs665.PaintWorks;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class GrigioIngridPaintWork implements SF90OptionsStrategyInterface {
    private String optionType = "Metallic";
    private String optionInfo = "Paintwork option with a metallic finish in Grigio Ingrid, a sophisticated shade of gray, providing a modern and elegant appearance while offering depth and shine to the Ferrari SF90's exterior.";
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
