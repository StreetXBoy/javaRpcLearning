package DesignPatternsLearing.Factory.AbstractFactory;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */
public interface Human {

    // 首先定义什么是人类

    // 人会笑，表达愉快
    void laugh();

    // 人会哭，表达悲伤
    void cry();

    // 人会说话
    void talk();

    // 定义性别
    void sex();

}