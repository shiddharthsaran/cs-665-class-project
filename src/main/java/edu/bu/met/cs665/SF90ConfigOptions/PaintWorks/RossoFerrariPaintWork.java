package edu.bu.met.cs665.SF90ConfigOptions.PaintWorks;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class RossoFerrariPaintWork implements SF90OptionsStrategyInterface {
    private String optionType = "Special";
    private String optionInfo = "Exclusive paintwork option referencing Ferrari's Formula 1 racing legacy with a color inspired by the Rosso Ferrari F1-75, a vivid red hue symbolizing passion, performance, and the pursuit of excellence, making a bold statement on the SF90's exterior.";
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
