/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: NeroCarpet.java
 * Description: NeroCarpet class represents an option for SF90 car's carpets in the default color option of black (Nero).
 */
package edu.bu.met.cs665.SF90ConfigOptions.Carpets;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class NeroCarpet implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Standard";
    private String optionInfo = "Carpets in the default color option of black (Nero), offering a classic and sleek appearance that coordinates well with various interior color schemes while providing a timeless and sophisticated look.";
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
