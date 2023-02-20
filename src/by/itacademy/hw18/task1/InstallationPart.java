package src.by.itacademy.hw18.task1;

public class InstallationPart implements IProduct {
    IProductPart body;
    IProductPart motherboard;
    IProductPart display;

    public InstallationPart(IProductPart body, IProductPart motherboard, IProductPart display) {
        this.body = body;
        this.motherboard = motherboard;
        this.display = display;
    }

    @Override
    public void installFirstPart(IProductPart productPart) {
        System.out.println("The body is installed");
        System.out.println();
    }

    @Override
    public void installSecondPart(IProductPart productPart) {
        System.out.println("The motherboard is installed");
        System.out.println();
    }

    @Override
    public void installThirdPart(IProductPart productPart) {
        System.out.println("The display is installed");
    }

    InstallationPart() {

    }
}
