package edu.usac.ipc1.carrera.track;

import static edu.usac.ipc1.carrera.track.TrackModel.TRACK_HEIGHT;
import static edu.usac.ipc1.carrera.track.TrackModel.TRACK_WIDTH;
import edu.usac.ipc1.carrera.vehicle.Vehicle;
import java.util.Date;

public class TrackController {

    private final TrackModel model;
    private int velocity = 1000;
    private int handicap = 1;

    public TrackController(TrackModel model) {
        this.model = model;
    }

    //@Override
    public synchronized void run() {
        Date initialTime = new Date();
        while (true && model.isAlive()) {
            moveObstacles();
            long difTime = new Date().getTime() - initialTime.getTime();
            if ((difTime/1000) % handicap == 0) {
                velocity = (int) ((velocity * (100 - 4)) / 100);
                if (velocity < 40) {
                    velocity = 40;
                }
            }
            try {
                wait(velocity);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

    public void moveObstacles() {
        for (int i = 0; i < model.getObstacles().length; i++) {
            if (model.getObstacles()[i] == null) {
                // Se genera un nuevo obstaculo
                model.getObstacles()[i] = generateNewObstacle();
                return;
            }
            int newPosY = model.getObstacles()[i].getPosY() + 1;
            if (newPosY < TRACK_HEIGHT) {
                // El antiguo obstaculo aún no sale de la vista
                // se mueve hacia abajo
                model.getObstacles()[i].setPosY(newPosY);
                if (checkCollision(model.getObstacles()[i])) {
                    model.setAlive(false);
                }
            } else {
                // El antiguo obstáculo se sale de la vista
                // se genera uno nuevo
                model.getObstacles()[i] = generateNewObstacle();
            }
        }
    }

    private boolean checkCollision(Vehicle obstacle) {
        return (obstacle.getPosX() == model.getPlayer().getPosX()
                && obstacle.getPosY() == model.getPlayer().getPosY());
    }

    private Vehicle generateNewObstacle() {
        int posY = 0;
        int posX = (int) Math.round(Math.random() * (TRACK_WIDTH - 1));
        return new Vehicle(posX, posY);
    }

    public void moveVehicleLeft() {
        int posX = model.getPlayer().getPosX();
        if (posX > 0) {
            model.getPlayer().setPosX(posX - 1);
        }
    }

    public void moveVehicleRigth() {
        int posX = model.getPlayer().getPosX();
        if (posX < TrackModel.TRACK_WIDTH - 1) {
            model.getPlayer().setPosX(posX + 1);
        }
    }

    public void setHandicap(Handicap handicap) {
        this.handicap = switch (handicap) {
            case Fácil ->
                3;
            case Intermedio ->
                2;
            case Difícil ->
                1;
        };
    }

}
