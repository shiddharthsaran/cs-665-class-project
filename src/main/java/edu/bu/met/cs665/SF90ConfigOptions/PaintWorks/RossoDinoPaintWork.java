package edu.bu.met.cs665.SF90ConfigOptions.PaintWorks;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class RossoDinoPaintWork implements SF90OptionsStrategyInterface {
    private String optionType = "Historical";
    private String optionInfo = "Paintwork option paying homage to Ferrari's heritage with a color inspired by the iconic Rosso Dino, a bright and dynamic red hue reminiscent of vintage Ferrari models, adding a nostalgic and timeless touch to the SF90's exterior.";
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
