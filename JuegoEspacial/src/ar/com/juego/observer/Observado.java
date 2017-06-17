package ar.com.juego.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by beetoven.desir on 6/6/2017.
 */
public class Observado {

    private List<IObserver> observadores = new ArrayList<IObserver>();

    public void registrarObservador(IObserver observer) {
        this.observadores.add(observer);
    }

    public void actualizarObservadores() {
        for (IObserver o : observadores) {
            o.actualizar();
        }
    }

    public void deleteObsevador(IObserver observador) {
        this.observadores.remove(observador);
    }
}
