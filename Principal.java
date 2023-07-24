package DesafioJavaAlura3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		Scanner desc = new Scanner(System.in);
		Scanner prec = new Scanner(System.in);
		
		System.out.println("Digite o limite do cartão: ");
		double limite = leitura.nextDouble();
		
		double totalCompras = 0;
		
		ArrayList<Produto> produtos = new ArrayList<>();
		
		int op = 0;
		
		while (totalCompras < limite || op == 1) {
			
			System.out.println("Deseja adicionar um novo produto?" + "\n" + "1 SIM" + "\n" + "2 NÃO");
			op = leitura.nextInt();
			
			if (op == 1) {
				
				System.out.println("Digite a descrição do produto: ");
				String descricao = desc.nextLine();
				
				System.out.println("Digite o valor do produto: R$ ");
				double valor = prec.nextDouble();
				
				Produto produto = new Produto(descricao, valor);
				
				produtos.add(produto);
				
				totalCompras += valor;
				System.out.println("Total: RS " + totalCompras);
				System.out.println("Saldo: R$ " + (limite - totalCompras));
				
			} else if (op == 2){
				break;
			} else {
				System.out.println("Digite 1 para SIM ou 2 para NÃO");
			}
			
		}
		
		produtos.sort(Comparator.comparing(Produto::getValor));
		System.out.println(produtos.toString());
		
	}
}
