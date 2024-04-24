/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: ForgedSilverRimsWheels.java
 * Description: ForgedSilverRimsWheels class implements the SF90OptionsStrategyInterface to define a configuration option for forged silver rims wheels.
 */
package edu.bu.met.cs665.SF90ConfigOptions.Wheels;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class ForgedSilverRimsWheels implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Forged";
    private String optionInfo = "Forged for enhanced strength and reduced weight, with a shiny, reflective silver finish that adds a touch of sophistication and style to the vehicle.";
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
