/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.ui;

import java.awt.CardLayout;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import src.model.BiblioSQL;
import src.model.SessionDB;
import static src.ui.MainFrame.MAINMENUPANEL;

/**
 *
 * @author NarF
 */
public class StartPanel extends javax.swing.JPanel {

    JPanel cards;
    CardLayout layout;

    /**
     * Creates new form Start
     */
    public StartPanel() {
        this.cards = MainFrame.getCards();
        layout = (CardLayout) cards.getLayout();
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBtnNueva = new javax.swing.JButton();
        jBtnCargar = new javax.swing.JButton();
        jBtnBrowse = new javax.swing.JButton();
        jTextFieldBrowse = new javax.swing.JTextField(System.getProperty("user.dir") + "/src/resources");
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabStatus = new javax.swing.JLabel();
        jLabNumLibros = new javax.swing.JLabel();
        jLabNumAutores = new javax.swing.JLabel();
        jLabFileSize = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 240));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Biblioteca");

        jBtnNueva.setText("Nueva");
        jBtnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevaActionPerformed(evt);
            }
        });

        jBtnCargar.setText("Cargar");
        jBtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCargarActionPerformed(evt);
            }
        });

        jBtnBrowse.setText("Buscar");
        jBtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBrowseActionPerformed(evt);
            }
        });

        jTextFieldBrowse.setEditable(false);

        jLabel2.setText("Elige una biblioteca o crea una nueva:");

        jLabel3.setText("Status:");
        jLabel3.setMaximumSize(null);

        jLabel4.setText("Libros:");
        jLabel4.setMaximumSize(null);

        jLabel5.setText("Autores:");
        jLabel5.setMaximumSize(null);

        jLabel6.setText("Tamaño:");
        jLabel6.setMaximumSize(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnNueva, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldBrowse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnBrowse))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabNumLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabNumAutores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabFileSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBrowse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabNumLibros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabNumAutores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabFileSize))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnNueva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabFileSize, jLabNumAutores, jLabNumLibros, jLabStatus, jLabel3});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevaActionPerformed
        // TODO add your handling code here:
        //layout.show(cards, MainFrame.NEWDBPANEL);

        if (jTextFieldBrowse.getText().trim().length() > 0) {
            File newfile = null;
            do {
                String nombre = JOptionPane.showInputDialog(this, "Introduce el nombre de la biblioteca", "Nueva Biblioteca", 3);
                if (nombre == null || nombre.length() < 1) {
                    break;
                }
                File file = new File(jTextFieldBrowse.getText());

                String dir = file.getAbsolutePath();
                if (file.isFile()) {
                    String full = file.getAbsolutePath();
                    dir = full.substring(0, full.lastIndexOf("/"));
                }
                newfile = new File(dir + "/" + nombre + ".db");

                if (!newfile.exists()) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(this, "File already exists", "Alert", JOptionPane.ERROR_MESSAGE);
                    newfile = null;
                }
            } while (true);

            if (newfile != null) {
                BiblioSQL biblioSQL = new BiblioSQL(new SessionDB(newfile));
                System.out.println("Initializing DB...");
                biblioSQL.initializeBiblio();
                int i = JOptionPane.showConfirmDialog(this, "Insertar demo data?", "Nueva Biblioteca", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    System.out.println("Inserting Demo Data...");
                    biblioSQL.insertDemoData();
                }
                jTextFieldBrowse.setText(newfile.getAbsolutePath());
                setStatusLabels();
                JOptionPane.showMessageDialog(this, "Biblioteca creada correctamente", "Nueva Biblioteca", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, "Creacion cancelada", "Cargando Biblioteca", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Elige una ruta", "Cargando Biblioteca", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnNuevaActionPerformed

    private void jBtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCargarActionPerformed
        // TODO add your handling code here:
        if (jTextFieldBrowse.getText().trim().length() > 0) {
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("D:/NarF/Documents/NetBeansProjects/COD_17_sqlite/src/resources"));
            File loadfile = new File(jTextFieldBrowse.getText());
            if (loadfile.exists()) {
                BiblioSQL biblioSQL = new BiblioSQL(new SessionDB(loadfile));

                if (biblioSQL.isValid()) {
                    biblioSQL.setOpenInstance();
                    JPanel menuCard = new MenuPanel(biblioSQL);
                    cards.add(menuCard, MAINMENUPANEL);
                    layout.show(cards, MAINMENUPANEL);
                } else {
                    JOptionPane.showMessageDialog(this, "Biblioteca Invalida", "Cargando Biblioteca", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Archivo inexistente", "Cargando Biblioteca", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Elige una biblioteca", "Cargando Biblioteca", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnCargarActionPerformed

    private void jBtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setCurrentDirectory(new File(jTextFieldBrowse.getText()));

        if (chooser.showOpenDialog(new JFrame()) == JFileChooser.APPROVE_OPTION) {
            jTextFieldBrowse.setText(chooser.getSelectedFile().getAbsolutePath());
            if (chooser.getSelectedFile().isFile()) {
                setStatusLabels();
            }
        }
    }//GEN-LAST:event_jBtnBrowseActionPerformed

    private void setStatusLabels() {
        File file = new File(jTextFieldBrowse.getText());
        BiblioSQL biblioSQL = new BiblioSQL(new SessionDB(file));

        String ok = "<html><b style=\"color:green;\">OK</b></hrml>";
        String err = "<html><b style=\"color:red;\">Invalid</b></hrml>";

        if (biblioSQL.isValid()) {
            jLabStatus.setText(ok);
            jLabNumLibros.setText(biblioSQL.queryLibros().size() + "");
            jLabNumAutores.setText(biblioSQL.queryAutores().size() + "");
            jLabFileSize.setText(byteSizeFormatter(file.length()) + " bytes");
        } else {
            jLabStatus.setText(err);
            jLabNumLibros.setText("");
            jLabNumAutores.setText("");
            jLabFileSize.setText(byteSizeFormatter(file.length()) + " bytes");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBrowse;
    private javax.swing.JButton jBtnCargar;
    private javax.swing.JButton jBtnNueva;
    private javax.swing.JLabel jLabFileSize;
    private javax.swing.JLabel jLabNumAutores;
    private javax.swing.JLabel jLabNumLibros;
    private javax.swing.JLabel jLabStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBrowse;
    // End of variables declaration//GEN-END:variables

    /**
     * Recursive Byte string formatter ex: 10000 = 10.000
     *
     * @param bytes string containing digits to be formated
     * @return x.xxx.xxx.xxx style string
     */
    private static String byteSizeFormatter(String bytes) {
        StringBuilder sb = new StringBuilder();
        if (bytes.length() < 4) {
            sb.insert(0, bytes);
        } else {
            sb.insert(0, "." + bytes.substring(bytes.length() - 3));
            sb.insert(0, byteSizeFormatter(bytes.substring(0, bytes.length() - 3)));
        }
        return sb.toString();
    }

    public static String byteSizeFormatter(long bytes) {
        return byteSizeFormatter(bytes + "");
    }
}
