import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1 ");

        int [] weight = new int[3];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;

        float [] symbols = { 1.57f, 7.654f, 9.986f};

        int [] something = {1, 2, 3, 4, 5 };



        System.out.println("Задача №2 ");

        for (int i = 0; i < weight.length; i++) {
            if (i != 2){
                System.out.print(weight[i] + "," );
            }
            else {
                System.out.print(weight[i]);
            }
        }

        System.out.println("");
        for (int i = 0; i < symbols.length; i++) {
            if (i != 2){
                System.out.print(symbols[i] + ",");
            }
            else System.out.print(symbols[i]);
        }

        System.out.println("");
        for (int i = 0; i < something.length; i++) {
            if (i != 4){
                System.out.print(something[i] + ",");
            }
            else System.out.print(something[i]);
        }



        System.out.println("");
        System.out.println("Задача №3 ");

        for (int i = weight.length - 1; i >= 0; i--) {
            if (i != 0){
                System.out.print(weight[i] + ",");
            }
            else {
                System.out.println(weight[i]);
            }

        }
        System.out.println( "");
        for (int i = symbols.length - 1; i >= 0 ; i--) {
            if (i != 0){
                System.out.print(symbols[i] + ", ");
            }
            else System.out.println(symbols[i]);

        }
        System.out.println("");
        for (int i = something.length - 1; i >= 0; i--) {
            if (i !=0){
                System.out.print(something[i] + ", ");
            }
            else {
                System.out.println(something[i]);
            }
        }


        System.out.println("");
        System.out.println("Задача №4 ");

        int [] arr = {1, 2, 3};


        for (int i = 0; i < arr.length; i++) {
            if (arr [i] % 2 != 0 ){
                arr[i] ++;
            }
        }System.out.println(Arrays.toString(arr));









        











            
        














    }
}