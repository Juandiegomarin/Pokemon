package Stats;

import java.util.Objects;

public class Ataque {

    private int ivs;
    private int evs;
    private int atack;

    public Ataque(int ivs, int evs, int atack) {
        this.ivs = ivs;
        this.evs = evs;
        this.atack = atack;
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

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ataque ataque = (Ataque) o;
        return ivs == ataque.ivs && evs == ataque.evs && atack == ataque.atack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ivs, evs, atack);
    }

    @Override
    public String toString() {
        return "Ataque{" +
                "ivs=" + ivs +
                ", evs=" + evs +
                ", atack=" + atack +
                '}';
    }
}
