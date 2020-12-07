package annotationLearining;

import java.lang.reflect.InvocationTargetException;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-06
 */

//https://www.cnblogs.com/liangweiping/p/3837332.html 自定义注解需要解析，大致明白了spring的机制！！！
public class testAnnotation {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Apple apple =factory.create();
        //通过工厂方法来解析类似于spring！！！！！
        System.out.println(apple.getName());
    }
}
