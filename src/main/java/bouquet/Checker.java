package main.java.bouquet;

import main.java.flowers.Flower;

public class Checker {

    /*public static boolean checkLength(Flower[] main.java.flowers){
        boolean flag = true;
        if(main.java.flowers[main.java.flowers.length-1]!=null){
            flag = false;
        }
        return flag;
    }*/

    /**
     * @return свободное место
     */
    public static int getPosition(Flower[] flowers) {
        int position = -1;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] == null) {
                position = i;
                break;
            }
        }
        return position;
    }
}
