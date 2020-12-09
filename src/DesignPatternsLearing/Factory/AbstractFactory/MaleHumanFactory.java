package DesignPatternsLearing.Factory.AbstractFactory;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */
public class MaleHumanFactory extends AbstractHumanFactory {

    // 创造男性黄种人
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowMaleHuman);
    }

    // 创造男性白种人
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    // 创造男性黑种人
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }

}