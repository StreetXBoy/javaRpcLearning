package DesignPatternsLearing.Singleton;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */
public class AdvancedLazyPattern {
    private  static  AdvancedLazyPattern advancedLazyPattern;

    private  static  Integer key = new Integer(4);

    //set as a lock


    private AdvancedLazyPattern(){

    }

    public  static  AdvancedLazyPattern getInstance(){
        if(advancedLazyPattern == null){
            synchronized (key){
                //由于可能多个线程都进入了step1,由于锁定机制，一个线程进入该代码块时，其他线程
                //仍在排队进入该代码块，如果不做判断，当前线程即使创造了实例，下一个线程也不知道，就会继续创建一个实例
                if (advancedLazyPattern ==null){
                    advancedLazyPattern =new AdvancedLazyPattern();
                }
            }
        }
        return  advancedLazyPattern;
    }
}
