package Moves;

import Stats.Tipo1;

import java.util.Objects;

public class Movimiento {

    private allMoves move;
    private Tipo1 tipo1;
    private Categoria categoria;
    private int potencia;
    private int precision;

    public Movimiento(allMoves move, Tipo1 tipo1, Categoria categoria , int potencia, int precision) {

        this.tipo1 = tipo1;
        this.categoria = categoria;
        this.move = move;
        this.potencia = potencia;
        this.precision = precision;
    }



    public Tipo1 getTipo1() {
        return tipo1;
    }

    public void setTipo1(Tipo1 tipo1) {
        this.tipo1 = tipo1;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public allMoves getMove() {
        return move;
    }

    public void setMove(allMoves move) {
        this.move = move;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movimiento that = (Movimiento) o;
        return potencia == that.potencia && precision == that.precision && move.equals(that.move) && tipo1 == that.tipo1 && categoria == that.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(move, tipo1, categoria, potencia, precision);
    }

    @Override
    public String toString() {
        return "Movimiento{" +
                "nombre='" + move + '\'' +
                ", tipo1=" + tipo1 +
                ", categoria=" + categoria +
                ", potencia=" + potencia +
                ", precision=" + precision +
                '}';
    }
}
