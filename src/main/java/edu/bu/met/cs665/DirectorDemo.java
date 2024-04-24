/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/23/2024
 * File Name: DirectorDemo.java
 * Description: DirectorDemo class demonstrates the use of SF90Director to construct SF90Car and SF90Manual objects with predefined configurations.
 */
package edu.bu.met.cs665;

import edu.bu.met.cs665.SF90Builders.SF90Builder;
import edu.bu.met.cs665.SF90Builders.SF90ManualBuilder;
import edu.bu.met.cs665.SF90Car.SF90Car;
import edu.bu.met.cs665.SF90Car.SF90Manual;
import edu.bu.met.cs665.SF90Director.SF90Director;

public class DirectorDemo {

    public static void main(String[] args){
        SF90Director director = new SF90Director();
        SF90Builder builder = new SF90Builder();
        // Construct an ultimate SF90Car configuration
        director.UltimateSF90(builder);
        SF90Car car = builder.getSF90ConfigCar();
        System.out.println(car.getStartingConfig());
        System.out.println();
        // Construct an ultimate SF90Manual configuration
        SF90ManualBuilder manualBuilder = new SF90ManualBuilder();
        director.UltimateSF90(manualBuilder);
        SF90Manual manual = manualBuilder.getSF90Manual();
        System.out.println(manual.printManual());



    }
}
