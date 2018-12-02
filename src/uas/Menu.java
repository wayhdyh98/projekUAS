package uas;
import java.sql.*;
import javax.swing.*;
import java.awt.*;

public class Menu extends Koneksi {
    public String iniUsername;
            
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void getData() {
        try {
            openConnect();
            Statement s = koneksi.createStatement();
            String sql = "Select * from mahasiswa Where nama='" + userText.getText() + "' and password='" + passText.getText() + "'";
            ResultSet r = s.executeQuery(sql);
            if(r.next()){
                User.setUserLogin(userText.getText());
                Mahasiswa mhs = new Mahasiswa();
                mhs.setVisible(true);
                mhs.setLocationRelativeTo(null);
                mhs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Username atau Password Salah! Coba lagi.");
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,"Terjadi kesalahan " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel_Siakad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Username = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        passText = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jLabel_Info = new javax.swing.JLabel();
        KlikSini = new javax.swing.JLabel();
        door = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(100, 100, 100));

        jPanel2.setBackground(new java.awt.Color(47, 97, 255));

        exit.setFont(new java.awt.Font("Font Awesome 5 Free Regular", 0, 36)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Font Awesome 5 Free Solid", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Siakad, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jLabel_Siakad))
                        .addGap(11, 11, 11))))
        );

        jLabel2.setFont(new java.awt.Font("Font Awesome 5 Free Solid", 0, 150)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("");

        jLabel_Username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Username.setText("Username");

        jLabel_Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Password.setText("Password");

        userText.setBackground(new java.awt.Color(240, 240, 240));
        userText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userText.setForeground(new java.awt.Color(255, 255, 255));
        userText.setToolTipText("");
        userText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        userText.setMargin(new java.awt.Insets(5, 5, 5, 5));
        userText.setOpaque(false);

        passText.setBackground(new java.awt.Color(240, 240, 240));
        passText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passText.setForeground(new java.awt.Color(255, 255, 255));
        passText.setToolTipText("Input password here!");
        passText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        passText.setMargin(new java.awt.Insets(5, 5, 5, 5));
        passText.setOpaque(false);

        loginButton.setBackground(new java.awt.Color(47, 97, 255));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel_Info.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel_Info.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Info.setText("Mahasiswa Baru? Belum Dapat Akun?");

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

        door.setFont(new java.awt.Font("Font Awesome 5 Free Solid", 0, 48)); // NOI18N
        door.setForeground(new java.awt.Color(255, 255, 255));
        door.setText("");
        door.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        door.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doorMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(door, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KlikSini)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(268, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(265, 265, 265))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(loginButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel_Username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Password)
                .addGap(4, 4, 4)
                .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Info)
                    .addComponent(KlikSini)
                    .addComponent(door, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if(userText.getText().equals("") && passText.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Username dan Password Anda!");
        }else if(userText.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Username Anda!");
        }else if(passText.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Password Anda!");
        }else{
            getData();
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void KlikSiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KlikSiniMouseClicked
        Register reg = new Register();
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
        reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_KlikSiniMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setFont(new Font("Font Awesome 5 Free Solid", Font.BOLD, 36));
        exit.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setFont(new Font("Font Awesome 5 Free Regular", Font.BOLD, 36));
        exit.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_exitMouseExited

    private void doorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doorMouseEntered
        door.setText("\uf52b");
    }//GEN-LAST:event_doorMouseEntered

    private void doorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doorMouseExited
        door.setText("\uf52a");
    }//GEN-LAST:event_doorMouseExited

    private void doorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doorMouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_doorMouseClicked

    private void KlikSiniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KlikSiniMouseEntered
        KlikSini.setText("<html><u>Klik Di Sini</u></html>");
    }//GEN-LAST:event_KlikSiniMouseEntered

    private void KlikSiniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KlikSiniMouseExited
        KlikSini.setText("Klik Di Sini");
    }//GEN-LAST:event_KlikSiniMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KlikSini;
    private javax.swing.JLabel door;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Info;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Siakad;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passText;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
