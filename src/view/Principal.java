package view;

import java.awt.GridLayout;
import util.FundoTela;
import java.sql.Connection;
import javax.swing.JFrame;
import util.Conexao;

public class Principal extends javax.swing.JFrame {

    FundoTela tela;
    ClienteTela clienteTela;
    FuncionarioTela funcionarioTela;
    Connection conexao = null;

    public Principal() {
        super("Lanchonete");
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new GridLayout());
        tela = new FundoTela("/image/logotipo-lanchonete.png");
        getContentPane().add(tela);
        conexao = Conexao.getConnection();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBarra = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        telaCliente = new javax.swing.JMenu();
        telaFuncionarios = new javax.swing.JMenu();
        telaCardapio = new javax.swing.JMenu();
        menuFinanceiro = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCadastro.setText("Cadastro");
        menuCadastro.setFocusable(false);

        telaCliente.setText("Clientes");
        telaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaClienteMouseClicked(evt);
            }
        });
        telaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(telaCliente);

        telaFuncionarios.setText("Funcionários");
        telaFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaFuncionariosMouseClicked(evt);
            }
        });
        menuCadastro.add(telaFuncionarios);

        telaCardapio.setText("Cardápio");
        menuCadastro.add(telaCardapio);

        menuBarra.add(menuCadastro);

        menuFinanceiro.setText("Financeiro");
        menuFinanceiro.setFocusable(false);
        menuBarra.add(menuFinanceiro);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 819, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaClienteActionPerformed
        
        
    }//GEN-LAST:event_telaClienteActionPerformed

    private void telaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telaClienteMouseClicked
       clienteTela = new ClienteTela();
       tela.add(clienteTela);
       clienteTela.setVisible(true);
       
       
    }//GEN-LAST:event_telaClienteMouseClicked

    private void telaFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telaFuncionariosMouseClicked
      funcionarioTela = new FuncionarioTela();
      tela.add(funcionarioTela);
      funcionarioTela.setVisible(true);
    }//GEN-LAST:event_telaFuncionariosMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuFinanceiro;
    private javax.swing.JMenu telaCardapio;
    private javax.swing.JMenu telaCliente;
    private javax.swing.JMenu telaFuncionarios;
    // End of variables declaration//GEN-END:variables
}
