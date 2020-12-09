package DesignPatternsLearing.Factory.AbstractFactory;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */
public class Test {
    public static void main(String[] args) {
        // 男性生产线
        HumanFactory maleHumanFactory = new MaleHumanFactory();

        // 女性生产线
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        // 生产线建立完毕，开始生产人了:
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();

        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        femaleYellowHuman.sex();
        /*
         * ...
         */

    }
}
