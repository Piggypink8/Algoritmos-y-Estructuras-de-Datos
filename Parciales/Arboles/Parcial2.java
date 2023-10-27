/* Devuelva una lista con los valores de los nodos que tengan el mismo numero de 
descendientes tanto por su subárbol izquierdo como por su subárbol derecho */

public class Parcial2 {
    public ListaGenerica<Integer> resolver (ArbolBinario<Integer> arbol){
        ListaGenerica<Integer> l = new ListaGenericaEnlazada<>();
        if(!arbol.esVacio()){
            resolver(arbol,l);
        }
        return l;
    }
    private void resolver(ArbolBinario<Integer> a, ListaGenerica<Integer> l){
        int cantHI = 0;
        int cantHD = 0;
        if(a.esHoja()){
            l.agregarFinal(a.getDato());
        } else {

            if(a.tieneHI()){ 
                cantHI = buscar(a.getHI());
                resolver(a.getHI(),l);
            }

            if(a.tieneHD()){ 
                cantHD = buscar(a.getHD());
                resolver(a.getHD(), l);
            }

            if(cantHD == cantHI)
                l.agregarFinal(a.getDato);
        }

    }

    private int buscar(ArbolBinario<Integer> a){
        int cant = 1;

        if(a.tieneHI())
            cant = cant + buscar(a.getHI());
        if(a.tieneHD())
            cant = cant + buscar(a.getHD());
        
        return cant;
    }
}
