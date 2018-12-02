package uas;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import backend.Backend;

public class Dosen extends javax.swing.JFrame {
    private DefaultTableModel model;
    private DefaultTableCellRenderer isi;
    
    public Dosen() {
        initComponents();
        this.setLocationRelativeTo(null);
        model = new DefaultTableModel();
        
        isi = new DefaultTableCellRenderer();
        isi.setHorizontalAlignment(SwingConstants.CENTER);
        
        khsTable.setModel(model);
        model.addColumn("Kode Matkul");
        model.addColumn("Nim");
        model.addColumn("Nilai");
        
        for (int i = 0; i < model.getColumnCount(); i++){
            khsTable.getColumnModel().getColumn(i).setCellRenderer(isi);
        }
    }
    
    private void getData(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        String mhs = mahasiswaBox.getSelectedItem().toString();
        try {
            ResultSet r = Backend.selectQuery("Select nim from mahasiswa Where nama='" + mhs + "'");
            if(r.next()){
                String nim = r.getString("nim");
                ResultSet r2 = Backend.selectQuery("Select * from khs Where nim='" + nim + "'");
                while (r2.next()) {
                    Object[] o = new Object[3];
                    o[0] = r2.getString("kode_mt");
                    o[1] = r2.getString("nim");
                    o[2] = r2.getString("nilai");
                    model.addRow(o);
                }
                r2.close();
            }
            r.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,"Terjadi kesalahan " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mahasiswaBox = new javax.swing.JComboBox<>();
        jurusanBox = new javax.swing.JComboBox<>();
        matkul1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tugas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quiz = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        uts = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        uas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        na = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        yudisiumButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        khsTable = new javax.swing.JTable();
        matkulBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel_Siakad = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        door = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(100, 100, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jurusan");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nama Mahasiswa");

        mahasiswaBox.setMinimumSize(new java.awt.Dimension(113, 20));
        mahasiswaBox.setPreferredSize(new java.awt.Dimension(113, 20));
        mahasiswaBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                mahasiswaBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                mahasiswaBoxPopupMenuWillBecomeVisible(evt);
            }
        });

        jurusanBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Elektronika" }));
        jurusanBox.setSelectedIndex(-1);
        jurusanBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jurusanBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        matkul1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        matkul1.setForeground(new java.awt.Color(255, 255, 255));
        matkul1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        matkul1.setText("Mata Kuliah");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tugas:");

        tugas.setForeground(new java.awt.Color(255, 255, 255));
        tugas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tugas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tugas.setOpaque(false);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Quiz:");

        quiz.setForeground(new java.awt.Color(255, 255, 255));
        quiz.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quiz.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        quiz.setOpaque(false);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("UTS:");

        uts.setForeground(new java.awt.Color(255, 255, 255));
        uts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uts.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        uts.setOpaque(false);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("UAS:");

        uas.setForeground(new java.awt.Color(255, 255, 255));
        uas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        uas.setOpaque(false);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nilai Akhir:");

        na.setEditable(false);
        na.setForeground(new java.awt.Color(255, 255, 255));
        na.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        na.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        na.setOpaque(false);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Status:");

        status.setEditable(false);
        status.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        status.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        status.setOpaque(false);

        yudisiumButton.setBackground(new java.awt.Color(47, 97, 255));
        yudisiumButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yudisiumButton.setForeground(new java.awt.Color(255, 255, 255));
        yudisiumButton.setText("Yudisium");
        yudisiumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yudisiumButtonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(211, 211, 211));
        jPanel3.setPreferredSize(new java.awt.Dimension(386, 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(211, 211, 211));
        jPanel5.setPreferredSize(new java.awt.Dimension(386, 3));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(75, 75, 75));
        jPanel10.setPreferredSize(new java.awt.Dimension(386, 3));

        khsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        khsTable.setGridColor(new java.awt.Color(100, 100, 100));
        jScrollPane1.setViewportView(khsTable);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        matkulBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                matkulBoxPopupMenuWillBecomeVisible(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(47, 97, 255));

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

        jLabel9.setFont(new java.awt.Font("Font Awesome 5 Free Solid", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Siakad, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Siakad)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addComponent(jurusanBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matkul1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tugas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quiz, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mahasiswaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(matkulBox, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 32, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uts, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(status)
                            .addComponent(na)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yudisiumButton)
                                    .addComponent(door))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jurusanBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(matkul1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mahasiswaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matkulBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(quiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(uts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(uas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(na, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yudisiumButton)
                        .addGap(66, 66, 66)
                        .addComponent(door, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void jurusanBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jurusanBoxPopupMenuWillBecomeInvisible
        if(jurusanBox.getSelectedItem() != null){
            String jur = jurusanBox.getSelectedItem().toString();
            try {
                ResultSet r = Backend.selectQuery("Select nama from mahasiswa Where jurusan='" + jur + "'");
                ResultSet r2 = Backend.selectQuery("Select matkul from tb_matkul Where jurusan='" + jur + "'");
                mahasiswaBox.removeAllItems();
                matkulBox.removeAllItems();
                while(r.next()){
                    mahasiswaBox.addItem(r.getString("nama"));
                }
                while(r2.next()){
                    matkulBox.addItem(r2.getString("matkul"));
                }
                mahasiswaBox.setSelectedIndex(-1);
                matkulBox.setSelectedIndex(-1);
                r.close();
                r2.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Terjadi Kesalahan " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jurusanBoxPopupMenuWillBecomeInvisible

    private void yudisiumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yudisiumButtonActionPerformed
        if (jurusanBox.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Pilih jurusan terlebih dahulu!");
        }else if (mahasiswaBox.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Pilih mahasiswa terlebih dahulu!");
        }else if (matkulBox.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Pilih mata kuliah terlebih dahulu!");
        }else if (tugas.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inputkan nilai tugas!");
        }else if (quiz.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inputkan nilai quiz!");
        }else if (uts.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inputkan nilai uts!");
        }else if (uas.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inputkan nilai uas!");
        }else {
            try{
                int nt = Integer.parseInt(tugas.getText());
                int nq = Integer.parseInt(quiz.getText());
                int nts = Integer.parseInt(uts.getText());
                int nas = Integer.parseInt(uas.getText());
                if ((nt > 100 || nt < 0) || (nq > 100 || nq < 0) || (nts > 100 || nts < 0) || (nas > 100 || nas < 0)){
                    JOptionPane.showMessageDialog(null, "Nilai tidak valid!");
                }else{
                    int nA = (nt * 10/100)+(nq * 20/100)+(nts * 30/100)+(nas * 40/100);
                    if (nA >= 60){
                        status.setText("LULUS!");
                        status.setFont(new Font("Legal LT Std Book", Font.BOLD, 12));
                        status.setForeground(new Color(72, 197, 0));
                    }else{
                        status.setText("TIDAK LULUS!");
                        status.setFont(new Font("Legal LT Std Book", Font.BOLD, 12));
                        status.setForeground(new Color(225, 0, 0));
                    }
                    na.setText(Integer.toString(nA));

                    String nilai_huruf;
                    if(nA >= 85){
                        nilai_huruf = "A";
                    }else if(nA >= 75){
                        nilai_huruf = "B";
                    }else if(nA >= 60){
                        nilai_huruf = "C";
                    }else if(nA >= 50){
                        nilai_huruf = "D";
                    }else{
                        nilai_huruf = "E";
                    }

                    try {
                        String mhs = mahasiswaBox.getSelectedItem().toString();
                        String mtkul = matkulBox.getSelectedItem().toString();
                        ResultSet r = Backend.selectQuery("Select nim, kode_mt from mahasiswa, tb_matkul Where nama='" + mhs + "' And matkul='" + mtkul + "'");
                        if(r.next()){
                            String nim = r.getString("nim");
                            String kode_mtkul = r.getString("kode_mt");
                            boolean succes = Backend.executeQuery("Insert into khs (kode_mt,nim,nilai) " + "values ('"
                                            + kode_mtkul + "',"
                                            + "'" + nim + "',"
                                            + "'" + nilai_huruf + "')"); 
                            if (!succes){
                                JOptionPane.showMessageDialog(this, "Data Gagal Disimpan ");
                            }
                        }
                        r.close();
                        getData();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "Terjadi Kesalahan " + ex.getMessage());
                    }
                }
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Harap Inputkan Angka!");
            }
        }
    }//GEN-LAST:event_yudisiumButtonActionPerformed

    private void mahasiswaBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_mahasiswaBoxPopupMenuWillBecomeInvisible
        if(jurusanBox.getSelectedItem() != null){
            if(mahasiswaBox.getSelectedItem() != null){
                getData();
            }
        }
    }//GEN-LAST:event_mahasiswaBoxPopupMenuWillBecomeInvisible

    private void mahasiswaBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_mahasiswaBoxPopupMenuWillBecomeVisible
        if(jurusanBox.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Pilih jurusan terlebih dahulu!");
        }
    }//GEN-LAST:event_mahasiswaBoxPopupMenuWillBecomeVisible

    private void matkulBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_matkulBoxPopupMenuWillBecomeVisible
        if(jurusanBox.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Pilih jurusan terlebih dahulu!");
        }
    }//GEN-LAST:event_matkulBoxPopupMenuWillBecomeVisible

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

    private void doorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doorMouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
                new Dosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Siakad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jurusanBox;
    private javax.swing.JTable khsTable;
    private javax.swing.JComboBox<String> mahasiswaBox;
    private javax.swing.JLabel matkul1;
    private javax.swing.JComboBox<String> matkulBox;
    private javax.swing.JTextField na;
    private javax.swing.JTextField quiz;
    private javax.swing.JTextField status;
    private javax.swing.JTextField tugas;
    private javax.swing.JTextField uas;
    private javax.swing.JTextField uts;
    private javax.swing.JButton yudisiumButton;
    // End of variables declaration//GEN-END:variables
}
