package Bouquet;

import Flowers.Flower;

import java.util.Scanner;

public class Bouquet {
   private Flower[] flowersBouquet = {};

    public void setFlowersBouquet(Flower[] flowersBouquet) {
        this.flowersBouquet = flowersBouquet;
    }

    public void totalPrice() {
        String inputName = "";
        double total = 0;
        Scanner in = new Scanner(System.in);
        while (!inputName.equals("q")) {
            inputName = in.nextLine();
            for (Flower flower : flowersBouquet) {
                if (flower.getName().equals(inputName)) {
                    total = total + flower.getPrice();
                }
            }
        }
        System.out.println(total);
    }
}
