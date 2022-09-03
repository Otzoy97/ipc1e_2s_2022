package edu.usac.ipc1.inventario;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            App app = new App();
            app.setVisible(true);
            app.setLocationRelativeTo(null);
        });
    }
}