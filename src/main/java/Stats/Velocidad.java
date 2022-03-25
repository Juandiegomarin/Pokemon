package Stats;

import java.util.Objects;

public class Velocidad {

    private int ivs;
    private int evs;
    private int speed;

    public Velocidad(int ivs, int evs, int speed) {
        this.ivs = ivs;
        this.evs = evs;
        this.speed = speed;
    }

    public int getIvs() {
        return ivs;
    }

    public void setIvs(int ivs) {
        this.ivs = ivs;
    }

    public int getEvs() {
        return evs;
    }

    public void setEvs(int evs) {
        this.evs = evs;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Velocidad velocidad = (Velocidad) o;
        return ivs == velocidad.ivs && evs == velocidad.evs && speed == velocidad.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ivs, evs, speed);
    }

    @Override
    public String toString() {
        return "Velocidad{" +
                "ivs=" + ivs +
                ", evs=" + evs +
                ", speed=" + speed +
                '}';
    }
}
