import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(firstBean);
        HelloWorld secondBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(secondBean);
        System.out.println(firstBean == secondBean);

        Cat beanCatOne = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCatOne);

        Cat beanCatTwo = (Cat) applicationContext.getBean("cat");
        beanCatTwo.setDemanding("Хочу жрать!");
        System.out.println(beanCatTwo);

        System.out.println(beanCatOne == beanCatTwo);
    }
}