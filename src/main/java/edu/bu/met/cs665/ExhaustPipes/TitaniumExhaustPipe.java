package edu.bu.met.cs665.ExhaustPipes;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class TitaniumExhaustPipe implements SF90OptionsStrategyInterface {
    private String optionType = "Titanium";
    private String optionInfo = "Lightweight and durable exhaust system option made from titanium, offering improved performance.";
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
