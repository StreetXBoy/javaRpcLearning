package DesignPatternsLearing.Factory.simpleFactory;

import DesignPatternsLearing.Factory.simpleFactory.Car;

class Benz implements Car {
    @Override
    public void run() {
        System.out.println("Benz开始启动了。。。。。");
    }

    @Override
    public void stop() {
        System.out.println("Benz停车了。。。。。");
    }
}