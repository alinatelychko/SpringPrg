package HW2_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("hw2_4.xml");

        Map<String, Integer> cityMap =  context.getBean("cityPopulation", Map.class);

        for (Map.Entry<String, Integer> entry : cityMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }

    }
}
