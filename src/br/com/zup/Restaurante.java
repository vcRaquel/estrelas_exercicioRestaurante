package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    List<Prato> cardapio = new ArrayList<>();

    //Método construtor
    public Restaurante() {

    }

    //Getter
    public List<Prato> getCardapio() {
        return cardapio;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Quantidade de pratos: " + cardapio.size());
        retorno.append("Pratos: ");
        retorno.append("\n" + cardapio);
        return retorno.toString();
    }

    //Método para adicionar um prato
    public void adicionarPrato(Prato novoPrato){
        cardapio.add(novoPrato);
    }


}
