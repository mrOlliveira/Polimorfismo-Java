import java.util.Scanner;
import java.util.ArrayList;
import portugues.*;
import matematica.*;
import geografia.*;

public class Main {
    private static ArrayList<String> historico = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n==== SISTEMA EDUCATIVO ====");
            System.out.println("1 - Português");
            System.out.println("2 - Matemática");
            System.out.println("3 - Geografia");
            System.out.println("4 - Praticar");
            System.out.println("5 - Ver Histórico");
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
                case 5 -> exibirHistorico();
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
            historico.add("Português - Gênero: " + escolha);
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
                    historico.add("Matemática - Seno de " + angulo + "° = " + seno.getResultado());
                    valido = true;
                }
                case "cosseno" -> {
                    Cosseno cosseno = new Cosseno(angulo);
                    cosseno.calcular();
                    cosseno.exibirExemplo();
                    cosseno.exibirResultado();
                    historico.add("Matemática - Cosseno de " + angulo + "° = " + cosseno.getResultado());
                    valido = true;
                }
                case "tangente" -> {
                    Tangente tangente = new Tangente(angulo);
                    tangente.calcular();
                    tangente.exibirExemplo();
                    tangente.exibirResultado();
                    historico.add("Matemática - Tangente de " + angulo + "° = " + tangente.getResultado());
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
                    historico.add("Geografia - Clima Tropical na região: " + regiao);
                    valido = true;
                }
                case "desértico", "desertico" -> {
                    Desertico clima = new Desertico(regiao);
                    clima.caracteristicas();
                    clima.descrever();
                    historico.add("Geografia - Clima Desértico na região: " + regiao);
                    valido = true;
                }
                case "equatorial" -> {
                    Equatorial clima = new Equatorial(regiao);
                    clima.caracteristicas();
                    clima.descrever();
                    historico.add("Geografia - Clima Equatorial na região: " + regiao);
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
                String resultado = resposta.equalsIgnoreCase("c") ? "Correto!" : "Errado! É o dissertativo.";
                System.out.println(resultado);
                historico.add("Prática Português - Resposta: " + resposta + " - " + resultado);
            }
            case "matematica" -> {
                System.out.println("\nQuanto é sen(30°)?");
                System.out.print("Resposta: ");
                try {
                    double res = Double.parseDouble(sc.nextLine());
                    String resultado = Math.abs(res - 0.5) < 0.001 ? "Correto!" : "Errado! É 0.5";
                    System.out.println(resultado);
                    historico.add("Prática Matemática - Resposta: " + res + " - " + resultado);
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
                String resultado = resposta.equalsIgnoreCase("c") ? "Correto!" : "Errado! É o tropical.";
                System.out.println(resultado);
                historico.add("Prática Geografia - Resposta: " + resposta + " - " + resultado);
            }
            default -> System.out.println("Matéria inválida!");
        }
    }

    private static void exibirHistorico() {
        System.out.println("\n=== HISTÓRICO DE ATIVIDADES ===");
        if (historico.isEmpty()) {
            System.out.println("Nenhuma atividade registrada ainda.");
        } else {
            for (String item : historico) {
                System.out.println("- " + item);
            }
        }
    }
}