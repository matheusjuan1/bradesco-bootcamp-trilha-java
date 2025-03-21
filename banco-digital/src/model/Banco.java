package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.Data;

@Data
public class Banco {

	private String nome;
	private List<Cliente> clientes;
	private List<Conta> contas;

	

	public Banco(String nome) {
		this.nome = nome;
		this.clientes = new ArrayList<>();
		this.contas = new ArrayList<>();
	}

	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public void addConta(Conta conta) {
		this.contas.add(conta);
	}

	private Optional<Conta> searchConta(int numero) {
		return this.contas.stream().filter(c -> c.getNumero() == numero).findFirst();
	}

	private Optional<Cliente> searchCliente(String cpf) {
		return this.clientes.stream().filter(c -> c.getCpf().equalsIgnoreCase(cpf)).findFirst();
	}

	public void removeConta(int numero, String cpfClient) {
		if(this.contas.isEmpty()) {
			System.out.println("Não existem contas neste banco");
			return;
		}
		if (searchConta(numero).isEmpty()) {
			System.out.println("Não existe conta com este numero");
			return;
		}

		if (searchCliente(cpfClient).isEmpty()) {
			System.out.println("Não existe cliente com este cpf");
			return;
		}

		searchConta(numero).ifPresent(conta -> {
			if (!conta.getCliente().getCpf().equalsIgnoreCase(cpfClient)) {
				System.out.println("Este cliente não tem autorização para remover esta conta");
				return;
			}
			contas.remove(conta);
		});
	}

	public void imprimirClientes() {
		this.clientes.stream().forEach(client -> System.out.println(client));
	}

	public void imprimirContas() {
		this.contas.stream().forEach(conta -> conta.imprimirExtrato());
	}
}
