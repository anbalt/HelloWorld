package src.by.itacademy.hw8.Task3;

import java.util.Objects;

public abstract class Item {
    private int id;
    private String name;
    private double price;

    private String color;
    protected int availableAmount;

    public Item(int id, String name, double price, String color, int availableAmount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.availableAmount = availableAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Double.compare(item.price, price) == 0 && availableAmount == item.availableAmount && Objects.equals(name, item.name) && Objects.equals(color, item.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, color, availableAmount);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", availableAmount=" + availableAmount +
                '}';
    }
}
