import java.util.Scanner;
import portugues.*;
import matematica.*;
import geografia.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

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
                System.out.println("\n1) Qual gênero apresenta argumentos?");
                System.out.println("a) Narrativo\nb) Descritivo\nc) Dissertativo");
                System.out.print("Resposta: ");
                String r1 = sc.nextLine();
                System.out.println(r1.equalsIgnoreCase("c") ? "Correto!" : "Errado! É o dissertativo.");

                System.out.println("\n2) Qual tipo de texto foca em retratar características?");
                System.out.println("a) Descritivo\nb) Narrativo\nc) Dissertativo");
                System.out.print("Resposta: ");
                String r2 = sc.nextLine();
                System.out.println(r2.equalsIgnoreCase("a") ? "Correto!" : "Errado! É o descritivo.");

                System.out.println("\n3) Qual gênero textual apresenta ações encadeadas com personagens?");
                System.out.println("a) Dissertativo\nb) Narrativo\nc) Descritivo");
                System.out.print("Resposta: ");
                String r3 = sc.nextLine();
                System.out.println(r3.equalsIgnoreCase("b") ? "Correto!" : "Errado! É o narrativo.");
            }

            case "matematica" -> {
                System.out.println("\n1) Quanto é seno(30°)?");
                System.out.print("Resposta: ");
                try {
                    double res = Double.parseDouble(sc.nextLine());
                    System.out.println(Math.abs(res - 0.5) < 0.01 ? "Correto!" : "Errado! É 0.5");
                } catch (NumberFormatException e) {
                    System.out.println("Digite um número!");
                }

                System.out.println("\n2) Quanto é cosseno(0°)?");
                System.out.print("Resposta: ");
                try {
                    double res2 = Double.parseDouble(sc.nextLine());
                    System.out.println(Math.abs(res2 - 1.0) < 0.01 ? "Correto!" : "Errado! É 1");
                } catch (NumberFormatException e) {
                    System.out.println("Digite um número!");
                }

                System.out.println("\n3) Quanto é tangente(60°)?");
                System.out.print("Resposta: ");
                try {
                    double res3 = Double.parseDouble(sc.nextLine());
                    System.out.println(Math.abs(res3 - 1.732) < 0.01 ? "Correto!" : "Errado! É 1.732");
                } catch (NumberFormatException e) {
                    System.out.println("Digite um número!");
                }
            }

            case "geografia" -> {
                System.out.println("\n1) Qual clima tem duas estações bem definidas?");
                System.out.println("a) Desértico\nb) Equatorial\nc) Tropical");
                System.out.print("Resposta: ");
                String r1 = sc.nextLine();
                System.out.println(r1.equalsIgnoreCase("c") ? "Correto!" : "Errado! É o tropical.");

                System.out.println("\n2) Qual clima apresenta altas temperaturas e chuvas o ano todo?");
                System.out.println("a) Desértico\nb) Equatorial\nc) Tropical");
                System.out.print("Resposta: ");
                String r2 = sc.nextLine();
                System.out.println(r2.equalsIgnoreCase("b") ? "Correto!" : "Errado! É o equatorial.");

                System.out.println("\n3) Qual clima é caracterizado por baixíssima umidade e pouca precipitação?");
                System.out.println("a) Desértico\nb) Equatorial\nc) Tropical");
                System.out.print("Resposta: ");
                String r3 = sc.nextLine();
                System.out.println(r3.equalsIgnoreCase("a") ? "Correto!" : "Errado! É o desértico.");
            }
            default -> System.out.println("Matéria inválida!");
        }
    }
}
