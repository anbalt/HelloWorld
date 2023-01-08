package src.by.itacademy.hw7.Task4;

public class Bouquet implements myBouquet {

    private Flower[] flowers;
    public Bouquet(int count) {
        flowers = new Flower[count];
    }
    public Flower[] getFlowers() {
        return this.flowers;
    }
    @Override
    public void addFlower(Flower flower) {
        if(FlowersPosition.getLength(this.flowers)) {
            int position = FlowersPosition.getPosition(this.flowers);
            this.flowers[position] = flower;
        } else {
            System.out.println("The bouquet is not available.");
        }

    }
    @Override
    public int getBouquetPrice() {
        double result = 0;
        for(Flower flower : this.flowers) {
            if(flower != null)
                result += flower.getPrice();
            else
                break;
        }
        return (int) result;
    }
}
