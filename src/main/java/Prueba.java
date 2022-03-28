import Moves.Categoria;
import Moves.Movimiento;
import Moves.allMoves;
import Stats.*;

import java.util.ArrayList;

public class Prueba {

    public static void main(String[] args) {

    Pokemon p1 = new Pokemon("Charizard", Tipo1.FUEGO, Tipo2.VOLADOR,new Estadisticas(Naturaleza.FIRME, Habilidad.MAR_LLAMAS,new Ataque(31,254,84),new AtaqueEspecial(31,0,109),new Defensa(31,4,74),new DefensaEspecial(31,0,85),new Velocidad(31,254,100),new Ps(31,0,78)),new Movimientos(new Movimiento[]{new Movimiento(allMoves.LANZALLAMAS,Tipo1.FUEGO, Categoria.ESPECIAL,90,100),new Movimiento(allMoves.ACROBATA,Tipo1.VOLADOR,Categoria.FISICA,80,100),new Movimiento(allMoves.LLAMARADA,Tipo1.FUEGO,Categoria.ESPECIAL,110,85),new Movimiento(allMoves.AVALANCHA,Tipo1.ROCA,Categoria.FISICA,100,80)}));
    Pokemon p2 =new Pokemon("Blastoise", Tipo1.AGUA, null,new Estadisticas(Naturaleza.MIEDOSA, Habilidad.TORRENTE,new Ataque(31,0,83),new AtaqueEspecial(31,254,85 ),new Defensa(31,4,100),new DefensaEspecial(31,254,254),new Velocidad(31,0,78),new Ps(31,0,79)),new Movimientos(new Movimiento[]{new Movimiento(allMoves.HIDROBOMBA,Tipo1.AGUA, Categoria.ESPECIAL,110,80),new Movimiento(allMoves.MUNDO_GELIDO,Tipo1.HIELO,Categoria.ESPECIAL,100,100),new Movimiento(allMoves.PROTECCION,Tipo1.NORMAL,Categoria.ESTADO,0,100),new Movimiento(allMoves.BOLA_SOMBRA,Tipo1.FANTASMA,Categoria.ESPECIAL,90,100)}));

        ArrayList<Pokemon> pokedex= new ArrayList<>();
        pokedex.add(p1);
        pokedex.add(p2);
    }


    public void combate(Pokemon p1,Pokemon p2){











    }
}


