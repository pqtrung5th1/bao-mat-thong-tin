/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan04;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.DHParameterSpec;

/**
 *
 * @author Administrator
 */
public class Alice extends javax.swing.JFrame {
    KeyAgreement aliceKeyAgree;
    PublicKey bobPubKey;
    SecretKey aliceDesKey;
    Cipher aliceCipher;
    /**
     * Creates new form Alice
     */
    public Alice() {
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

        btnHienThiKB = new javax.swing.JButton();
        btnKhoaChung = new javax.swing.JButton();
        btnMaHoaKAB = new javax.swing.JButton();
        btnMaHoaGiaiMa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKhoaAlice = new javax.swing.JTextField();
        txtKhoaBob = new javax.swing.JTextField();
        txtKhoaKAB = new javax.swing.JTextField();
        txtMaHoaKAB = new javax.swing.JTextField();
        btnTaoKhoaA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHienThiKB.setText("Hien Thi KB");
        btnHienThiKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiKBActionPerformed(evt);
            }
        });

        btnKhoaChung.setText("Khoa Chung");
        btnKhoaChung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaChungActionPerformed(evt);
            }
        });

        btnMaHoaKAB.setText("Ma Hoa KAB");
        btnMaHoaKAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaHoaKABActionPerformed(evt);
            }
        });

        btnMaHoaGiaiMa.setText("Ma Hoa/ Giai Ma");
        btnMaHoaGiaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaHoaGiaiMaActionPerformed(evt);
            }
        });

        jLabel5.setText("Alice");

        jLabel1.setText("Khoa Alice");

        jLabel2.setText("Khoa Bob");

        jLabel3.setText("Khoa AB");

        jLabel4.setText("Ma Hoa KAB");

        btnTaoKhoaA.setText("Tao Khoa A");
        btnTaoKhoaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoKhoaAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKhoaAlice, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKhoaBob, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKhoaKAB, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaHoaKAB, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMaHoaKAB)
                            .addComponent(btnKhoaChung)
                            .addComponent(btnHienThiKB)
                            .addComponent(btnTaoKhoaA)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btnMaHoaGiaiMa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKhoaAlice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaoKhoaA))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKhoaBob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHienThiKB))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKhoaKAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhoaChung))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaHoaKAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaHoaKAB))
                .addGap(40, 40, 40)
                .addComponent(btnMaHoaGiaiMa)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoKhoaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoKhoaAActionPerformed
        // TODO add your handling code here:
        try{
            AlgorithmParameterGenerator paramGen = AlgorithmParameterGenerator.getInstance("DH");
            paramGen.init(512);
            AlgorithmParameters params = paramGen.generateParameters();
            
            DHParameterSpec dhSkipParamSpec = (DHParameterSpec) params.getParameterSpec(DHParameterSpec.class);
            System.out.println("Generating a DH KeyPair...");
            KeyPairGenerator aliceKpairGen = KeyPairGenerator.getInstance("DH");
            aliceKpairGen.initialize(dhSkipParamSpec);
            KeyPair aliceKpair = aliceKpairGen.genKeyPair();
            
            System.out.println("Initialzing the KeyAgreement Engine with DH private key");
            aliceKeyAgree = KeyAgreement.getInstance("DH");
            aliceKeyAgree.init(aliceKpair.getPrivate());
            
            byte[]alicePubKeyEnc = aliceKpair.getPublic().getEncoded();
            FileOutputStream fos = new FileOutputStream("D:/A.pub");
            fos.write(alicePubKeyEnc);
            fos.close();
            txtKhoaAlice.setText(alicePubKeyEnc.toString());
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_btnTaoKhoaAActionPerformed

    private void btnHienThiKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiKBActionPerformed
        // TODO add your handling code here:
        try{
            FileInputStream fis = new FileInputStream("D:/B.pub");
            byte[]bkeyP = new byte[fis.available()];
            fis.read(bkeyP);
            fis.close();
            txtKhoaBob.setText(bkeyP.toString());
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_btnHienThiKBActionPerformed

    private void btnKhoaChungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaChungActionPerformed
        // TODO add your handling code here:
        try{
            FileInputStream fis = new FileInputStream("D:/B.pub");
            byte[]bobPubkeyEnc = new byte[fis.available()];
            fis.read(bobPubkeyEnc);
            fis.close();
            
            KeyFactory aliceKeyFac = KeyFactory.getInstance("DH");
            X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(bobPubkeyEnc);
            bobPubKey = aliceKeyFac.generatePublic(x509KeySpec);
            System.out.println("Excuting PHASE1 of key agreement");
            aliceKeyAgree.doPhase(bobPubKey,true);
            byte[]aliceSharedSecret = aliceKeyAgree.generateSecret();
            
            System.out.println("Khoa chung: secret(DEBUG ONLY):"+CryptoUtil.toHexString(aliceSharedSecret));
            txtKhoaKAB.setText(CryptoUtil.toHexString(aliceSharedSecret));
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_btnKhoaChungActionPerformed

    private void btnMaHoaKABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaHoaKABActionPerformed
        // TODO add your handling code here:
        try{
            aliceKeyAgree.doPhase(bobPubKey,true);
            aliceDesKey = aliceKeyAgree.generateSecret("DES");
            txtMaHoaKAB.setText(aliceDesKey.toString());
            
            BufferedWriter bw = null;
            String filename = "D:\\KhoaA.txt";
            bw = new BufferedWriter(new FileWriter(filename));
            bw.write(aliceDesKey.toString());
            bw.close();
        }catch(Exception ex){}
    }//GEN-LAST:event_btnMaHoaKABActionPerformed

    private void btnMaHoaGiaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaHoaGiaiMaActionPerformed
        // TODO add your handling code here:
        Descs des = new Descs();
        des.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnMaHoaGiaiMaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienThiKB;
    private javax.swing.JButton btnKhoaChung;
    private javax.swing.JButton btnMaHoaGiaiMa;
    private javax.swing.JButton btnMaHoaKAB;
    private javax.swing.JButton btnTaoKhoaA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtKhoaAlice;
    private javax.swing.JTextField txtKhoaBob;
    private javax.swing.JTextField txtKhoaKAB;
    private javax.swing.JTextField txtMaHoaKAB;
    // End of variables declaration//GEN-END:variables
}