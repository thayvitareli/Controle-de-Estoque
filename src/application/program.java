package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.ProductDAO;
import model.Product;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int escolha;		
		List <Product> list = new ArrayList<Product>();
		Product product = null;
		ProductDAO dao = new ProductDAO();
		
		do {
			System.out.println("--------------------------------------------------");
			System.out.println("--------------------- MENU------------------------");

			System.out.println("[1] - Adicionar novo produto");
			System.out.println("[2] - Venda de produto: alterar estoque ");
			System.out.println("[3] - Compra de produto: alterar no estoque");
			System.out.println("[4] - Exibir relatório de produtos ");
			System.out.println("[5] - Excluir um produto do estoque");
			System.out.println("[0] - Sair ");			
			escolha = sc.nextInt();
			System.out.println("---------------------------------------------------");
			
			switch (escolha) {
			case 1:
				System.out.println("----------- CADASTRO DE NOVO PRODUTOS ----------");
				System.out.println("------------------------------------------------");
				product = product.cadastrarProduto(sc,dao);
				if(product == null) {
					break;
				}
				dao.cadastrarProdutos(product);
				break;
			case 2:
				System.out.println("--------- VENDA DE PRODUTO: ALTERAR ESTOQUE ---------");
				System.out.println("-----------------------------------------------------");

				product.baixaEstoque(sc,dao);
				break;
			case 3:
				System.out.println("---------- COMPRA DE PRODUTO: ALTERAR ESTOQUE --------");
				System.out.println("------------------------------------------------------");

				product.acrescentarEstoque(sc,dao);
				break;
			case 4:
				System.out.println("---------------- RELATÓRIO DE PRODUTOS ---------------");
				System.out.println("------------------------------------------------------");
				for(Product p : dao.listarProdutos()) {
					System.out.println(p + "\n");
				}
				break;
			case 5:
				System.out.println("---------- EXCLUIR PRODUTO DO BANCO DE DADOS ---------");
				System.out.println("------------------------------------------------------");
				product.excluirProduto(sc, dao);
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
