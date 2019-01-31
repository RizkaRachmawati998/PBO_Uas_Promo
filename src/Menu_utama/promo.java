package Menu_utama;

import com.sun.java.swing.plaf.windows.resources.windows;
import javax.swing.JOptionPane;
import login.login;
import promo.fpromo;
import tblBarang.fbarang;
import transaksi.transaksi;
import java.awt.event.*;
import java.awt.*;

public class promo extends javax.swing.JFrame {

    public promo() {
        initComponents();
        
    }

   

    @SuppressWarnings("unchecked")
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnDataBArang = new javax.swing.JMenu();
        mnPromo = new javax.swing.JMenu();
        mnTransajsi = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/download.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Makaic");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jDesktopPane2.setBackground(new java.awt.Color(102, 204, 255));
        jDesktopPane2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jDesktopPane2.setInheritsPopupMenu(true);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 842, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane2)
                .addContainerGap())
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/b_home.png"))); // NOI18N
        jMenu1.setText("Menu");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png"))); // NOI18N
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        mnDataBArang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/data barang.jpg"))); // NOI18N
        mnDataBArang.setText("Data Barang");
        mnDataBArang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnDataBArangMousePressed(evt);
            }
        });
        jMenuBar1.add(mnDataBArang);

        mnPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/promo.jpg"))); // NOI18N
        mnPromo.setText("Promo");
        mnPromo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnPromoMouseClicked(evt);
            }
        });
        mnPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPromoActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnPromo);

        mnTransajsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transaksi.2.png"))); // NOI18N
        mnTransajsi.setText("Transaksi");
        mnTransajsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnTransajsiMousePressed(evt);
            }
        });
        jMenuBar1.add(mnTransajsi);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnDataBArangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnDataBArangMousePressed
        fbarang b = new fbarang();
        jDesktopPane2.add(b);
        b.setVisible(true);

    }//GEN-LAST:event_mnDataBArangMousePressed

    private void mnPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPromoActionPerformed
        
    }//GEN-LAST:event_mnPromoActionPerformed

    private void mnPromoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPromoMouseClicked
        fpromo f = new fpromo();
        jDesktopPane2.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_mnPromoMouseClicked

    private void mnTransajsiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnTransajsiMousePressed
       transaksi t = new transaksi();
        jDesktopPane2.add(t);
        t.setVisible(true);
    }//GEN-LAST:event_mnTransajsiMousePressed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new promo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane2;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JMenu jMenu1;
    public static javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JMenu mnDataBArang;
    public static javax.swing.JMenu mnPromo;
    public static javax.swing.JMenu mnTransajsi;
    // End of variables declaration//GEN-END:variables
}
