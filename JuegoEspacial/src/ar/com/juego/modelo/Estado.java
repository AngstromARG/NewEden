/**
 *
 */
package ar.com.juego.modelo;

/**
 * @author beetoven.desir
 */
public enum Estado {

    COLONIZADO("C"), NUETRO("N"), ENEMIGO("E"), INESTABLE("I");

    public final String abreviacion;

    private Estado(String abre) {
        this.abreviacion = abre;
    }

    /**
     * @return
     */
    public String getAbreviacion() {
        return abreviacion;
    }
}
