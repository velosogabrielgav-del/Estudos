package comparabletitulo;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {

        Titulo titulo = new Titulo("Itau","Banco");
        Titulo titulo2 = new Titulo("brasil","País");
        Titulo titulo3 = new Titulo("Rio de Janeiro","Estado");
        Titulo titulo4 = new Titulo("São Paulo","Estado");

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(titulo);
        lista.add(titulo2);
        lista.add(titulo3);
        lista.add(titulo4);

        Collections.sort(lista);
        System.out.println(lista);


    }
}
