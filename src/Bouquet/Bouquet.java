package Bouquet;

import java.util.Scanner;

public class Bouquet {
    double[] price = {1.5, 2.5, 3.0, 4.2};
    String[] name = {"Aloe", "Aster", "Rosebud", "Herbera"};

    public void totalPrice() {
        String inputName = "";
        double total = 0;
        Scanner in = new Scanner(System.in);
        while (!inputName.equals("q")) {
            inputName = in.nextLine();
            for (int i = 0; i < name.length; i++) {
                if (name[i].equals(inputName)) {
                    total = total + price[i];
                }
            }
        }
        System.out.println(total);
    }
}
