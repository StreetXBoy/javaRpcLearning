package DesignPatternsLearing.Observer;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */
public interface Person {
    //小王和小李通过这个接口可以接收到小美发过来的消息
    void getMessage(String s);
}