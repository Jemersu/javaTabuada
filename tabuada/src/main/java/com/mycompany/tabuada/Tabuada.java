package com.mycompany.tabuada;
import java.util.Scanner; //importado biblioteca Scanner

public class Tabuada {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); //instanciando a biblioteca 
        
        //Variaveis
        int tabuada;
        int num;
        
        System.out.print("TABUDA \nDigite o número da tabuada: ");  //mostre/mensagem para o usuario
        tabuada = scan.nextInt(); //captura do dado inserido pelo usuario
    
        for(num = 0; num < 11; num++) //estrutura de repetição
        {
            System.out.println(tabuada + " " + " x " + " " + num + " = " + (num*tabuada)); //mostre/mensagem para o usuario
        }//fim for
        
    }//fim Método Principal
}//fim Classe
