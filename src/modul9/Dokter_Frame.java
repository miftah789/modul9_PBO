/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul9;

/**
 *
 * @author Asus
 */
public class Dokter_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Dokter_Frame
     */
    public Dokter_Frame() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        waktu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        usia = new javax.swing.JTextField();
        jk = new javax.swing.JTextField();
        gol = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        kewar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spesial = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pilihdokter = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Pemilihan Dokter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 20, 170, 30);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(null);

        waktu.setEditable(false);
        waktu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        waktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waktuActionPerformed(evt);
            }
        });
        jPanel3.add(waktu);
        waktu.setBounds(130, 360, 200, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Alamat");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 80, 110, 30);

        nama.setEditable(false);
        nama.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel3.add(nama);
        nama.setBounds(130, 40, 200, 30);

        alamat.setEditable(false);
        alamat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        jPanel3.add(alamat);
        alamat.setBounds(130, 80, 200, 30);

        usia.setEditable(false);
        usia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        usia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usiaActionPerformed(evt);
            }
        });
        jPanel3.add(usia);
        usia.setBounds(130, 120, 200, 30);

        jk.setEditable(false);
        jk.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkActionPerformed(evt);
            }
        });
        jPanel3.add(jk);
        jk.setBounds(130, 160, 200, 30);

        gol.setEditable(false);
        gol.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golActionPerformed(evt);
            }
        });
        jPanel3.add(gol);
        gol.setBounds(130, 200, 200, 30);

        status.setEditable(false);
        status.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel3.add(status);
        status.setBounds(130, 240, 200, 30);

        kewar.setEditable(false);
        kewar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        kewar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kewarActionPerformed(evt);
            }
        });
        jPanel3.add(kewar);
        kewar.setBounds(130, 280, 200, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nama");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 40, 110, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Usia");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 120, 110, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Jenis Kelamin");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 160, 110, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Status");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 240, 110, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Golongan Darah");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 200, 90, 30);

        spesial.setEditable(false);
        spesial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        spesial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spesialActionPerformed(evt);
            }
        });
        jPanel3.add(spesial);
        spesial.setBounds(130, 320, 200, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Kewarganegaraan");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 280, 110, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Waktu Praktek");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 360, 110, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Dokter Spesialis");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(20, 320, 110, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 130, 350, 410);

        pilihdokter.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pilihdokter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Salah Satu --", "DR. Farras Yassar", "DR. Anisa Putri", "DR. Harun Fajar" }));
        pilihdokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihdokterActionPerformed(evt);
            }
        });
        getContentPane().add(pilihdokter);
        pilihdokter.setBounds(150, 70, 190, 30);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Pilih Dokter      :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 70, 110, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 390, 550);

        setSize(new java.awt.Dimension(405, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void waktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waktuActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void usiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usiaActionPerformed

    private void jkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jkActionPerformed

    private void golActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_golActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void kewarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kewarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kewarActionPerformed

    private void spesialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spesialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spesialActionPerformed

    private void pilihdokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihdokterActionPerformed
        // TODO add your handling code here:
        if(pilihdokter.getSelectedItem().equals("DR. Farras Yassar")){
        nama.setText("DR. Farras Yassar ");
        alamat.setText("Jl. Surabaya 16, Malang");
        usia.setText("20 Tahun");
        jk.setText("Laki-Laki");
        gol.setText("A");
        status.setText("Belum Menikah ");
        kewar.setText("Indonesia");
        spesial.setText("Dokter Umum");
        waktu.setText(" Pagi (07.00-15.00)");
        }
        else
        if(pilihdokter.getSelectedItem().equals("DR. Anisa Putri")){
        nama.setText("DR. Anisa Putri");
        alamat.setText("Jl. Veteran 3, Malang");
        usia.setText("20 Tahun");
        jk.setText("Perempuan");
        gol.setText("O");
        status.setText("Belum Menikah");
        kewar.setText("Indonesia");
        spesial.setText("Dokter Gigi");
        waktu.setText(" Sore (16.00-22.00)");
        }
        else
        if(pilihdokter.getSelectedItem().equals("DR. Harun Fajar")){
        nama.setText("DR. Harun Fajar ");
        alamat.setText("Jl. Bandung 9, Malang");
        usia.setText("20 Tahun");
        jk.setText("Laki-Laki");
        gol.setText("B");
        status.setText("Belum Menikah");
        kewar.setText("Indonesia");
        spesial.setText("Dokter Gizi");
        waktu.setText(" Malam (22.00-06.00)");

        }
    }//GEN-LAST:event_pilihdokterActionPerformed

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
            java.util.logging.Logger.getLogger(Dokter_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dokter_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dokter_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dokter_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dokter_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField gol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jk;
    private javax.swing.JTextField kewar;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox pilihdokter;
    private javax.swing.JTextField spesial;
    private javax.swing.JTextField status;
    private javax.swing.JTextField usia;
    private javax.swing.JTextField waktu;
    // End of variables declaration//GEN-END:variables
}
