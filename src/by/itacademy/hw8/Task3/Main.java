package src.by.itacademy.hw8.Task3;

import src.by.itacademy.hw8.Task3.Clothes.Clothes;
import src.by.itacademy.hw8.Task3.Clothes.ClothesSizes;
import src.by.itacademy.hw8.Task3.Shoes.ShoesSize;

public class Main {
    private Clothes[] clothesArray;

    public static void main(String[] args) {

        OnlineShop onlineShop = new OnlineShop();

        onlineShop.buyClothesByColor("red");
        onlineShop.buyClothesByColor("blue");
        onlineShop.buyClothesByColor("white");

        onlineShop.buyClothesBySize(new ClothesSizes[]{ClothesSizes.S});
        onlineShop.buyClothesBySize(new ClothesSizes[]{ClothesSizes.L});
        onlineShop.buyClothesBySize(new ClothesSizes[]{ClothesSizes.M});

        onlineShop.buyShoesByColor("red");
        onlineShop.buyShoesByColor("blue");
        onlineShop.buyShoesByColor("white");

        onlineShop.buyShoesBySize(new ShoesSize[]{ShoesSize.FOURTY});
        onlineShop.buyShoesBySize(new ShoesSize[]{ShoesSize.THIRTY_NINE});
        onlineShop.buyShoesBySize(new ShoesSize[]{ShoesSize.THIRTY_SEVEN});
    }

}
