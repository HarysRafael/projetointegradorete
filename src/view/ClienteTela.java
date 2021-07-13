package view;

import dao.ClienteDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;
import model.ClienteModel;
import table.ClienteTableModel;

public class ClienteTela extends javax.swing.JInternalFrame {

    private ClienteDAO clienteDAO = new ClienteDAO();
    private ClienteModel clienteModel = new ClienteModel();
    private Date dataAtual;
    private SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    private MaskFormatter formatoTel;

    public ClienteTela() {
        super("Cliente");
        setVisible(true);
        initComponents();
        tbClientes.setModel(new ClienteTableModel(new ClienteDAO().listarTodos()));

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        ClienteEnderecoLabel2 = new javax.swing.JLabel();
        BairroClienteTextField2 = new javax.swing.JTextField();
        ClienteIdLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        DataCadastroClienteTextField2 = new javax.swing.JTextField();
        CidadeClienteTextField2 = new javax.swing.JTextField();
        ClienteTelefoneLabel2 = new javax.swing.JLabel();
        ClienteDataCadastroLabel2 = new javax.swing.JLabel();
        ClienteBairroLabel2 = new javax.swing.JLabel();
        ClienteCidadeLabel2 = new javax.swing.JLabel();
        EmailClienteTextField2 = new javax.swing.JTextField();
        NomeClienteTextField2 = new javax.swing.JTextField();
        TelefoneClienteTextField2 = new javax.swing.JTextField();
        RuaClienteTextField2 = new javax.swing.JTextField();
        ClienteIdTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        ClienteRuaLabel2 = new javax.swing.JLabel();
        tfClienteCidade = new javax.swing.JTextField();
        tfClienteRua = new javax.swing.JTextField();
        tfClienteId = new javax.swing.JTextField();
        ClienteCidadeLabel3 = new javax.swing.JLabel();
        ClienteEnderecoLabel3 = new javax.swing.JLabel();
        tfClienteDataCadastro = new javax.swing.JTextField();
        ClienteDataCadastroLabel3 = new javax.swing.JLabel();
        ClienteBairroLabel3 = new javax.swing.JLabel();
        ClienteEmailLabel2 = new javax.swing.JLabel();
        ClienteIdLabel3 = new javax.swing.JLabel();
        tfClienteNome = new javax.swing.JTextField();
        tfClienteEmail = new javax.swing.JTextField();
        ClienteNomeLabel2 = new javax.swing.JLabel();
        tfClienteBairro = new javax.swing.JTextField();
        ClienteTelefoneLabel3 = new javax.swing.JLabel();
        try{
            formatoTel = new MaskFormatter ("(##) #####-####");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Campo", "Ero", 0);
        }
        tfClienteTelefone = new JFormattedTextField(formatoTel);
        btSalvarCliente = new javax.swing.JButton();
        btLimparDadosCliente = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        tfPesquisaNomeCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        ClienteEnderecoLabel4 = new javax.swing.JLabel();

        ClienteEnderecoLabel2.setText("Endereço");

        ClienteIdLabel2.setText("Código:");

        ClienteTelefoneLabel2.setText("Teefone:");

        ClienteDataCadastroLabel2.setText("Data de Cadastro:");

        ClienteBairroLabel2.setText("Bairro:");

        ClienteCidadeLabel2.setText("Cidade:");

        NomeClienteTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeClienteTextField2ActionPerformed(evt);
            }
        });

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Email", "Telefone"
            }
        ));
        jScrollPane2.setViewportView(tbCliente);

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ClienteRuaLabel2.setText("Rua:");

        tfClienteId.setEditable(false);
        tfClienteId.setBackground(new java.awt.Color(204, 204, 204));

        ClienteCidadeLabel3.setText("Cidade:");

        ClienteEnderecoLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClienteEnderecoLabel3.setText("Endereço");

        tfClienteDataCadastro.setEditable(false);
        tfClienteDataCadastro.setBackground(new java.awt.Color(204, 204, 204));
        tfClienteDataCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClienteDataCadastroActionPerformed(evt);
            }
        });

        ClienteDataCadastroLabel3.setText("Data de Cadastro:");

        ClienteBairroLabel3.setText("Bairro:");

        ClienteEmailLabel2.setText("Email:");

        ClienteIdLabel3.setText("Código:");

        tfClienteNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClienteNomeActionPerformed(evt);
            }
        });

        tfClienteEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClienteEmailActionPerformed(evt);
            }
        });

        ClienteNomeLabel2.setText("Nome:");

        ClienteTelefoneLabel3.setText("Teefone:");

        tfClienteTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClienteTelefoneActionPerformed(evt);
            }
        });

        btSalvarCliente.setText("Salvar");
        btSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarClienteActionPerformed(evt);
            }
        });

        btLimparDadosCliente.setText("Limpar");
        btLimparDadosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparDadosClienteActionPerformed(evt);
            }
        });

        btDeletar.setText("Deletar");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar (nome):");

        tfPesquisaNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisaNomeClienteActionPerformed(evt);
            }
        });
        tfPesquisaNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisaNomeClienteKeyPressed(evt);
            }
        });

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Telefone", "E-mail", "Rua", "Bairro", "Cidade", "Data Cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);
        if (tbClientes.getColumnModel().getColumnCount() > 0) {
            tbClientes.getColumnModel().getColumn(0).setResizable(false);
            tbClientes.getColumnModel().getColumn(1).setResizable(false);
            tbClientes.getColumnModel().getColumn(2).setResizable(false);
            tbClientes.getColumnModel().getColumn(3).setResizable(false);
            tbClientes.getColumnModel().getColumn(4).setResizable(false);
            tbClientes.getColumnModel().getColumn(5).setResizable(false);
            tbClientes.getColumnModel().getColumn(6).setResizable(false);
            tbClientes.getColumnModel().getColumn(7).setResizable(false);
        }

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        ClienteEnderecoLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClienteEnderecoLabel4.setText("Dados Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator5)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(334, 334, 334)
                                .addComponent(btSalvarCliente)
                                .addGap(18, 18, 18)
                                .addComponent(btLimparDadosCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ClienteEmailLabel2)
                                            .addComponent(ClienteNomeLabel2)
                                            .addComponent(ClienteIdLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ClienteTelefoneLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ClienteDataCadastroLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfClienteDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(172, 172, 172)
                                        .addComponent(ClienteEnderecoLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btDeletar)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(ClienteBairroLabel3)
                                        .addGap(376, 376, 376)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ClienteCidadeLabel3)
                                    .addContainerGap()))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ClienteRuaLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfClienteRua, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfClienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfClienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ClienteEnderecoLabel3)
                                .addGap(162, 162, 162))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPesquisaNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ClienteEnderecoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfClienteRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ClienteRuaLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfClienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ClienteBairroLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfClienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ClienteCidadeLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ClienteEnderecoLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ClienteIdLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ClienteNomeLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ClienteEmailLabel2)
                                    .addComponent(tfClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfClienteDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ClienteDataCadastroLabel3)
                                    .addComponent(tfClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ClienteTelefoneLabel3))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarCliente)
                    .addComponent(btLimparDadosCliente)
                    .addComponent(btDeletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisaNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    public void limparCampos() {
        tfClienteId.setText("");
        tfClienteNome.setText("");
        tfClienteEmail.setText("");
        tfClienteTelefone.setText("");
        tfClienteRua.setText("");
        tfClienteBairro.setText("");
        tfClienteCidade.setText("");
        tfClienteDataCadastro.setText("");
    }
    private void NomeClienteTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void tfClienteNomeActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void tfClienteEmailActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void btSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                

        if (tfClienteNome.getText().equals("") || tfClienteEmail.getText().equals("") || tfClienteTelefone.getText().equals("")
                || tfClienteRua.getText().equals("") || tfClienteBairro.getText().equals("") || tfClienteCidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha Todos os Campos!", "Cliente", JOptionPane.WARNING_MESSAGE);
        } else {
            if (tfClienteId.getText().equals("")) {

                dataAtual = new Date();
                formatoData = new SimpleDateFormat("dd/MM/yyyy");
                clienteModel.setNome(tfClienteNome.getText());
                clienteModel.setEmail(tfClienteEmail.getText());
                clienteModel.setTelefone(tfClienteTelefone.getText());
                clienteModel.setRua(tfClienteRua.getText());
                clienteModel.setBairro(tfClienteBairro.getText());
                clienteModel.setCidade(tfClienteCidade.getText());
                clienteModel.setDataCadastro(formatoData.format(dataAtual));
                clienteDAO.cadastrarCliente(clienteModel);
                this.limparCampos();

            } else {
                dataAtual = new Date();
                clienteModel.setId(Integer.parseInt(tfClienteId.getText()));
                clienteModel.setNome(tfClienteNome.getText());
                clienteModel.setEmail(tfClienteEmail.getText());
                clienteModel.setTelefone(tfClienteTelefone.getText());
                clienteModel.setRua(tfClienteRua.getText());
                clienteModel.setBairro(tfClienteBairro.getText());
                clienteModel.setCidade(tfClienteCidade.getText());
                clienteModel.setDataCadastro(formatoData.format(dataAtual));
                clienteDAO.editarCliente(clienteModel);
                this.limparCampos();
            }

        }

        tbClientes.setModel(new ClienteTableModel(new ClienteDAO().listarTodos()));
    }                                               

    private void tfPesquisaNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void btLimparDadosClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        this.limparCampos();
    }                                                    

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {                                        
        tfClienteId.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_ID_CLIENTE).toString());
        tfClienteNome.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_NOME_CLIENTE).toString());
        tfClienteTelefone.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_TELEFONE_CLIENTE).toString());
        tfClienteEmail.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_EMAIL_CLIENTE).toString());
        tfClienteRua.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_RUA_CLIENTE).toString());
        tfClienteBairro.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_BAIRRO_CLIENTE).toString());
        tfClienteCidade.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_CIDADE_CLIENTE).toString());
        tfClienteDataCadastro.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), ClienteTableModel.COL_DATACADASTRO_CLIENTE).toString());
    }                                       

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (tfClienteId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo de Código está vazio, escolha um cliente!", "Cliente", JOptionPane.WARNING_MESSAGE);
        } else {
            int escolha = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Cliente", JOptionPane.YES_NO_OPTION);
            if (escolha == 0) {
                int codigo = Integer.parseInt(tfClienteId.getText());
                clienteDAO.excluirCliente(codigo);
                this.limparCampos();
                tbClientes.setModel(new ClienteTableModel(new ClienteDAO().listarTodos()));
            }
        }
    }                                         

    private void tfPesquisaNomeClienteKeyPressed(java.awt.event.KeyEvent evt) {                                                 
        String nome = tfPesquisaNomeCliente.getText();
        tbClientes.setModel(new ClienteTableModel(new ClienteDAO().encontrarPorNome(nome)));
    }                                                

    private void tfClienteDataCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void tfClienteTelefoneActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    // Variables declaration - do not modify                     
    private javax.swing.JTextField BairroClienteTextField2;
    private javax.swing.JTextField CidadeClienteTextField2;
    private javax.swing.JLabel ClienteBairroLabel2;
    private javax.swing.JLabel ClienteBairroLabel3;
    private javax.swing.JLabel ClienteCidadeLabel2;
    private javax.swing.JLabel ClienteCidadeLabel3;
    private javax.swing.JLabel ClienteDataCadastroLabel2;
    private javax.swing.JLabel ClienteDataCadastroLabel3;
    private javax.swing.JLabel ClienteEmailLabel2;
    private javax.swing.JLabel ClienteEnderecoLabel2;
    private javax.swing.JLabel ClienteEnderecoLabel3;
    private javax.swing.JLabel ClienteEnderecoLabel4;
    private javax.swing.JLabel ClienteIdLabel2;
    private javax.swing.JLabel ClienteIdLabel3;
    private javax.swing.JTextField ClienteIdTextField2;
    private javax.swing.JLabel ClienteNomeLabel2;
    private javax.swing.JLabel ClienteRuaLabel2;
    private javax.swing.JLabel ClienteTelefoneLabel2;
    private javax.swing.JLabel ClienteTelefoneLabel3;
    private javax.swing.JTextField DataCadastroClienteTextField2;
    private javax.swing.JTextField EmailClienteTextField2;
    private javax.swing.JTextField NomeClienteTextField2;
    private javax.swing.JTextField RuaClienteTextField2;
    private javax.swing.JTextField TelefoneClienteTextField2;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btLimparDadosCliente;
    private javax.swing.JButton btSalvarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tbCliente;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField tfClienteBairro;
    private javax.swing.JTextField tfClienteCidade;
    private javax.swing.JTextField tfClienteDataCadastro;
    private javax.swing.JTextField tfClienteEmail;
    private javax.swing.JTextField tfClienteId;
    private javax.swing.JTextField tfClienteNome;
    private javax.swing.JTextField tfClienteRua;
    private javax.swing.JTextField tfClienteTelefone;
    private javax.swing.JTextField tfPesquisaNomeCliente;
    // End of variables declaration                   
}
