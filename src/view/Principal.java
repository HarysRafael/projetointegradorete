package view;

import java.awt.GridLayout;
import util.FundoTela;
import java.sql.Connection;
import javax.swing.JFrame;
import util.Conexao;

public class Principal extends javax.swing.JFrame {

    private CardapioTela cardapioTela;
    private ClienteTela clienteTela;
    private Connection conexao = null;
    private FundoTela tela;
    private FuncionarioTela funcionarioTela;
    private PedidoTela pedidoTela;
    private BalancoTela balancoTela;
    

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
        telaPedidos = new javax.swing.JMenuItem();
        telaBalanco = new javax.swing.JMenuItem();

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
        telaCardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCardapioMouseClicked(evt);
            }
        });
        menuCadastro.add(telaCardapio);

        menuBarra.add(menuCadastro);

        menuFinanceiro.setText("Finanças");
        menuFinanceiro.setFocusable(false);
        menuFinanceiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFinanceiroMouseClicked(evt);
            }
        });

        telaPedidos.setText("Pedidos");
        telaPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaPedidosActionPerformed(evt);
            }
        });
        menuFinanceiro.add(telaPedidos);

        telaBalanco.setText("Balanço");
        telaBalanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaBalancoActionPerformed(evt);
            }
        });
        menuFinanceiro.add(telaBalanco);

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

    private void telaCardapioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telaCardapioMouseClicked
        cardapioTela = new CardapioTela();
        tela.add(cardapioTela);
        cardapioTela.setVisible(true);
    }//GEN-LAST:event_telaCardapioMouseClicked

    private void menuFinanceiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFinanceiroMouseClicked

    }//GEN-LAST:event_menuFinanceiroMouseClicked

    private void telaBalancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaBalancoActionPerformed
        balancoTela = new BalancoTela();
        tela.add(balancoTela);
        balancoTela.setVisible(true);
    }//GEN-LAST:event_telaBalancoActionPerformed

    private void telaPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaPedidosActionPerformed
        pedidoTela = new PedidoTela();
        tela.add(pedidoTela);
        pedidoTela.setVisible(true);
    }//GEN-LAST:event_telaPedidosActionPerformed

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
    private javax.swing.JMenuItem telaBalanco;
    private javax.swing.JMenu telaCardapio;
    private javax.swing.JMenu telaCliente;
    private javax.swing.JMenu telaFuncionarios;
    private javax.swing.JMenuItem telaPedidos;
    // End of variables declaration//GEN-END:variables
}
