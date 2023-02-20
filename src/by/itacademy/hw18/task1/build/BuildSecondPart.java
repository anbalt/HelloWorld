package src.by.itacademy.hw18.task1.build;

import src.by.itacademy.hw18.task1.ILineStep;
import src.by.itacademy.hw18.task1.IProductPart;
import src.by.itacademy.hw18.task1.part.Motherboard;

public class BuildSecondPart implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("There is a motherboard.");
        return new Motherboard("motherboard");
    }
}
