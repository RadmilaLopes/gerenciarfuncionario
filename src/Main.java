
/**
 * Classe Principal contendo o mennu.
 * @author Radmila, Tifani
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        final GerenciarFuncionario gc = new GerenciarFuncionario();

        int opcao = 0;
        do {
            System.out.println("\nMenu Principal");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Consultar Único Funcionário");
            System.out.println("3. Bonificar único funcionário");
            System.out.println("4. Bonificar todos os funcionários");
            System.out.println("5. Listar Funcionários Cadastrados");
            System.out.println("9. Sair");
            System.out.println("Escolha sua opção: ");
            opcao = Integer.parseInt(gc.sc.nextLine());
            switch (opcao) {
                case 1:
                    gc.execCadastrar();
                    break;
                case 2:
                    gc.execConsultarUnico();
                    break;
                case 3:
                    gc.execBonificarUnico();
                    break;
                case 4:
                    gc.execBonificar();
                    break;
                case 5:
                    gc.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=9);

    }
}