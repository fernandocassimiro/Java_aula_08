/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste6;

/**
 *
 * @author Fernando
 */
import java.util.Scanner;
public class Teste6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         boolean continuar=true;

  int opcao;

  Scanner entrada = new Scanner(System.in);

  do

  {

  System.out.println("\t\tMenu de opções a serem escolhidas:");

  System.out.println("\t1. Que número você apertou?");

  System.out.println("\t2. Desculpe, não entendi?");

  System.out.println("\t3. Você já digitou? Digite de novo, por favor!");

  System.out.println("\t4. O menu será apresentado novamente, ok!?");

  System.out.println("\t5. Não li, pode repetir, por favor?");

  System.out.println("\t0. Sair");

  System.out.print("\nInsira sua opção: ");

  opcao = entrada.nextInt();

  if(opcao == 0){

  continuar = false;

  System.out.println("Programa finalizado.");

  }

  else{

  System.out.printf("\n\n\n\n\n\n");

  }

  } while( continuar );
    }
    
}
