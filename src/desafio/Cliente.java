package desafio;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class Cliente implements Serializable {

    @Serial
    private static final long serialVersionUID = -4845628077711887024L;
    private String nome;
    private final Endereco endereco;
    private transient BigDecimal limiteCredito;


    public Cliente(String nome, Endereco endereco, BigDecimal limiteCredito) {
        this.nome = nome;
        this.endereco = endereco;
        this.limiteCredito = limiteCredito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", limiteCredito=" + limiteCredito +
                '}';
    }


    public BigDecimal getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(BigDecimal limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
