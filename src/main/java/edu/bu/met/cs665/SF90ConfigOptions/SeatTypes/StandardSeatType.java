/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: StandardSeatType.java
 * Description: StandardSeatType class represents the standard seat type option for the Ferrari SF90.
 */
package edu.bu.met.cs665.SF90ConfigOptions.SeatTypes;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class StandardSeatType implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Standard";
    private String optionInfo = "Default seating option provided with the Ferrari SF90, balancing comfort and support for everyday driving.";
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
