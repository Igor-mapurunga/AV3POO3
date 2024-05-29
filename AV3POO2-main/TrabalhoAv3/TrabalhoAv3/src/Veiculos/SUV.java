package Veiculos;

import Interfaces.OperacoesAluguel;
import Interfaces.OperacaoCadastro;
import Interfaces.OperacoesVeiculo;

public class SUV extends Carro implements  OperacoesAluguel, OperacoesVeiculo {
    public SUV(String modelo, String marca, int numeroDePortas) {
        super(modelo, marca, numeroDePortas);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("SUV Carro: Modelo - " +
                modelo +
                ", Marca - " +
                marca +
                ", Número de Portas - " +
                numeroDePortas);
    }

    public void exibirDetalhes(boolean exibirNumeroDePortas) {
        if (exibirNumeroDePortas ) {
            System.out.println("SUV Carro: Modelo - " +
                    modelo +
                    ", Marca - " +
                    marca +
                    ", Número de Portas - " +
                    numeroDePortas);
        } else {
            System.out.println("SUV Carro: Modelo - " + modelo + ", Marca - " + marca);
        }
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado");
    }

    @Override
    public void alugar() {
        System.out.println("Carro alugado");
    }

    @Override
    public void devolver() {
        System.out.println("Carro devolvido");
    }

    @Override
    public String toString() {
        return "SUV{" +
                "numeroDePortas=" + numeroDePortas +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}