/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matthew;
import Matthew.view.EntradaDados;
/**
 *
 * @author bruno
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("aaaaasd");
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        EntradaDados tela = new EntradaDados();
        tela.setVisible(true);
    }
}
