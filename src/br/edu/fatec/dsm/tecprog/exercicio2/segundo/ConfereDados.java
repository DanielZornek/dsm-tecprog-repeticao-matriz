package br.edu.fatec.dsm.tecprog.exercicio2.segundo;

import java.util.Scanner;

public class ConfereDados {
    public static void main(String[] args) {
        String[][] dados = {
                {"paulo", "naruto", "goku", "daniel", "alessandro", "felipe"},
                {"paulo123", "rasengan", "genkidama", "trator", "cafeh", "euamophp"}
        };

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o nome de usuário: ");
        String usuario = entrada.nextLine();

        System.out.print("Insira a senha: ");
        String senha = entrada.nextLine();

        boolean encontrou = false;
        for (int i = 0; i < dados[0].length; i++) {
            if (usuario.equals(dados[0][i]) && senha.equals(dados[1][i])) {
                encontrou = true;
                break;
            }
        }

        if (encontrou) {
            System.out.println("Login Confere!");
        } else {
            System.out.println("Usuário ou senha inválidos.");
        }

        entrada.close();
    }
}