/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: NeroRoof.java
 * Description: NeroRoof class represents the roof option featuring a black color (Nero) finish for the Ferrari SF90's exterior.
 */
package edu.bu.met.cs665.SF90ConfigOptions.Roofs;

import edu.bu.met.cs665.SF90OptionStrategy.SF90OptionsStrategyInterface;

public class NeroRoof implements SF90OptionsStrategyInterface {
    // Attributes to store option type and information
    private String optionType = "Nero";
    private String optionInfo = "Roof option featuring a black color (Nero) finish, adding a sleek and sporty contrast to the Ferrari SF90's exterior while providing a bold and distinctive appearance.";
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
