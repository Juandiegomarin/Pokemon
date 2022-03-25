package Stats;

import java.util.Objects;

public class DefensaEspecial {
    private int ivs;
    private int evs;
    private int specialDefense;

    public DefensaEspecial(int ivs, int evs, int specialDefense) {
        this.ivs = ivs;
        this.evs = evs;
        this.specialDefense = specialDefense;
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

    public int getSpecialDefense() {
        return specialDefense;
    }

    public void setSpecialDefense(int specialDefense) {
        this.specialDefense = specialDefense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DefensaEspecial that = (DefensaEspecial) o;
        return ivs == that.ivs && evs == that.evs && specialDefense == that.specialDefense;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ivs, evs, specialDefense);
    }

    @Override
    public String toString() {
        return "DefensaEspecial{" +
                "ivs=" + ivs +
                ", evs=" + evs +
                ", specialDefense=" + specialDefense +
                '}';
    }
}
