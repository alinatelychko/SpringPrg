package HW2_3;

import HW2.City;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        List<String> cityBeans = List.of("kyivCity", "lvivCity", "odesaCity", "kharkivCity", "dniproCity");

        for (String cityBean : cityBeans) {
            City city = context.getBean(cityBean, City.class);
            System.out.println(city);
        }
    }
}
