/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: DaytonaRacingCarbonSeatType.java
 * Description: DaytonaRacingCarbonSeatType class represents the Daytona Racing Carbon seat type option for the Ferrari SF90.
 */
package edu.bu.met.cs665.SF90ConfigOptions.SeatTypes;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class DaytonaRacingCarbonSeatType implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Daytona Racing Carbon";
    private String optionInfo = "Combines the Daytona design with lightweight carbon fiber construction, offering enhanced support and aesthetics tailored for the Ferrari SF90, ideal for track-focused driving experiences.";
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
