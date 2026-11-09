package tostringcomarray;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Gabriel",23);
        Pessoa pessoa2 = new Pessoa("Yuri",23);
        Pessoa pessoa3 = new Pessoa("Chada",23);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " +listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        System.out.println(listaDePessoas.toString());

    }
}
