/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.ui;

import com.github.lgooddatepicker.components.DatePickerSettings;
import java.awt.Dimension;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import src.model.Autor;
import src.model.BiblioSQL;
import src.model.Libro;

/**
 *
 * @author NarF
 */
public final class LibroFrame extends javax.swing.JFrame {

    String nombre = "";
    BiblioSQL biblioSQL = BiblioSQL.getOpenInstance();

    ;
    /**
     *
     * @param id
     */
    public LibroFrame(Integer id) {
        nombre = "Libro";
        initComponents();

        setMinimumSize(new Dimension(350, 275));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(nombre);

        DatePickerSettings settings = new DatePickerSettings();
        settings.setFormatForDatesCommonEra(Autor.USER_DATE);
        settings.setAllowKeyboardEditing(false);
        datePicker1.setSettings(settings);

        DefaultComboBoxModel<String> cBoxAutorModel = (DefaultComboBoxModel) jCBoxAutor.getModel();
        DefaultComboBoxModel<String> cBoxGeneroModel = (DefaultComboBoxModel) jCBoxGenero.getModel();
        DefaultComboBoxModel<String> cBoxEditorialModel = (DefaultComboBoxModel) jCBoxEditorial.getModel();

        Set<Integer> autoresKeySet = biblioSQL.getAutores().keySet();
        autoresKeySet.forEach(e -> cBoxAutorModel.addElement(biblioSQL.getAutores().get(e).getNombre()));

        Set<Integer> generosKeySet = biblioSQL.getGeneros().keySet();
        generosKeySet.forEach(e -> cBoxGeneroModel.addElement(biblioSQL.getGeneros().get(e)));

        Set<Integer> editorialesKeySet = biblioSQL.getEditoriales().keySet();
        editorialesKeySet.forEach(e -> cBoxEditorialModel.addElement(biblioSQL.getEditoriales().get(e)));

        if (id != null) {
            Libro libro = biblioSQL.getLibros().get(id);

            jTextFieldID.setText(id + "");
            jTextFieldName.setText(biblioSQL.getLibros().get(id).getTitulo());

            datePicker1.setDate(libro.getFechaPublicacion());
            jCBoxAutor.setSelectedItem((String) biblioSQL.getAutores().get(libro.getIdAutor()).getNombre());
            jCBoxGenero.setSelectedItem((String) biblioSQL.getGeneros().get(libro.getIdGenero()));
            jCBoxEditorial.setSelectedItem((String) biblioSQL.getEditoriales().get(libro.getIdEditorial()));
        } else {
            datePicker1.setDateToToday();
        }
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        jCBoxAutor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCBoxGenero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jCBoxEditorial = new javax.swing.JComboBox<>();
        jBtnCancel = new javax.swing.JButton();
        jBtnAccept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(300, 200));

        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText(nombre);
        titleLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        idLabel.setText("id");

        jTextFieldID.setEditable(false);
        jTextFieldID.setMinimumSize(new java.awt.Dimension(100, 24));

        nameLabel.setText(nombre);

        jTextFieldName.setMinimumSize(new java.awt.Dimension(100, 24));

        jLabel1.setText("FechaPub");

        jLabel2.setText("autor");

        jLabel3.setText("genero");

        jLabel4.setText("editorial");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datePicker1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCBoxAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCBoxGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCBoxEditorial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBoxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCBoxEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtnCancel.setText("Cancelar");
        jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelActionPerformed(evt);
            }
        });

        jBtnAccept.setText("Aceptar");
        jBtnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 122, Short.MAX_VALUE)
                        .addComponent(jBtnAccept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancel)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCancel)
                    .addComponent(jBtnAccept)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAcceptActionPerformed
        // TODO add your handling code here:
        int nuevoAutor = 0;
        String selectedPais = (String) jCBoxAutor.getSelectedItem();
        for (Map.Entry<Integer, Autor> entry : biblioSQL.getAutores().entrySet()) {
            if (entry.getValue().getNombre().equals(selectedPais)) {
                nuevoAutor = entry.getKey();
                break;
            }
        }
        int nuevoGenero = 0;
        String selectedGenero = (String) jCBoxGenero.getSelectedItem();
        for (Map.Entry<Integer, String> entry : biblioSQL.getGeneros().entrySet()) {
            if (entry.getValue().equals(selectedGenero)) {
                nuevoGenero = entry.getKey();
                break;
            }
        }
        int nuevaEditorial = 0;
        String selectedEditorial = (String) jCBoxEditorial.getSelectedItem();
        for (Map.Entry<Integer, String> entry : biblioSQL.getEditoriales().entrySet()) {
            if (entry.getValue().equals(selectedEditorial)) {
                nuevaEditorial = entry.getKey();
                break;
            }
        }
        if (jTextFieldID.getText().length() == 0) {
            if (jTextFieldName.getText().trim().length() > 0) {
                if (biblioSQL.insertLibro(jTextFieldName.getText().trim(), Libro.getDbDate(datePicker1.getText()), nuevoAutor, nuevoGenero, nuevaEditorial) > 0) {
                    LibrosPanel.refreshTable();
                    JOptionPane.showMessageDialog(this, "Insercion realizada", nombre, JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Insercion rechazada", nombre, JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Nombre de " + nombre + " invalido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (jTextFieldName.getText().trim().length() > 0) {
                if (biblioSQL.updateLibro(Integer.parseInt(jTextFieldID.getText()), jTextFieldName.getText().trim(), Libro.getDbDate(datePicker1.getText()), nuevoAutor, nuevoGenero, nuevaEditorial) > 0) {
                    JOptionPane.showMessageDialog(this, "Modificacion realizada", nombre, JOptionPane.INFORMATION_MESSAGE);
                    LibrosPanel.refreshTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Modificacion rechazada", nombre, JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Nombre de " + nombre + " invalido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        this.dispose();
    }//GEN-LAST:event_jBtnAcceptActionPerformed

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBtnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JLabel idLabel;
    public javax.swing.JButton jBtnAccept;
    public javax.swing.JButton jBtnCancel;
    private javax.swing.JComboBox<String> jCBoxAutor;
    private javax.swing.JComboBox<String> jCBoxEditorial;
    private javax.swing.JComboBox<String> jCBoxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
