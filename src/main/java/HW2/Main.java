package HW2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hw2.xml");

        List<String> cityBeans = List.of("kyivCity", "lvivCity", "odesaCity", "kharkivCity", "dniproCity");

        for (String cityBean : cityBeans) {
            City city = context.getBean(cityBean, City.class);
            System.out.println(city);
        }

    }
}