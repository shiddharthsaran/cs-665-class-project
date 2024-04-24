/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: BasicStartingConfiguration.java
 * Description: BasicStartingConfiguration class represents the basic starting configuration option for the Ferrari SF90.
 */
package edu.bu.met.cs665.SF90ConfigOptions.StartingConfigurations;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class BasicStartingConfiguration implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Basic";
    private String optionInfo = "The Basic does not include design elements and functional components to improve the performance of the SF90 Stradale";
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
