package Stats;

import java.util.Objects;

public class Ataque {

    private int ivs;
    private int puntosEvasion;
    private int atack;

    public Ataque(int ivs, int evs, int atack) {
        this.ivs = ivs;
        this.puntosEvasion = evs;
        this.atack = atack;
    }

    public int getIvs() {
        return ivs;
    }

    public void setIvs(int ivs) {
        this.ivs = ivs;
    }

    public int getEvs() {
        return puntosEvasion;
    }

    public void setEvs(int evs) {
        this.puntosEvasion = evs;
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
        return ivs == ataque.ivs && puntosEvasion == ataque.puntosEvasion && atack == ataque.atack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ivs, puntosEvasion, atack);
    }

    @Override
    public String toString() {
        return "Ataque{" +
                "ivs=" + ivs +
                ", evs=" + puntosEvasion +
                ", atack=" + atack +
                '}';
    }
}
