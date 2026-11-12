package arraylist;

import java.util.ArrayList;

public class MainArray {
    public static void main(String[] args) {


        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Melancia");
        frutas.add("Laranja");
        frutas.add("Limão");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }


    }
}
