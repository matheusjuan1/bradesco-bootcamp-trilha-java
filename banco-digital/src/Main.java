import model.Banco;
import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.Conta;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Matheus Juan", "4546");
		Cliente cliente2 = new Cliente("Pedro Alvares", "1010");

		Banco bancoItau = new Banco("Itaú");

		bancoItau.addCliente(cliente1);
		bancoItau.addCliente(cliente2);

		bancoItau.imprimirClientes();


		System.out.println("--------------------");
		bancoItau.removeConta(1, "456");

		Conta contaMj = new ContaCorrente(cliente1);
		Conta contaPA = new ContaPoupanca(cliente2);

		bancoItau.addConta(contaMj);
		bancoItau.addConta(contaPA);

		bancoItau.imprimirContas();

		System.out.println("------------------");

		bancoItau.removeConta(100, "456");
		bancoItau.removeConta(1, "456");
		bancoItau.removeConta(2, "4546");
		bancoItau.removeConta(2, "1010");

		System.out.println("-------------------");
		bancoItau.imprimirContas();
	}

}
