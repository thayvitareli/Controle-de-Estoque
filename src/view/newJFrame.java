package view;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.ProductDAO;
import model.Product;

/**
 *
 * @author Thain
 */
public class newJFrame extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// metodo para listar items na tabela
	public void listar() {

		ProductDAO dao = new ProductDAO();

		DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
		dados.setNumRows(0);

		for (Product p : dao.listarProdutos()) {
			dados.addRow(new Object[] { p.getCode(), p.getName(), p.getQuantity(), p.getPrice()

			});

		}

	}

	/**
	 * Creates new form newJFrame
	 */
	public newJFrame() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel5 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		tabelaProdutos1 = new javax.swing.JTable();
		txtConsultarTabela1 = new javax.swing.JTextField();
		jLabel17 = new javax.swing.JLabel();
		btnconsultarTabela = new javax.swing.JButton();
		jLabel18 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel3 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		txtCodigo = new javax.swing.JTextField();
		txtNomeProduto = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		txtQuantidade = new javax.swing.JTextField();
		txtPreco = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		btnLimparCadastro = new javax.swing.JButton();
		btnSalvarCadastro = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tabelaProdutos = new javax.swing.JTable();
		txtConsultarTabela = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		btnDeletarProduto = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		txtCodigoVenda = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		txtNomeProdutoVenda = new javax.swing.JTextField();
		txtQuantidadeVenda = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		btnSalvarVendaProduto = new javax.swing.JButton();
		btnLimparCampoVenda = new javax.swing.JButton();
		jPanel7 = new javax.swing.JPanel();
		txtCodigoReposicao = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		txtNomeProdutoReposicao = new javax.swing.JTextField();
		txtQuantidadeReposicao = new javax.swing.JTextField();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		btnSalvarReposicao = new javax.swing.JButton();
		btnLimparCampoReposicao = new javax.swing.JButton();

		tabelaProdutos1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "C�digo", "Nome", "Quantidade", "Pre�o" }));
		jScrollPane2.setViewportView(tabelaProdutos1);

		jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jLabel17.setText("C�digo");

		jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel18.setText("Consultar Produto");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel5Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jLabel18)
								.addGap(186, 186, 186))
				.addGroup(jPanel5Layout.createSequentialGroup()
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel5Layout.createSequentialGroup().addGap(32, 32, 32)
										.addComponent(jLabel17).addGap(18, 18, 18)
										.addComponent(txtConsultarTabela1, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(btnconsultarTabela))
								.addGroup(jPanel5Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(
										jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(30, Short.MAX_VALUE)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
						.addGap(17, 17, 17).addComponent(jLabel18).addGap(20, 20, 20)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtConsultarTabela1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnconsultarTabela).addComponent(jLabel17))
						.addGap(18, 18, 18).addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(64, Short.MAX_VALUE)));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowActivated(java.awt.event.WindowEvent evt) {
				formWindowActivated(evt);
			}
		});

		jPanel1.setBackground(new java.awt.Color(0, 51, 51));

		jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("Controle de Estoque");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(40, 40, 40).addComponent(jLabel1)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(42, 42, 42).addComponent(jLabel1)
						.addContainerGap(42, Short.MAX_VALUE)));

		jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

		jPanel3.setBackground(new java.awt.Color(255, 255, 255));

		jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jLabel2.setText("C�digo");

		jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jLabel3.setText("Produto");

		jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jLabel4.setText("Quantidade");

		txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtQuantidadeActionPerformed(evt);
			}
		});

		txtPreco.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtPrecoActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jLabel5.setText("Pre�o");

		jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel15.setText("Cadastrar Novo Produto");

		btnLimparCadastro.setText("LIMPAR");
		btnLimparCadastro.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLimparCadastroActionPerformed(evt);
			}
		});

		btnSalvarCadastro.setText("SALVAR");
		btnSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSalvarCadastroActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addGroup(
						jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(
								javax.swing.GroupLayout.Alignment.LEADING,
								jPanel3Layout.createSequentialGroup().addGap(20, 20, 20)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel4).addComponent(jLabel2).addComponent(jLabel3))
										.addGap(20, 20, 20)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(txtNomeProduto, javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout
														.createSequentialGroup()
														.addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE,
																117, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, Short.MAX_VALUE))
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout
														.createSequentialGroup()
														.addComponent(txtQuantidade,
																javax.swing.GroupLayout.PREFERRED_SIZE, 96,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(20, 20, 20)
														.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
																48, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(txtPreco, javax.swing.GroupLayout.DEFAULT_SIZE,
																124, Short.MAX_VALUE))))
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(jLabel15).addGap(50, 50, 50)))
						.addGap(103, 103, 103))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel3Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(btnSalvarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 103,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(32, 32, 32)
								.addComponent(btnLimparCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 96,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(148, 148, 148)));

		jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { btnLimparCadastro, btnSalvarCadastro });

		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jLabel15)
						.addGap(20, 20, 20)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(20, 20, 20)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3)
								.addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(20, 20, 20)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4)
								.addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5).addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnSalvarCadastro).addComponent(btnLimparCadastro,
										javax.swing.GroupLayout.PREFERRED_SIZE, 46,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(30, 30, 30)));

		jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { btnLimparCadastro, btnSalvarCadastro });

		jTabbedPane1.addTab("Cadastro", jPanel3);

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));

		tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "C�digo", "Nome", "Quantidade", "Pre�o" }));
		jScrollPane1.setViewportView(tabelaProdutos);

		jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jLabel6.setText("C�digo");

		btnconsultarTabela.setText("Consultar");
		btnconsultarTabela.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnconsultarTabelaActionPerformed(evt);
			}
		});

		jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel16.setText("Consultar Produto");

		btnDeletarProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		btnDeletarProduto.setText("Deletar");
		btnDeletarProduto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDeletarProdutoActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jLabel16)
								.addGap(186, 186, 186))
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(32, 32, 32).addComponent(jLabel6)
										.addGap(18, 18, 18)
										.addComponent(txtConsultarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(btnconsultarTabela))
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(
										jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(187, 187, 187).addComponent(
										btnDeletarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 111,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(30, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
						.addGap(17, 17, 17).addComponent(jLabel16).addGap(20, 20, 20)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtConsultarTabela, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnconsultarTabela).addComponent(jLabel6))
						.addGap(18, 18, 18)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(btnDeletarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addGap(12, 12, 12)));

		jTabbedPane1.addTab("Consulta", jPanel2);

		jPanel4.setBackground(new java.awt.Color(255, 255, 255));

		jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jLabel7.setText("C�digo");

		jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jLabel8.setText("Produto");

		txtNomeProdutoVenda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNomeProdutoVendaActionPerformed(evt);
			}
		});

		txtCodigoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtCodigoVendaKeyPressed(evt);
			}
		});
		
		txtCodigoReposicao.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtCodigoReposicaoKeyPressed(evt);
			}
		});


		jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jLabel9.setText("Quantidade");

		jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel10.setText("Venda de Estoque ");

		btnSalvarVendaProduto.setText("SALVAR");
		btnSalvarVendaProduto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSalvarVendaProdutoActionPerformed(evt);
			}
		});

		btnLimparCampoVenda.setText("LIMPAR");
		btnLimparCampoVenda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLimparCampoVendaActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel4Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel10).addGap(132, 132, 132))
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(20, 20, 20)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel7))
						.addGap(18, 18, 18)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addComponent(btnSalvarVendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE,
												103, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(51, 51, 51).addComponent(btnLimparCampoVenda,
												javax.swing.GroupLayout.PREFERRED_SIZE, 96,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(txtNomeProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 225,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtQuantidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(148, Short.MAX_VALUE)));

		jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { btnLimparCampoVenda, btnSalvarVendaProduto });

		jPanel4Layout
				.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel4Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jLabel10)
								.addGap(20, 20, 20)
								.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(txtCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel7)).addGap(20, 20, 20).addComponent(
														txtNomeProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel8))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25,
										Short.MAX_VALUE)
								.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel9)
										.addComponent(txtQuantidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53,
										Short.MAX_VALUE)
								.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnSalvarVendaProduto).addComponent(btnLimparCampoVenda,
												javax.swing.GroupLayout.PREFERRED_SIZE, 46,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(30, 30, 30)));

		// LABEL VENDA
		jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { btnLimparCampoVenda, btnSalvarVendaProduto });

		jTabbedPane1.addTab("Venda de Estoque", jPanel4);

		jPanel7.setBackground(new java.awt.Color(255, 255, 255));

		jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jLabel11.setText("C�digo");

		jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jLabel12.setText("Produto");

		txtNomeProdutoReposicao.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNomeProdutoReposicaoActionPerformed(evt);
			}
		});

		jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jLabel13.setText("Quantidade");

		jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel14.setText("Compra de Estoque");

		// botao de adicionar quantidade a item no estoque
		btnSalvarReposicao.setText("SALVAR");
		btnSalvarReposicao.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSalvarReposicaoActionPerformed(evt);
			}
		});

		// botao de limpar campos na janela de reposi��o
		btnLimparCampoReposicao.setText("LIMPAR");
		btnLimparCampoReposicao.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLimparCampoReposicaoActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addGroup(jPanel7Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel7Layout.createSequentialGroup().addGap(20, 20, 20)
								.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel13).addComponent(jLabel12,
												javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 56,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(20, 20, 20))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(jLabel11)
										.addGap(20, 20, 20)))
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel7Layout.createSequentialGroup().addGroup(jPanel7Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel7Layout.createSequentialGroup().addGap(0, 60, Short.MAX_VALUE)
												.addComponent(jLabel14))
										.addGroup(jPanel7Layout.createSequentialGroup()
												.addComponent(txtCodigoReposicao,
														javax.swing.GroupLayout.PREFERRED_SIZE, 117,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, Short.MAX_VALUE))
										.addComponent(txtNomeProdutoReposicao)).addGap(173, 173, 173))
								.addGroup(jPanel7Layout.createSequentialGroup().addGroup(jPanel7Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtQuantidadeReposicao, javax.swing.GroupLayout.PREFERRED_SIZE,
												117, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel7Layout.createSequentialGroup()
												.addComponent(btnSalvarReposicao,
														javax.swing.GroupLayout.PREFERRED_SIZE, 103,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(39, 39, 39).addComponent(btnLimparCampoReposicao,
														javax.swing.GroupLayout.PREFERRED_SIZE, 96,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));

		// LABEL REPOSI��O
		jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { btnLimparCampoReposicao, btnSalvarReposicao });

		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jLabel14)
						.addGap(20, 20, 20)
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtCodigoReposicao, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel11))
						.addGap(20, 20, 20)
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtNomeProdutoReposicao, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel12))
						.addGap(20, 20, 20)
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel13).addComponent(txtQuantidadeReposicao,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnSalvarReposicao).addComponent(btnLimparCampoReposicao,
										javax.swing.GroupLayout.PREFERRED_SIZE, 46,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(36, Short.MAX_VALUE)));

		jPanel7Layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { btnLimparCampoReposicao, btnSalvarReposicao });

		jTabbedPane1.addTab("Compra de Estoque", jPanel7);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(
						layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void txtCodigoVendaKeyPressed(java.awt.event.KeyEvent evt) {

		int encontrou =0;
		if (evt.getKeyCode() == KeyEvent.VK_ENTER ) {	
			Integer codigo = Integer.parseInt(txtCodigoVenda.getText());
			ProductDAO dao = new ProductDAO();
			for (Product p : dao.listarProdutos()) {
				if (p.getCode().equals(codigo)) {
					encontrou = 1;
					txtNomeProdutoVenda.setText(p.getName());
				}
			}
		}
		if(encontrou == 0) {
			txtNomeProdutoVenda.setText("");

		}
	}
	
	private void txtCodigoReposicaoKeyPressed(java.awt.event.KeyEvent evt) {
		int encontrou =0;
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			Integer codigo = Integer.parseInt(txtCodigoReposicao.getText());
			ProductDAO dao = new ProductDAO();
			for (Product p : dao.listarProdutos()) {
				if (p.getCode().equals(codigo)) {
					encontrou = 1;
					txtNomeProdutoReposicao.setText(p.getName());
				}
			}
		}
		if(encontrou == 0) {
			txtNomeProdutoReposicao.setText("");

		}
		
	}

	private void formWindowActivated(java.awt.event.WindowEvent evt) {
		// TODO add your handling code here:
		listar();
	}

	private void txtNomeProdutoReposicaoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void txtNomeProdutoVendaActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void btnSalvarCadastroActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		// Bot�o Cadastrar novo Produto
		try {
			Product obj = new Product();

			obj.setName(txtNomeProduto.getText().toUpperCase());
			obj.setQuantity(Integer.parseInt(txtQuantidade.getText().toUpperCase()));
			obj.setCode(Integer.parseInt(txtCodigo.getText()));
			obj.setPrice(Double.parseDouble(txtPreco.getText().replaceAll(",", ".")));

			ProductDAO dao = new ProductDAO();

			int validaCodigo = obj.verificarCodigo(obj.getCode(), dao.listarProdutos());
			if (validaCodigo == 1) {
				JOptionPane.showMessageDialog(null,
						"C�digo j� cadastrado!\n" + "N�o � possivel cadastrar dois produtos com o mesmo c�digo.\n");
			} else {
				dao.cadastrarProdutos(obj);
			}
		} catch (Exception error) {
			JOptionPane.showMessageDialog(null, "ERRO!\nVerifique se todos os campos foram preenchidos corretamente");

		}
	}

	private void btnLimparCadastroActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		txtCodigo.setText("");
		txtNomeProduto.setText("");
		txtQuantidade.setText("");
		txtPreco.setText("");
	}

	private void btnSalvarVendaProdutoActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		try {

			int encontrou = 0;
			Product obj = new Product();

			obj.setQuantity(Integer.parseInt(txtQuantidadeVenda.getText()));
			obj.setCode(Integer.parseInt(txtCodigoVenda.getText()));

			ProductDAO dao = new ProductDAO();
			for (Product p : dao.listarProdutos()) {
				if (obj.getCode().equals(p.getCode())) {
					encontrou = 1;
					if (p.getQuantity() > 0) {
						obj.setQuantity(p.getQuantity() - obj.getQuantity());
						dao.atualizarEstoque(obj);
					} else {
						JOptionPane.showMessageDialog(null, "Estoque Insulficiente!");

					}
				}
			}
			if (encontrou == 0) {
				JOptionPane.showMessageDialog(null, "C�digo n�o encontrado, verifique o c�digo digitado");
			}
		} catch (Exception error) {

			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se os campos foram preenchidos corretamente");

		}
	}

	private void btnLimparCampoVendaActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		txtCodigoVenda.setText("");
		txtNomeProdutoVenda.setText("");
		txtQuantidadeVenda.setText("");
	}

	private void btnLimparCampoReposicaoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		txtCodigoReposicao.setText("");
		txtNomeProdutoReposicao.setText("");
		txtQuantidadeReposicao.setText("");
	}

	private void btnconsultarTabelaActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			int codigo = Integer.parseInt(txtConsultarTabela.getText());
			int encontrou = 0;

			DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();

			ProductDAO dao = new ProductDAO();

			for (Product p : dao.listarProdutos()) {
				int codigoLista = p.getCode();

				if (codigoLista == codigo) {
					encontrou = 1;

					JOptionPane.showMessageDialog(null, p);

				}
			}
			if (encontrou == 0) {
				JOptionPane.showMessageDialog(null, "C�digo n�o encontrado");

			}
		} catch (Exception error) {
			JOptionPane.showMessageDialog(null,
					"N�o foi poss�vel realizar a consulta.\n" + "Verifique se o campo foi preenchido corretamente");

		}
	}

	private void tabelaProdutosMouseClicked(java.awt.event.MouseListener evt) {

		Product obj = new Product();

		obj.setCode(Integer.parseInt(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0).toString()));
		obj.setName(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 1).toString());
		obj.setQuantity(Integer.parseInt(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 3).toString()));
		obj.setPrice(Double.parseDouble(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 4).toString()));

	}

	private void btnDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		//
		try {
			ProductDAO dao = new ProductDAO();
			Product obj = new Product();

			obj.setCode(Integer.parseInt(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0).toString()));
			dao.excluirProdutoEstoque(obj);
		} catch (Exception error) {
			JOptionPane.showMessageDialog(null, "Selecione um produto para excluir");

		}

	}

	private void btnSalvarReposicaoActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

		try {

			int encontrou = 0;
			Product obj = new Product();

			obj.setQuantity(Integer.parseInt(txtQuantidadeReposicao.getText()));
			obj.setCode(Integer.parseInt(txtCodigoReposicao.getText()));

			ProductDAO dao = new ProductDAO();
			for (Product p : dao.listarProdutos()) {
				if (obj.getCode().equals(p.getCode())) {
					encontrou = 1;
					obj.setQuantity(p.getQuantity() + obj.getQuantity());
					dao.atualizarEstoque(obj);
				}
			}
			if (encontrou == 0) {
				JOptionPane.showMessageDialog(null, "C�digo n�o encontrado, verifique o c�digo digitado");
			}
		} catch (Exception error) {
			// tratar excecao
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se os campos foram preenchidos corretamente");
		}

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new newJFrame().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btnDeletarProduto;
	private javax.swing.JButton btnLimparCadastro;
	private javax.swing.JButton btnLimparCampoReposicao;
	private javax.swing.JButton btnLimparCampoVenda;
	private javax.swing.JButton btnSalvarCadastro;
	private javax.swing.JButton btnSalvarReposicao;
	private javax.swing.JButton btnSalvarVendaProduto;
	private javax.swing.JButton btnconsultarTabela;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable tabelaProdutos;
	private javax.swing.JTable tabelaProdutos1;
	private javax.swing.JTextField txtCodigo;
	private javax.swing.JTextField txtCodigoReposicao;
	private javax.swing.JTextField txtCodigoVenda;
	private javax.swing.JTextField txtConsultarTabela;
	private javax.swing.JTextField txtConsultarTabela1;
	private javax.swing.JTextField txtNomeProduto;
	private javax.swing.JTextField txtNomeProdutoReposicao;
	private javax.swing.JTextField txtNomeProdutoVenda;
	private javax.swing.JTextField txtPreco;
	private javax.swing.JTextField txtQuantidade;
	private javax.swing.JTextField txtQuantidadeReposicao;
	private javax.swing.JTextField txtQuantidadeVenda;
	// End of variables declaration
}