package edu.usac.ipc1.carrera.track;

import edu.usac.ipc1.carrera.vehicle.Vehicle;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TrackRender   {

    private JLabel[][] matrix;
    private final TrackModel trackModel;

    public TrackRender(TrackModel trackModel) {
        this.trackModel = trackModel;
    }

    public void addLabels(JPanel panel) {
        panel.removeAll();
        matrix = new JLabel[8][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new JLabel();
                matrix[i][j].setOpaque(true);
                matrix[i][j].setBackground(Color.WHITE);
                panel.add(matrix[i][j]);
            }
        }
        panel.validate();
    }

    //@Override
    public synchronized void run() {
        while (true && trackModel.isAlive()) {
            render();
            try {
                wait(20);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

    private void render() {
        Vehicle player = trackModel.getPlayer();
        Vehicle[] obstacles = trackModel.getObstacles();
        for (JLabel[] rows : matrix) {
            for (JLabel cols : rows) {
                cols.setBackground(Color.WHITE);
            }
        }
        for (Vehicle obstacle : obstacles) {
            if (obstacle == null) {
                continue;
            }
            int posX = obstacle.getPosX();
            int posY = obstacle.getPosY();
            matrix[posY][posX].setBackground(Color.RED);
        }
        int posX = player.getPosX();
        int posY = player.getPosY();
        matrix[posY][posX].setBackground(Color.BLUE);
    }
}
