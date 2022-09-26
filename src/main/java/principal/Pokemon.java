package principal;

import stats.Tipo1;
import stats.Tipo2;

import java.util.Objects;

public class Pokemon {


    private String nombre;
    private Tipo1 tipo1;
    private Tipo2 tipo2;
    private Estadisticas estadisticas;
    private Movimientos movimientos;
    private Objeto objeto;

    public Pokemon(String nombre, Tipo1 tipo1, Tipo2 tipo2, Estadisticas estadisticas, Movimientos movimientos,Objeto objeto) {
        this.nombre = nombre;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.estadisticas = estadisticas;
        this.movimientos = movimientos;
        this.objeto= objeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo1 getTipo1() {
        return tipo1;
    }

    public void setTipo1(Tipo1 tipo1) {
        this.tipo1 = tipo1;
    }

    public Tipo2 getTipo2() {
        return tipo2;
    }

    public void setTipo2(Tipo2 tipo2) {
        this.tipo2 = tipo2;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    public Movimientos getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimientos movimientos) {
        this.movimientos = movimientos;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return nombre.equals(pokemon.nombre) && tipo1 == pokemon.tipo1 && tipo2 == pokemon.tipo2 && estadisticas.equals(pokemon.estadisticas) && movimientos.equals(pokemon.movimientos)&& objeto.equals(pokemon.objeto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipo1, tipo2, estadisticas, movimientos,objeto);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo1=" + tipo1 +
                ", tipo2=" + tipo2 +
                ", estadisticas=" + estadisticas +
                ", movimientos=" + movimientos +
                ", objeto=" + objeto +
                '}';
    }
}
