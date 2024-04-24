/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: NeroInteriorColor.java
 * Description: NeroInteriorColor class represents an option for SF90 car's interior color in a classic and timeless black hue.
 */
package edu.bu.met.cs665.SF90ConfigOptions.InteriorColors;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class NeroInteriorColor implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Nero";
    private String optionInfo = "A classic and timeless interior color option for the Ferrari SF90, featuring a rich black hue, exuding a sense of sophistication and sportiness while offering a sleek and premium look to the cabin.";
    /**
     * Sets the type of the option.
     * @param optionType The type of the option.
     */
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
