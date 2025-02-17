package HW1;

public class Knight {
    private Quest quest;
    private String name;

    public Knight(Quest quest, String name) {
        this.quest = quest;
        this.name = name;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "quest=" + quest +
                ", name='" + name + '\'' +
                '}';
    }
}
