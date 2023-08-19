package aplicativo;

import java.util.Locale;
import java.util.Scanner;

import nuevo_Banco.ContencaoDespesa;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		ContencaoDespesa despesa = new ContencaoDespesa();
		System.out.println("Opcao 1");
		System.out.println("Opcao 2");
		System.out.println("Opcao 3");
		int resposta = leitor.nextInt();
		despesa.setResposta(resposta);

		System.out.println(despesa.getResposta());

		switch (resposta) {
		case 1: {
			System.out.println("Cadastre seu saldo :");
			double saldo = leitor.nextDouble();
			despesa.setSaldo(saldo);
			System.out.println("Deseja comprar algum produto :");
			int escolha = leitor.nextInt();
			despesa.setEscolhaOpcao(escolha);
			break;
		}

		case 2: {
			System.out.println("Cadastre a despesa : ");
			double gasto = leitor.nextDouble();
			despesa.setDespesa(gasto);
			break;
		}

		case 3: {
			System.out.println("Saldo:" + despesa.getSaldo());
			break;
		}
		default:
			System.out.println("Informe um numero 1 , 2 , ou 3 para inicioalizar o programa ");
			break;
		}
		
		switch (despesa.getEscolhaOpcao()) {
		case 1:  {
			System.out.println("Informe o nome do produto :");
			String nomeProduto = leitor.next();
			despesa.setProduto(nomeProduto);
			System.out.println("informe o valor do produto :");
			double valorProduto = leitor.nextDouble();
			despesa.setValorProduto(valorProduto);
			break;
		}
		default:
			System.out.println("sei lá");
			break;
		
		}
		
	}

}
