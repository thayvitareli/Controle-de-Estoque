package entities;

import java.util.List;
import java.util.Scanner;

public class Product {
	private String name;
	private Integer code;
	private Integer quantity;
	private Double price;

	List<Product> list;

	public Product() {
	}

	public Product(Product cadastrarProduto) {

	}

	public Product(String name, Integer code, Integer quantity, Double price) {
		super();
		this.name = name;
		this.code = code;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static Product cadastrarProduto(Scanner sc, List<Product> list2) {

		System.out.println("Código: ");
		int code = sc.nextInt();
		while (verificarCodigo(code, list2) == 1) {
			System.out.println("ERRO: Código já cadastrado, verifique e digite novamente");
			System.out.println("Código: ");
			code = sc.nextInt();
			verificarCodigo(code, list2);
		}
		sc.nextLine();
		System.out.println("Produto: ");
		String productName = sc.nextLine();
		System.out.println("Quantidade: ");
		int quantity = sc.nextInt();
		System.out.println("Preco: ");
		double price = sc.nextDouble();

		Product product = new Product(productName, code, quantity, price);
		return product;
	}

	public void baixaEstoque(List<Product> list2, Scanner sc) {
		int encontrado = 0;
		if (list2.isEmpty()) {
			System.out.println("Não existe produtos cadastrados");
		} else {
			System.out.println("Codigo: ");
			int code = sc.nextInt();

			for (Product p : list2) {
				if (code == p.getCode()) {
					encontrado = 1;
					System.out.println("Quantidade: ");
					int quantidade = sc.nextInt();
					if (quantidade <= p.getQuantity()) {
						p.quantity = p.getQuantity() - quantidade;
						System.out.println("Operação realizada com sucesso");
					} else {
						System.out.println("Estoque insulficiente!");
					}
				}
			}
			if (encontrado == 0) {
				System.out.println("ERRO! Código inválido ou produto não cadastrado");
			}
		}
	}

	public static void acrescentarEstoque(List<Product> list2, Scanner sc) {
		int encontrado = 0;
		if (list2.isEmpty()) {
			System.out.println("Não existe produtos cadastrados");
		} else {
			System.out.println("Codigo: ");
			int code = sc.nextInt();

			for (Product p : list2) {
				if (code == p.getCode()) {
					encontrado = 1;
					System.out.println("Quantidade: ");
					int quantidade = sc.nextInt();
					p.quantity = p.getQuantity() + quantidade;
					System.out.println("Operação realizada com sucesso");
				}
			}
			if (encontrado == 0) {
				System.out.println("ERRO! Código inválido ou produto não cadastrado");
			}
		}
	}

	public static void exibirProdutos(List<Product> list) {
		if (list.isEmpty()) {
			System.out.println("Não existe produtos cadastrados");
		} else {
			for (Product p : list) {
				System.out.println(p);
				System.out.println();
			}
		}
	}

	public static int verificarCodigo(int code, List<Product> list2) {
		int encontrado = 0;
		for (Product p : list2) {
			if (code == p.getCode()) {
				encontrado = 1;
				return encontrado;
			}
		}
		return encontrado;
	}

	@Override
	public String toString() {
		return "Product: " + name + "\ncode: " + code + "\nquantity: " + quantity + "\nprice: " + price;
	}

}
