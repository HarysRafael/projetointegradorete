package view;

import dao.FuncionarioDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import model.FuncionarioModel;
import table.FuncionarioTableModel;

public class FuncionarioTela extends javax.swing.JInternalFrame {

    private Date dataAtual;
    private FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    private FuncionarioModel funcionarioModel = new FuncionarioModel();
    private SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    private MaskFormatter formatoTel;

    public FuncionarioTela() {
        super("Funcionário");
        setVisible(true);
        initComponents();       
        tbFuncionario.setModel(new FuncionarioTableModel(new FuncionarioDAO().listarTodos()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfFuncionarioNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfFuncionarioId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfFuncionarioEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        try{
            formatoTel = new MaskFormatter ("(##) #####-####");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Campo", "Ero", 0);
        }
        tfFuncionarioTelefone = new JFormattedTextField(formatoTel)
        ;
        jLabel6 = new javax.swing.JLabel();
        tfFuncionarioDataContrato = new javax.swing.JTextField();
        btSalvarFuncionario = new javax.swing.JButton();
        btLimparFuncionario = new javax.swing.JButton();
        btDeletarFuncionario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFuncionario = new javax.swing.JTable();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        tfPersquisarNomeFuncionario = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Dados");

        jLabel2.setText("Nome:");

        jLabel3.setText("Código:");

        tfFuncionarioId.setEditable(false);
        tfFuncionarioId.setBackground(new java.awt.Color(204, 204, 204));
        tfFuncionarioId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFuncionarioIdActionPerformed(evt);
            }
        });

        jLabel4.setText("Email:");

        tfFuncionarioEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFuncionarioEmailActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefone:");

        tfFuncionarioTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFuncionarioTelefoneActionPerformed(evt);
            }
        });

        jLabel6.setText("Contratado:");

        tfFuncionarioDataContrato.setEditable(false);
        tfFuncionarioDataContrato.setBackground(new java.awt.Color(204, 204, 204));

        btSalvarFuncionario.setText("Salvar");
        btSalvarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvarFuncionarioMouseClicked(evt);
            }
        });
        btSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarFuncionarioActionPerformed(evt);
            }
        });

        btLimparFuncionario.setText("Limpar");
        btLimparFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLimparFuncionarioMouseClicked(evt);
            }
        });

        btDeletarFuncionario.setText("Deletar");
        btDeletarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDeletarFuncionarioMouseClicked(evt);
            }
        });
        btDeletarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarFuncionarioActionPerformed(evt);
            }
        });

        tbFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Email", "Telefone", "Contratado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbFuncionario);
        if (tbFuncionario.getColumnModel().getColumnCount() > 0) {
            tbFuncionario.getColumnModel().getColumn(0).setResizable(false);
            tbFuncionario.getColumnModel().getColumn(1).setResizable(false);
            tbFuncionario.getColumnModel().getColumn(2).setResizable(false);
            tbFuncionario.getColumnModel().getColumn(3).setResizable(false);
            tbFuncionario.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel7.setText("Pesquisar (nome):");

        tfPersquisarNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPersquisarNomeFuncionarioActionPerformed(evt);
            }
        });
        tfPersquisarNomeFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPersquisarNomeFuncionarioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(btSalvarFuncionario)
                                        .addGap(27, 27, 27)
                                        .addComponent(btLimparFuncionario))
                                    .addComponent(tfFuncionarioTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(btDeletarFuncionario))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfFuncionarioDataContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfFuncionarioEmail)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfFuncionarioNome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfFuncionarioId, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jSeparator5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPersquisarNomeFuncionario)))))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfFuncionarioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFuncionarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfFuncionarioEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfFuncionarioTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfFuncionarioDataContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarFuncionario)
                    .addComponent(btLimparFuncionario)
                    .addComponent(btDeletarFuncionario))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfPersquisarNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limparCampos() {
        tfFuncionarioId.setText("");
        tfFuncionarioNome.setText("");
        tfFuncionarioEmail.setText("");
        tfFuncionarioTelefone.setText("");
        tfFuncionarioDataContrato.setText("");
    }
    private void tfFuncionarioIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFuncionarioIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFuncionarioIdActionPerformed

    private void tfFuncionarioEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFuncionarioEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFuncionarioEmailActionPerformed

    private void tfPersquisarNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPersquisarNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPersquisarNomeFuncionarioActionPerformed

    private void btSalvarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarFuncionarioMouseClicked

    }//GEN-LAST:event_btSalvarFuncionarioMouseClicked

    private void btLimparFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimparFuncionarioMouseClicked
        this.limparCampos();
    }//GEN-LAST:event_btLimparFuncionarioMouseClicked

    private void btDeletarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeletarFuncionarioMouseClicked
        if (tfFuncionarioId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo de Código está vazio, escolha um funcionário!", "Funcionário", JOptionPane.WARNING_MESSAGE);
        } else {
            int escolha = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Funcionário", JOptionPane.YES_NO_OPTION);
            if (escolha == 0) {
                int codigo = Integer.parseInt(tfFuncionarioId.getText());
                funcionarioDAO.excluirFuncionario(codigo);
                this.limparCampos();
                tbFuncionario.setModel(new FuncionarioTableModel(new FuncionarioDAO().listarTodos()));
            }
        }
    }//GEN-LAST:event_btDeletarFuncionarioMouseClicked

    private void tfPersquisarNomeFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPersquisarNomeFuncionarioKeyPressed
        String nome = tfPersquisarNomeFuncionario.getText();
         tbFuncionario.setModel(new FuncionarioTableModel(new FuncionarioDAO().encontrarPorNome(nome)));
    }//GEN-LAST:event_tfPersquisarNomeFuncionarioKeyPressed

    private void tbFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFuncionarioMouseClicked
        tfFuncionarioId.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), FuncionarioTableModel.COL_ID_FUNCIONARIO).toString());
        tfFuncionarioNome.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), FuncionarioTableModel.COL_NOME_FUNCIONARIO).toString());
        tfFuncionarioTelefone.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), FuncionarioTableModel.COL_TELEFONE_FUNCIONARIO).toString());
        tfFuncionarioEmail.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), FuncionarioTableModel.COL_EMAIL_FUNCIONARIO).toString());
        tfFuncionarioDataContrato.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), FuncionarioTableModel.COL_DATACONTRATO_FUNCIONARIO).toString());
    }//GEN-LAST:event_tbFuncionarioMouseClicked

    private void btDeletarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeletarFuncionarioActionPerformed

    private void btSalvarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarFuncionarioActionPerformed
        
        if (tfFuncionarioNome.getText().equals("") || tfFuncionarioEmail.getText().equals("") || tfFuncionarioTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha Todos os Campos!", "Cliente", JOptionPane.WARNING_MESSAGE);
        } else {
            if (tfFuncionarioId.getText().equals("")) {

                dataAtual = new Date();
                formatoData = new SimpleDateFormat("dd/MM/yyyy");
                funcionarioModel.setNome(tfFuncionarioNome.getText());
                funcionarioModel.setEmail(tfFuncionarioEmail.getText());
                funcionarioModel.setTelefone(tfFuncionarioTelefone.getText());
                funcionarioModel.setDataContrato(formatoData.format(dataAtual));
                funcionarioDAO.cadastrarFuncionario(funcionarioModel);
                this.limparCampos();

            } else {
                dataAtual = new Date();
                formatoData = new SimpleDateFormat("dd/MM/yyyy");
                funcionarioModel.setId(Integer.parseInt(tfFuncionarioId.getText()));
                funcionarioModel.setNome(tfFuncionarioNome.getText());
                funcionarioModel.setEmail(tfFuncionarioEmail.getText());
                funcionarioModel.setTelefone(tfFuncionarioTelefone.getText());
                funcionarioModel.setDataContrato(formatoData.format(dataAtual));
                funcionarioDAO.editarFuncionario(funcionarioModel);
                this.limparCampos();
            }

        }

        tbFuncionario.setModel(new FuncionarioTableModel(new FuncionarioDAO().listarTodos()));
    }//GEN-LAST:event_btSalvarFuncionarioActionPerformed

    private void tfFuncionarioTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFuncionarioTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFuncionarioTelefoneActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeletarFuncionario;
    private javax.swing.JButton btLimparFuncionario;
    private javax.swing.JButton btSalvarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tbFuncionario;
    private javax.swing.JTextField tfFuncionarioDataContrato;
    private javax.swing.JTextField tfFuncionarioEmail;
    private javax.swing.JTextField tfFuncionarioId;
    private javax.swing.JTextField tfFuncionarioNome;
    private javax.swing.JTextField tfFuncionarioTelefone;
    private javax.swing.JTextField tfPersquisarNomeFuncionario;
    // End of variables declaration//GEN-END:variables
}
