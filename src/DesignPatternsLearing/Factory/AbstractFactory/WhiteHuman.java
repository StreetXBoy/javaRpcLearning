package DesignPatternsLearing.Factory.AbstractFactory;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */
public abstract class WhiteHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("白种人会笑...");
    }

    @Override
    public void cry() {
        System.out.println("白种人会哭...");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话，一般说的都是单字节...");
    }

}