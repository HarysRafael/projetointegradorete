package view;

import dao.CardapioDAO;
import dao.ClienteDAO;
import dao.PedidoDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PedidoModel;
import table.CardapioTableModel;
import table.ClienteTableModel;

public class PedidoTela extends javax.swing.JInternalFrame {

    private MaskFormatter formatoTel;
    private Date dataAtual;
    private SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    private PedidoDAO pedidoDao = new PedidoDAO();
    private PedidoModel pedidoModel = new PedidoModel();

    public PedidoTela() {
        super("Pedidos");
        initComponents();
        painelPai.setEnabledAt(1, false);
        tbClientes.setModel(new ClienteTableModel(new ClienteDAO().listarTodos()));
        tbCardapio.setModel(new CardapioTableModel(new CardapioDAO().listarTodos()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPai = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfIdCliente = new javax.swing.JTextField();
        tfNomeCliente = new javax.swing.JTextField();
        tfEmailCliente = new javax.swing.JTextField();
        try{
            formatoTel = new MaskFormatter ("(##) #####-####");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Campo", "Ero", 0);
        }
        tfTelefoneCliente = new JFormattedTextField(formatoTel);
        jLabel5 = new javax.swing.JLabel();
        tfDataCadastroCliente = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfRuaCliente = new javax.swing.JTextField();
        tfCidadeCliente = new javax.swing.JTextField();
        tfBairroCliente = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btOKCliente = new javax.swing.JButton();
        btCancelarCliente = new javax.swing.JButton();
        tfPesquisarCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfNomeClienteTelaPedido = new javax.swing.JTextField();
        btCancelarPedido = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tfCardapioId = new javax.swing.JTextField();
        tfCardapioNome = new javax.swing.JTextField();
        tfCardapioValor = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCardapio = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        tfPesquisarCardapio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfQuantidadeItem = new javax.swing.JTextField();
        btAdicionarItem = new javax.swing.JButton();
        btRemoverItem = new javax.swing.JButton();
        btFinalizarPedido = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPedido = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        tfTotalPedido = new javax.swing.JTextField();

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Email:");

        jLabel4.setText("Telefone:");

        tfIdCliente.setEditable(false);
        tfIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdClienteActionPerformed(evt);
            }
        });

        tfNomeCliente.setEditable(false);

        tfEmailCliente.setEditable(false);
        tfEmailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailClienteActionPerformed(evt);
            }
        });

        tfTelefoneCliente.setEditable(false);
        tfTelefoneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefoneClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Data Cadastro:");

        tfDataCadastroCliente.setEditable(false);
        tfDataCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataCadastroClienteActionPerformed(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Endereço");

        jLabel7.setText("Rua:");

        jLabel8.setText("Bairro:");

        jLabel9.setText("Cidade:");

        tfRuaCliente.setEditable(false);

        tfCidadeCliente.setEditable(false);
        tfCidadeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCidadeClienteActionPerformed(evt);
            }
        });

        tfBairroCliente.setEditable(false);
        tfBairroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBairroClienteActionPerformed(evt);
            }
        });

        btOKCliente.setText("OK");
        btOKCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKClienteActionPerformed(evt);
            }
        });

        btCancelarCliente.setText("Cancelar");
        btCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarClienteActionPerformed(evt);
            }
        });

        tfPesquisarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarClienteKeyPressed(evt);
            }
        });

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbClientes);

        jLabel16.setText("Pesquisar (nome):");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfDataCadastroCliente))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(206, 206, 206))
                                            .addComponent(tfEmailCliente)
                                            .addComponent(tfNomeCliente))))
                                .addGap(23, 23, 23)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tfBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(tfRuaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(btOKCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btCancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(tfRuaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(tfCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(tfDataCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tfPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOKCliente)
                    .addComponent(btCancelarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPai.addTab("Cliente", jPanel1);

        tfNomeClienteTelaPedido.setEditable(false);
        tfNomeClienteTelaPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btCancelarPedido.setText("Cancelar");
        btCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarPedidoActionPerformed(evt);
            }
        });

        jLabel17.setText("Produto: ");

        jLabel18.setText("Código:");

        jLabel19.setText("Valor:  R$");

        tfCardapioId.setEditable(false);
        tfCardapioId.setBackground(new java.awt.Color(204, 204, 204));

        tfCardapioValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCardapioValorActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Cardápio");

        tbCardapio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbCardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCardapioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCardapio);

        jLabel21.setText("Pesquisar (nome):");

        tfPesquisarCardapio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarCardapioKeyPressed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Pedido");

        jLabel10.setText("Quantidade:");

        tfQuantidadeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantidadeItemActionPerformed(evt);
            }
        });

        btAdicionarItem.setText("Adicionar");
        btAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarItemActionPerformed(evt);
            }
        });

        btRemoverItem.setText("Remover");
        btRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverItemActionPerformed(evt);
            }
        });

        btFinalizarPedido.setText("OK");
        btFinalizarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFinalizarPedidoMouseClicked(evt);
            }
        });
        btFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarPedidoActionPerformed(evt);
            }
        });

        tbPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Cliente", "Item ", "Valor Unitário", "Quantidade", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPedidoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbPedido);
        if (tbPedido.getColumnModel().getColumnCount() > 0) {
            tbPedido.getColumnModel().getColumn(0).setResizable(false);
            tbPedido.getColumnModel().getColumn(1).setResizable(false);
            tbPedido.getColumnModel().getColumn(2).setResizable(false);
            tbPedido.getColumnModel().getColumn(3).setResizable(false);
            tbPedido.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel11.setText("Total do pedido: R$");

        tfTotalPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(tfNomeClienteTelaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tfCardapioId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel19))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tfCardapioNome, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(tfCardapioValor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel10)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(tfQuantidadeItem, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPesquisarCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(221, 221, 221)
                                        .addComponent(jLabel22))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(btCancelarPedido)
                                        .addGap(50, 50, 50)
                                        .addComponent(btFinalizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(btRemoverItem))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel11)
                                        .addGap(7, 7, 7)
                                        .addComponent(tfTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(91, 91, 91))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btAdicionarItem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(tfNomeClienteTelaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(tfCardapioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(tfCardapioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(tfCardapioValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(tfQuantidadeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(tfPesquisarCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btAdicionarItem))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btCancelarPedido)
                                    .addComponent(btFinalizarPedido)
                                    .addComponent(btRemoverItem)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        painelPai.addTab("Pedido", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelPai)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**/
    private void btCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarPedidoActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarPedidoActionPerformed

    private void btCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarClienteActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarClienteActionPerformed

    private void btOKClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKClienteActionPerformed
        if (tfNomeCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "É preciso selecionar um cliente para sequencia no pedido", "Pedido", JOptionPane.WARNING_MESSAGE);
        } else {
            painelPai.setEnabledAt(1, true);
            painelPai.setEnabledAt(0, false);
            painelPai.setSelectedIndex(1);
            tfNomeClienteTelaPedido.setText(tfNomeCliente.getText());
            tbCardapio.setModel(new CardapioTableModel(new CardapioDAO().listarTodos()));
        }
    }//GEN-LAST:event_btOKClienteActionPerformed

    private void tfBairroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBairroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBairroClienteActionPerformed

    private void tfCidadeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCidadeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCidadeClienteActionPerformed

    private void tfDataCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataCadastroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataCadastroClienteActionPerformed

    private void tfTelefoneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefoneClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefoneClienteActionPerformed

    private void tfEmailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailClienteActionPerformed

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        tfIdCliente.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_ID_CLIENTE).toString());
        tfNomeCliente.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_NOME_CLIENTE).toString());
        tfTelefoneCliente.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_TELEFONE_CLIENTE).toString());
        tfEmailCliente.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_EMAIL_CLIENTE).toString());
        tfRuaCliente.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_RUA_CLIENTE).toString());
        tfBairroCliente.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_BAIRRO_CLIENTE).toString());
        tfCidadeCliente.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_CIDADE_CLIENTE).toString());
        tfDataCadastroCliente.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_DATACADASTRO_CLIENTE).toString());
    }//GEN-LAST:event_tbClientesMouseClicked

    private void tfPesquisarClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarClienteKeyPressed
        String nome = tfPesquisarCliente.getText();
        tbClientes.setModel(new ClienteTableModel(new ClienteDAO().listarPorNome(nome)));
    }//GEN-LAST:event_tfPesquisarClienteKeyPressed

    private void tfIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdClienteActionPerformed

    private void tfCardapioValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCardapioValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCardapioValorActionPerformed

    private void tfPesquisarCardapioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarCardapioKeyPressed
        String nome = tfPesquisarCardapio.getText();
        tbCardapio.setModel(new CardapioTableModel(new CardapioDAO().encontrarPorNome(nome)));
    }//GEN-LAST:event_tfPesquisarCardapioKeyPressed

    private void tbCardapioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCardapioMouseClicked
        tfCardapioId.setText(tbCardapio.getValueAt(tbCardapio.getSelectedRow(), CardapioTableModel.COL_ID_CARDAPIO).toString());
        tfCardapioNome.setText(tbCardapio.getValueAt(tbCardapio.getSelectedRow(), CardapioTableModel.COL_NOME_CARDAPIO).toString());
        tfCardapioValor.setText(tbCardapio.getValueAt(tbCardapio.getSelectedRow(), CardapioTableModel.COL_VALOR_CARDAPIO).toString());
    }//GEN-LAST:event_tbCardapioMouseClicked

    private void tfQuantidadeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantidadeItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuantidadeItemActionPerformed

    private void btAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarItemActionPerformed

        if (tfQuantidadeItem.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha a quantidade!", "Pedido", JOptionPane.WARNING_MESSAGE);
        }
        preencherTabelaPedido();
        tfTotalPedido.setText(calcularValorTotal() + "");
        limparCardapio();

    }//GEN-LAST:event_btAdicionarItemActionPerformed

    private void btRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverItemActionPerformed
        removerItemPedido();
        tfTotalPedido.setText(calcularValorTotal() + "");
        limparCardapio();

    }//GEN-LAST:event_btRemoverItemActionPerformed

    private void btFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarPedidoActionPerformed


    }//GEN-LAST:event_btFinalizarPedidoActionPerformed

    private void tbPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPedidoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPedidoMouseClicked

    private void btFinalizarPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFinalizarPedidoMouseClicked
         if (tfTotalPedido.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "É preciso selecionar algum produto para realizar o pedido", "Pedido", JOptionPane.WARNING_MESSAGE);
         }else{
        dataAtual = new Date();
        pedidoModel.setData(formatoData.format(dataAtual));
        pedidoModel.setNomeCliente(tfNomeClienteTelaPedido.getText());
        pedidoModel.setTotal(tfTotalPedido.getText());
        confirmarPedido(pedidoModel);
         }
    }//GEN-LAST:event_btFinalizarPedidoMouseClicked

    private void tfTotalPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarItem;
    private javax.swing.JButton btCancelarCliente;
    private javax.swing.JButton btCancelarPedido;
    private javax.swing.JButton btFinalizarPedido;
    private javax.swing.JButton btOKCliente;
    private javax.swing.JButton btRemoverItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane painelPai;
    private javax.swing.JTable tbCardapio;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTable tbPedido;
    private javax.swing.JTextField tfBairroCliente;
    private javax.swing.JTextField tfCardapioId;
    private javax.swing.JTextField tfCardapioNome;
    private javax.swing.JTextField tfCardapioValor;
    private javax.swing.JTextField tfCidadeCliente;
    private javax.swing.JTextField tfDataCadastroCliente;
    private javax.swing.JTextField tfEmailCliente;
    private javax.swing.JTextField tfIdCliente;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfNomeClienteTelaPedido;
    private javax.swing.JTextField tfPesquisarCardapio;
    private javax.swing.JTextField tfPesquisarCliente;
    private javax.swing.JTextField tfQuantidadeItem;
    private javax.swing.JTextField tfRuaCliente;
    private javax.swing.JTextField tfTelefoneCliente;
    private javax.swing.JTextField tfTotalPedido;
    // End of variables declaration//GEN-END:variables

    public void limparCardapio() {
        tfCardapioId.setText("");
        tfCardapioNome.setText("");
        tfCardapioValor.setText("");
        tfQuantidadeItem.setText("");

    }

    private void preencherTabelaPedido() {
        DefaultTableModel modeloTabelaPedidos = (DefaultTableModel) tbPedido.getModel();
        modeloTabelaPedidos.addRow(new Object[]{tfNomeClienteTelaPedido.getText(), tfCardapioNome.getText(), tfCardapioValor.getText(), tfQuantidadeItem.getText(), calcularValorItem()});

    }

    private void removerItemPedido() {
        DefaultTableModel modeloTabelaPedido = (DefaultTableModel) tbPedido.getModel();
        if (tbPedido.getSelectedRow() >= 0) {
            modeloTabelaPedido.removeRow(tbPedido.getSelectedRow());
            tbPedido.setModel(modeloTabelaPedido);
        } else {
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }
    }

    private void limparTabela() {
        DefaultTableModel modeloTabelaPedidos = (DefaultTableModel) tbPedido.getModel();
        modeloTabelaPedidos.setNumRows(0);
    }

    private Double calcularValorItem() {
        Double valorItem = Double.parseDouble(tfCardapioValor.getText());
        Double quantidadeItem = Double.parseDouble(tfQuantidadeItem.getText());
        Double total = valorItem * quantidadeItem;
        return total;

    }

    private String calcularValorTotal() {
        double total = 0;
        for (int i = 0; i <= tbPedido.getRowCount() - 1; i++) {
            total += Double.parseDouble(tbPedido.getValueAt(i, 4).toString());

        }
        
        return total+"";
    }

    public void limparTodosOsCampos() {
        limparTabela();
        limparCardapio();
        tfTotalPedido.setText("");

    }

    public void confirmarPedido(PedidoModel pedidoModel) {
        int escolha = JOptionPane.showConfirmDialog(null, "Confirma o pedido? \n"+ "Cliente: " + pedidoModel.getNomeCliente() + "\n Valor total: " + pedidoModel.getTotal(), "Pedido", JOptionPane.YES_NO_OPTION);
        if (escolha == 0) {
            pedidoDao.cadastrarPedido(pedidoModel);
            limparTodosOsCampos();
        }
    }

}
