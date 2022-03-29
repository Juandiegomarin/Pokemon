import Moves.Movimiento;
import Stats.*;
import Moves.Categoria;
import Moves.allMoves;
import java.util.ArrayList;


public class Prueba {



    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Charizard", Tipo1.FUEGO, Tipo2.VOLADOR, new Estadisticas(Naturaleza.FIRME, Habilidad.MAR_LLAMAS, new Ataque(31, 254, 84), new AtaqueEspecial(31, 0, 109), new Defensa(31, 4, 74), new DefensaEspecial(31, 0, 85), new Velocidad(31, 254, 100), new Ps(31, 0, 78)), new Movimientos(new Movimiento[]{new Movimiento(allMoves.LANZALLAMAS, Tipo1.FUEGO, Categoria.ESPECIAL, 90, 100), new Movimiento(allMoves.ACROBATA, Tipo1.VOLADOR, Categoria.FISICA, 80, 100), new Movimiento(allMoves.LLAMARADA, Tipo1.FUEGO, Categoria.ESPECIAL, 110, 85), new Movimiento(allMoves.AVALANCHA, Tipo1.ROCA, Categoria.FISICA, 100, 80)}), Objeto.CARBON);
        Pokemon p2 = new Pokemon("Blastoise", Tipo1.AGUA, null, new Estadisticas(Naturaleza.MIEDOSA, Habilidad.TORRENTE, new Ataque(31, 0, 83), new AtaqueEspecial(31, 254, 85), new Defensa(31, 4, 100), new DefensaEspecial(31, 254, 254), new Velocidad(31, 0, 78), new Ps(31, 0, 79)), new Movimientos(new Movimiento[]{new Movimiento(allMoves.HIDROBOMBA, Tipo1.AGUA, Categoria.ESPECIAL, 110, 80), new Movimiento(allMoves.MUNDO_GELIDO, Tipo1.HIELO, Categoria.ESPECIAL, 100, 100), new Movimiento(allMoves.PROTECCION, Tipo1.NORMAL, Categoria.ESTADO, 0, 100), new Movimiento(allMoves.BOLA_SOMBRA, Tipo1.FANTASMA, Categoria.ESPECIAL, 90, 100)}), Objeto.RESTOS);
        ArrayList<Pokemon> pokedex = new ArrayList<>();
        pokedex.add(p1);
        pokedex.add(p2);
    }

    public double eficacia(Movimiento movimiento, Pokemon defensivo) {
        double eficacia = 0;
        if (movimiento.getTipo1().equals(Tipo1.NORMAL)) {

            if (defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo2().equals(Tipo2.ROCA) || defensivo.getTipo2().equals(Tipo2.ACERO) || defensivo.getTipo1().equals(Tipo1.ACERO)) {
                eficacia = 0.5;
            }
            if ((defensivo.getTipo1().equals(Tipo1.ROCA) && defensivo.getTipo2().equals(Tipo2.ACERO)) || ((defensivo.getTipo1().equals(Tipo1.ACERO) && defensivo.getTipo2().equals(Tipo2.ROCA)))) {
                eficacia = 0.25;
            }
            if (defensivo.getTipo1().equals(Tipo1.FANTASMA) || defensivo.getTipo1().equals(Tipo2.FANTASMA)) {
                eficacia = 0;
            } else {
                eficacia = 1;
            }
        } else if (movimiento.getTipo1().equals(Tipo1.FUEGO)) {
            if ((defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo1().equals(Tipo1.HIELO) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo1().equals(Tipo1.ACERO)) && (defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo2().equals(Tipo2.HIELO) || defensivo.getTipo2().equals(Tipo2.BICHO) || defensivo.getTipo2().equals(Tipo2.ACERO))) {
                eficacia = 4;
            }
            if (defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo1().equals(Tipo1.HIELO) || defensivo.getTipo2().equals(Tipo2.HIELO) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo2().equals(Tipo2.BICHO) || defensivo.getTipo1().equals(Tipo1.ACERO) || defensivo.getTipo2().equals(Tipo2.ACERO)) {
                eficacia = 2;
            }
            if ((defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo1().equals(Tipo1.HIELO) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo1().equals(Tipo1.ACERO) || defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo2().equals(Tipo2.HIELO) || defensivo.getTipo2().equals(Tipo2.BICHO) || defensivo.getTipo2().equals(Tipo2.ACERO)) && (defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo1().equals(Tipo1.DRAGON) || defensivo.getTipo1().equals(Tipo1.FUEGO) || defensivo.getTipo2().equals(Tipo2.FUEGO) || defensivo.getTipo1().equals(Tipo1.AGUA) || (defensivo.getTipo2().equals(Tipo2.ROCA) || defensivo.getTipo2().equals(Tipo2.DRAGON) || defensivo.getTipo2().equals(Tipo2.AGUA)))) {
                eficacia = 1;
            }
            if (defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo1().equals(Tipo1.AGUA) || defensivo.getTipo1().equals(Tipo1.DRAGON) || defensivo.getTipo1().equals(Tipo1.FUEGO) || defensivo.getTipo2().equals(Tipo2.DRAGON) || (defensivo.getTipo2().equals(Tipo2.ROCA) || defensivo.getTipo2().equals(Tipo2.AGUA) || defensivo.getTipo2().equals(Tipo2.FUEGO))) {
                eficacia = 0.5;
            }
            if ((defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo1().equals(Tipo1.TIERRA) || defensivo.getTipo1().equals(Tipo1.AGUA) || defensivo.getTipo1().equals(Tipo1.DRAGON)) && (defensivo.getTipo2().equals(Tipo2.ROCA) || defensivo.getTipo2().equals(Tipo2.TIERRA) || defensivo.getTipo2().equals(Tipo2.AGUA) || defensivo.getTipo2().equals(Tipo2.DRAGON))) {
                eficacia = 0.25;
            } else {
                eficacia = 1;
            }
        } else if (movimiento.getTipo1().equals(Tipo1.AGUA)) {
            if ((defensivo.getTipo1().equals(Tipo1.FUEGO) || defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo1().equals(Tipo1.TIERRA)) && (defensivo.getTipo2().equals(Tipo2.FUEGO) || defensivo.getTipo2().equals(Tipo2.ROCA) || defensivo.getTipo2().equals(Tipo2.TIERRA))) {
                eficacia = 4;
            }
            if (defensivo.getTipo1().equals(Tipo1.FUEGO) || defensivo.getTipo2().equals(Tipo2.FUEGO) || defensivo.getTipo1().equals(Tipo1.TIERRA) || defensivo.getTipo2().equals(Tipo2.TIERRA) || defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo2().equals(Tipo2.ROCA)) {
                eficacia = 2;
            }
            if ((defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo1().equals(Tipo1.AGUA) || defensivo.getTipo1().equals(Tipo1.DRAGON) || defensivo.getTipo2().equals(Tipo2.DRAGON) || defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo2().equals(Tipo2.AGUA)) && (defensivo.getTipo1().equals(Tipo1.FUEGO) || defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo1().equals(Tipo1.TIERRA) || defensivo.getTipo2().equals(Tipo2.FUEGO) || defensivo.getTipo2().equals(Tipo2.ROCA) || defensivo.getTipo2().equals(Tipo2.TIERRA))) {
                eficacia = 1;
            }
            if (defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo1().equals(Tipo1.AGUA) || defensivo.getTipo2().equals(Tipo2.AGUA) || defensivo.getTipo1().equals(Tipo1.DRAGON) || defensivo.getTipo2().equals(Tipo2.DRAGON)) {
                eficacia = 0.5;
            }
            if ((defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo1().equals(Tipo1.AGUA) || defensivo.getTipo1().equals(Tipo1.DRAGON)) && (defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo2().equals(Tipo2.AGUA) || defensivo.getTipo2().equals(Tipo2.DRAGON))) {
                eficacia = 0.25;
            } else {
                eficacia = 1;
            }
        } else if (movimiento.getTipo1().

                equals(Tipo1.PLANTA)) {
            if ((defensivo.getTipo1().equals(Tipo1.AGUA) || defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo1().equals(Tipo1.TIERRA)) && (defensivo.getTipo2().equals(Tipo2.AGUA) || defensivo.getTipo2().equals(Tipo2.ROCA) || defensivo.getTipo2().equals(Tipo2.TIERRA))) {
                eficacia = 4;
            }
            if (defensivo.getTipo1().equals(Tipo1.AGUA) || defensivo.getTipo2().equals(Tipo2.AGUA) || defensivo.getTipo1().equals(Tipo1.TIERRA) || defensivo.getTipo2().equals(Tipo2.TIERRA) || defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo2().equals(Tipo2.ROCA)) {
                eficacia = 2;
            }
            if ((defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo1().equals(Tipo1.DRAGON) || defensivo.getTipo2().equals(Tipo2.DRAGON) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo2().equals(Tipo2.VOLADOR) || defensivo.getTipo1().equals(Tipo1.FUEGO) || defensivo.getTipo2().equals(Tipo2.FUEGO) || defensivo.getTipo1().equals(Tipo1.VENENO) || defensivo.getTipo2().equals(Tipo2.VENENO) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo2().equals(Tipo2.BICHO) || defensivo.getTipo1().equals(Tipo1.ACERO) || defensivo.getTipo2().equals(Tipo2.ACERO)) && (defensivo.getTipo1().equals(Tipo1.AGUA) || defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo1().equals(Tipo1.TIERRA) || defensivo.getTipo2().equals(Tipo2.AGUA) || defensivo.getTipo2().equals(Tipo2.ROCA) || defensivo.getTipo2().equals(Tipo2.TIERRA))) {
                eficacia = 1;
            }
            if ((defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo1().equals(Tipo1.DRAGON) || defensivo.getTipo2().equals(Tipo2.DRAGON) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo2().equals(Tipo2.VOLADOR) || defensivo.getTipo1().equals(Tipo1.FUEGO) || defensivo.getTipo2().equals(Tipo2.FUEGO) || defensivo.getTipo1().equals(Tipo1.VENENO) || defensivo.getTipo2().equals(Tipo2.VENENO) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo2().equals(Tipo2.BICHO) || defensivo.getTipo1().equals(Tipo1.ACERO) || defensivo.getTipo2().equals(Tipo2.ACERO))) {
                eficacia = 0.5;
            }
            if ((defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo1().equals(Tipo1.DRAGON) || defensivo.getTipo2().equals(Tipo2.DRAGON) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo2().equals(Tipo2.VOLADOR) || defensivo.getTipo2().equals(Tipo2.FUEGO) || defensivo.getTipo1().equals(Tipo1.FUEGO) || defensivo.getTipo1().equals(Tipo1.VENENO) || defensivo.getTipo2().equals(Tipo2.VENENO) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo2().equals(Tipo2.BICHO) || defensivo.getTipo1().equals(Tipo1.ACERO) || defensivo.getTipo2().equals(Tipo2.ACERO)) && (defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo1().equals(Tipo1.DRAGON) || defensivo.getTipo2().equals(Tipo2.DRAGON) || defensivo.getTipo2().equals(Tipo2.VOLADOR) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo1().equals(Tipo1.FUEGO) || defensivo.getTipo2().equals(Tipo2.FUEGO) || defensivo.getTipo1().equals(Tipo1.VENENO) || defensivo.getTipo2().equals(Tipo2.VENENO) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo2().equals(Tipo2.BICHO) || defensivo.getTipo1().equals(Tipo1.ACERO) || defensivo.getTipo2().equals(Tipo2.ACERO))) {
                eficacia = 0.25;
            } else {
                eficacia = 1;
            }
        } else if (movimiento.getTipo1().equals(Tipo1.ELECTRICO)) {
            if ((defensivo.getTipo1().equals(Tipo1.AGUA) && defensivo.getTipo2().equals(Tipo2.VOLADOR)) || ((defensivo.getTipo1().equals(Tipo1.VOLADOR) && defensivo.getTipo2().equals(Tipo2.AGUA)))) {
                eficacia = 4;
            }
            if (defensivo.getTipo1().equals(Tipo1.AGUA) || defensivo.getTipo2().equals(Tipo2.AGUA) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo2().equals(Tipo2.VOLADOR)) {
                eficacia = 2;
            }


                if ((defensivo.getTipo1().equals(Tipo1.AGUA) || defensivo.getTipo2().equals(Tipo2.AGUA) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo2().equals(Tipo2.VOLADOR)) && (defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo1().equals(Tipo1.ELECTRICO) || defensivo.getTipo2().equals(Tipo2.ELECTRICO) || defensivo.getTipo2().equals(Tipo2.DRAGON) || defensivo.getTipo2().equals(Tipo2.DRAGON))) {
                    eficacia = 1;
                }
                if ((defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo1().equals(Tipo1.DRAGON) || defensivo.getTipo2().equals(Tipo2.DRAGON) || defensivo.getTipo1().equals(Tipo1.ELECTRICO) || defensivo.getTipo2().equals(Tipo2.ELECTRICO))) {
                    eficacia = 0.5;
                }
                if ((defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo1().equals(Tipo1.DRAGON) || defensivo.getTipo2().equals(Tipo2.DRAGON) || defensivo.getTipo1().equals(Tipo1.ELECTRICO) || defensivo.getTipo2().equals(Tipo2.ELECTRICO)) && (defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo1().equals(Tipo1.DRAGON) || defensivo.getTipo2().equals(Tipo2.DRAGON) || defensivo.getTipo1().equals(Tipo1.ELECTRICO) || defensivo.getTipo2().equals(Tipo2.ELECTRICO))) {
                    eficacia = 0.25;
                }
                if (defensivo.getTipo1().equals(Tipo1.TIERRA) || defensivo.getTipo1().equals(Tipo2.TIERRA)) {
                    eficacia = 0;
                } else {
                    eficacia = 1;
                }
            } else if (movimiento.getTipo1().equals(Tipo1.HIELO)) {
                if ((defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo1().equals(Tipo1.TIERRA) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo1().equals(Tipo1.DRAGON)) && (defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo2().equals(Tipo2.TIERRA) || defensivo.getTipo2().equals(Tipo2.VOLADOR) || defensivo.getTipo2().equals(Tipo2.DRAGON))) {
                    eficacia = 4;
                }
                if (defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo1().equals(Tipo1.TIERRA) || defensivo.getTipo2().equals(Tipo2.TIERRA) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo2().equals(Tipo2.VOLADOR) || defensivo.getTipo1().equals(Tipo1.DRAGON) || defensivo.getTipo2().equals(Tipo2.DRAGON)) {
                    eficacia = 2;
                }
                if ((defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo1().equals(Tipo1.TIERRA) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo1().equals(Tipo1.DRAGON) || defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo2().equals(Tipo2.TIERRA) || defensivo.getTipo2().equals(Tipo2.VOLADOR) || defensivo.getTipo2().equals(Tipo2.DRAGON)) && (defensivo.getTipo1().equals(Tipo1.FUEGO) || defensivo.getTipo1().equals(Tipo1.AGUA) || defensivo.getTipo1().equals(Tipo1.HIELO) || defensivo.getTipo2().equals(Tipo2.HIELO) || defensivo.getTipo1().equals(Tipo1.ACERO) || (defensivo.getTipo2().equals(Tipo2.FUEGO) || defensivo.getTipo2().equals(Tipo2.AGUA) || defensivo.getTipo2().equals(Tipo2.ACERO)))) {
                    eficacia = 1;
                }
                if (defensivo.getTipo1().equals(Tipo1.FUEGO) || defensivo.getTipo1().equals(Tipo1.AGUA) || defensivo.getTipo1().equals(Tipo1.HIELO) || defensivo.getTipo1().equals(Tipo1.ACERO) || defensivo.getTipo2().equals(Tipo2.HIELO) || (defensivo.getTipo2().equals(Tipo2.ACERO) || defensivo.getTipo2().equals(Tipo2.AGUA) || defensivo.getTipo2().equals(Tipo2.FUEGO))) {
                    eficacia = 0.5;
                }
                if ((defensivo.getTipo1().equals(Tipo1.FUEGO) || defensivo.getTipo1().equals(Tipo1.AGUA) || defensivo.getTipo1().equals(Tipo1.HIELO) || defensivo.getTipo1().equals(Tipo1.ACERO)) && (defensivo.getTipo2().equals(Tipo2.FUEGO) || defensivo.getTipo2().equals(Tipo2.HIELO) || defensivo.getTipo2().equals(Tipo2.AGUA) || defensivo.getTipo2().equals(Tipo2.ACERO))) {
                    eficacia = 0.25;
                } else {
                    eficacia = 1;
                }
            } else if (movimiento.getTipo1().equals(Tipo1.LUCHA)) {
                if ((defensivo.getTipo1().equals(Tipo1.NORMAL) || defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo1().equals(Tipo1.HIELO) || defensivo.getTipo1().equals(Tipo1.SINIESTRO) || defensivo.getTipo1().equals(Tipo1.ACERO)) && (defensivo.getTipo2().equals(Tipo2.NORMAL) || defensivo.getTipo2().equals(Tipo2.ROCA) || defensivo.getTipo2().equals(Tipo2.HIELO) || defensivo.getTipo2().equals(Tipo2.SINIESTRO) || defensivo.getTipo2().equals(Tipo2.ACERO))) {
                    eficacia = 4;
                }
                if (defensivo.getTipo1().equals(Tipo1.NORMAL) || defensivo.getTipo2().equals(Tipo2.NORMAL) || defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo2().equals(Tipo2.ROCA) || defensivo.getTipo1().equals(Tipo1.HIELO) || defensivo.getTipo2().equals(Tipo2.HIELO) || defensivo.getTipo1().equals(Tipo1.ACERO) || defensivo.getTipo2().equals(Tipo2.ACERO) || defensivo.getTipo1().equals(Tipo1.SINIESTRO) || defensivo.getTipo2().equals(Tipo2.SINIESTRO)) {
                    eficacia = 2;
                }
                if ((defensivo.getTipo1().equals(Tipo1.NORMAL) || defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo1().equals(Tipo1.HIELO) || defensivo.getTipo1().equals(Tipo1.ACERO) || defensivo.getTipo1().equals(Tipo1.SINIESTRO) || defensivo.getTipo2().equals(Tipo2.NORMAL) || defensivo.getTipo2().equals(Tipo2.ROCA) || defensivo.getTipo2().equals(Tipo2.HIELO) || defensivo.getTipo2().equals(Tipo2.ACERO) || defensivo.getTipo2().equals(Tipo2.SINIESTRO)) && (defensivo.getTipo1().equals(Tipo1.VENENO) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo1().equals(Tipo1.PSIQUICO) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo1().equals(Tipo1.HADA) || defensivo.getTipo2().equals(Tipo2.VENENO) || defensivo.getTipo2().equals(Tipo2.VOLADOR) || defensivo.getTipo2().equals(Tipo2.PSIQUICO) || defensivo.getTipo2().equals(Tipo2.BICHO) || defensivo.getTipo2().equals(Tipo2.HADA))) {
                    eficacia = 1;
                }
                if ((defensivo.getTipo1().equals(Tipo1.VENENO) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo1().equals(Tipo1.PSIQUICO) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo1().equals(Tipo1.HADA) || defensivo.getTipo2().equals(Tipo2.VENENO) || defensivo.getTipo2().equals(Tipo2.VOLADOR) || defensivo.getTipo2().equals(Tipo2.PSIQUICO) || defensivo.getTipo2().equals(Tipo2.BICHO) || defensivo.getTipo2().equals(Tipo2.HADA))) {
                    eficacia = 0.5;
                }
                if ((defensivo.getTipo1().equals(Tipo1.VENENO) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo1().equals(Tipo1.PSIQUICO) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo1().equals(Tipo1.HADA) || defensivo.getTipo2().equals(Tipo2.VENENO) || defensivo.getTipo2().equals(Tipo2.VOLADOR) || defensivo.getTipo2().equals(Tipo2.PSIQUICO) || defensivo.getTipo2().equals(Tipo2.BICHO) || defensivo.getTipo2().equals(Tipo2.HADA)) && (defensivo.getTipo1().equals(Tipo1.VENENO) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo1().equals(Tipo1.PSIQUICO) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo1().equals(Tipo1.HADA) || defensivo.getTipo2().equals(Tipo2.VENENO) || defensivo.getTipo2().equals(Tipo2.VOLADOR) || defensivo.getTipo2().equals(Tipo2.PSIQUICO) || defensivo.getTipo2().equals(Tipo2.BICHO) || defensivo.getTipo2().equals(Tipo2.HADA))) {
                    eficacia = 0.25;
                }
                if (defensivo.getTipo1().equals(Tipo1.FANTASMA) || defensivo.getTipo1().equals(Tipo2.FANTASMA)) {
                    eficacia = 0;
                } else {
                    eficacia = 1;
                }

            } else if (movimiento.getTipo1().equals(Tipo1.VENENO)) {


                if ((defensivo.getTipo1().equals(Tipo1.PLANTA) && defensivo.getTipo2().equals(Tipo2.HADA)) || ((defensivo.getTipo1().equals(Tipo1.HADA) && defensivo.getTipo2().equals(Tipo2.PLANTA)))) {
                    eficacia = 4;
                }

                if (defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo1().equals(Tipo1.HADA) || defensivo.getTipo2().equals(Tipo2.HADA)) {
                    eficacia = 2;
                }

                if ((defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo1().equals(Tipo1.HADA) || defensivo.getTipo2().equals(Tipo2.HADA)) && (defensivo.getTipo1().equals(Tipo1.VENENO) || defensivo.getTipo2().equals(Tipo2.VENENO) || defensivo.getTipo1().equals(Tipo1.TIERRA) || defensivo.getTipo2().equals(Tipo2.TIERRA) || defensivo.getTipo2().equals(Tipo2.ROCA) || defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo1().equals(Tipo1.FANTASMA) || defensivo.getTipo2().equals(Tipo2.FANTASMA))) {
                    eficacia = 1;
                }
                if ((defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo2().equals(Tipo2.BICHO))) {
                    eficacia = 0.5;
                }

                if ((defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo1().equals(Tipo1.BICHO)) && (defensivo.getTipo2().equals(Tipo2.PLANTA) || defensivo.getTipo2().equals(Tipo2.BICHO))) {
                    eficacia = 0.25;
                }

                if (defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo1().equals(Tipo2.VOLADOR)) {
                    eficacia = 0;

                } else {
                    eficacia = 1;
                }
            } else if (movimiento.getTipo1().equals(Tipo1.TIERRA)) {

                if ((defensivo.getTipo1().equals(Tipo1.FUEGO) || defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo1().equals(Tipo1.VENENO) || defensivo.getTipo1().equals(Tipo1.ELECTRICO) || defensivo.getTipo1().equals(Tipo1.ACERO)) && (defensivo.getTipo2().equals(Tipo2.FUEGO) || defensivo.getTipo2().equals(Tipo2.ROCA) || defensivo.getTipo2().equals(Tipo2.VENENO) || defensivo.getTipo2().equals(Tipo2.ELECTRICO) || defensivo.getTipo2().equals(Tipo2.ACERO))) {
                    eficacia = 4;
                }

                if (defensivo.getTipo1().equals(Tipo1.FUEGO) || defensivo.getTipo2().equals(Tipo2.FUEGO) || defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo2().equals(Tipo2.ROCA) || defensivo.getTipo1().equals(Tipo1.VENENO) || defensivo.getTipo2().equals(Tipo2.VENENO) || defensivo.getTipo1().equals(Tipo1.ACERO) || defensivo.getTipo2().equals(Tipo2.ACERO) || defensivo.getTipo1().equals(Tipo1.ELECTRICO) || defensivo.getTipo2().equals(Tipo2.ELECTRICO)) {
                    eficacia = 2;
                }

                if ((defensivo.getTipo1().equals(Tipo1.FUEGO) || defensivo.getTipo1().equals(Tipo1.ROCA) || defensivo.getTipo1().equals(Tipo1.VENENO) || defensivo.getTipo1().equals(Tipo1.ACERO) || defensivo.getTipo1().equals(Tipo1.ELECTRICO) || defensivo.getTipo2().equals(Tipo2.FUEGO) || defensivo.getTipo2().equals(Tipo2.ROCA) || defensivo.getTipo2().equals(Tipo2.VENENO) || defensivo.getTipo2().equals(Tipo2.ACERO) || defensivo.getTipo2().equals(Tipo2.ELECTRICO)) && (defensivo.getTipo1().equals(Tipo1.PLANTA) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo2().equals(Tipo2.BICHO) || defensivo.getTipo2().equals(Tipo2.PLANTA))) {
                    eficacia = 1;
                }

                if ((defensivo.getTipo1().equals(Tipo1.VENENO) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo1().equals(Tipo1.PSIQUICO) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo1().equals(Tipo1.HADA) || defensivo.getTipo2().equals(Tipo2.VENENO) || defensivo.getTipo2().equals(Tipo2.VOLADOR) || defensivo.getTipo2().equals(Tipo2.PSIQUICO) || defensivo.getTipo2().equals(Tipo2.BICHO) || defensivo.getTipo2().equals(Tipo2.HADA))) {
                    eficacia = 0.5;
                }

                if ((defensivo.getTipo1().equals(Tipo1.VENENO) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo1().equals(Tipo1.PSIQUICO) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo1().equals(Tipo1.HADA) || defensivo.getTipo2().equals(Tipo2.VENENO) || defensivo.getTipo2().equals(Tipo2.VOLADOR) || defensivo.getTipo2().equals(Tipo2.PSIQUICO) || defensivo.getTipo2().equals(Tipo2.BICHO) || defensivo.getTipo2().equals(Tipo2.HADA)) && (defensivo.getTipo1().equals(Tipo1.VENENO) || defensivo.getTipo1().equals(Tipo1.VOLADOR) || defensivo.getTipo1().equals(Tipo1.PSIQUICO) || defensivo.getTipo1().equals(Tipo1.BICHO) || defensivo.getTipo1().equals(Tipo1.HADA) || defensivo.getTipo2().equals(Tipo2.VENENO) || defensivo.getTipo2().equals(Tipo2.VOLADOR) || defensivo.getTipo2().equals(Tipo2.PSIQUICO) || defensivo.getTipo2().equals(Tipo2.BICHO) || defensivo.getTipo2().equals(Tipo2.HADA))) {
                    eficacia = 0.25;
                }
                if (defensivo.getTipo1().equals(Tipo1.FANTASMA) || defensivo.getTipo1().equals(Tipo2.FANTASMA)) {
                    eficacia = 0;

                } else {
                    eficacia = 1;
                }

            }
            return eficacia;
        }
    }

