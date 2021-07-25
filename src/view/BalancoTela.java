package view;

import dao.PedidoDAO;
import table.BalancoTableModel;

public class BalancoTela extends javax.swing.JInternalFrame {

    private PedidoDAO pedidoDao;

    public BalancoTela() {
        super("Balanço");
        initComponents();
        tbBalanco.setModel(new BalancoTableModel(new PedidoDAO().listarTodos()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbBalanco = new javax.swing.JTable();
        cbOpcaoPesquisa = new javax.swing.JComboBox<>();
        tfPesquisaBalanco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        tbBalanco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Cliente", "Nome Cliente", "Bairro Cliente", "Data Cadastro Cliente", "Codigo Pedido", "Valor Pedido", "Data Pedido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbBalanco);
        if (tbBalanco.getColumnModel().getColumnCount() > 0) {
            tbBalanco.getColumnModel().getColumn(0).setResizable(false);
            tbBalanco.getColumnModel().getColumn(1).setResizable(false);
            tbBalanco.getColumnModel().getColumn(2).setResizable(false);
            tbBalanco.getColumnModel().getColumn(3).setResizable(false);
            tbBalanco.getColumnModel().getColumn(4).setResizable(false);
            tbBalanco.getColumnModel().getColumn(5).setResizable(false);
            tbBalanco.getColumnModel().getColumn(6).setResizable(false);
        }

        cbOpcaoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma opção para listar pedidos", "Bairro", "Nome" }));
        cbOpcaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOpcaoPesquisaActionPerformed(evt);
            }
        });

        tfPesquisaBalanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisaBalancoKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Balanço");

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbOpcaoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPesquisaBalanco, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jButton1)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOpcaoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPesquisaBalanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbOpcaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpcaoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOpcaoPesquisaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfPesquisaBalancoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaBalancoKeyPressed
        if (cbOpcaoPesquisa.getSelectedItem().toString().equals("Bairro")) {
            String bairro = tfPesquisaBalanco.getText();
            tbBalanco.setModel(new BalancoTableModel(new PedidoDAO().buscarPedidoPorBairroCliente(bairro)));
        }
        if (cbOpcaoPesquisa.getSelectedItem().toString().equals("Nome")) {
            String nome = tfPesquisaBalanco.getText();
            tbBalanco.setModel(new BalancoTableModel(new PedidoDAO().buscarPedidoPorNomeCliente(nome)));
        }
    }//GEN-LAST:event_tfPesquisaBalancoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbOpcaoPesquisa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbBalanco;
    private javax.swing.JTextField tfPesquisaBalanco;
    // End of variables declaration//GEN-END:variables

}
