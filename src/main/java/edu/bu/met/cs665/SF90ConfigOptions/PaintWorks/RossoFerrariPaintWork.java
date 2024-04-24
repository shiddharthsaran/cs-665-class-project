/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: RossoFerrariPaintWork.java
 * Description: RossoFerrariPaintWork class represents an exclusive paintwork option for SF90 car referencing Ferrari's Formula 1 racing legacy.
 */
package edu.bu.met.cs665.SF90ConfigOptions.PaintWorks;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class RossoFerrariPaintWork implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Special";
    private String optionInfo = "Exclusive paintwork option referencing Ferrari's Formula 1 racing legacy with a color inspired by the Rosso Ferrari F1-75, a vivid red hue symbolizing passion, performance, and the pursuit of excellence, making a bold statement on the SF90's exterior.";
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
