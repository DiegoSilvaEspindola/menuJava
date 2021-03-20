package trabalhoMod3;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        int status = 1;
        int op;
        Scanner entrada = new Scanner (System.in);

        while ( status == 1){

            System.out.println("Menu ");
            System.out.println("Digite 1 para pagar ");
            System.out.println("Digite 2 para receber");
            System.out.println("Digite 3 para sair");
            System.out.println("Somente opções 1,2,3,");
            op = entrada.nextInt();

            switch(op){
                case 1 :
                    System.out.println("DEPOSITO EFETUADO !");
                    break;
                case 2 :
                    System.out.println("RECEBIMENTO CONCLUIDO !");
                    break;
                case 3 :
                    System.out.println("SAINDO... VOLTE SEMPRE!");
                    status++;
                    break;


            }

        }

    }

}

