import java.text.NumberFormat;
import java.util.Locale;

public class Pessoa implements Comparable {
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;
    
    public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return String.format("[%d] %s %s %d %s", 
            getCodigo(), getNome(), getCargo(), getIdade(), nf.format(getSalario()));
    }

    @Override
    public int compareTo(Object obj) {
        Pessoa pessoa = (Pessoa) obj;
        return this.getNome().compareTo(pessoa.getNome());
    }
}
