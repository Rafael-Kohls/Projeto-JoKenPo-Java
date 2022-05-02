package javaapplication3;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        System.out.println("***Bem vindo ao jogo Pedra-Papel-Tesoura***");
        System.out.println(" ");
        System.out.println("******Placar Atual******");
        System.out.println(" Jogador: 0 Máquina: 0");
        System.out.println("************************");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Escolha sua jogada:");
        System.out.println("1 - Tesoura");
        System.out.println("2 - Papel");
        System.out.println("3 - Pedra");
       
        Random gerador = new Random();
        Scanner leitor = new Scanner(System.in);

        int numDado;
        int numUsua;
        int pontosU = 0;
        int pontosM = 0;
        
        for(int i = 0; i < 3; i++)
        {
            numUsua = leitor.nextInt();
            numDado = gerador.nextInt(3) + 1;

            switch(numDado){
                case 1:
                    System.out.println("A máquina escolheu Tesoura.");
                    System.out.println(" ");
            break;
                case 2:
                    System.out.println("A máquina escolheu Papel.");
                    System.out.println(" ");
            break;
                case 3:
                    System.out.println("A máquina escolheu Pedra.");
                    System.out.println(" ");
            break;
            }

            switch(numUsua){
                case 1:
                    System.out.println("Você esolheu Tesoura.");
                    System.out.println(" ");
            break;
                case 2:
                    System.out.println("Você escolheu Papel.");
                    System.out.println(" ");
            break;
                case 3:
                    System.out.println("Você escolheu Pedra.");
                    System.out.println(" ");
            break;
            }

            if(numDado == numUsua){
                System.out.println("Empatou, Um ponto para cada.");
                System.out.println(" ");
                pontosM = pontosM + 1;
                pontosU = pontosU + 1;
            } 
            else if((numDado - numUsua)== 1 ||
                    (numDado - numUsua)== -2){
                System.out.println("Parabéns, Você marcou 1 ponto!");
                System.out.println(" ");
                pontosU = pontosU + 1;
            }
            else{
                System.out.println("Ah não, a máquina marcou 1 ponto!");
                System.out.println(" ");
                pontosM = pontosM + 1;
            }
            
                System.out.println("******Placar Atual******");
                System.out.println("Jogador:" + pontosU + " " + "Máquina:" + pontosM);
                System.out.println("************************");
        }
        if(pontosM > pontosU){
            System.out.println("a Máquina Ganhou a melhor de 3.");
        }
        else if(pontosM < pontosU){
            System.out.println("Você Ganhou a melhor de 3.");
        }
        else{
        System.out.println("A melhor de 3 empatou.");}
                
     
    }
    
}
