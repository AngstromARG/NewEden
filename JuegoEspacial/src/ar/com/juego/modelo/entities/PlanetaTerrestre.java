package ar.com.juego.modelo.entities;

import ar.com.juego.modelo.Estado;
import ar.com.juego.modelo.Estructura;
import ar.com.juego.modelo.Planeta;

public class PlanetaTerrestre extends Planeta {


    public PlanetaTerrestre(String nombre, Estructura estructura) {
        super(nombre, estructura);
        this.setCantDefensas(25000);
        this.setCapacitadProd(8);
        this.setPoblacion(1000000);
        this.setEstado(Estado.COLONIZADO);
    }
}
