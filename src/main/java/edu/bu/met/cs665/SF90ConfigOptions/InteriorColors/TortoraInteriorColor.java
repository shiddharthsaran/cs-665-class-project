/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: TortoraInteriorColor.java
 * Description: TortoraInteriorColor class represents an option for SF90 car's interior color in a light, neutral shade resembling taupe or light beige.
 */
package edu.bu.met.cs665.SF90ConfigOptions.InteriorColors;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class TortoraInteriorColor implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Tortora";
    private String optionInfo = "A light, neutral interior color option for the Ferrari SF90, often resembling a shade of taupe or light beige, adding a sense of elegance and spaciousness to the cabin.";
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
