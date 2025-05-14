import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opcao;
        Scanner op = new Scanner(System.in);

        //Exemplos de generos textuais abordados
        Romance domCasmurro = new Romance("Dom Casmurro", "Um romance escrito por Machado de Assis, publicado em 1899", "Machado de Assis");
        Poema sonetoDeFidelidade = new Poema("Soneto de Fidelidade", "Um famoso soneto de Vinicius de Moraes", "Soneto", 14);
        Conto aTerceiraMargemDoRio = new Conto("A Terceira Margem do Rio", "Um conto enigmático de Guimarães Rosa", 10, "Isolamento e Existência");

        do{
            System.out.println("-MENU-");
            System.out.println("1-Generos Textuais");
            System.out.println("2-tema 2");
            System.out.println("3-tema 3");
            System.out.println("0-Sair");
            System.out.print("Escolha uma opção: ");
            opcao = op.nextInt();
            op.nextLine();

            switch (opcao) {
                case 0 -> {
                }
                case 1 -> {
                    //ler e validar o que o usuario digitar
                        Scanner sc = new Scanner(System.in);
                        String generotextual;
                        do {
                        System.out.print("Digite o nome da figura (ex: Romance, Poema, Conto,): ");
                        generotextual = sc.nextLine().toLowerCase();
                        } while (!generotextual.equals("romance") && !generotextual.equals("conto") && 
                        !generotextual.equals("poema")); 
                        sc.close();

                        //processamento com base no que foi escolhido abaixo
                    break;
                }
                case 2 -> {
                    //ler e validar o que o usuario digitar
                        Scanner sc = new Scanner(System.in);
                        String tema2;
                        do {
                        System.out.print("Digite o subtema: (ex: subtema1, subtema2, subtema3,): ");
                        tema2 = sc.nextLine().toLowerCase();
                        } while (!tema2.equals("subtema1") && !tema2.equals("subtema2") && 
                        !tema2.equals("subtema3")); 
                        sc.close();

                        //processamento com base no que foi escolhido abaixo
                    break;
                }
                case 3 -> {
                    //ler e validar o que o usuario digitar
                        Scanner sc = new Scanner(System.in);
                        String tema3;
                        do {
                        System.out.print("Digite o subtema: (ex: subtema1, subtema2, subtema3,): ");
                        tema3 = sc.nextLine().toLowerCase();
                        } while (!tema3.equals("subtema1") && !tema3.equals("subtema2") && 
                        !tema3.equals("subtema3"));
                        sc.close(); 

                        //processamento com base no que foi escolhido abaixo
                    break;
                }
                default -> System.out.println("Opção inválida");
            }
        }while(opcao != 0);
        System.out.println("Programa encerrado.");
        op.close();
    }

}

