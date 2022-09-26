package Stats;

import java.util.Objects;

public class Defensa {
    private int ivs;
    private int evs;
    private int defense;

    public Defensa(int ivs, int evs, int defense) {
        this.ivs = ivs;
        this.evs = evs;
        this.defense = defense;
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

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Defensa defensa = (Defensa) o;
        return ivs == defensa.ivs && evs == defensa.evs && defense == defensa.defense;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ivs, evs, defense);
    }

    @Override
    public String toString() {
        return "Defensa{" +
                "ivs=" + ivs +
                ", evs=" + evs +
                ", defense=" + defense +
                '}';
    }
}
