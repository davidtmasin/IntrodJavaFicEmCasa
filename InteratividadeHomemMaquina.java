package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class InteratividadeHomemMaquina {
    public static void main(String[] args){
        Scanner nome = new Scanner(System.in);
        String usuario;

        System.out.println("Ol�, eu sou a Chewbacca, sua assistente virtual. Por qual nome posso te chamar?");
        usuario = nome.nextLine();

        System.out.println("Saudaa��es, "+usuario+". Seja bem-vindo(a)!");
    }
}
