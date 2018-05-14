package Matthew.view;

import Matthew.model.Calculos;
import Matthew.model.vo.ResultadosVO;
import java.util.List;

/**
 *
 * @author bruno
 */
public class EntradaDados extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public EntradaDados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        tabPane = new javax.swing.JTabbedPane();
        pnlAtivo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCaixa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtReceber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotalACirculante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotalAtivo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotalPCirculante = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTotalPermanente = new javax.swing.JTextField();
        txtEmprestimos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTotalPLiquido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtResultadoFinanceiro = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtReceitaBruta = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtResultadoOp = new javax.swing.JTextField();
        txtDespesas = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtLucroAntesImpostos = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCustoMercadoriaVendida = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtLucroPerda = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtLucroBruto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jLabel1.setText("Caixa e Equivalentes");

        jLabel2.setText("Estoques");

        jLabel3.setText("Duplicatas a Receber");

        jLabel4.setText("Total Ativo Circulantes");

        jLabel5.setText("Total Ativo");

        jLabel6.setText("Total Passivo Circulantes");

        jLabel7.setText("Total Passivo Permanente");

        jLabel8.setText("Empréstimos e financiamentos");

        jLabel10.setText("Total Patrimônio Líquido");

        jLabel9.setText("Resultado Financeiro");

        javax.swing.GroupLayout pnlAtivoLayout = new javax.swing.GroupLayout(pnlAtivo);
        pnlAtivo.setLayout(pnlAtivoLayout);
        pnlAtivoLayout.setHorizontalGroup(
            pnlAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtivoLayout.createSequentialGroup()
                .addGroup(pnlAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAtivoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(txtTotalACirculante, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCaixa, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtReceber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotalAtivo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pnlAtivoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addGroup(pnlAtivoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addGroup(pnlAtivoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addGroup(pnlAtivoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addGroup(pnlAtivoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)))
                .addGap(268, 268, 268)
                .addGroup(pnlAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAtivoLayout.createSequentialGroup()
                        .addGroup(pnlAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalPLiquido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotalPermanente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmprestimos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotalPCirculante, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9))
                        .addGap(7, 7, 7))
                    .addGroup(pnlAtivoLayout.createSequentialGroup()
                        .addGroup(pnlAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(pnlAtivoLayout.createSequentialGroup()
                        .addComponent(txtResultadoFinanceiro)
                        .addContainerGap())))
        );
        pnlAtivoLayout.setVerticalGroup(
            pnlAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAtivoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalACirculante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultadoFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlAtivoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalPLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalPCirculante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalPermanente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel3.getAccessibleContext().setAccessibleName("");

        tabPane.addTab("Balanço Patrimonial", pnlAtivo);

        jLabel11.setText("Receita Bruta");

        jLabel16.setText("Custo da Mercadoria Vendida");

        txtDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDespesasActionPerformed(evt);
            }
        });

        jLabel17.setText("Despesas Financeiras");

        jLabel18.setText("Lucro antes dos impostos");

        jLabel19.setText("Resultado Operacional");

        jLabel20.setText("Lucro ou Perda do Período");

        txtLucroPerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLucroPerdaActionPerformed(evt);
            }
        });

        jLabel21.setText("Lucro Bruto");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(txtDespesas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtReceitaBruta)
                    .addComponent(txtCustoMercadoriaVendida)
                    .addComponent(jLabel18)
                    .addComponent(txtLucroAntesImpostos))
                .addGap(269, 269, 269)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(txtLucroPerda)
                    .addComponent(txtLucroBruto)
                    .addComponent(txtResultadoOp))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReceitaBruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultadoOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustoMercadoriaVendida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLucroBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLucroPerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLucroAntesImpostos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        tabPane.addTab("DRE", jPanel5);

        getContentPane().add(tabPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        Calculos calc = new Calculos();
////        ativos
        calc.setdCaixaEqui(Double.parseDouble(txtCaixa.getText()));
        calc.setdEstoque(Double.parseDouble(txtEstoque.getText()));
        calc.setdContaReceber(Double.parseDouble(txtReceber.getText()));
        calc.setdAtivoCirculante(Double.parseDouble(txtTotalACirculante.getText()));
        calc.setdAtivoTotal(Double.parseDouble(txtTotalAtivo.getText()));
        calc.setdEmprestimos(Double.parseDouble(txtEmprestimos.getText()));
        calc.setdPatrimonioLiq(Double.parseDouble(txtTotalPLiquido.getText()));
        calc.setdPassivoCirculante(Double.parseDouble(txtTotalPCirculante.getText()));
        calc.setdPassivoPermanente(Double.parseDouble(txtTotalPermanente.getText()));
        calc.setdResultadoFinanceiro(Double.parseDouble(txtResultadoFinanceiro.getText()));
//        //DRE
        calc.setdReceitaBruta(Double.parseDouble(txtReceitaBruta.getText()));
        calc.setdCustoMercadoriaVendida(Double.parseDouble(txtCustoMercadoriaVendida.getText()));
        calc.setdDespesas(Double.parseDouble(txtDespesas.getText()));
        calc.setdLucroAImpostos(Double.parseDouble(txtLucroAntesImpostos.getText()));
        calc.setdResultadoOp(Double.parseDouble(txtResultadoOp.getText()));
        calc.setdLucroBruto(Double.parseDouble(txtLucroBruto.getText()));
        calc.setdLucroPerda(Double.parseDouble(txtLucroPerda.getText()));
        //calcular
        List<ResultadosVO> lst = calc.Calcular();

        Resultado res = new Resultado(lst);
        res.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtLucroPerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLucroPerdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLucroPerdaActionPerformed

    private void txtDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDespesasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDespesasActionPerformed

    /*
     * @param args the command line arguments
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaDados().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel pnlAtivo;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JTextField txtCaixa;
    private javax.swing.JTextField txtCustoMercadoriaVendida;
    private javax.swing.JTextField txtDespesas;
    private javax.swing.JTextField txtEmprestimos;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtLucroAntesImpostos;
    private javax.swing.JTextField txtLucroBruto;
    private javax.swing.JTextField txtLucroPerda;
    private javax.swing.JTextField txtReceber;
    private javax.swing.JTextField txtReceitaBruta;
    private javax.swing.JTextField txtResultadoFinanceiro;
    private javax.swing.JTextField txtResultadoOp;
    private javax.swing.JTextField txtTotalACirculante;
    private javax.swing.JTextField txtTotalAtivo;
    private javax.swing.JTextField txtTotalPCirculante;
    private javax.swing.JTextField txtTotalPLiquido;
    private javax.swing.JTextField txtTotalPermanente;
    // End of variables declaration//GEN-END:variables
}