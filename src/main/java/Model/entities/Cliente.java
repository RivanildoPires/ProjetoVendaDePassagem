package Model.entities;

import Model.interfaces.InterfacePessoa;


public class Cliente extends Pessoa implements InterfacePessoa {

    private final String cpf;
    private String telefone;

    public Cliente(String nome, String cpf, String telefone) {
        super(nome);
        this.cpf = cpf;
        this.telefone = telefone;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Cliente [ Nome = " + nome + ", CPF = " + cpf + ", Telefone = " + telefone + " ]";
    }
}
