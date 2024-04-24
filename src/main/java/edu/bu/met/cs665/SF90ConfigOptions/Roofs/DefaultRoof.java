/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: DefaultRoof.java
 * Description: DefaultRoof class represents the standard roof configuration for the Ferrari SF90 provided by the manufacturer.
 */

package edu.bu.met.cs665.SF90ConfigOptions.Roofs;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class DefaultRoof implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Default";
    private String optionInfo = "The standard roof configuration provided by the manufacturer for the Ferrari SF90, typically matching the body color or featuring a traditional material such as carbon fiber or aluminum.";
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
