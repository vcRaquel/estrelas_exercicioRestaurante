package br.com.zup;

import java.util.Scanner;

public class Sistema {
    //método para entrada de dados
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    //método para exibir menu
    public static void menu() {
        System.out.println("Bem vinde à taberna do Pôney Saltitante");

        System.out.println("Digite 1 - Para exibir o cardápio");
        System.out.println("Digite 2 - Para cadastrar um prato");
        System.out.println("Digite 3 - Para sair");
    }
}
