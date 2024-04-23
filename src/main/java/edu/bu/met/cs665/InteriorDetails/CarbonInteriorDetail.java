package edu.bu.met.cs665.InteriorDetails;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class CarbonInteriorDetail implements SF90OptionsStrategyInterface {
    private String optionType = "Carbon Fibre";
    private String optionInfo = "An optional enhancement for the Ferrari SF90, featuring interior components made from lightweight and high-strength carbon fiber material, offering a premium and sporty aesthetic while potentially reducing overall vehicle weight.";
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
