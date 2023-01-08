package src.by.itacademy.hw7.Task4;

public class Main {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet(3);

        Rose rose = new Rose();
        Lily lily = new Lily();
        Chamomile chamomile = new Chamomile();

        System.out.println("The bouquets contains: ");
        bouquet.addFlower(rose);
        bouquet.addFlower(lily);
        bouquet.addFlower(chamomile);

        Printer.printBouquet(bouquet.getFlowers());
        Printer.printPrice(bouquet.getBouquetPrice());

        int shelfLife;
        for (shelfLife = 7; shelfLife <= 7; shelfLife--) {
                if (shelfLife == 0)
                    break;
                else
                    System.out.println("The bouquet will wither in " + shelfLife + " days");
            }
        }
    }

