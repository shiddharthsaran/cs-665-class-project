package edu.bu.met.cs665.StartingConfigurations;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class BasicStartingConfiguration implements SF90OptionsStrategyInterface {
    private String optionType = "Basic";
    private String optionInfo = "The Basic does not include design elements and functional components to improve the performance of the SF90 Stradale";

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
