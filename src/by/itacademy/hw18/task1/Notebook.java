package src.by.itacademy.hw18.task1;

import src.by.itacademy.hw18.task1.build.BuildFirstPart;
import src.by.itacademy.hw18.task1.build.BuildSecondPart;
import src.by.itacademy.hw18.task1.build.BuildThirdPart;
import src.by.itacademy.hw18.task1.part.Body;
import src.by.itacademy.hw18.task1.part.Display;
import src.by.itacademy.hw18.task1.part.Motherboard;

public class Notebook implements IAssemblyLine {
    @Override
    public IProduct assembleProduct(IProduct iProduct) {

        Body body = (Body) new BuildFirstPart().buildProductPart();
        iProduct.installFirstPart(body);

        Motherboard motherboard = (Motherboard) new BuildSecondPart().buildProductPart();
        iProduct.installSecondPart(motherboard);

        Display display = (Display) new BuildThirdPart().buildProductPart();
        iProduct.installThirdPart(display);

        InstallationPart installationPart = new InstallationPart(body, motherboard, display);
        System.out.println("The notebook is built!");

        return installationPart;
    }
}
