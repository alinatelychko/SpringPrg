package HW2;

public class City {
    private String name;
    private int population;
    private String climate;

    //через конструктор
    public City(String name) {
        this.name = name;
    }

    //через сеттер
    public void setPopulation(int population) {
        this.population = population;
    }

    //через ініт
    public void init (){
        this.climate = "4 сезони";
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", climate='" + climate + '\'' +
                '}';
    }
}
