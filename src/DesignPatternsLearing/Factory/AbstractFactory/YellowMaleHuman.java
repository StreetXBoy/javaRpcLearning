package DesignPatternsLearing.Factory.AbstractFactory;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */
public class YellowMaleHuman extends YellowHuman {

    @Override
    public void sex() {
        System.out.println("该黄种人的性别为男...");
    }

}