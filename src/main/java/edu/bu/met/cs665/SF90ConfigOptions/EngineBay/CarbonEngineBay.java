/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: CarbonEngineBay.java
 * Description: CarbonEngineBay class represents an option for SF90 car's engine bay components made from carbon fiber material.
 */
package edu.bu.met.cs665.SF90ConfigOptions.EngineBay;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class CarbonEngineBay implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Carbon Fibre";
    private String optionInfo = "Engine bay components, such as the engine cover, intake manifold, and other elements, are made from lightweight carbon fibre.";
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
