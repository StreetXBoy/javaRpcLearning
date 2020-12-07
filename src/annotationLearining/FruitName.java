package annotationLearining;

import java.lang.annotation.*;

/**
 * 水果名称注解
 * @author peida
 *
 */
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface FruitName {
    String value() default "";
}