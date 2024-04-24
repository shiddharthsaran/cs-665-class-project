/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: RossoDinoPaintWork.java
 * Description: RossoDinoPaintWork class represents a paintwork option for SF90 car paying homage to Ferrari's heritage with a color inspired by the iconic Rosso Dino.
 */

package edu.bu.met.cs665.SF90ConfigOptions.PaintWorks;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class RossoDinoPaintWork implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Historical";
    private String optionInfo = "Paintwork option paying homage to Ferrari's heritage with a color inspired by the iconic Rosso Dino, a bright and dynamic red hue reminiscent of vintage Ferrari models, adding a nostalgic and timeless touch to the SF90's exterior.";
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
