package src.by.itacademy.hw18.task1.build;

import src.by.itacademy.hw18.task1.ILineStep;
import src.by.itacademy.hw18.task1.IProductPart;
import src.by.itacademy.hw18.task1.part.Body;

public class BuildFirstPart implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("There is a body.");
        return new Body("body");

    }
}
