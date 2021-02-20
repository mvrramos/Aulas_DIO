package Listas;

import java.util.ArrayList;
import java.util.List;

public class Exemplo001 {
    public static void main(String[] args) {
        //Cria a lista
        List<String> nomes = new ArrayList<>();

        //Adiciona elementos a lista
        nomes.add("Marcos");
        nomes.add("Thay");
        nomes.add("Carlos");
        nomes.add("João");
        nomes.add("Anderson");

        System.out.println(nomes);
        
        //Substitui o nome do indice pelo Thiago
        nomes.set(2, "Thiago");
        System.out.println(nomes);

        //Remove o nome equivalente ao indice
        nomes.remove(2);
        System.out.println(nomes);

        //Retorna o nome equivalente ao indice
        String nome = nomes.get(3);
        System.out.println("Indice: "+nome+" do nome "+nome);

        //Mostra o numero de elementos
        int tamanho = nomes.size();
        System.out.println("Tamanho do array: "+tamanho);

        //Retorna booleano se tem o elemento 
        boolean temThay = nomes.contains("Thay");
        System.out.println("Tem o nome Thay? "+temThay);

        //Retorna booleano se a lista está vazia
        boolean listaVazia = nomes.isEmpty();
        System.out.println("A lista está vazia: "+listaVazia);

        //Retorna posicao na lista
        int posicao = nomes.indexOf("João");
        System.out.println("Posição de João: "+posicao);

        
    }
}