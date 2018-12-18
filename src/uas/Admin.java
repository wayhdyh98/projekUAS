package uas;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import backend.Backend;

public class Admin extends javax.swing.JFrame {
    private DefaultTableModel model;
    private DefaultTableCellRenderer isi;
    private int gate;
    
    public Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        gate = 0;
        setTable();
        tambahPanel.setVisible(false);
    }
    
    public void setTable(){
        isi = new DefaultTableCellRenderer();
        isi.setHorizontalAlignment(SwingConstants.CENTER);
        
        model = new DefaultTableModel();
        this.tableMahasiswa.setModel(model);
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Jurusan");
        model.addColumn("Kelas");
        model.addColumn("A/I/S");
        
        for (int i = 0; i < model.getColumnCount(); i++){
            tableMahasiswa.getColumnModel().getColumn(i).setCellRenderer(isi);
        }
    }
    
    private void getDataAbsen(){
        try {
//            WHERE mahasiswa.nim = absensi.nim
            String nim = nimBox.getSelectedItem().toString();
            ResultSet r = Backend.selectQuery("Select * from absensi WHERE nim ="+nim+" ");
            if (r.next()) {                
                alpha.setText(r.getString("alpha"));
                ijin.setText(r.getString("ijin"));
                sakit.setText(r.getString("sakit"));
            }
            r.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,"Terjadi kesalahan"+e.getMessage());
        }
    }
    
    private void getDataTable(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        ResultSet r;
        if (jurusanBox.getSelectedItem().toString().equals("Semua Jurusan")){
            r = Backend.selectQuery("Select * from mahasiswa, absensi WHERE mahasiswa.nim = absensi.nim");
        }else{
            String jur = jurusanBox.getSelectedItem().toString();
            r = Backend.selectQuery("Select * from mahasiswa, absensi where jurusan='" + jur + "' and mahasiswa.nim = absensi.nim");
        }
        try {
            while (r.next()) {
                if(gate == 1){
                    nimBox.addItem(r.getString("nim"));
                }                
                Object[] o = new Object[5];
                o[0] = r.getString("nim");
                o[1] = r.getString("nama");
                o[2] = r.getString("jurusan");
                o[3] = r.getString("kelas");
                o[4] = r.getString("total_ais");
                model.addRow(o);
            }
            gate = 0;
            r.close();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan "+e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jurusanBox = new javax.swing.JComboBox<>();
        top = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel_Siakad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        door = new javax.swing.JLabel();
        insertButton = new javax.swing.JPanel();
        shadow = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        updateButton = new javax.swing.JPanel();
        shadow4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        eraseButton = new javax.swing.JPanel();
        shadow1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tableBackground = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMahasiswa = new javax.swing.JTable();
        tambahPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        alpha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ijin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sakit = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        nimBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(100, 100, 100));

        jurusanBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Jurusan", "Teknik Informatika", "Elektronika" }));
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

        top.setBackground(new java.awt.Color(47, 97, 255));

        exit.setFont(new java.awt.Font("Font Awesome 5 Free Regular", 0, 24)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Font Awesome 5 Free Solid", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Siakad, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(topLayout.createSequentialGroup()
                        .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(topLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel_Siakad, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jurusan");

        door.setFont(new java.awt.Font("Font Awesome 5 Free Solid", 0, 24)); // NOI18N
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

        insertButton.setBackground(new java.awt.Color(47, 97, 255));
        insertButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertButton.setPreferredSize(new java.awt.Dimension(149, 98));
        insertButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                insertButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                insertButtonMouseReleased(evt);
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

        jLabel3.setFont(new java.awt.Font("Font Awesome 5 Free Solid", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("");

        javax.swing.GroupLayout insertButtonLayout = new javax.swing.GroupLayout(insertButton);
        insertButton.setLayout(insertButtonLayout);
        insertButtonLayout.setHorizontalGroup(
            insertButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shadow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );
        insertButtonLayout.setVerticalGroup(
            insertButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertButtonLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shadow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        updateButton.setBackground(new java.awt.Color(104, 222, 49));
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.setPreferredSize(new java.awt.Dimension(149, 98));
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updateButtonMouseReleased(evt);
            }
        });

        shadow4.setBackground(new java.awt.Color(85, 176, 43));

        javax.swing.GroupLayout shadow4Layout = new javax.swing.GroupLayout(shadow4);
        shadow4.setLayout(shadow4Layout);
        shadow4Layout.setHorizontalGroup(
            shadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shadow4Layout.setVerticalGroup(
            shadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Font Awesome 5 Free Solid", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("");

        javax.swing.GroupLayout updateButtonLayout = new javax.swing.GroupLayout(updateButton);
        updateButton.setLayout(updateButtonLayout);
        updateButtonLayout.setHorizontalGroup(
            updateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shadow4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );
        updateButtonLayout.setVerticalGroup(
            updateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateButtonLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shadow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        eraseButton.setBackground(new java.awt.Color(255, 54, 54));
        eraseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eraseButton.setPreferredSize(new java.awt.Dimension(149, 98));
        eraseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eraseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eraseButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eraseButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eraseButtonMouseReleased(evt);
            }
        });

        shadow1.setBackground(new java.awt.Color(216, 50, 50));

        javax.swing.GroupLayout shadow1Layout = new javax.swing.GroupLayout(shadow1);
        shadow1.setLayout(shadow1Layout);
        shadow1Layout.setHorizontalGroup(
            shadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        shadow1Layout.setVerticalGroup(
            shadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Font Awesome 5 Free Solid", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("");

        javax.swing.GroupLayout eraseButtonLayout = new javax.swing.GroupLayout(eraseButton);
        eraseButton.setLayout(eraseButtonLayout);
        eraseButtonLayout.setHorizontalGroup(
            eraseButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        eraseButtonLayout.setVerticalGroup(
            eraseButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eraseButtonLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableBackground.setBackground(new java.awt.Color(75, 75, 75));

        tableMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMahasiswa.setGridColor(new java.awt.Color(100, 100, 100));
        jScrollPane1.setViewportView(tableMahasiswa);

        javax.swing.GroupLayout tableBackgroundLayout = new javax.swing.GroupLayout(tableBackground);
        tableBackground.setLayout(tableBackgroundLayout);
        tableBackgroundLayout.setHorizontalGroup(
            tableBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableBackgroundLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tableBackgroundLayout.setVerticalGroup(
            tableBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tambahPanel.setBackground(new java.awt.Color(75, 75, 75));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alpha");

        alpha.setForeground(new java.awt.Color(255, 255, 255));
        alpha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        alpha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        alpha.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Absensi");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ijin");

        ijin.setForeground(new java.awt.Color(255, 255, 255));
        ijin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ijin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        ijin.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sakit");

        sakit.setForeground(new java.awt.Color(255, 255, 255));
        sakit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sakit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        sakit.setOpaque(false);

        tambah.setBackground(new java.awt.Color(47, 97, 255));
        tambah.setForeground(new java.awt.Color(255, 255, 255));
        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("NIM");

        nimBox.setMinimumSize(new java.awt.Dimension(113, 20));
        nimBox.setPreferredSize(new java.awt.Dimension(113, 20));
        nimBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                nimBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout tambahPanelLayout = new javax.swing.GroupLayout(tambahPanel);
        tambahPanel.setLayout(tambahPanelLayout);
        tambahPanelLayout.setHorizontalGroup(
            tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tambahPanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(sakit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahPanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(ijin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(alpha, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(tambahPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nimBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tambahPanelLayout.setVerticalGroup(
            tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nimBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alpha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ijin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tambah)
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jurusanBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tambahPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                        .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eraseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(door, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tableBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(tableBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jurusanBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eraseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(insertButton, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tambahPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(door, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void jurusanBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jurusanBoxPopupMenuWillBecomeInvisible
        if (jurusanBox.getSelectedItem() != null){
            gate = 1;
            nimBox.removeAllItems();
            getDataTable();
            nimBox.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jurusanBoxPopupMenuWillBecomeInvisible

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setFont(new Font("Font Awesome 5 Free Solid", Font.BOLD, 25));
        exit.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setFont(new Font("Font Awesome 5 Free Regular", Font.BOLD, 25));
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

    private void insertButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonMouseEntered
        insertButton.setBackground(new Color(47,93,235));
    }//GEN-LAST:event_insertButtonMouseEntered

    private void insertButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonMouseExited
        insertButton.setBackground(new Color(47,97,255));
    }//GEN-LAST:event_insertButtonMouseExited

    private void insertButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonMousePressed
        insertButton.setBackground(new Color(47,87,211));
    }//GEN-LAST:event_insertButtonMousePressed

    private void insertButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonMouseReleased
        insertButton.setBackground(new Color(47,93,235));
        tambahPanel.setVisible(true);
        alpha.setEditable(false);
        alpha.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        alpha.setForeground(Color.GRAY);
        ijin.setEditable(false);
        ijin.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        ijin.setForeground(Color.GRAY);
        sakit.setEditable(false);
        sakit.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        sakit.setForeground(Color.GRAY);
        tambah.setEnabled(false);
    }//GEN-LAST:event_insertButtonMouseReleased

    private void updateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseEntered
        updateButton.setBackground(new Color(100,209,49));
    }//GEN-LAST:event_updateButtonMouseEntered

    private void updateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseExited
        updateButton.setBackground(new Color(104,222,49));
    }//GEN-LAST:event_updateButtonMouseExited

    private void updateButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMousePressed
        updateButton.setBackground(new Color(97,200,49));
    }//GEN-LAST:event_updateButtonMousePressed

    private void updateButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseReleased
        updateButton.setBackground(new Color(100,209,49));
        tambahPanel.setVisible(true);
        alpha.setEditable(true);
        alpha.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        alpha.setForeground(Color.WHITE);
        ijin.setEditable(true);
        ijin.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        ijin.setForeground(Color.WHITE);
        sakit.setEditable(true);
        sakit.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        sakit.setForeground(Color.WHITE);
        tambah.setEnabled(true);
    }//GEN-LAST:event_updateButtonMouseReleased

    private void eraseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseButtonMouseEntered
        eraseButton.setBackground(new Color(240,51,51));
    }//GEN-LAST:event_eraseButtonMouseEntered

    private void eraseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseButtonMouseExited
        eraseButton.setBackground(new Color(255,54,54));
    }//GEN-LAST:event_eraseButtonMouseExited

    private void eraseButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseButtonMousePressed
        eraseButton.setBackground(new Color(234,49,49));
    }//GEN-LAST:event_eraseButtonMousePressed

    private void eraseButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseButtonMouseReleased
        eraseButton.setBackground(new Color(240,51,51));
        if(nimBox.getSelectedItem() != null){
            Boolean succes = Backend.executeQuery("Update absensi set alpha=" + 0 + ", ijin=" + 0 + ", sakit=" + 0
                                                    + ", total_ais=" + 0 + " where nim='" + nimBox.getSelectedItem().toString() + "'");
            if (succes) {
                getDataAbsen();
                getDataTable();
                JOptionPane.showMessageDialog(this, "Reset Berhasil");
            } else {
                JOptionPane.showMessageDialog(this, "Gagal Mereset Data");
            }
        }
    }//GEN-LAST:event_eraseButtonMouseReleased

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        if(nimBox.getSelectedItem() != null){
            try{
                int a = Integer.parseInt(alpha.getText());
                int i = Integer.parseInt(ijin.getText());
                int s = Integer.parseInt(sakit.getText());
                Boolean succes = Backend.executeQuery("Update absensi set alpha=" + a + ", ijin=" + i + ", sakit=" + s
                                                        + ", total_ais=" + (a+i+s) + " where nim='" + nimBox.getSelectedItem().toString() + "'");
                if (succes) {
                    getDataTable();
                    JOptionPane.showMessageDialog(this, "Update Data Berhasil");
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Mengupdate Data");
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Harap Inputkan Angka!");
            }
        }
    }//GEN-LAST:event_tambahActionPerformed

    private void nimBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_nimBoxPopupMenuWillBecomeInvisible
        if(jurusanBox.getSelectedItem() != null){
            if(nimBox.getSelectedItem() != null){
                getDataAbsen();
            }
        }
    }//GEN-LAST:event_nimBoxPopupMenuWillBecomeInvisible

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alpha;
    private javax.swing.JPanel background;
    private javax.swing.JLabel door;
    private javax.swing.JPanel eraseButton;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField ijin;
    private javax.swing.JPanel insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Siakad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jurusanBox;
    private javax.swing.JComboBox<String> nimBox;
    private javax.swing.JTextField sakit;
    private javax.swing.JPanel shadow;
    private javax.swing.JPanel shadow1;
    private javax.swing.JPanel shadow4;
    private javax.swing.JPanel tableBackground;
    private javax.swing.JTable tableMahasiswa;
    private javax.swing.JButton tambah;
    private javax.swing.JPanel tambahPanel;
    private javax.swing.JPanel top;
    private javax.swing.JPanel updateButton;
    // End of variables declaration//GEN-END:variables
}
