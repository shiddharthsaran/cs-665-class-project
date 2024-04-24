/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: DefaultBodyWorkElement.java
 * Description: DefaultBodyWorkElement class represents the default option for SF90 car's body work.
 */
package edu.bu.met.cs665.SF90ConfigOptions.BodyWorkElements;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class DefaultBodyWorkElement implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Default";
    private String optionInfo = "Default bodywork elements refers to the standard configuration or materials used.";
    /**
     * Sets the type of the option.
     * @param optionType The type of the option.
     */
    @Override
    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }
    /**
     * Sets the information/details of the option.
     * @param optionInfo The information/details of the option.
     */
    @Override
    public void setOptionInfo(String optionInfo) {
        this.optionInfo = optionInfo;
    }
    /**
     * Retrieves the details of the option.
     * @return A formatted string containing the type and information of the option.
     */
    @Override
    public String getOptionDetails() {
        return String.format("Type: %s, Information: %s",optionType, optionInfo);
    }
}
