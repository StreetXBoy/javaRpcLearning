package DesignPatternsLearing.Proxy;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */
public class NormalHome implements ProxyInterface{

    @Override
    public void marry() {
        System.out.println("我们结婚啦～");
    }

}