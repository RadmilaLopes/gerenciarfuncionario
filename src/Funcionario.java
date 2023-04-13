/**
 * Representação de funcionários.
 * @author Radmila, Tifani
 * @version 1.0.0
 * @since 1.0.0
 */
public class Funcionario {
    private double salario;
    private long registro;
    private boolean estaAtivo;
    private String nome;
    private String departamento;
    private String rg;

    public Funcionario(final long registro, final String nome, final boolean estaAtivo,
                       final String departamento, final String rg, double salario) {
        this.registro = registro;
        this.nome = nome;
        this.estaAtivo = estaAtivo;
        this.departamento = departamento;
        this.rg = rg;
        this.salario = salario;
    }

    public long getRegistro() {
        return registro;
    }

    public void setRegistro(long registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return  "Registro: " + registro +
                "\nNome: " + nome +
                "\nEstá Ativo: " + (estaAtivo ? "Sim" : "Não") +
                "\nDepartamento: " + departamento +
                "\nRG: " + rg +
                "\nSalário: " + String.format("%.2f", salario) + "\n";
    }
}
