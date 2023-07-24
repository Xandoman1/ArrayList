package DesafioJavaAlura3;

public class Produto implements Comparable {

	String descricao;
	double valor;
	
	public Produto(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Descrição: " + this.getDescricao() + " - " + "Valor: R$ " + this.getValor() + "\n" ;
	}

	public double compareTo(Produto outroProduto) {
		return this.getDescricao().compareTo(outroProduto.getDescricao());
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}





	
	
}
