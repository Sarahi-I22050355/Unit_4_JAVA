/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import java.awt.Color;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Sarah
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    public App() {
        initComponents();
    }

        public void ShowCSV_InDGV() {
    // Limpiar filas y columnas del JTable
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);

        // Leer líneas del archivo CSV
        try (BufferedReader reader = new BufferedReader(new FileReader(filePathCSV))) {
            String line;
            // Leer la primera línea para obtener los nombres de las columnas
            if ((line = reader.readLine()) != null) {
                // Dividir la línea en nombres de columnas
                String[] columnNames = line.split(",");
                // Agregar las columnas al JTable
                for (String columnName : columnNames) {
                    model.addColumn(columnName);
                }
            }
            // Leer el resto de las líneas para agregar filas al JTable
            while ((line = reader.readLine()) != null) {
                // Dividir la línea en campos
                String[] fields = line.split(",");
                // Agregar la fila al JTable
                model.addRow(fields);
            }

            // Agregar una fila en blanco proporcional a la cantidad de columnas
            int columnCount = model.getColumnCount();
            Object[] emptyRow = new Object[columnCount];
            model.addRow(emptyRow);

        } catch (Exception e) {
            e.printStackTrace();
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Search text");

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product", "Quantity", "Price", "Revenue"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setText("Open");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save new file");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Inventory Manager");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(2, 2, 2)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addGap(3, 3, 3)
                                .addComponent(jButton5))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    // Verificar si el filePathCSV está vacío o el archivo no existe
    if (filePathCSV == null || filePathCSV.isEmpty() || !new File(filePathCSV).exists()) {
    JOptionPane.showMessageDialog(null, "Select a file to work with.", "Warning", JOptionPane.WARNING_MESSAGE);
    return;
    }

    // Verificar si el campo de búsqueda está vacío
    if (jTextField1.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "To search, you must use a NAME.", "Warning", JOptionPane.WARNING_MESSAGE);
    return;
    }

    try {
    // Leer el archivo CSV línea por línea
    try (BufferedReader reader = new BufferedReader(new FileReader(filePathCSV))) {
    String line;
    // Recorrer el archivo línea por línea
    while ((line = reader.readLine()) != null) {
    String[] fields = line.split(",");

    // Comparar el término de búsqueda con el primer campo (en este caso, el nombre)
    if (fields.length > 0 && fields[0].equals(jTextField1.getText())) {
    JOptionPane.showMessageDialog(null, "Found: " + String.join(", ", fields), "Warning", JOptionPane.WARNING_MESSAGE);
    return;
    }
    }
    }
    } catch (Exception ex) {
    System.out.println("Error searching in the CSV file: " + ex.getMessage());
    }

    // Si no se encuentra ningún nombre coincidente en el archivo
    JOptionPane.showMessageDialog(null, "No matching name found in the file", "Warning", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    // Check if a file is selected
    if (filePathCSV == null || filePathCSV.trim().isEmpty() || !new File(filePathCSV).exists()) {
    JOptionPane.showMessageDialog(null, "Select a valid file to work with.", "Attention", JOptionPane.WARNING_MESSAGE);
    return;
    }

    // Check if a name to search for is entered
    if (jTextField1.getText().trim().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a name to search for.", "Attention", JOptionPane.WARNING_MESSAGE);
    return;
    }

    try {
    // Read the CSV file line by line and write the non-deleted lines to a new temporary file
    String tempFilePath = File.createTempFile("temp", null).getAbsolutePath();
    try (BufferedReader reader = new BufferedReader(new FileReader(filePathCSV));
    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFilePath))) {
    String line;
    while ((line = reader.readLine()) != null) {
    // Check if the current line contains the name to delete
    if (!line.contains(jTextField1.getText())) {
    writer.write(line + System.lineSeparator());
    }
    }
    }

    // Replace the original file with the temporary file
    File originalFile = new File(filePathCSV);
    originalFile.delete();
    File tempFile = new File(tempFilePath);
    tempFile.renameTo(originalFile);

    ShowCSV_InDGV();
    } catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "Error deleting line from the CSV file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    Map<String, Double> data = new HashMap<>();
    double maxRevenue = 0; // Variable para almacenar el valor máximo de Revenue

    // Obtener los datos y encontrar el valor máximo de Revenue
    for (int i = 0; i < model.getRowCount(); i++) {
    if (model.getValueAt(i, model.findColumn("Product")) != null && model.getValueAt(i, model.findColumn("Revenue")) != null) {
    String product = model.getValueAt(i, model.findColumn("Product")).toString();
    double revenue = Double.parseDouble(model.getValueAt(i, model.findColumn("Revenue")).toString());
    data.put(product, revenue);
    if (revenue > maxRevenue) {
       maxRevenue = revenue;
    }
    }
    }

    DefaultCategoryDataset dataset = new DefaultCategoryDataset(); // Crear un solo dataset

    // Agregar los datos al dataset
    for (Map.Entry<String, Double> entry : data.entrySet()) {
    String product = entry.getKey();
    double revenue = entry.getValue();
    dataset.addValue(revenue, product, "Revenue");
    }

    // Crear un nuevo gráfico
    JFreeChart chart = ChartFactory.createBarChart(
    "Revenue by Product", // Título del gráfico
    "Product", // Etiqueta del eje X
    "Revenue", // Etiqueta del eje Y
    dataset, // Utilizar el dataset con todos los datos
    PlotOrientation.VERTICAL, // Orientación del gráfico
    true, // Mostrar leyenda
    true, // Usar tooltips
    false // Usar URLs
    );

    // Establecer el fondo del gráfico

    chart.setBackgroundPaint(Color.WHITE);

    // Obtener la trama del gráfico
    CategoryPlot plot = (CategoryPlot) chart.getPlot();

    // Establecer el rango del eje Y para que coincida con el valor máximo de Revenue
    plot.getRangeAxis().setRange(0, maxRevenue + 10); // Ajusta el rango para dar espacio adicional

    // Crear un panel de gráfico
    ChartPanel chartPanel = new ChartPanel(chart);

    // Establecer las restricciones de diseño para el jPanel1
    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
    .addContainerGap()
    .addComponent(chartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
    .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
    .addContainerGap()
    .addComponent(chartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
    .addContainerGap())
    );
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Crear un objeto JFileChooser
        JFileChooser fileChooser = new JFileChooser();

        // Aplicar un filtro para mostrar solo archivos CSV
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files (*.csv)", "csv");
        fileChooser.setFileFilter(filter);

        // Mostrar el diálogo de selección de archivo
        int result = fileChooser.showOpenDialog(null);

        // Si el usuario cancela la selección, salir del método
        if (result != JFileChooser.APPROVE_OPTION) {
            return;
        }

        // Obtener la ruta del archivo seleccionado
        File selectedFile = fileChooser.getSelectedFile();
        filePathCSV = selectedFile.getAbsolutePath();

        // Llamar al método para mostrar el contenido del archivo CSV en el JTable
        ShowCSV_InDGV();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    // Check if there is data in the JTable
    if (jTable1.getRowCount() == 0) {
        JOptionPane.showMessageDialog(null, "There is no data to save.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Get the CSV file path
        String filePath = filePathCSV;

        // Create a StringBuilder to build the CSV file content
        StringBuilder csvContent = new StringBuilder();

        // Add column headers to the CSV file
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < model.getColumnCount(); i++) {
            csvContent.append(model.getColumnName(i));
            if (i < model.getColumnCount() - 1) {
                csvContent.append(",");
            }
        }
        csvContent.append(System.lineSeparator()); // Add new line after headers

        // Add row data to the CSV file
        for (int rowIndex = 0; rowIndex < model.getRowCount(); rowIndex++) {
            boolean hasData = false; // Flag to check if the row has non-empty cells
            StringBuilder rowDataStr = new StringBuilder();

            for (int columnIndex = 0; columnIndex < model.getColumnCount(); columnIndex++) {
                Object cellValue = model.getValueAt(rowIndex, columnIndex);
                // Check if the cell value is not null or empty
                if (cellValue != null && !cellValue.toString().trim().isEmpty()) {
                    rowDataStr.append(cellValue);
                    hasData = true; // Set the flag to true if the cell has a non-empty value
                }

                if (columnIndex < model.getColumnCount() - 1) {
                    rowDataStr.append(",");
                }
            }

            // Add the row data to the CSV content if the row has non-empty cells
            if (hasData) {
                csvContent.append(rowDataStr.toString()).append(System.lineSeparator());
            }
        }

        // Write the content to the CSV file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(csvContent.toString());
        }

        JOptionPane.showMessageDialog(null, "Data saved successfully to the CSV file.", "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error saving data to the CSV file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    ShowCSV_InDGV();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    // Check if there is data in the JTable
    if (jTable1.getRowCount() == 0) {
    JOptionPane.showMessageDialog(null, "There is no data to save.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
    }

    // Get the index of the "Revenue" column
    int revenueColumnIndex = jTable1.getColumn("Revenue").getModelIndex();

    // Get the data and row indices of the "Revenue" column, excluding the last row
    List<Double> revenueData = new ArrayList<>();
    List<Integer> rowIndices = new ArrayList<>();
    TableModel model = jTable1.getModel();
    for (int rowIndex = 0; rowIndex < model.getRowCount() - 1; rowIndex++) {
    Object revenueValue = model.getValueAt(rowIndex, revenueColumnIndex);
    if (revenueValue != null) {
    revenueData.add(Double.parseDouble(revenueValue.toString()));
    rowIndices.add(rowIndex);
    }
    }

    // Sort the revenue data and row indices in descending order
    Collections.sort(rowIndices, Comparator.comparingDouble(row -> -revenueData.get(rowIndices.indexOf(row))));
    Collections.sort(revenueData, Collections.reverseOrder());

    // Create a JFileChooser instance
    JFileChooser saveFileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files (*.csv)", "csv");
    saveFileChooser.setFileFilter(filter);
    saveFileChooser.setDialogTitle("Save as CSV File");
    saveFileChooser.setSelectedFile(new File(filePathCSV));

    // Show the save file dialog
    int result = saveFileChooser.showSaveDialog(null);
    if (result != JFileChooser.APPROVE_OPTION) {
    return;
    }

    // Get the selected file path
    File selectedFile = saveFileChooser.getSelectedFile();
    String filePathCSV = selectedFile.getAbsolutePath();

    try {
    // Create a FileWriter to write to the CSV file
    FileWriter writer = new FileWriter(filePathCSV);

    // Write column headers to the CSV file
    TableColumnModel columnModel = jTable1.getColumnModel();
    for (int columnIndex = 0; columnIndex < columnModel.getColumnCount(); columnIndex++) {
    String headerText = columnModel.getColumn(columnIndex).getHeaderValue().toString();
    writer.write(headerText);
    if (columnIndex < columnModel.getColumnCount() - 1) {
        writer.write(",");
    }
    }
    writer.write(System.lineSeparator());

    // Write data from each row to the CSV file
    for (int rowIndex : rowIndices) {
    for (int columnIndex = 0; columnIndex < model.getColumnCount(); columnIndex++) {
        Object cellValue = model.getValueAt(rowIndex, columnIndex);
        if (cellValue != null && !cellValue.toString().isEmpty()) {
            writer.write(cellValue.toString());
        }
        if (columnIndex < model.getColumnCount() - 1) {
            writer.write(",");
        }
    }
    writer.write(System.lineSeparator());
    }

    // Close the FileWriter
    writer.close();

    JOptionPane.showMessageDialog(null, "Data saved successfully to the CSV file.", "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "Error saving data to the CSV file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    ShowCSV_InDGV();
    }//GEN-LAST:event_jButton3ActionPerformed

    private Color getRandomColor() {
    Random random = new Random();
    return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}