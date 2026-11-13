package listacollection;

import java.util.ArrayList;
import java.util.Collections;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(7);
        lista.add(2);
        lista.add(4);
        lista.add(1);

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
