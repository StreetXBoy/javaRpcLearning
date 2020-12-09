package DesignPatternsLearing.Factory.AbstractFactory;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */



public abstract class AbstractHumanFactory implements HumanFactory {

    // 给定一个性别人种，创建一个人类出来 专业术语是产生产品等级
    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;
        // 如果传递进来不是一个Enum中具体的一个Element的话，则不处理
        if(!humanEnum.getValue().equals("")) {
            try {
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                // 因为使用了enum，这个种异常情况不会产生了，除非你的enum有问题
            }
        }
        return human;
    }

}