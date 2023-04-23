package model;

import java.util.List;
import java.util.Scanner;

import dao.ProductDAO;

public class Product {
	private int id;
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

	public Integer getID() {
		return id;
	}

	public void setID(Integer id) {
		this.code = id;
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

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static Product cadastrarProduto(Scanner sc, ProductDAO dao) {

		int voltar;

		System.out.print("C�digo: ");
		int code = sc.nextInt();
		while (verificarCodigo(code, dao.listarProdutos()) == 1) {
			System.out.println("\nERRO: C�digo j� cadastrado, verifique o c�digo");
			System.out.println("Ou digite 0 para tentar novamente ou 1 para voltar ao menu");
			voltar = sc.nextInt();
			if (voltar == 1) {
				return null;
			}
			System.out.print("C�digo: ");
			code = sc.nextInt();
			verificarCodigo(code, dao.listarProdutos());
		}
		sc.nextLine();
		System.out.print("Produto: ");
		String productName = sc.nextLine();
		System.out.print("Quantidade: ");
		int quantity = sc.nextInt();
		System.out.print("Preco: ");
		double price = sc.nextDouble();

		Product product = new Product(productName, code, quantity, price);
		System.out.println("Na funcao cadastrar: " + product);
		return product;
	}

	public static void baixaEstoque(Scanner sc, ProductDAO dao) {

		int encontrado = 0;
		if (dao.listarProdutos().isEmpty()) {
			System.out.println("N�o existe produtos cadastrados");
		} else {
			System.out.print("Codigo: ");
			int code = sc.nextInt();

			for (Product p : dao.listarProdutos()) {
				if (code == p.getCode()) {
					encontrado = 1;
					System.out.print("Quantidade: ");
					int quantidade = sc.nextInt();
					if (quantidade <= p.getQuantity()) {
						p.quantity = p.getQuantity() - quantidade;

						dao.vendaEstoque(p);

					} else {
						System.out.println("Estoque insulficiente!");
					}
				}
			}
			if (encontrado == 0) {
				System.out.println("ERRO! C�digo inv�lido ou produto n�o cadastrado");
			}
		}
	}

	public static void acrescentarEstoque(Scanner sc, ProductDAO dao) {
		int encontrado = 0;

		if (dao.listarProdutos().isEmpty()) {
			System.out.println("N�o existe produtos cadastrados");
		} else {
			System.out.print("Codigo: ");
			int code = sc.nextInt();

			for (Product p : dao.listarProdutos()) {
				if (code == p.getCode()) {
					encontrado = 1;
					System.out.print("Quantidade: ");
					int quantidade = sc.nextInt();
					p.quantity = p.getQuantity() + quantidade;
					dao.compraEstoque(p);
				}
			}
			if (encontrado == 0) {
				System.out.println("ERRO! C�digo inv�lido ou produto n�o cadastrado");
			}
		}
	}

	public static void excluirProduto(Scanner sc, ProductDAO dao) {

		int encontrado = 0;
		int confirmar;

		if (dao.listarProdutos().isEmpty()) {
			System.out.println("N�o existe produtos cadastrados");
		} else {
			System.out.print("Codigo: ");
			int code = sc.nextInt();

			for (Product p : dao.listarProdutos()) {
				if (code == p.getCode()) {
					encontrado = 1;
					System.out.println("Produto: " + p.getName());
					System.out.println("Deseja confirmar a a��o ?" + " 1 - SIM , 2 - N�O");
					confirmar = sc.nextInt();
					if (confirmar == 1) {
						dao.excluirProdutoEstoque(p);
					} else {
						break;
					}
				}
			}
			if (encontrado == 0) {
				System.out.println("ERRO! C�digo inv�lido ou produto n�o cadastrado");
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
