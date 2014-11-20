/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a09001005
 */
public abstract class Vista implements Observer {

    private Modelo modelo;

    public Vista(Modelo modelo, int idEvento) {
        this.modelo = modelo;
        this.modelo.registrarObservador(this, idEvento);
    }

    @Override
    public void actualizar(Object o) {
        System.out.println("si actualiza, vista");
    }


    public abstract void activar();

    public abstract void desplegar();
}
