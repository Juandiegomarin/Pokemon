package stats;

import java.util.Objects;

public class AtaqueEspecial {

    private int ivs;
    private int evs;
    private int specialAtack;

    public AtaqueEspecial(int ivs, int evs, int specialAtack) {
        this.ivs = ivs;
        this.evs = evs;
        this.specialAtack = specialAtack;
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

    public int getSpecialAtack() {
        return specialAtack;
    }

    public void setSpecialAtack(int specialAtack) {
        this.specialAtack = specialAtack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtaqueEspecial that = (AtaqueEspecial) o;
        return ivs == that.ivs && evs == that.evs && specialAtack == that.specialAtack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ivs, evs, specialAtack);
    }

    @Override
    public String toString() {
        return "AtaqueEspecial{" +
                "ivs=" + ivs +
                ", evs=" + evs +
                ", specialAtack=" + specialAtack +
                '}';
    }
}
