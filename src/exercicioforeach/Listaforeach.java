package exercicioforeach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listaforeach {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Fabio");
        lista.add("Idaneide");
        lista.add("Gabriel");

        Collections.sort(lista);
        System.out.println(lista);

        for (String nomes : lista){
            System.out.println(nomes);
        }

    }
}
