/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author cadav
 */
public class NodoDoble {
    
    private Palabra dato;
    private NodoDoble ligaIzq;
    private NodoDoble ligaDer;

    public NodoDoble(Palabra dato) {
        this.dato = dato;
        ligaIzq = ligaDer = null;
    }

    public Palabra getDato() {
        return dato;
    }

    public NodoDoble getLigaIzq() {
        return ligaIzq;
    }

    public void setLigaIzq(NodoDoble ligaIzq) {
        this.ligaIzq = ligaIzq;
    }

    public NodoDoble getLigaDer() {
        return ligaDer;
    }

    public void setLigaDer(NodoDoble ligaDer) {
        this.ligaDer = ligaDer;
    }
    
    
}
  