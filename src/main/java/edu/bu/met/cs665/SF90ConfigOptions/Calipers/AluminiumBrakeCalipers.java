/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: AluminiumBrakeCalipers.java
 * Description: AluminiumBrakeCalipers class represents an option for SF90 car's brake calipers made of aluminum material.
 */
package edu.bu.met.cs665.SF90ConfigOptions.Calipers;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class AluminiumBrakeCalipers implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Aluminium";
    private String optionInfo = "Aluminum-colored brake calipers typically have a metallic silver appearance resembling the natural color of aluminum metal.";
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
