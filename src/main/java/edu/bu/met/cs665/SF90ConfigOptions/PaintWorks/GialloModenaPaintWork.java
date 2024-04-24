/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: GialloModenaPaintWork.java
 * Description: GialloModenaPaintWork class represents a paintwork option for SF90 car with a solid finish in Giallo Modena, a vibrant yellow hue.
 */
package edu.bu.met.cs665.SF90ConfigOptions.PaintWorks;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class GialloModenaPaintWork implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Solid";
    private String optionInfo = "Paintwork option featuring a solid finish in Giallo Modena, a vibrant and classic yellow hue, adding a bold and eye-catching element to the Ferrari SF90's exterior.";
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
