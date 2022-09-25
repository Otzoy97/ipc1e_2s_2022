package edu.usac.ipc1.carrera.track;

import edu.usac.ipc1.carrera.vehicle.Segmento;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TableroRender   {

    private JLabel[][] matriz;
    private final TableroModelo modelo;

    public TableroRender(TableroModelo modelo) {
        this.modelo = modelo;
    }

    public void addLabels(JPanel panel) {
        panel.removeAll();
        matriz = new JLabel[10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = new JLabel();
                matriz[i][j].setOpaque(true);
                matriz[i][j].setBackground(Color.WHITE);
                panel.add(matriz[i][j]);
            }
        }
        panel.validate();
    }

    //@Override
    public synchronized void run() {
        while (true && modelo.isVivo() && modelo.isActivo()) {
            render();
            try {
                wait(20);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

    private void render() {
        Segmento fruta = modelo.getFruta();
        Segmento[] serpiente = modelo.getSerpiente();
        for (JLabel[] rows : matriz) {
            for (JLabel cols : rows) {
                cols.setBackground(Color.WHITE);
            }
        }
        for (Segmento segmento : serpiente) {
            if (segmento == null) {
                continue;
            }
            int posX = segmento.getPosX();
            int posY = segmento.getPosY();
            matriz[posY][posX].setBackground(Color.GREEN);
        }
        int posX = fruta.getPosX();
        int posY = fruta.getPosY();
        matriz[posY][posX].setBackground(Color.RED);
    }
}
