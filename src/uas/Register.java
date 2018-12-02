package uas;
import javax.swing.*;
import java.awt.*;
import backend.Backend;

public class Register extends javax.swing.JFrame {
    
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel_Nim = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        nimText = new javax.swing.JTextField();
        passText = new javax.swing.JPasswordField();
        daftarButton = new javax.swing.JButton();
        jLabel_Username = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        jLabel_Jurusan = new javax.swing.JLabel();
        jurusanBox = new javax.swing.JComboBox<>();
        jLabel_Kelas = new javax.swing.JLabel();
        kelasBox2 = new javax.swing.JComboBox<>();
        kelasBox1 = new javax.swing.JComboBox<>();
        top = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel_Siakad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Info = new javax.swing.JLabel();
        KlikSini = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(100, 100, 100));

        jLabel_Nim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Nim.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nim.setText("NIM");

        jLabel_Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Password.setText("Password");

        nimText.setBackground(new java.awt.Color(174, 174, 174));
        nimText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nimText.setForeground(new java.awt.Color(255, 255, 255));
        nimText.setToolTipText("");
        nimText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        nimText.setMargin(new java.awt.Insets(5, 5, 5, 5));
        nimText.setOpaque(false);

        passText.setBackground(new java.awt.Color(174, 174, 174));
        passText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passText.setForeground(new java.awt.Color(255, 255, 255));
        passText.setToolTipText("");
        passText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        passText.setMargin(new java.awt.Insets(5, 5, 5, 5));
        passText.setOpaque(false);

        daftarButton.setBackground(new java.awt.Color(47, 97, 255));
        daftarButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        daftarButton.setForeground(new java.awt.Color(255, 255, 255));
        daftarButton.setText("Daftar");
        daftarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarButtonActionPerformed(evt);
            }
        });

        jLabel_Username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Username.setText("Username");

        userText.setBackground(new java.awt.Color(174, 174, 174));
        userText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userText.setForeground(new java.awt.Color(255, 255, 255));
        userText.setToolTipText("");
        userText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        userText.setMargin(new java.awt.Insets(5, 5, 5, 5));
        userText.setOpaque(false);

        jLabel_Jurusan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Jurusan.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Jurusan.setText("Jurusan");

        jurusanBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Elektronika" }));
        jurusanBox.setSelectedIndex(-1);

        jLabel_Kelas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Kelas.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Kelas.setText("Kelas");

        kelasBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G" }));
        kelasBox2.setSelectedIndex(-1);

        kelasBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        kelasBox1.setSelectedIndex(-1);

        top.setBackground(new java.awt.Color(47, 97, 255));

        exit.setFont(new java.awt.Font("Font Awesome 5 Free Regular", 0, 48)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        jLabel_Siakad.setFont(new java.awt.Font("Legal LT Std Book", 0, 24)); // NOI18N
        jLabel_Siakad.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Siakad.setText("Sistem Akademik");

        jLabel1.setFont(new java.awt.Font("Font Awesome 5 Free Solid", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Siakad, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Siakad)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Font Awesome 5 Free Solid", 0, 200)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("");

        jLabel_Info.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel_Info.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Info.setText("Sudah Punya Akun?");

        KlikSini.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        KlikSini.setForeground(new java.awt.Color(255, 255, 255));
        KlikSini.setText("Klik Di Sini");
        KlikSini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KlikSini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KlikSiniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KlikSiniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KlikSiniMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel_Nim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Jurusan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jurusanBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                .addComponent(userText, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nimText, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(kelasBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kelasBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(103, 103, 103))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(daftarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(jLabel_Info)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KlikSini)
                        .addContainerGap())))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nimText, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Nim))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Username))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jurusanBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Jurusan))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kelasBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kelasBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Kelas))
                        .addGap(18, 18, 18)
                        .addComponent(daftarButton))
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Info)
                        .addComponent(KlikSini)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        if(nimText.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nim Wajib diisi!");
        }else if(userText.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Username Wajib diisi!");
        }else if(passText.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Password Wajib diisi!");
        }else if(jurusanBox.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Jurusan Wajib diisi!");
        }else if(kelasBox1.getSelectedItem() == null || kelasBox2.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Kelas Wajib diisi!");
        }else{
            String query = "Insert into mahasiswa (nim,nama,password,jurusan,kelas) " + "values ('"
            + this.nimText.getText() + "',"
            + "'" + this.userText.getText() + "',"
            + "'" + this.passText.getText() + "',"
            + "'" + this.jurusanBox.getSelectedItem().toString() + "',"
            + "'" + this.kelasBox1.getSelectedItem().toString() + this.kelasBox2.getSelectedItem().toString() + "')";
            Backend.executeQuery(query);
            
            Menu mn = new Menu();
            mn.setVisible(true);
            mn.setLocationRelativeTo(null);
            mn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setFont(new Font("Font Awesome 5 Free Solid", Font.BOLD, 48));
        exit.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setFont(new Font("Font Awesome 5 Free Regular", Font.BOLD, 48));
        exit.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_exitMouseExited

    private void KlikSiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KlikSiniMouseClicked
        Menu mn = new Menu();
        mn.setVisible(true);
        mn.setLocationRelativeTo(null);
        mn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_KlikSiniMouseClicked

    private void KlikSiniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KlikSiniMouseEntered
        KlikSini.setText("<html><u>Klik Di Sini</u></html>");
    }//GEN-LAST:event_KlikSiniMouseEntered

    private void KlikSiniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KlikSiniMouseExited
        KlikSini.setText("Klik Di Sini");
    }//GEN-LAST:event_KlikSiniMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KlikSini;
    private javax.swing.JPanel background;
    private javax.swing.JButton daftarButton;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Info;
    private javax.swing.JLabel jLabel_Jurusan;
    private javax.swing.JLabel jLabel_Kelas;
    private javax.swing.JLabel jLabel_Nim;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Siakad;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JComboBox<String> jurusanBox;
    private javax.swing.JComboBox<String> kelasBox1;
    private javax.swing.JComboBox<String> kelasBox2;
    private javax.swing.JTextField nimText;
    private javax.swing.JPasswordField passText;
    private javax.swing.JPanel top;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
