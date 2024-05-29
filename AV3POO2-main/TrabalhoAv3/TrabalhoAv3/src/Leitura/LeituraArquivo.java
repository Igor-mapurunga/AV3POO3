package Leitura;
import Clientes.Clientes;
import Veiculos.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LeituraArquivo {
    public static void lerVeiculosDeArquivo(String nomeArquivo, List<Veiculo> veiculosDisponiveis) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                String tipo = dados[0];
                String modelo = dados[1];
                String marca = dados[2];
                int capacidadeOuCarga = Integer.parseInt(dados[3]);

                Veiculo veiculo = null;
                switch (tipo) {
                    case "Sedan":
                        veiculo = new Sedan(modelo, marca, capacidadeOuCarga);
                        break;
                    case "SUV":
                        veiculo = new SUV(modelo, marca, capacidadeOuCarga);
                        break;
                    case "CaminhaoPequeno":
                        veiculo = new CaminhaoPequeno(modelo, marca, capacidadeOuCarga);
                        break;
                    case "CaminhaoGrande":
                        veiculo = new CaminhaoGrande(modelo, marca, capacidadeOuCarga);
                        break;
                }
                if (veiculo != null) {
                    veiculosDisponiveis.add(veiculo);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void lerClientesDoArquivo(String nomeArquivo, List<Clientes> clientesCadastrados) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                String anoDeNascimento = dados[0];
                String nome = dados[1];
                int idade = Integer.parseInt(dados[2]);
                String cpf = dados[3];

                Clientes cliente = new Clientes(anoDeNascimento, nome, idade, cpf);
                clientesCadastrados.add(cliente);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
