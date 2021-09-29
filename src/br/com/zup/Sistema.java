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

    //método para exibir submenu
    public static void menuIngrediente(){
        System.out.println("Cadastro de ingredientes");
        System.out.println("Digite 1 - Para cadastrar ingrediente");
        System.out.println("Digite 2 - Para sair do submenu");
    }

    //método para criar cadastrar ingredientes:
    public static Ingrediente cadastrarIngrediente() {
        String nomeIngrediente = capturarDados("Digite o nome do ingrediente: ").nextLine();
        String quantidadeIngrediente = capturarDados("Digite a quantidade do Ingrediente: ").nextLine();
        Ingrediente ingrediente = new Ingrediente(nomeIngrediente, quantidadeIngrediente);
        return ingrediente;
    }

    //método para cadastrar os pratos
    public static Prato cadastrarPrato() {
        String nomePrato = capturarDados("Digite o nome do prato: ").nextLine();
        double valorPrato = capturarDados("Digite o valor do prato: ").nextDouble();
        Prato prato = new Prato(nomePrato, valorPrato);
        return prato;
    }

    public static void executar() {
        boolean menu = true;
        Restaurante restaurante = new Restaurante();

        while (menu) {
            menu();
            int opcaoDoUsuario = capturarDados("Digite a opção desejada: ").nextInt();

            if (opcaoDoUsuario == 1) {
                System.out.println(restaurante);
            } else if(opcaoDoUsuario == 2){
                Prato prato = cadastrarPrato(); // para cadastrar um novo prato
                restaurante.adicionarPrato(prato); // para adicionar o prato na lista cardápio da classe Restaurante
                //criando submenu para cadastrar ingredientes em um prato
                boolean submenu = true;
                while (submenu){
                    menuIngrediente();
                    int seletor = capturarDados("Digite a opção desejada: ").nextInt();
                    if (seletor == 1){
                        Ingrediente ingrediente = cadastrarIngrediente();
                        prato.adicionarIngrediente(ingrediente);
                    }else if (seletor == 2){
                        System.out.println("Estaremos direcionando você para o menu principal");
                        submenu = false;
                    }
                }

            }else if (opcaoDoUsuario == 3){
                System.out.println("Agradecemos a preferência! Volte sempre!");
                menu = false;
            }
        }

    }


}
