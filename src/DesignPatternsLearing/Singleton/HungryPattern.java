package DesignPatternsLearing.Singleton;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */

//该模式能简单快速的创建一个单例对象，而且是线程安全的(只在类加载时才会初始化，以后都不会)。
// 但它有一个缺点，就是不管你要不要都会直接创建一个对象，会消耗一定的性能(当然很小很小，几乎可以忽略不计，所以这种模式在很多场合十分常用而且十分简单)

public class HungryPattern {
    private static  HungryPattern hungryPattern=new HungryPattern();
    private HungryPattern(){

    }
    public static  HungryPattern getInstance(){
        return  hungryPattern;
    }
}
