package uas;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;
import java.awt.*;
import backend.Backend;

public class Mahasiswa extends javax.swing.JFrame {
    private DefaultTableModel model;
    private DefaultTableCellRenderer isi;
    private String nim;
    private int gate;

    public Mahasiswa() {
        initComponents();
        setTabelAbsen();
    }
    
    public Mahasiswa(String nim) {
        initComponents();
        khsButton.setBackground(new Color(47,87,211));
        this.setLocationRelativeTo(null);
        this.nim = nim;
        ambilDataMhs();
        setTabelNilai();
    }
    
    public void centerTabel(DefaultTableModel model){
        isi = new DefaultTableCellRenderer();
        isi.setHorizontalAlignment(SwingConstants.CENTER);
        
        for (int i = 0; i < model.getColumnCount(); i++){
            tabelStatus.getColumnModel().getColumn(i).setCellRenderer(isi);
        }
    }
    
    public void setTabelAbsen(){
        model = new DefaultTableModel();
        this.tabelStatus.setModel(model);
        model.addColumn("Alpha");
        model.addColumn("Ijin");
        model.addColumn("Sakit");
        model.addColumn("A/I/S");
        centerTabel(model);
        ambilDataAbsen();
        gate = 1;
    }
    
    public void setTabelNilai(){
        model = new DefaultTableModel();
        this.tabelStatus.setModel(model);
        model.addColumn("Mata Kuliah");
        model.addColumn("Nilai");
        centerTabel(model);
        ambilDataNilai();
        gate = 2;
    }
    
    public void ambilDataNilai(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            ResultSet r = Backend.selectQuery("Select * from khs k Inner Join tb_matkul m On k.kode_mt = m.kode_mt Where k.nim = '" + nim + "'");
            while (r.next()) {                
                Object[] o = new Object[2];
                o[0] = r.getString("matkul");
                o[1] = r.getString("nilai");
                model.addRow(o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,"Terjadi kesalahan"+e.getMessage());
        }
    }
    
    public void ambilDataAbsen(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            ResultSet r = Backend.selectQuery("Select * from absensi Where nim = '" + nim + "'");
            while (r.next()) {
                Object[] o = new Object[4];
                o[0] = r.getString("alpha");
                o[1] = r.getString("ijin");
                o[2] = r.getString("sakit");
                o[3] = r.getString("total_ais");
                model.addRow(o);                
            }
            r.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,"Terjadi kesalahan"+e.getMessage());
        }
    }
    
    public void ambilDataMhs(){
        try {
            ResultSet r = Backend.selectQuery("Select * from mahasiswa Where nim ='" + nim + "'");
            while (r.next()) {         
                namaText.setText(r.getString("nama"));
                nimText.setText(r.getString("nim"));
                jurusanText.setText(r.getString("jurusan"));
                kelasText.setText(r.getString("kelas"));
            }
            r.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,"Terjadi kesalahan"+e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        top = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel_Siakad = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        namaText = new javax.swing.JTextField();
        nimText = new javax.swing.JTextField();
        jurusanText = new javax.swing.JTextField();
        kelasText = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelStatus = new javax.swing.JTable();
        khsButton = new javax.swing.JPanel();
        shadow = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        absensiButton = new javax.swing.JPanel();
        shadow1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        door = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(100, 100, 100));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nama");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NIM");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jurusan");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Kelas");

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

        jLabel6.setFont(new java.awt.Font("Font Awesome 5 Free Solid", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Siakad, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Siakad)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Font Awesome 5 Free Solid", 0, 150)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("");

        namaText.setEditable(false);
        namaText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        namaText.setForeground(new java.awt.Color(255, 255, 255));
        namaText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        namaText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        namaText.setOpaque(false);

        nimText.setEditable(false);
        nimText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nimText.setForeground(new java.awt.Color(255, 255, 255));
        nimText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nimText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        nimText.setOpaque(false);

        jurusanText.setEditable(false);
        jurusanText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jurusanText.setForeground(new java.awt.Color(255, 255, 255));
        jurusanText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jurusanText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jurusanText.setOpaque(false);

        kelasText.setEditable(false);
        kelasText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kelasText.setForeground(new java.awt.Color(255, 255, 255));
        kelasText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kelasText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        kelasText.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(75, 75, 75));

        tabelStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelStatus.setGridColor(new java.awt.Color(100, 100, 100));
        jScrollPane1.setViewportView(tabelStatus);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        khsButton.setBackground(new java.awt.Color(47, 97, 255));
        khsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        khsButton.setPreferredSize(new java.awt.Dimension(149, 98));
        khsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                khsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                khsButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                khsButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                khsButtonMouseReleased(evt);
            }
        });

        shadow.setBackground(new java.awt.Color(38, 73, 170));

        javax.swing.GroupLayout shadowLayout = new javax.swing.GroupLayout(shadow);
        shadow.setLayout(shadowLayout);
        shadowLayout.setHorizontalGroup(
            shadowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shadowLayout.setVerticalGroup(
            shadowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Legal LT Std Book", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("KHS");

        javax.swing.GroupLayout khsButtonLayout = new javax.swing.GroupLayout(khsButton);
        khsButton.setLayout(khsButtonLayout);
        khsButtonLayout.setHorizontalGroup(
            khsButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shadow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        khsButtonLayout.setVerticalGroup(
            khsButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, khsButtonLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shadow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        absensiButton.setBackground(new java.awt.Color(47, 97, 255));
        absensiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        absensiButton.setPreferredSize(new java.awt.Dimension(149, 98));
        absensiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                absensiButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                absensiButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                absensiButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                absensiButtonMouseReleased(evt);
            }
        });

        shadow1.setBackground(new java.awt.Color(38, 73, 170));

        javax.swing.GroupLayout shadow1Layout = new javax.swing.GroupLayout(shadow1);
        shadow1.setLayout(shadow1Layout);
        shadow1Layout.setHorizontalGroup(
            shadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shadow1Layout.setVerticalGroup(
            shadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Legal LT Std Book", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ABSENSI");

        javax.swing.GroupLayout absensiButtonLayout = new javax.swing.GroupLayout(absensiButton);
        absensiButton.setLayout(absensiButtonLayout);
        absensiButtonLayout.setHorizontalGroup(
            absensiButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        absensiButtonLayout.setVerticalGroup(
            absensiButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, absensiButtonLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(namaText))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nimText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jurusanText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kelasText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(door)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(khsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(absensiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nimText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jurusanText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kelasText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(khsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(absensiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(door, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void khsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khsButtonMouseEntered
        if (gate == 2){
            khsButton.setBackground(new Color(47,87,211));
        }else{
            khsButton.setBackground(new Color(47,93,235));
        }
    }//GEN-LAST:event_khsButtonMouseEntered

    private void khsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khsButtonMouseExited
        if (gate == 2){
            khsButton.setBackground(new Color(47,87,211));
        }else{
            khsButton.setBackground(new Color(47,97,255));
        }
    }//GEN-LAST:event_khsButtonMouseExited

    private void khsButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khsButtonMousePressed
        khsButton.setBackground(new Color(47,87,211));
        absensiButton.setBackground(new Color(47,97,255));
    }//GEN-LAST:event_khsButtonMousePressed

    private void khsButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khsButtonMouseReleased
        khsButton.setBackground(new Color(47,87,211));
        setTabelNilai();
    }//GEN-LAST:event_khsButtonMouseReleased

    private void absensiButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_absensiButtonMouseEntered
        if (gate == 1){
            absensiButton.setBackground(new Color(47,87,211));
        }else{
            absensiButton.setBackground(new Color(47,93,235));
        }
    }//GEN-LAST:event_absensiButtonMouseEntered

    private void absensiButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_absensiButtonMouseExited
        if (gate == 1){
            absensiButton.setBackground(new Color(47,87,211));
        }else{
            absensiButton.setBackground(new Color(47,97,255));
        }
    }//GEN-LAST:event_absensiButtonMouseExited

    private void absensiButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_absensiButtonMousePressed
        absensiButton.setBackground(new Color(47,87,211));
        khsButton.setBackground(new Color(47,97,255));
    }//GEN-LAST:event_absensiButtonMousePressed

    private void absensiButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_absensiButtonMouseReleased
        absensiButton.setBackground(new Color(47,87,211));
        setTabelAbsen();
    }//GEN-LAST:event_absensiButtonMouseReleased

    private void doorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doorMouseClicked
        Menu mn = new Menu();
        mn.setVisible(true);
        mn.setLocationRelativeTo(null);
        mn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_doorMouseClicked

    private void doorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doorMouseEntered
        door.setText("\uf52b");
    }//GEN-LAST:event_doorMouseEntered

    private void doorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doorMouseExited
        door.setText("\uf52a");
    }//GEN-LAST:event_doorMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel absensiButton;
    private javax.swing.JPanel background;
    private javax.swing.JLabel door;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Siakad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jurusanText;
    private javax.swing.JTextField kelasText;
    private javax.swing.JPanel khsButton;
    private javax.swing.JTextField namaText;
    private javax.swing.JTextField nimText;
    private javax.swing.JPanel shadow;
    private javax.swing.JPanel shadow1;
    private javax.swing.JTable tabelStatus;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
