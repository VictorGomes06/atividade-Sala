package nuevo_Banco;

import java.util.Set;

public class ContencaoDespesa {
	private double saldo;
	private double despesa;
	private double salario;
	private double valorProduto;
	private String produto;
	private int resposta;
	private int escolhaOpcao;

	public ContencaoDespesa() {
		this.saldo = 0;
		this.despesa = 0;
		this.salario = 0;
		this.valorProduto = 0;
		this.produto = 0;
	}

	public ContencaoDespesa(double saldo, double despesa, double salario, String produto, double valorProduto) {
		this.saldo = saldo;
		this.despesa = despesa;
		this.salario = salario;
		this.valorProduto = valorProduto;
		this.produto = produto;
	}
	
	public double CompraDoProduto() {
		saldo = saldo - valorProduto;
		return saldo;
	}
	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getDespesa() {
		return despesa;
	}

	public void setDespesa(double despesa) {
		this.despesa = despesa;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	

	public int getResposta() {
		return resposta;
	}
	public void setResposta(int resposta) {
		this.resposta = resposta;
	}
	public int getEscolhaOpcao() {
		return escolhaOpcao;
	}
	public void setEscolhaOpcao(int escolhaOpcao) {
		this.escolhaOpcao = escolhaOpcao;
	}
}
