package src.by.itacademy.hw8.Task1;

public class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }
    public void prepare(Cookable c) {
        c.cook();
    }
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;

        Food food = (Food) o;
        return name.equals(food.name);
    }
    public int hashCode() {
        return name.hashCode();
    }
    public String toString() {
        return '\"' + name.toUpperCase() + '\"';
    }
}
