package src.by.itacademy.hw8.Task3.Clothes;

import src.by.itacademy.hw8.Task3.Buyable;
import src.by.itacademy.hw8.Task3.Item;

import java.util.Objects;

public class Clothes extends Item implements Buyable {
    private ClothesSizes[][] clothesSizes;

    public Clothes(int id, String name, double price, String color, int availableAmount, ClothesSizes[] clothesSizes) {
        super(id, name, price, color, availableAmount);
        this.clothesSizes = new ClothesSizes[][]{clothesSizes};
    }

    public ClothesSizes[][] getClothesSizes() {
        return clothesSizes;
    }

    public void setClothesSizes(ClothesSizes clothesSizes) {
        this.clothesSizes = new ClothesSizes[][]{new ClothesSizes[]{clothesSizes}};
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return clothesSizes == clothes.clothesSizes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clothesSizes);
    }


    @Override
    public void buy() {
        availableAmount--;
    }
}
