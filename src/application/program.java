package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int escolha;		
		List <Product> list = new ArrayList<Product>();
		Product product = new Product();

		do {
			System.out.println("--------------------------------------------");
			System.out.println("[1] - Adicionar novo produto");
			System.out.println("[2] - Baixar do estoque ");
			System.out.println("[3] - Acrescentar no Estoque");
			System.out.println("[4] - Exibir relatório de produtos ");
			System.out.println("[0] - Sair ");			
			escolha = sc.nextInt();

			switch (escolha) {
			case 1:
				list.add(product.cadastrarProduto(sc, list));
				break;
			case 2:
				product.baixaEstoque(list,sc);
				break;
			case 3:
				product.acrescentarEstoque(list, sc);
				break;
			case 4:
				product.exibirProdutos(list);
				break;
			case 0:
				System.out.println("Fechando o Programa");
				break;
			default:
				System.out.println("Opção inválida!");
			}
			
		} while(escolha != 0);
		sc.close();
	}	
}
