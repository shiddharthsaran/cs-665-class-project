package edu.bu.met.cs665;

import edu.bu.met.cs665.SF90Builders.SF90Builder;
import edu.bu.met.cs665.SF90Builders.SF90ManualBuilder;
import edu.bu.met.cs665.SF90Car.SF90Car;
import edu.bu.met.cs665.SF90Car.SF90Manual;
import edu.bu.met.cs665.SF90Director.SF90Director;

public class Main {
    public static void main(String[] args){
        SF90Director director = new SF90Director();
        SF90Builder builder = new SF90Builder();
        director.UltimateSF90(builder);
        SF90Car car = builder.getSF90ConfigCar();
        System.out.println(car.getExhaustPipes());

        SF90ManualBuilder manualBuilder = new SF90ManualBuilder();
        director.UltimateSF90(manualBuilder);
        SF90Manual manual = manualBuilder.getSF90Manual();
        System.out.println(manual.printManual());
        SF90ManualBuilder basicManualBuilder = new SF90ManualBuilder();
        director.BasicSF90Car(basicManualBuilder);
        SF90Manual basicManual = basicManualBuilder.getSF90Manual();
        System.out.println(basicManual.printManual());


    }
}
