package DesignPatternsLearing.Factory.simpleFactory;

import DesignPatternsLearing.Factory.simpleFactory.Car;

public class Test {

    public static void main(String[] args) {
        Car c = Factory.getCarInstance("Benz");
        if (c != null) {
            c.run();
            c.stop();
        } else {
            System.out.println("造不了这种汽车。。。");
        }

    }

}