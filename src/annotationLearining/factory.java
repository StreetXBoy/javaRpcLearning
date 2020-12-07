package annotationLearining;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-06
 */
public class factory {

    public static  Apple create() throws InvocationTargetException, IllegalAccessException {
        Apple apple =new Apple();
        Method[] methods=Apple.class.getMethods();
        for(Method method:methods){
            if(method.isAnnotationPresent(FruitName.class)){
                FruitName fruitName=method.getAnnotation(FruitName.class);
                method.invoke(apple,fruitName.value());
            }

        }
        return  apple;
    }
}
