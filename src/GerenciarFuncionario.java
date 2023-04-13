import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe contendo funcionalidades para gerenciamento de funcionários.
 * @author Radmila, Tifani
 * @version 1.0.0
 * @since 1.0.0
 */
public class GerenciarFuncionario {
    public List<Funcionario> funcionarios = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    /**
     * Método responsável por cadastrar um funcionário
     */
    public void execCadastrar() {
        System.out.println("\nCadastro de Funcionário");
        System.out.println("---------------------");
        System.out.println("Registro do Funcionário: ");
        final long registro = Long.parseLong(sc.nextLine());
        System.out.println("Nome do Funcionário: ");
        final String nome = sc.nextLine();
        System.out.println("Está Ativo (s/n): ");
        final String estaAtivo = sc.nextLine();
        System.out.println("Departamento: ");
        final String departamento = sc.nextLine();
        System.out.println("RG: ");
        final String rg = sc.nextLine();
        System.out.println("Salário: ");
        final Double salario = Double.parseDouble(sc.nextLine());
        final Funcionario funcionario = new Funcionario(registro, nome, estaAtivo.equals("s") || estaAtivo.equals("S")? true : false, departamento, rg, salario);
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso");
    }

    /**
     * Método responsável por consultar um único funcionário
     */
    public void execConsultarUnico() {
        System.out.println("Digite o registro do funcinário: ");
        final long registro = Long.parseLong(sc.nextLine());
        for (Funcionario funcionario : funcionarios) { //varrendo a lista
            if (registro == funcionario.getRegistro()) {
                System.out.println("Informações do Funcionário:\n");
                System.out.println(funcionario);
                return;
            }
        }
        System.out.println("Funcionário não cadastrado");
    }

    /**
     * Método responsável por bonificar um único funcionário
     */
    public void execBonificarUnico() {
        System.out.println("Digite o registro do funcinário: ");
        final long registro  = Long.valueOf(sc.nextLine());
        System.out.println("Digite o valor da bonificação: ");
        final double bonificarUnico = Double.parseDouble(sc.nextLine());
        for (Funcionario funcionario : funcionarios) { //varrendo a lista
            if (registro == funcionario.getRegistro()) {
                System.out.println("Bonificação do Funcionário: "  + funcionario.getNome());
                System.out.println("---------------------");
                System.out.println("Salário : "  + funcionario.getSalario());
                System.out.println("Bonificação : "  + bonificarUnico);
                funcionario.setSalario(funcionario.getSalario() + bonificarUnico);
                System.out.println("Total Salário : " + funcionario.getSalario());
                return;
            }
        }
    }

    /**
     * Método responsável por consultar todos os funcionários
     */
    public void execBonificar () {
        System.out.println("Digite o valor da bonificação para todos os funcionários: ");
        final double bonificarUnico = Double.parseDouble(sc.nextLine());
        for (Funcionario funcionario : funcionarios) { //varrendo a lista
            funcionario.setSalario(funcionario.getSalario() + bonificarUnico);
        }
        System.out.println("---------------------");
        System.out.println(funcionarios.size() + " funcionários bonificados com sucesso.");
        System.out.println("---------------------");
    }

    /**
     * Método responsável por listar todos os funcionários
     */
    public void execConsultar () {
        System.out.println("Cadastro de Funcionários:\n");
        for (Funcionario funcionario : funcionarios) { //varrendo a lista
            System.out.println(funcionario.getRegistro() + " - " + funcionario.getNome());
        }
        System.out.println("---------------------");
        System.out.println(funcionarios.size() + " funcinários cadastrados.");
    }
}
