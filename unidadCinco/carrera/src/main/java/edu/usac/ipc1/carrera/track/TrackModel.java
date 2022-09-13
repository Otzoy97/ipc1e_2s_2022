package edu.usac.ipc1.carrera.track;

import edu.usac.ipc1.carrera.vehicle.Vehicle;

public class TrackModel {

    public static final int TRACK_HEIGHT = 8;
    public static final int TRACK_WIDTH = 3;
    private final Vehicle[] obstacles;
    private Vehicle player;
    private volatile boolean alive;

    public TrackModel() {
        this.obstacles = new Vehicle[6];
        this.player = new Vehicle(1, 7);
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public Vehicle[] getObstacles() {
        return obstacles;
    }

    public Vehicle getPlayer() {
        return player;
    }

    public void setPlayer(Vehicle player) {
        this.player = player;
    }

}
