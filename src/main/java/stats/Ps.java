package stats;

import java.util.Objects;

public class Ps {

    private int ivs;
    private int evs;
    private int hp;

    public Ps(int ivs, int evs, int hp) {
        this.ivs = ivs;
        this.evs = evs;
        this.hp = hp;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ps ps = (Ps) o;
        return ivs == ps.ivs && evs == ps.evs && hp == ps.hp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ivs, evs, hp);
    }

    @Override
    public String toString() {
        return "Ps{" +
                "ivs=" + ivs +
                ", evs=" + evs +
                ", hp=" + hp +
                '}';
    }
}
