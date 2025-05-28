import java.util.ArrayList;
import java.util.Scanner;
import Matematica.*;
import Geografia.*;
import Portugues.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> objetos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n==== Oque Você quer aprender hoje? ====");
            System.out.println("1 - Português (Gêneros Textuais)");
            System.out.println("2 - Matemática (Trigonometria)");
            System.out.println("3 - Geografia (Climas)");
            System.out.println("4 - Praticar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o gênero (1-narrativo, 2-descritivo, 3-dissertativo): ");
                    int op = sc.nextInt();
                    do {
            if (op == 1) {
                Narrativo.apresentarCaracteristicas();
                Narrativo.exibirExemplo();
            } else if (op == 2){
                Descritivo.apresentarCaracteristicas();
                Descritivo.apresentarCaracteristicas();
            }else {
                Dissertativo.apresentarCaracteristicas();
                Dissertativo.apresentarCaracteristicas();
            } 
        }while (op <= 3);
//n sei pq essa bosta ta dando errado, desculpa
                    break;

                case 2:
                System.out.print("Digite a forma trigonometrica \n (1-Seno, 2-Cosseno, 3-Cosseno): ");
                    int op = sc.nextInt();
                    do {
            if (op == 1) {
               Seno.exibirExemplo()
            } else if (op == 2){
               Cosseno.exibirExemplo():
            }else {
               Tangente.exibirExemplo();
            } 
        }while (op <= 3);
//n sei pq essa bosta ta dando errado, desculpa
                    

                    break;

                case 3:
                  System.out.print("Digite o clima desejado \n (1-Desertico, 2-Equatorial, 3-Tropical): ");
                    int op = sc.nextInt();
                    do {
            if (op == 1) {
               Desertico.caracteristicas()
               Desertico.descrever();
            } else if (op == 2){
               Equatorial.caracteristicas()
               Equatorial.descrever();
            }else {
               Tropical.caracteristicas()
               Tropical.descrever();
            } 
        }while (op <= 3);
//n sei pq essa bosta ta dando errado, desculpa
                    break;

                case 4:

            System.out.println("\nQual Tema você quer praticar?");
            System.out.println("1 - Português (Gêneros Textuais)");
            System.out.println("2 - Matemática (Trigonometria)");
            System.out.println("3 - Geografia (Climas)");
            int praticar = sc.nextInt();
            //daqui pra baixo vem as questões e tal
            do {
            if (praticar == 1) {
                //questoes de pt
            }else if (praticar == 2){
                System.out.print("Digite a operação (seno, cosseno, tangente): ");
                String operacao = sc.nextLine().toLowerCase();

                System.out.print("Digite o ângulo em graus: ");
                double angulo = sc.nextDouble();
                sc.nextLine();
            } else {
                //questao de geo
            }
        }while (praticar <= 3);
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
