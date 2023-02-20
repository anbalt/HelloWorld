package src.by.itacademy.hw18.task1.build;

import src.by.itacademy.hw18.task1.part.Display;
import src.by.itacademy.hw18.task1.ILineStep;
import src.by.itacademy.hw18.task1.IProductPart;

public class BuildThirdPart implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("There is a display.");
        return new Display("display");
    }
}
