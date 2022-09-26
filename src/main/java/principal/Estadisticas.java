import Stats.*;

import java.util.Objects;

public class Estadisticas {



    private Naturaleza naturaleza;
    private Habilidad habilidad;
    private Ataque ataque;
    private AtaqueEspecial ataqueEspecial;
    private Defensa defensa;
    private DefensaEspecial defensaEspecial;
    private Velocidad velocidad;
    private Ps ps;

    public Estadisticas(Naturaleza naturaleza, Habilidad habilidad, Ataque ataque, AtaqueEspecial ataqueEspecial, Defensa defensa, DefensaEspecial defensaEspecial, Velocidad velocidad, Ps ps) {
        this.naturaleza = naturaleza;
        this.habilidad = habilidad;
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.defensa = defensa;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.ps = ps;
    }

    public Naturaleza getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(Naturaleza naturaleza) {
        this.naturaleza = naturaleza;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public Ataque getAtaque() {
        return ataque;
    }

    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }

    public AtaqueEspecial getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(AtaqueEspecial ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public Defensa getDefensa() {
        return defensa;
    }

    public void setDefensa(Defensa defensa) {
        this.defensa = defensa;
    }

    public DefensaEspecial getDefensaEspecial() {
        return defensaEspecial;
    }

    public void setDefensaEspecial(DefensaEspecial defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public Velocidad getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Velocidad velocidad) {
        this.velocidad = velocidad;
    }

    public Ps getPs() {
        return ps;
    }

    public void setPs(Ps ps) {
        this.ps = ps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estadisticas that = (Estadisticas) o;
        return naturaleza == that.naturaleza && habilidad == that.habilidad && ataque.equals(that.ataque) && ataqueEspecial.equals(that.ataqueEspecial) && defensa.equals(that.defensa) && defensaEspecial.equals(that.defensaEspecial) && velocidad.equals(that.velocidad) && ps.equals(that.ps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naturaleza, habilidad, ataque, ataqueEspecial, defensa, defensaEspecial, velocidad, ps);
    }

    @Override
    public String toString() {
        return "Estadisticas{" +
                "naturaleza=" + naturaleza +
                ", habilidad=" + habilidad +
                ", ataque=" + ataque +
                ", ataqueEspecial=" + ataqueEspecial +
                ", defensa=" + defensa +
                ", defensaEspecial=" + defensaEspecial +
                ", velocidad=" + velocidad +
                ", ps=" + ps +
                '}';
    }
}
