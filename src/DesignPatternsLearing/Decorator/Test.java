package DesignPatternsLearing.Decorator;

import DesignPatternsLearing.Decorator.Bread;
import DesignPatternsLearing.Decorator.Cream;
import DesignPatternsLearing.Decorator.Food;
import DesignPatternsLearing.Decorator.Vegetable;


// 一个new 接一个 new java io流 使用这种方式

public class Test {
    public static void main(String[] args) {
        Food food = new Bread(new Vegetable(new Cream(new Food("香肠"))));
        System.out.println(food.make());
    }
}