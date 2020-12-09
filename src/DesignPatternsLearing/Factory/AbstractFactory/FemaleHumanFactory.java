package DesignPatternsLearing.Factory.AbstractFactory;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */
public class FemaleHumanFactory extends AbstractHumanFactory {

    // 创造女性黄种人
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }

    // 创造女性白种人
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    // 创造女性黑种人
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }

}