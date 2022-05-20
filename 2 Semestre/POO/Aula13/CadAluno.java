
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
public class CadAluno extends javax.swing.JFrame {

    /**
     * Creates new form Aluno
     */
    public CadAluno() {
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

        campus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtrgm = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        rbtsm = new javax.swing.JRadioButton();
        rbtaf = new javax.swing.JRadioButton();
        rbtlib = new javax.swing.JRadioButton();
        rbtpin = new javax.swing.JRadioButton();
        btnmostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de alunos");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setText("RGM: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 30, 29, 14);

        jLabel2.setText("Nome: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 60, 34, 14);
        jPanel1.add(txtrgm);
        txtrgm.setBounds(60, 30, 110, 20);
        jPanel1.add(txtnome);
        txtnome.setBounds(60, 60, 320, 20);

        campus.add(rbtsm);
        rbtsm.setText("São Miguel");
        jPanel1.add(rbtsm);
        rbtsm.setBounds(10, 100, 77, 23);

        campus.add(rbtaf);
        rbtaf.setText("Anália Franco");
        jPanel1.add(rbtaf);
        rbtaf.setBounds(100, 100, 91, 23);

        campus.add(rbtlib);
        rbtlib.setText("Liberdade");
        jPanel1.add(rbtlib);
        rbtlib.setBounds(200, 100, 73, 23);

        campus.add(rbtpin);
        rbtpin.setText("Pinheiros");
        jPanel1.add(rbtpin);
        rbtpin.setBounds(290, 100, 69, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 30, 400, 140);

        btnmostrar.setText("Mostrar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmostrar);
        btnmostrar.setBounds(20, 180, 69, 23);

        setBounds(0, 0, 460, 261);
    }// </editor-fold>//GEN-END:initComponents

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        String nome, rgm, campus = "";
        nome = txtnome.getText();
        rgm = txtrgm.getText();
        if (rbtsm.isSelected())
            campus = "São Miguel Paulista";
        else if (rbtaf.isSelected())
            campus = "Anália Franco";
        else if (rbtlib.isSelected())
            campus = "Liberdade";
        else if (rbtpin.isSelected())
            campus = "Pinheiros";
        
        if (campus != "")
            JOptionPane.showMessageDialog(null, "RGM: " +
                 rgm + "\nNome: " + nome + "\nCampus: " +
                 campus);
        else
          JOptionPane.showMessageDialog(null, 
                  "Escolha um campus");
       
    }//GEN-LAST:event_btnmostrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmostrar;
    private javax.swing.ButtonGroup campus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtaf;
    private javax.swing.JRadioButton rbtlib;
    private javax.swing.JRadioButton rbtpin;
    private javax.swing.JRadioButton rbtsm;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtrgm;
    // End of variables declaration//GEN-END:variables
}
