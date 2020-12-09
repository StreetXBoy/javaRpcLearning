package DesignPatternsLearing.Proxy;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */
public class Test {
    public static void main(String[] args) {
        ProxyInterface proxyInterface = new WeddingCompany(new NormalHome());
        proxyInterface.marry();
    }
}