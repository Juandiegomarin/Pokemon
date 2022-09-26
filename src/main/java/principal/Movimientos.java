package principal;

import moves.Movimiento;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Movimientos {

    private Movimiento movimientos [] ;

    public Movimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movimientos that = (Movimientos) o;
        return Arrays.equals(movimientos, that.movimientos);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(movimientos);
    }

    @Override
    public String toString() {
        return "Movimientos{" +
                "movimientos=" + Arrays.toString(movimientos) +
                '}';
    }
}
