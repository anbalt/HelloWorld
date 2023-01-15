package src.by.itacademy.hw8.Task3;

import src.by.itacademy.hw8.Task3.Clothes.Clothes;
import src.by.itacademy.hw8.Task3.Clothes.ClothesSizes;
import src.by.itacademy.hw8.Task3.Shoes.Shoes;
import src.by.itacademy.hw8.Task3.Shoes.ShoesSize;

public class OnlineShop {
    private Clothes[] clothes;
    private Shoes[] shoes;
    private Clothes[] clothesArray;

    public  Clothes[] getClothes() {
        int count = 0;
        for(Clothes c : clothes) {
            if (c != null) {
                count++;
            }
        }
        Clothes[] clothesArray = new Clothes[count];
        for (int i = 0; i < clothesArray.length; i++) {
            clothesArray[i] = clothes[i];
        }
        return clothesArray;
    }

    public void initClothes() {
        clothes = new Clothes[3];

        Clothes dress = new Clothes(1, "Dress",
                54.5, "blue", 5, new ClothesSizes[]{ClothesSizes.M});
        Clothes skirt = new Clothes(2, "Skirt",
                20.9, "red", 7, new ClothesSizes[]{ClothesSizes.S});
        Clothes shirt = new Clothes(3, "Shirt",
                35.5, "white", 15, new ClothesSizes[]{ClothesSizes.L});

        clothes[0] = dress;
        clothes[1] = skirt;
        clothes[2] = shirt;
    }

    public Shoes[] getShoes() {
        int count = 0;
        for(Shoes c : shoes) {
            if (c != null) {
                count++;
            }
        }
        Shoes[] shoesArray = new Shoes[count];
        for (int i = 0; i < shoesArray.length; i++) {
            shoesArray[i] = shoes[i];
        }
        return shoesArray;
    }
    public void initShoes() {
        shoes = new Shoes[3];

        Shoes boots = new Shoes(4, "Boots",
                30.1, "black", 8, new ShoesSize[] {ShoesSize.THIRTY_NINE});
        Shoes highHeel = new Shoes(5, "HighHeel",
                28.7, "pink", 9, new ShoesSize[]{ShoesSize.THIRTY_SEVEN});
        Shoes sneakers = new Shoes(6, "Sneakers",
                32.6, "yellow", 17, new ShoesSize[]{ShoesSize.FOURTY});

        shoes[0] = boots;
        shoes[1] = highHeel;
        shoes[2] = sneakers;
    }

    public void buyClothesByColor(String color) {
        for (Clothes item : clothes) {
            if(item.getColor().equals(color)) {
                item.buy();
            }
        }
    }

    public void buyClothesBySize(ClothesSizes[] clothesSizes) {
        for (Clothes item : clothes) {
            if(item.getColor().equals(clothesSizes)) {
                item.buy();
            }
        }
    }

    public void buyShoesByColor(String color) {
        for (Shoes item : shoes) {
            if(item.getColor().equals(color)) {
                item.buy();
            }
        }
    }

    public void buyShoesBySize(ShoesSize[] shoesSizes) {
        for (Shoes item : shoes) {
            if(item.getColor().equals(shoesSizes)) {
                item.buy();
            }
        }
    }
}
