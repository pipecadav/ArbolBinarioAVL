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
public class ClaseArbol {
    
    NodoDoble raiz;
    Palabra dato;
    
  public int insertar (String cadena){
      Palabra dato = new Palabra(cadena);
      if(raiz == null){
          raiz = new NodoDoble(dato);
          return 1;
      }else{
          NodoDoble aux = raiz;
          while(aux != null){
              if(aux.getDato().getDato().compareTo(cadena) == 0){
                  aux.getDato().aumentar();
                  return 0;
              }else if(aux.getDato().getDato().compareTo(cadena) > 0){
                  
              }
          }
      }
      return 0;
  }  
    
}
