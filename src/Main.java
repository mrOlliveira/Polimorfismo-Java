import java.util.Scanner;
import portugues.*;
import matematica.*;
import geografia.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao =-1;

        do {
            System.out.println("\n==== SISTEMA EDUCATIVO ====");
            System.out.println("1 - Português");
            System.out.println("2 - Matemática");
            System.out.println("3 - Geografia");
            System.out.println("4 - Praticar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            
            try {
                opcao = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Digite apenas números!");
                sc.nextLine();
                continue;
            }

            switch (opcao) {
                case 1 -> menuPortugues(sc);
                case 2 -> menuMatematica(sc);
                case 3 -> menuGeografia(sc);
                case 4 -> menuPraticar(sc);
                case 0 -> System.out.println("Até logo!");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        sc.close();
    }

    private static void menuPortugues(Scanner sc) {
        System.out.println("\n=== GÊNEROS TEXTUAIS ===");
        System.out.println("Digite o gênero que deseja aprender:");
        System.out.println("- narrativo");
        System.out.println("- descritivo");
        System.out.println("- dissertativo");
        System.out.print("Sua escolha: ");
        
        String escolha = sc.nextLine().toLowerCase().trim();
        GeneroTextual genero = switch (escolha) {
            case "narrativo" -> new Narrativo("João investigou os sons na mansão...");
            case "descritivo" -> new Descritivo("A praia tinha areia branca e ondas azul-turquesa...");
            case "dissertativo" -> new Dissertativo("A educação digital é essencial porque...");
            default -> {
                System.out.println("Gênero inválido!");
                yield null;
            }
        };
        
        if (genero != null) {
            genero.apresentarCaracteristicas();
            genero.exibirExemplo();
        }
    }

    private static void menuMatematica(Scanner sc) {
    System.out.println("\n=== TRIGONOMETRIA ===");

    System.out.print("Digite um ângulo em graus: ");
    double angulo = sc.nextDouble();
    sc.nextLine();

    boolean valido = false;
    do {
        System.out.println("\nEscolha a função trigonométrica:");
        System.out.println("Seno");
        System.out.println("Cosseno");
        System.out.println("Tangente");
        System.out.print("Sua escolha: ");
        String escolha = sc.nextLine().toLowerCase().trim();

        switch (escolha) {
            case "seno" -> {
                Seno seno = new Seno(angulo);
                seno.calcular();
                seno.exibirExemplo();
                seno.exibirResultado();
                valido = true;
            }
            case "cosseno" -> {
                Cosseno cosseno = new Cosseno(angulo);
                cosseno.calcular();
                cosseno.exibirExemplo();
                cosseno.exibirResultado();
                valido = true;
            }
            case "tangente" -> {
                Tangente tangente = new Tangente(angulo);
                tangente.calcular();
                tangente.exibirExemplo();
                tangente.exibirResultado();
                valido = true;
            }
            default -> {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
    } while (!valido);
}


    private static void menuGeografia(Scanner sc) {
    System.out.println("\n=== CLIMAS ===");
    sc.nextLine();
    System.out.print("Digite uma região: ");
    String regiao = sc.nextLine();

    boolean valido = false;
    do {
        System.out.println("\nEscolha o clima da região:");
        System.out.println("Tropical");
        System.out.println("Desértico");
        System.out.println("Equatorial");
        System.out.print("Sua escolha: ");
        String escolha = sc.nextLine().toLowerCase().trim();

        switch (escolha) {
            case "tropical" -> {
                Tropical clima = new Tropical(regiao);
                clima.caracteristicas();
                clima.descrever();
                valido = true;
            }
            case "desértico", "desertico" -> {
                Desertico clima = new Desertico(regiao);
                clima.caracteristicas();
                clima.descrever();
                valido = true;
            }
            case "equatorial" -> {
                Equatorial clima = new Equatorial(regiao);
                clima.caracteristicas();
                clima.descrever();
                valido = true;
            }
            default -> System.out.println("Opção inválida, tente novamente.");
        }
    } while (!valido);
}


    private static void menuPraticar(Scanner sc) {
        System.out.println("\n=== MODO PRÁTICA ===");
        System.out.println("Escolha a matéria:");
        System.out.println("- portugues");
        System.out.println("- matematica");
        System.out.println("- geografia");
        System.out.print("Sua escolha: ");
        
        String escolha = sc.nextLine().toLowerCase().trim();
        switch (escolha) {
            case "portugues" -> {
                System.out.println("\nQual gênero apresenta argumentos?");
                System.out.println("a) Narrativo");
                System.out.println("b) Descritivo");
                System.out.println("c) Dissertativo");
                System.out.print("Resposta: ");
                String resposta = sc.nextLine();
                System.out.println(resposta.equalsIgnoreCase("c") 
                    ? "Correto!" 
                    : "Errado! É o dissertativo.");
            }
            case "matematica" -> {
                System.out.println("\nQuanto é sen(30°)?");
                System.out.print("Resposta: ");
                try {
                    double res = Double.parseDouble(sc.nextLine());
                    System.out.println(Math.abs(res - 0.5) < 0.001 
                        ? "Correto!" 
                        : "Errado! É 0.5");
                } catch (NumberFormatException e) {
                    System.out.println("Digite um número!");
                }
            }
            case "geografia" -> {
                System.out.println("\nQual clima tem duas estações bem definidas?");
                System.out.println("a) Desértico");
                System.out.println("b) Equatorial");
                System.out.println("c) Tropical");
                System.out.print("Resposta: ");
                String resposta = sc.nextLine();
                System.out.println(resposta.equalsIgnoreCase("c") 
                    ? "Correto!" 
                    : "Errado! É o tropical.");
            }
            default -> System.out.println("Matéria inválida!");
        }
    }
}