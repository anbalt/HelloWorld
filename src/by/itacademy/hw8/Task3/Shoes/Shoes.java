package src.by.itacademy.hw8.Task3.Shoes;

import src.by.itacademy.hw8.Task3.Buyable;
import src.by.itacademy.hw8.Task3.Item;

import java.util.Objects;

public class Shoes extends Item implements Buyable {
  private ShoesSize[] shoesSize;

  public Shoes(int id, String name, double price, String color, int availableAmount, ShoesSize[] shoesSize) {
    super(id, name, price, color, availableAmount);
    this.shoesSize = shoesSize;
  }

  public ShoesSize[] getShoesSize() {
    return shoesSize;
  }

  public void setShoesSize(ShoesSize shoesSize) {
    this.shoesSize = new ShoesSize[]{shoesSize};
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Shoes shoes = (Shoes) o;
    return shoesSize == shoes.shoesSize;
  }

  @Override
  public int hashCode() {
    return Objects.hash(shoesSize);
  }

  @Override
  public String toString() {
    return "Shoes{" +
            "shoesSize=" + shoesSize +
            '}';
  }

  @Override
  public void buy() {
    availableAmount--;
  }
}
