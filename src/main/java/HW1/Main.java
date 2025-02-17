package HW1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hw1.xml");
        List<Knight> knights = List.of(
                context.getBean("knight1", Knight.class),
                context.getBean("knight2", Knight.class),
                context.getBean("knight3", Knight.class),
                context.getBean("knight4", Knight.class),
                context.getBean("knight5", Knight.class)
        );
        for (Knight knight : knights) {
            System.out.println(knight);
        }

    }
}
