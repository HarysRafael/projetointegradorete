package view;

import dao.CardapioDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import model.CardapioModel;
import table.CardapioTableModel;

public class CardapioTela extends javax.swing.JInternalFrame {

    private Date dataAtual;
    private CardapioDAO cardapioDAO = new CardapioDAO();
    private CardapioModel cardapioModel = new CardapioModel();

    public CardapioTela() {
        initComponents();
        setVisible(true);
        initComponents();
        tbCardapio.setModel(new CardapioTableModel(new CardapioDAO().listarTodos()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfCardapioId = new javax.swing.JTextField();
        tfCardapioNome = new javax.swing.JTextField();
        tfCardapioValor = new javax.swing.JTextField();
        btSalvarCardapio = new javax.swing.JButton();
        btLimparCardapio = new javax.swing.JButton();
        btDeletarCardapio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCardapio = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        tfPesquisaCardapio = new javax.swing.JTextField();

        setClosable(true);
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cardápio");

        jLabel2.setText("Produto: ");

        jLabel3.setText("Código:");

        jLabel4.setText("Valor:  R$");

        tfCardapioId.setEditable(false);
        tfCardapioId.setBackground(new java.awt.Color(204, 204, 204));

        tfCardapioValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCardapioValorActionPerformed(evt);
            }
        });

        btSalvarCardapio.setText("Salvar");
        btSalvarCardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvarCardapioMouseClicked(evt);
            }
        });
        btSalvarCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarCardapioActionPerformed(evt);
            }
        });

        btLimparCardapio.setText("Limpar");
        btLimparCardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLimparCardapioMouseClicked(evt);
            }
        });

        btDeletarCardapio.setText("Deletar");
        btDeletarCardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDeletarCardapioMouseClicked(evt);
            }
        });

        tbCardapio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Produto", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCardapioMouseClicked(evt);
            }
        });
        tbCardapio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbCardapioKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbCardapio);
        if (tbCardapio.getColumnModel().getColumnCount() > 0) {
            tbCardapio.getColumnModel().getColumn(0).setResizable(false);
            tbCardapio.getColumnModel().getColumn(1).setResizable(false);
            tbCardapio.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel5.setText("Perquisar (nome):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btSalvarCardapio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimparCardapio)
                .addGap(134, 134, 134))
            .addComponent(jSeparator1)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPesquisaCardapio))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCardapioValor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btDeletarCardapio)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfCardapioId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfCardapioNome, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCardapioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCardapioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfCardapioValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimparCardapio)
                            .addComponent(btSalvarCardapio)
                            .addComponent(btDeletarCardapio))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisaCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limparCampos() {
        tfCardapioId.setText("");
        tfCardapioNome.setText("");
        tfCardapioValor.setText("");
    }

    private void tfCardapioValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCardapioValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCardapioValorActionPerformed

    private void btLimparCardapioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimparCardapioMouseClicked
        this.limparCampos();
    }//GEN-LAST:event_btLimparCardapioMouseClicked

    private void btSalvarCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarCardapioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarCardapioActionPerformed

    private void btSalvarCardapioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarCardapioMouseClicked
        if (tfCardapioNome.getText().equals("") || tfCardapioValor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha Todos os Campos!", "Cardápio", JOptionPane.WARNING_MESSAGE);
        } else {
            if (tfCardapioId.getText().equals("")) {
                cardapioModel.setNome(tfCardapioNome.getText());
                cardapioModel.setValor(Double.parseDouble(tfCardapioValor.getText()));
                cardapioDAO.cadastrarCardapio(cardapioModel);
                this.limparCampos();

            } else {
                cardapioModel.setId(Integer.parseInt(tfCardapioId.getText()));
                cardapioModel.setNome(tfCardapioNome.getText());
                cardapioModel.setValor(Double.parseDouble(tfCardapioValor.getText()));
                cardapioDAO.editarCardapio(cardapioModel);
                this.limparCampos();
            }

        }

        tbCardapio.setModel(new CardapioTableModel(new CardapioDAO().listarTodos()));

    }//GEN-LAST:event_btSalvarCardapioMouseClicked

    private void btDeletarCardapioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeletarCardapioMouseClicked
        if (tfCardapioId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo de Código está vazio, escolha um item do Cardápio!", "Cardápio", JOptionPane.WARNING_MESSAGE);
        } else {
            int escolha = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Cardápio", JOptionPane.YES_NO_OPTION);
            if (escolha == 0) {
                int codigo = Integer.parseInt(tfCardapioId.getText());
                cardapioDAO.excluir(codigo);
                this.limparCampos();
                tbCardapio.setModel(new CardapioTableModel(new CardapioDAO().listarTodos()));
            }
        }
    }//GEN-LAST:event_btDeletarCardapioMouseClicked

    private void tbCardapioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbCardapioKeyPressed
        String nome = tfPesquisaCardapio.getText();
        tbCardapio.setModel(new CardapioTableModel(new CardapioDAO().encontrarPorNome(nome)));
    }//GEN-LAST:event_tbCardapioKeyPressed

    private void tbCardapioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCardapioMouseClicked
        tfCardapioId.setText(tbCardapio.getValueAt(tbCardapio.getSelectedRow(), CardapioTableModel.COL_ID_CARDAPIO).toString());
        tfCardapioNome.setText(tbCardapio.getValueAt(tbCardapio.getSelectedRow(), CardapioTableModel.COL_NOME_CARDAPIO).toString());
        tfCardapioValor.setText(tbCardapio.getValueAt(tbCardapio.getSelectedRow(), CardapioTableModel.COL_VALOR_CARDAPIO).toString());
    }//GEN-LAST:event_tbCardapioMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeletarCardapio;
    private javax.swing.JButton btLimparCardapio;
    private javax.swing.JButton btSalvarCardapio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbCardapio;
    private javax.swing.JTextField tfCardapioId;
    private javax.swing.JTextField tfCardapioNome;
    private javax.swing.JTextField tfCardapioValor;
    private javax.swing.JTextField tfPesquisaCardapio;
    // End of variables declaration//GEN-END:variables
}
