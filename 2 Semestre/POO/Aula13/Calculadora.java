
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logonaf
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        btnsoma = new javax.swing.JButton();
        numeros = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtn1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtn2 = new javax.swing.JTextField();
        btnsub = new javax.swing.JButton();
        btnmult = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnsoma.setText("+");
        btnsoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsomaActionPerformed(evt);
            }
        });
        getContentPane().add(btnsoma);
        btnsoma.setBounds(20, 130, 50, 23);

        numeros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        numeros.setLayout(null);

        jLabel1.setText("n1");
        numeros.add(jLabel1);
        jLabel1.setBounds(20, 30, 20, 14);
        numeros.add(txtn1);
        txtn1.setBounds(40, 30, 210, 20);

        jLabel2.setText("n2");
        numeros.add(jLabel2);
        jLabel2.setBounds(20, 60, 20, 14);
        numeros.add(txtn2);
        txtn2.setBounds(40, 60, 210, 20);

        getContentPane().add(numeros);
        numeros.setBounds(20, 20, 270, 100);

        btnsub.setText("-");
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });
        getContentPane().add(btnsub);
        btnsub.setBounds(90, 130, 50, 23);

        btnmult.setText("*");
        btnmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultActionPerformed(evt);
            }
        });
        getContentPane().add(btnmult);
        btnmult.setBounds(170, 130, 50, 23);

        btndiv.setText("/");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });
        getContentPane().add(btndiv);
        btndiv.setBounds(240, 130, 50, 23);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("O resultado é: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 170, 100, 14);

        resultado.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        resultado.setForeground(new java.awt.Color(51, 51, 255));
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultado.setToolTipText("");
        getContentPane().add(resultado);
        resultado.setBounds(20, 210, 270, 60);

        setBounds(0, 0, 330, 340);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsomaActionPerformed
        calcular(1);
    }//GEN-LAST:event_btnsomaActionPerformed

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
        calcular(2);
    }//GEN-LAST:event_btnsubActionPerformed

    private void btnmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultActionPerformed
        calcular(3);
    }//GEN-LAST:event_btnmultActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        calcular(4);
    }//GEN-LAST:event_btndivActionPerformed

    /**
     * @param args the command line arguments
     */
    public void calcular(int op){
        float n1, n2, r;
        n1 = Float.parseFloat(txtn1.getText());
        n2 = Float.parseFloat(txtn2.getText());
        try{
            switch(op){
                case 1: 
                    r = n1 + n2;                    
                    break;
                case 2:
                    r = n1 - n2;                    
                    break;
                case 3:
                    r = n1 * n2;
                    break;
                default:
                    r = n1 / n2;
            }
            resultado.setText(r+"");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, 
                    "Digite um número");
        }
            
        
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btnmult;
    private javax.swing.JButton btnsoma;
    private javax.swing.JButton btnsub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel numeros;
    private javax.swing.JLabel resultado;
    private javax.swing.JTextField txtn1;
    private javax.swing.JTextField txtn2;
    // End of variables declaration//GEN-END:variables
}
