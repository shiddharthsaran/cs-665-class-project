/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: AlcantaraInsertsCarpet.java
 * Description: AlcantaraInsertsCarpet class represents an option for SF90 car's carpets featuring Alcantara inserts.
 */
package edu.bu.met.cs665.SF90ConfigOptions.Carpets;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class AlcantaraInsertsCarpet implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Tone on Tone";
    private String optionInfo = "Carpets featuring Alcantara inserts that match or complement the color of the surrounding carpeting, providing a cohesive and upscale interior aesthetic with a luxurious feel.";
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
