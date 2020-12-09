package DesignPatternsLearing.ProductComsumer;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */
public class Test {
    public static void main(String[] args) {
        SyncStack stack = new SyncStack();
        Consumer p = new Consumer(stack);
        Producter c = new Producter(stack);

        new Thread(p).start();
        new Thread(c).start();

    }
}
