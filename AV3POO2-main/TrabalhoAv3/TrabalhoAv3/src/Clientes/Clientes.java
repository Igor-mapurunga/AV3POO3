package Clientes;

import Interfaces.OperacaoCadastro;
import Veiculos.Veiculo;

import java.util.List;

public  class Clientes implements OperacaoCadastro {
private String nome;
private String anoDeNascimento;
private int idade;
private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(String anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Clientes(String nome, String anoDeNascimento, int idade, String cpf) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
        this.idade = idade;
        this.cpf = cpf;
    }

    @Override
    public void cadastrarCliente() {

    }

    @Override
    public void exibirDetalhes() {

    }

    public static void exibirDetalhesClientes(List<Clientes> clientesCadastrados){
        for (Clientes cliente : clientesCadastrados) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Ano de Nascimento: " + cliente.getAnoDeNascimento());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println(); // Adiciona uma linha em branco entre cada cliente
        }
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nome='" + nome + '\'' +
                ", anoDeNascimento='" + anoDeNascimento + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
