/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: RossoCorsaBrakeCalipers.java
 * Description: RossoCorsaBrakeCalipers class represents an option for SF90 car's brake calipers finished in Rosso Corsa color.
 */
package edu.bu.met.cs665.SF90ConfigOptions.Calipers;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class RossoCorsaBrakeCalipers implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Rosso Corsa";
    private String optionInfo = "Rossa Corsa brake calipers refers to brake calipers finished in a vibrant racing red color, adding a bold and sporty accent to the vehicle's braking system with a nod to Ferrari's racing heritage.";
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
