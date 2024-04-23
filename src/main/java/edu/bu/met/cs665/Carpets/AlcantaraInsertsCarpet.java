package edu.bu.met.cs665.Carpets;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class AlcantaraInsertsCarpet implements SF90OptionsStrategyInterface {
    private String optionType = "Tone on Tone";
    private String optionInfo = "Carpets featuring Alcantara inserts that match or complement the color of the surrounding carpeting, providing a cohesive and upscale interior aesthetic with a luxurious feel.";
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
