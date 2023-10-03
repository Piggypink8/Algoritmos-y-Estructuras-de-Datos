/* Devuelva en una lista la suma de los datos contenidos
en los nodos del árbol que tienen un número impar de hijos.
Realice un recorrido en postOrden
 * 
 */

public class Parcial3 {
    public ListaGenerica<Integer> resolver(ArbolGeneral<Integer> a){
        ListaGenerica<Integer> l = new ListaEnlazadaGenerica<>();
        if(!a.esVacio()){
            resolver(a, l);
        }
        return l;
    }
    
    private void resolver(ArbolGeneral<Integer> a, ListaGenerica<Integer> l) {
        ListaGenerica<Integer> lhijos = a.getHijos();
        lhijos.comenzar();
        ArbolGeneral<Integer> aux;
        
        while(!lhijos.fin()){
            aux = lhijos.proximo();
            resolver(aux,l);
        }

        if(lhijos.tamanio() % 2 != 0){
            l.agregarFinal(sumador(a));
        }
   
    }
    // sumador que toma los hijos del nodo y los retorna la suma de ellos. 
    private int sumador(ArbolGeneral<Integer> a){
        ListaGenerica<Integer> lhijos = a.getHijos();
        lhijos.comenzar();
        int suma = 0;
        while(!lhijos.fin()){
            suma += lhijos.proximo().getDato();
        }
        return suma;
    }
     
}
