/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: CarbonFibreWheels.java
 * Description: CarbonFibreWheels class represents the carbon fibre wheels option for the Ferrari SF90.
 */
package edu.bu.met.cs665.SF90ConfigOptions.Wheels;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class CarbonFibreWheels implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Carbon Fibre";
    private String optionInfo = "Carbon fibre wheels represent a top-tier option for enthusiasts and drivers seeking the ultimate in performance, lightweight construction, and cutting-edge technology for their vehicle.";
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
