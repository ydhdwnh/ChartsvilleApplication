/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartsvilleapplication;

import generated.MusicChart;
import generated.MusicChart.ChartDetail;
import generated.MusicChart.ChartHeader;
import generated.ObjectFactory;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

/**
 *
 * @author TimW
 */

public class CVMain extends javax.swing.JFrame {
    private static final String homeDirectory="c:\\Junk\\";
    
    /**
     * Creates new form CVMain
     */
    public CVMain() {
        initComponents();
        formatTableColumns();
    }
    
    // Method to format the chart table font in the cells
    private void formatTableColumns()
    {
        javax.swing.JTextField tx;
        tx = new javax.swing.JTextField();
        tx.setFont(new java.awt.Font("Comic Sans MS", 0, 24));
        javax.swing.DefaultCellEditor dce = new javax.swing.DefaultCellEditor(tx);
        
        cvChartTable.getColumnModel().getColumn(0).setCellEditor(dce);
        cvChartTable.getColumnModel().getColumn(1).setCellEditor(dce);
        cvChartTable.getColumnModel().getColumn(2).setCellEditor(dce);
        cvChartTable.getColumnModel().getColumn(3).setCellEditor(dce);
        cvChartTable.setGridColor(Color.LIGHT_GRAY);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cvChartTypebuttonGroup = new javax.swing.ButtonGroup();
        gridPopupMenu = new javax.swing.JPopupMenu();
        insertRowMenuItem = new javax.swing.JMenuItem();
        deleteRowMenuItem = new javax.swing.JMenuItem();
        cvScrollPane = new javax.swing.JScrollPane();
        cvChartTable = new javax.swing.JTable();
        titleLabel = new javax.swing.JLabel();
        keyLabel = new javax.swing.JLabel();
        Title = new javax.swing.JTextField();
        keyComboBox = new javax.swing.JComboBox();
        tempoLabel = new javax.swing.JLabel();
        tempoTextField = new javax.swing.JTextField();
        timeLabel = new javax.swing.JLabel();
        timeComboBox = new javax.swing.JComboBox();
        chartTypeLayeredPane = new javax.swing.JLayeredPane();
        chartTypeLabel = new javax.swing.JLabel();
        chordRadioButton = new javax.swing.JRadioButton();
        numberRadioButton = new javax.swing.JRadioButton();
        textColorLayeredPane = new javax.swing.JLayeredPane();
        textColorLabel = new javax.swing.JLabel();
        blackButton = new javax.swing.JButton();
        redButton = new javax.swing.JButton();
        greenButton = new javax.swing.JButton();
        blueButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentText = new javax.swing.JEditorPane();
        commentLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newChart = new javax.swing.JMenuItem();
        openChart = new javax.swing.JMenuItem();
        saveChart = new javax.swing.JMenuItem();
        printChart = new javax.swing.JMenuItem();
        exitChart = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        insertRowMenuItem.setText("Insert Row");
        insertRowMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertRowMenuItemMouseClicked(evt);
            }
        });
        gridPopupMenu.add(insertRowMenuItem);

        deleteRowMenuItem.setText("Delete Row");
        deleteRowMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteRowMenuItemMouseClicked(evt);
            }
        });
        gridPopupMenu.add(deleteRowMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        setName("cvFrame"); // NOI18N

        cvChartTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cvChartTable.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        cvChartTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Bar", "Bar", "Bar", "Bar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cvChartTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cvChartTable.setRowHeight(32);
        cvChartTable.setSelectionBackground(new java.awt.Color(204, 204, 255));
        cvChartTable.getTableHeader().setReorderingAllowed(false);
        cvChartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cvChartTableMouseClicked(evt);
            }
        });
        cvScrollPane.setViewportView(cvChartTable);

        titleLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        titleLabel.setText("Chart Title");

        keyLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        keyLabel.setText("Key");

        Title.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        keyComboBox.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        keyComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G" }));
        keyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyComboBoxActionPerformed(evt);
            }
        });

        tempoLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        tempoLabel.setText("Tempo");

        tempoTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        timeLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        timeLabel.setText("Time");

        timeComboBox.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        timeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4/4", "2/4", "2/4", "6/8", " " }));

        chartTypeLayeredPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        chartTypeLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        chartTypeLabel.setText("Chart Type");

        cvChartTypebuttonGroup.add(chordRadioButton);
        chordRadioButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        chordRadioButton.setText("Chord Chart");
        chordRadioButton.setAlignmentY(0.0F);
        chordRadioButton.setContentAreaFilled(false);
        chordRadioButton.setFocusable(false);
        chordRadioButton.setIconTextGap(2);
        chordRadioButton.setMargin(null);

        cvChartTypebuttonGroup.add(numberRadioButton);
        numberRadioButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        numberRadioButton.setText("Number Chart");
        numberRadioButton.setAlignmentY(0.0F);
        numberRadioButton.setContentAreaFilled(false);
        numberRadioButton.setFocusable(false);
        numberRadioButton.setIconTextGap(2);
        numberRadioButton.setMargin(null);

        javax.swing.GroupLayout chartTypeLayeredPaneLayout = new javax.swing.GroupLayout(chartTypeLayeredPane);
        chartTypeLayeredPane.setLayout(chartTypeLayeredPaneLayout);
        chartTypeLayeredPaneLayout.setHorizontalGroup(
            chartTypeLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chartTypeLayeredPaneLayout.createSequentialGroup()
                .addComponent(chartTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
            .addGroup(chartTypeLayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chartTypeLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chordRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(numberRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        chartTypeLayeredPaneLayout.setVerticalGroup(
            chartTypeLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chartTypeLayeredPaneLayout.createSequentialGroup()
                .addComponent(chartTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chordRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        chartTypeLayeredPane.setLayer(chartTypeLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        chartTypeLayeredPane.setLayer(chordRadioButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        chartTypeLayeredPane.setLayer(numberRadioButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        textColorLayeredPane.setBackground(new java.awt.Color(255, 51, 51));
        textColorLayeredPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textColorLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textColorLabel.setText("Text Color");

        blackButton.setBackground(new java.awt.Color(0, 0, 0));
        blackButton.setMargin(new java.awt.Insets(2, 14, 8, 14));
        blackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackButtonActionPerformed(evt);
            }
        });

        redButton.setBackground(new java.awt.Color(255, 0, 0));
        redButton.setMargin(new java.awt.Insets(2, 14, 8, 14));

        greenButton.setBackground(new java.awt.Color(0, 255, 0));
        greenButton.setMargin(new java.awt.Insets(2, 14, 8, 14));
        greenButton.setName(""); // NOI18N

        blueButton.setBackground(new java.awt.Color(0, 0, 255));
        blueButton.setMargin(new java.awt.Insets(2, 14, 8, 14));

        javax.swing.GroupLayout textColorLayeredPaneLayout = new javax.swing.GroupLayout(textColorLayeredPane);
        textColorLayeredPane.setLayout(textColorLayeredPaneLayout);
        textColorLayeredPaneLayout.setHorizontalGroup(
            textColorLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textColorLayeredPaneLayout.createSequentialGroup()
                .addGroup(textColorLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textColorLayeredPaneLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(greenButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blueButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textColorLayeredPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(blackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redButton))
                    .addGroup(textColorLayeredPaneLayout.createSequentialGroup()
                        .addComponent(textColorLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        textColorLayeredPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {blackButton, blueButton, greenButton, redButton});

        textColorLayeredPaneLayout.setVerticalGroup(
            textColorLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textColorLayeredPaneLayout.createSequentialGroup()
                .addComponent(textColorLabel)
                .addGap(18, 18, 18)
                .addGroup(textColorLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blackButton)
                    .addComponent(redButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(textColorLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blueButton)
                    .addComponent(greenButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textColorLayeredPaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {blackButton, blueButton, greenButton, redButton});

        textColorLayeredPane.setLayer(textColorLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        textColorLayeredPane.setLayer(blackButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        textColorLayeredPane.setLayer(redButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        textColorLayeredPane.setLayer(greenButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        textColorLayeredPane.setLayer(blueButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jScrollPane1.setViewportView(commentText);

        commentLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        commentLabel.setText("Comments");

        jMenuBar1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jMenuBar1.setName("cvMenu1"); // NOI18N

        fileMenu.setText("File");

        newChart.setText("New");
        newChart.setName("newChart"); // NOI18N
        fileMenu.add(newChart);

        openChart.setText("Open");
        openChart.setToolTipText("");
        openChart.setName("openChart"); // NOI18N
        openChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openChartActionPerformed(evt);
            }
        });
        fileMenu.add(openChart);

        saveChart.setText("Save");
        saveChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChartActionPerformed(evt);
            }
        });
        fileMenu.add(saveChart);

        printChart.setText("Print");
        printChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printChartActionPerformed(evt);
            }
        });
        fileMenu.add(printChart);

        exitChart.setText("Exit");
        exitChart.setName("exitItem"); // NOI18N
        exitChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitChartActionPerformed(evt);
            }
        });
        fileMenu.add(exitChart);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");
        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cvScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addComponent(commentLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Title)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keyLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tempoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(keyComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tempoTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(135, 135, 135)
                .addComponent(textColorLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chartTypeLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleLabel)
                                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(commentLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textColorLayeredPane)
                                    .addComponent(chartTypeLayeredPane))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(keyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(keyLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tempoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tempoLabel))
                        .addGap(24, 24, 24)))
                .addComponent(cvScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitChartActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitChartActionPerformed

    private void keyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyComboBoxActionPerformed

    private void blackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blackButtonActionPerformed

    private void cvChartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cvChartTableMouseClicked
        // TODO add your handling code here:
        if (evt.getButton()==3)
        {
            this.gridPopupMenu.setLocation(getMousePosition());
            this.gridPopupMenu.setVisible(true);
        }
    }//GEN-LAST:event_cvChartTableMouseClicked

    private void insertRowMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertRowMenuItemMouseClicked
        // TODO add your handling code here:
        if (evt.getButton()==1)
        {
            int r = cvChartTable.getSelectedRow();
            //javax.swing.JOptionPane.showMessageDialog(null, "Inserting Row");
            gridPopupMenu.setVisible(false);
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) cvChartTable.getModel();
            model.insertRow(r, new Object[]{"", "", "", ""});
            cvChartTable.setRowSelectionInterval(r, r);
        }
    }//GEN-LAST:event_insertRowMenuItemMouseClicked

    private void deleteRowMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteRowMenuItemMouseClicked
        // TODO add your handling code here:
        if (evt.getButton()==1)
        {
            int r = cvChartTable.getSelectedRow();
            //javax.swing.JOptionPane.showMessageDialog(null, "Removing Row");
            gridPopupMenu.setVisible(false);
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) cvChartTable.getModel();
            model.removeRow(r);
            cvChartTable.setRowSelectionInterval(r, r);
        }
    }//GEN-LAST:event_deleteRowMenuItemMouseClicked

    private void saveChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChartActionPerformed
        // TODO add your handling code here:
        FileDialog f = new FileDialog(this);
        f.setTitle("Save Music Chart");
        f.setFile("*.xml");
        f.setMode(FileDialog.SAVE);
        f.setFile(Title.getText()+".xml");
        f.setDirectory("C:\\Junk");

        f.setVisible(true);
        String fileName;
        fileName = f.getFile();
        if (fileName != null){
            saveChart();
        }
    }//GEN-LAST:event_saveChartActionPerformed

    private void openChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openChartActionPerformed
        // TODO add your handling code here:
        FileDialog f = new FileDialog(this);
        f.setTitle("Open Music Chart");
        f.setFile("*.xml");
        f.setVisible(true);
        String fileName = f.getFile();
        String fileDir = f.getDirectory();
        
        if (fileName != null){
            try{
                ObjectFactory o = new generated.ObjectFactory();
                JAXBContext jc = JAXBContext.newInstance(o.getClass());
                Unmarshaller u = jc.createUnmarshaller();
                MusicChart chart = (MusicChart)u.unmarshal( new File( fileDir + fileName ) );

                openChart(chart);
            }
            catch(JAXBException  ex){
                Logger.getLogger(CVMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_openChartActionPerformed

    private void printChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printChartActionPerformed
        try {
            // TODO add your handling code here:
            cvChartTable.print(JTable.PrintMode.FIT_WIDTH);
        } catch (PrinterException ex) {
            Logger.getLogger(CVMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printChartActionPerformed

    private void openChart(MusicChart chart){
        int iCell=0, iRow=0;
        ChartHeader chartHeader;
        ChartDetail chartDetail;
        QName s1;
        Object s2;
        
        cvChartTable.selectAll();
        cvChartTable.clearSelection();
        chartHeader = (ChartHeader)((JAXBElement) chart.getContent().get(0)).getValue();        
        chartDetail = (ChartDetail)((JAXBElement) chart.getContent().get(1)).getValue();        

        Title.setText(chartHeader.getChartName());
        commentText.setText(chartHeader.getChartComments());
        tempoTextField.setText(chartHeader.getChartTempo());
        keyComboBox.setSelectedItem(chartHeader.getChartKey());
        timeComboBox.setSelectedItem(chartHeader.getChartTime());
        if ("Chord Chart".equals(chartHeader.getChartType())){
            chordRadioButton.setSelected(true);
        }else{
            numberRadioButton.setSelected(true);
        }
        
        for (int i=0; i < chartDetail.getContent().size(); i++) {
            s1 = ((JAXBElement)chartDetail.getContent().get(i)).getName();
            s2 = ((JAXBElement)chartDetail.getContent().get(i)).getValue();
            if("BarText".equals(s1.toString())){
                cvChartTable.setValueAt(s2, iRow, iCell);
                iCell++;
                if(iCell == 4){
                    iCell=0;
                    iRow++;
                }
            }
        }
    }
    
    private void saveChart(){
        try{
            ObjectFactory o = new generated.ObjectFactory();
            MusicChart mChart = o.createMusicChart();
            ChartHeader cHeader = o.createMusicChartChartHeader();
            ChartDetail cDetail = o.createMusicChartChartDetail();
            
            JAXBContext jc = JAXBContext.newInstance(o.getClass());
            Unmarshaller u = jc.createUnmarshaller();
            Marshaller m = jc.createMarshaller();

            // *************************
            // Set Chart Header
            // *************************
            cHeader.setChartName(Title.getText());
            cHeader.setChartKey(keyComboBox.getSelectedItem().toString());
            cHeader.setChartTempo(tempoTextField.getText());
            cHeader.setChartTime(timeComboBox.getSelectedItem().toString());
            cHeader.setChartComments(commentText.getText());
            if (chordRadioButton.isSelected()){
                cHeader.setChartType(chordRadioButton.getText());
            }else{
                cHeader.setChartType(numberRadioButton.getText());
            }

            // *************************
            // Set Chart Detail
            // *************************
            int iRow=0, iCol=0, iBar=0;
            for (iRow=0; iRow < cvChartTable.getRowCount(); iRow++){
                for (iCol=0; iCol < 4; iCol++){
                    String cText;
                    cDetail.getContent().add(o.createMusicChartChartDetailBarNumber(iBar++));
                    cText = (String) cvChartTable.getValueAt(iRow, iCol);
                    cDetail.getContent().add(o.createMusicChartChartDetailBarText(cText));
                    cDetail.getContent().add(o.createMusicChartChartDetailCommentIndicator(false));
                }
            }

            mChart.getContent().add(o.createMusicChartChartHeader(cHeader));
            mChart.getContent().add(o.createMusicChartChartDetail(cDetail));
            
            try (OutputStream os = new FileOutputStream( homeDirectory + Title.getText() + ".xml" )) {
                m.marshal( mChart, os );
            }
            catch(IOException ex){
                Logger.getLogger(CVMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch(JAXBException  ex){
            Logger.getLogger(CVMain.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
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
            java.util.logging.Logger.getLogger(CVMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CVMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CVMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CVMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CVMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Title;
    private javax.swing.JButton blackButton;
    private javax.swing.JButton blueButton;
    private javax.swing.JLabel chartTypeLabel;
    private javax.swing.JLayeredPane chartTypeLayeredPane;
    private javax.swing.JRadioButton chordRadioButton;
    private javax.swing.JLabel commentLabel;
    private javax.swing.JEditorPane commentText;
    private javax.swing.JTable cvChartTable;
    private javax.swing.ButtonGroup cvChartTypebuttonGroup;
    private javax.swing.JScrollPane cvScrollPane;
    private javax.swing.JMenuItem deleteRowMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitChart;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton greenButton;
    private javax.swing.JPopupMenu gridPopupMenu;
    private javax.swing.JMenuItem insertRowMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox keyComboBox;
    private javax.swing.JLabel keyLabel;
    private javax.swing.JMenuItem newChart;
    private javax.swing.JRadioButton numberRadioButton;
    private javax.swing.JMenuItem openChart;
    private javax.swing.JMenuItem printChart;
    private javax.swing.JButton redButton;
    private javax.swing.JMenuItem saveChart;
    private javax.swing.JLabel tempoLabel;
    private javax.swing.JTextField tempoTextField;
    private javax.swing.JLabel textColorLabel;
    private javax.swing.JLayeredPane textColorLayeredPane;
    private javax.swing.JComboBox timeComboBox;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
