package HW2_3;

import HW2.City;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public City kyivCity(){
        City city = new City("Kyiv");
        city.setPopulation(3000000);
        return city;
    }

    @Bean
    public City lvivCity(){
        City city = new City("Lviv");
        city.setPopulation(750000);
        return city;
    }

    @Bean
    public City odesaCity(){
        City city = new City("Odesa");
        city.setPopulation(1010000);
        return city;

    }

    @Bean
    public City kharkivCity(){
        City city = new City("Kharkiv");
        city.setPopulation(1400000);
        return city;
    }

    @Bean
    public City dniproCity(){
        City city = new City("Dnipro");
        city.setPopulation(980000);
        return city;
    }
}
