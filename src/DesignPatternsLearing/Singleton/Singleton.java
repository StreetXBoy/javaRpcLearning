package DesignPatternsLearing.Singleton;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */



//单例模式
//
//        简单点说，就是一个应用程序中，某个类的实例对象只有一个，你没有办法去new，因为构造器是被private修饰的，一般通过getInstance()的方法来获取它们的实例。
//
//
//
//        getInstance()的返回值是一个对象的引用，并不是一个新的实例，

//把singleton换成instance 也叫懒汉式 线程不安全


//看上去，这段代码没什么明显问题，但它不是线程安全的。假设当前有N个线程同时调用getInstance（）方法，由于当前还没有对象生成，所以一部分同时都进入step 2,

public class Singleton {
    private  static  Singleton singleton;

    private Singleton(){

    }
    public  static  Singleton getInstance(){
        if(singleton == null){
            singleton =new Singleton();
        }
        return  singleton;
    }
}
