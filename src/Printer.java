import Flowers.Flower;

public class Printer {

    public static void print(Flower[] flowers){
        StringBuilder str = new StringBuilder(flowers.length);
        str.append("[ ");
        for(Flower flower : flowers){
            str.append(flower.getName());
            str.append(" ");
        }
        str.append("]");
        System.out.println(str.toString());
    }

    public static void printPrice(double price){
        System.out.println("price = " + price);
    }
}
