package Bouquet;

import Flowers.Flower;

public class Checker {

    /*public static boolean checkLength(Flower[] flowers){
        boolean flag = true;
        if(flowers[flowers.length-1]!=null){
            flag = false;
        }
        return flag;
    }*/

    /**
     * @param flowers
     * @return свободное место
     */
    public static int getPosition(Flower[] flowers){
        int position = -1;
        for(int i=0;i<flowers.length;i++){
            if(flowers[i]==null){
                position=i;
                break;
            }
        }
        return position;
    }
}
