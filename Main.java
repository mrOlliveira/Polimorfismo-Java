import geografia.*;
import matematica.*;
import portugues.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> objetos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Português (Gêneros Textuais)");
            System.out.println("2 - Matemática (Trigonometria)");
            System.out.println("3 - Geografia (Climas)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o gênero (narrativo, descritivo, dissertativo): ");
                    String genero = sc.nextLine().toLowerCase();

                    System.out.print("Digite o título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Digite o conteúdo ou exemplo: ");
                    String conteudo = sc.nextLine();

                    GeneroTextual gt = switch (genero) {
                        case "narrativo" -> new Narrativo(titulo, conteudo);
                        case "descritivo" -> new Descritivo(titulo, conteudo);
                        case "dissertativo" -> new Dissertativo(titulo, conteudo);
                        default -> {
                            System.out.println("Gênero inválido.");
                            yield null;
                        }
                    };

                    if (gt != null) {
                        objetos.add(gt);
                        gt.apresentarCaracteristicas();
                        gt.exibirExemplo();
                    }
                    break;

                case 2:
                    System.out.print("Digite a operação (seno, cosseno, tangente): ");
                    String operacao = sc.nextLine().toLowerCase();

                    System.out.print("Digite o ângulo em graus: ");
                    double angulo = sc.nextDouble();
                    sc.nextLine();

                    FormaTrigonometrica ft = switch (operacao) {
                        case "seno" -> new Seno(angulo);
                        case "cosseno" -> new Cosseno(angulo);
                        case "tangente" -> new Tangente(angulo);
                        default -> {
                            System.out.println("Operação inválida.");
                            yield null;
                        }
                    };

                    if (ft != null) {
                        objetos.add(ft);
                        ft.calcular();
                        ft.exibirResultado();
                    }
                    break;

                case 3:
                    System.out.print("Digite o clima (tropical, equatorial, desertico): ");
                    String clima = sc.nextLine().toLowerCase();

                    System.out.print("Digite a região: ");
                    String regiao = sc.nextLine();

                    Clima cl = switch (clima) {
                        case "tropical" -> new Tropical(regiao);
                        case "equatorial" -> new Equatorial(regiao);
                        case "desertico" -> new Desertico(regiao);
                        default -> {
                            System.out.println("Clima inválido.");
                            yield null;
                        }
                    };

                    if (cl != null) {
                        objetos.add(cl);
                        cl.descrever();
                        cl.caracteristicas();
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
