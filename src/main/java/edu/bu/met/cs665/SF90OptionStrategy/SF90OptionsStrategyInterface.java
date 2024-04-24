/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: SF90OptionsStrategyInterface.java
 * Description: SF90OptionsStrategyInterface interface defines methods for handling SF90 car options.
 */
package edu.bu.met.cs665.SF90OptionStrategy;

public interface SF90OptionsStrategyInterface {
    // Interface methods to set and retrieve option details
    void setOptionType(String optionType);
    void setOptionInfo(String optionInfo);
    String getOptionDetails();
}
