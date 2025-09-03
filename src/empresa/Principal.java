package empresa;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                   
                    System.out.println("Escolha o tipo de moeda:");
                    System.out.println("1. Real");
                    System.out.println("2. Dolar");
                    System.out.println("3. Euro");
                    System.out.print("Opção: ");
                    int tipoMoeda = scanner.nextInt();
                    System.out.print("Digite o valor da moeda: ");
                    double valor = scanner.nextDouble();

                    Moeda moedaParaAdicionar = null;
                    switch (tipoMoeda) {
                        case 1:
                            moedaParaAdicionar = new Real(valor);
                            break;
                        case 2:
                            moedaParaAdicionar = new Dolar(valor);
                            break;
                        case 3:
                            moedaParaAdicionar = new Euro(valor);
                            break;
                        default:
                            System.out.println("Opção de moeda inválida.");
                            continue; 
                    }
                    cofrinho.adicionar(moedaParaAdicionar);
                    break;

                case 2:
                   
                    cofrinho.listagemMoedas();
                    break;
                    
                case 3:
                   
                    double total = cofrinho.totalConvertido();
                    System.out.printf("Total do cofrinho convertido para Real: R$ %.2f%n", total);
                    break;
                    
                case 4:
                  
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 4);
        
        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\n--- Menu Cofrinho ---");
        System.out.println("1. Adicionar moeda");
        System.out.println("2. Listar moedas");
        System.out.println("3. Calcular total convertido para Real");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }
}