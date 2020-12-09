package DesignPatternsLearing.Factory.simpleFactory;

import DesignPatternsLearing.Factory.simpleFactory.Benz;
import DesignPatternsLearing.Factory.simpleFactory.Car;
import DesignPatternsLearing.Factory.simpleFactory.Ford;

class Factory {
    public static Car getCarInstance(String type) {
        Car c = null;
        if ("Benz".equals(type)) {
            c = new Benz();
        }
        if ("Ford".equals(type)) {
            c = new Ford();
        }
        return c;
    }
}