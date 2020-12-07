package annotationLearining;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-06
 */
public class Apple {


    @FruitName(value = "Apple")
    private String name;

    public String getName() {
        return name;
    }
    @FruitName(value = "red")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                '}';
    }
}
