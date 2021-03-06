/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfwordcount;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author imran
 */
public class MainWindow extends javax.swing.JFrame {

    OutputStreamWriter statusWriter;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();


        tfOutput.setText(new File("output.txt").getAbsolutePath());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        tfInputDirectoryLocation = new javax.swing.JTextField();
        bFileChooser = new javax.swing.JButton();
        bStart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taStatus = new javax.swing.JTextArea();
        tfOutput = new javax.swing.JTextField();
        fcOutput = new javax.swing.JButton();
        tfRegex = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word Frequency Counter v1.0");

        bFileChooser.setText("...");
        bFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFileChooserActionPerformed(evt);
            }
        });

        bStart.setText("Start");
        bStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStartActionPerformed(evt);
            }
        });

        taStatus.setColumns(20);
        taStatus.setRows(5);
        jScrollPane1.setViewportView(taStatus);

        fcOutput.setText("jButton2");
        fcOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcOutputActionPerformed(evt);
            }
        });

        tfRegex.setText("[^a-zA-Z]");

        jLabel1.setText("RegEX to split words");

        jLabel2.setText("Input directory");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fcOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bStart, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfInputDirectoryLocation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfRegex))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfInputDirectoryLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFileChooser)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfRegex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bStart)
                    .addComponent(tfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fcOutput))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFileChooserActionPerformed
        JFileChooser inputDIrectoryChooser = new JFileChooser();
        inputDIrectoryChooser.setFileFilter(new FolderFilter());
        inputDIrectoryChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int showOpenDialogResponse = inputDIrectoryChooser.showOpenDialog(this);

        if (showOpenDialogResponse == JFileChooser.APPROVE_OPTION) {
            File selectedFile = inputDIrectoryChooser.getSelectedFile();
            tfInputDirectoryLocation.setText(selectedFile.getAbsolutePath());
        }

    }//GEN-LAST:event_bFileChooserActionPerformed

    private void bStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStartActionPerformed
        String directoryPath = tfInputDirectoryLocation.getText();
        final File directory = new File(directoryPath);
        if (directory.exists()) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    openOutputFile();
                    setStatus("Starting with '" + directory.getAbsolutePath() + "'");
                    traverseDirectory(directory);
                    setStatus("Completed\n\n");
                    closeOutputFile();
                }
            }).start();

        } else {
            setStatus("Please select a valid Directory");
        }
    }//GEN-LAST:event_bStartActionPerformed

    private void fcOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcOutputActionPerformed
        JFileChooser outputFileChooser = new JFileChooser();
        outputFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int showOpenDialogResponse = outputFileChooser.showSaveDialog(this);

        if (showOpenDialogResponse == JFileChooser.APPROVE_OPTION) {
            File selectedFile = outputFileChooser.getSelectedFile();
            if (Util.isExtensionMatch(selectedFile, "txt") || Util.isExtensionMatch(selectedFile, "rtf")) {
                tfOutput.setText(selectedFile.getAbsolutePath());
            } else {
                setStatus("Please select a valid file ( *.txt, *.rtf), output will be appended");
            }
        }
    }//GEN-LAST:event_fcOutputActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bFileChooser;
    private javax.swing.JButton bStart;
    private javax.swing.JButton fcOutput;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taStatus;
    private javax.swing.JTextField tfInputDirectoryLocation;
    private javax.swing.JTextField tfOutput;
    private javax.swing.JTextField tfRegex;
    // End of variables declaration//GEN-END:variables

    void setStatus(String text) {
        taStatus.append(text + "\n");
        printToFile(text);
    }

    void printToFile(String text) {
        if (statusWriter != null) {
            try {
                statusWriter.append(text + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    void traverseDirectory(File root) {
        if (root.isDirectory()) {
            File[] childs = root.listFiles();
            if (childs != null) {
                for (int i = 0; i < childs.length; i++) {
                    traverseDirectory(childs[i]);
                }
            } else {
                setStatus(root.getName() + " - Child is null");
            }

        } else if (Util.isRightFile(root)) {
            try {
                processFile(root);
            } catch (IOException ex) {
                setStatus("ERROR: " + " @ " + root.getAbsolutePath() + "\n" + ex.getMessage() + "\n");
            }
        }

    }

    private void processFile(File file) throws IOException {
        setStatus("Processing '" + file.getName() + "'");
        String fullDocumentAsText = Util.getText(file);
        setStatus("Total character count = " + fullDocumentAsText.length());

        String regexToSplitWord = tfRegex.getText();
        ArrayList<Word> words = Util.getWordFrequencies(fullDocumentAsText, regexToSplitWord);
        setStatus("Total words = " + words.size());
        for (int i = 0; i < words.size(); i++) {
            printToFile("\t" + String.format("%6d", words.get(i).count) + "\t" + words.get(i).text);
        }
    }

    private void openOutputFile() {
        try {
            String fileLocation = tfOutput.getText();

            File statusFile = new File(fileLocation);
            if (statusFile.exists()) {
                statusFile.delete();
            } else {
                statusFile.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(statusFile);
            statusWriter = new OutputStreamWriter(fos, Charset.forName("UTF-8").newEncoder());

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void closeOutputFile() {
        if (statusWriter != null) {
            try {
                statusWriter.close();
                statusWriter = null;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    class FolderFilter extends FileFilter {

        @Override
        public String getDescription() {
            return "Select a directory";
        }

        @Override
        public boolean accept(File file) {
            return file.isDirectory();
        }
    }
}
