package edu.usac.ipc1;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.InputEvent;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.JPopupMenu.Separator;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Editor extends JFrame {
    private JTextArea txtContent;
    private boolean isSaved = false;
    private Archivo archivo;
    private JFileChooser fileChooser;

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setVisible(true);
        editor.setLocationRelativeTo(null);
    }

    public Editor() {
        init();
    }

    private void init() {
        setTitle("Editor de texto");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        GridBagConstraints gridBagConstraints;
        getContentPane().setLayout(new GridBagLayout());

        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu("Archivo");
        JMenuItem jMenuItem0 = new JMenuItem("Abrir...");
        jMenuItem0.setAccelerator(KeyStroke.getKeyStroke('A', InputEvent.CTRL_DOWN_MASK));
        jMenuItem0.addActionListener(e -> openFile());
        JMenuItem jMenuItem1 = new JMenuItem("Guardar");
        jMenuItem1.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.addActionListener(e -> save());
        JMenuItem jMenuItem2 = new JMenuItem("Guardar como...");
        jMenuItem2.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.CTRL_DOWN_MASK + InputEvent.SHIFT_DOWN_MASK));
        jMenuItem2.addActionListener(e -> saveFileAs());

        JMenuItem jMenuItem3 = new JMenuItem("Obtener info...");
        jMenuItem3.setAccelerator(KeyStroke.getKeyStroke('I', InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.addActionListener(e -> getInfo());

        JMenuItem jMenuItem4 = new JMenuItem("Eliminar archivo");
        jMenuItem4.setAccelerator(KeyStroke.getKeyStroke('D', InputEvent.CTRL_DOWN_MASK + InputEvent.SHIFT_DOWN_MASK));
        jMenuItem4.addActionListener(e -> deleteFile());

        jMenu.add(jMenuItem0);
        jMenu.add(jMenuItem1);
        jMenu.add(jMenuItem2);
        jMenu.add(new Separator());
        jMenu.add(jMenuItem3);
        jMenu.add(jMenuItem4);
        jMenuBar.add(jMenu);
        setJMenuBar(jMenuBar);

        JPanel panel0 = new JPanel();
        panel0.setLayout(new GridBagLayout());

        txtContent = new JTextArea();
        txtContent.setFont(new Font("Courier New", Font.PLAIN, 12));
        txtContent.setWrapStyleWord(true);
        txtContent.setLineWrap(true);
        txtContent.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JScrollPane scp0 = new JScrollPane(txtContent);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        panel0.add(scp0, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        add(panel0, gridBagConstraints);

    }

    private void saveFileAs() {
        try {
            fileChooser = new JFileChooser(archivo.getPath().getParent().toString());
        } catch (Exception ex) {
            if (fileChooser == null) {
                fileChooser = new JFileChooser();
            }
        }
        fileChooser.setFileFilter(new FileNameExtensionFilter("Documentos de texto (*.txt)", "txt"));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setMultiSelectionEnabled(false);
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            archivo = new Archivo(fileChooser.getSelectedFile().getAbsolutePath() + ".txt");
            archivo.crear();
            String msg = archivo.escribir(this.txtContent.getText());
            JOptionPane.showMessageDialog(this, msg, "Editor", JOptionPane.INFORMATION_MESSAGE);
            isSaved = true;
        }
    }

    /**
     * Guarda los cambios en el archivo de texto seleccionado
     */
    private void save() {
        if (!this.isSaved) {
            this.saveFileAs();
        } else {
            String msg = archivo.escribir(this.txtContent.getText());
            JOptionPane.showMessageDialog(this, msg, "Editor", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * Despliega un selector de archivo para seleccionar y abrir un archivo
     */
    private void openFile() {
        try {
            fileChooser = new JFileChooser(archivo.getPath().getParent().toString());
        } catch (Exception ex) {
            if (fileChooser == null) {
                fileChooser = new JFileChooser();
            }
        }
        fileChooser.setFileFilter(new FileNameExtensionFilter("Documentos de texto (*.txt)", "txt"));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setMultiSelectionEnabled(false);
        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            archivo = new Archivo(fileChooser.getSelectedFile().getAbsolutePath());
            this.txtContent.setText(archivo.leer());
            isSaved = true;
        }
    }

    private void getInfo() {
        JOptionPane.showMessageDialog(this, archivo.informar(), "Editor", JOptionPane.INFORMATION_MESSAGE);
    }

    private void deleteFile() {
        if (archivo.eliminar()) {
            JOptionPane.showMessageDialog(this, "Archivo eliminado", "Editor", JOptionPane.INFORMATION_MESSAGE);
            isSaved = false;
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar el archivo", "Editor",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
}