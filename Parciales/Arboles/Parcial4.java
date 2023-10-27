
public class Parcial4 {
    public ListaGenerica<Integer> devolverCamino(ArbolGeneral<Integer> a){
        ListaGenerica<Integer> lA = new ListaGenericaEnlazada<Integer>();
        ListaGenerica<Integer> lF = new ListaGenericaEnlazada<Integer>();
        if(!a.esVacio()){
            devolverCamino(a, lA, lF);
        }

    }
    private void devolverCamino(ArbolGeneral<Integer> a, ListaGenerica<Integer> lA,ListaGenerica<Integer> lF){
        lA.agregarFinal(a.getDato)
        ListaGenerica<Integer> lhijos = a.getHijos();
        lhijos.comenzar();
        ArbolGeneral<Integer> aux;
        
        if(a.esHoja()){
            if(lA.tamanio() > lF.tamanio())
                clonar(lA,lF);

        } else {
            while(!lhijos.fin()){
                aux = lhijos.proximo();
                devolverCamino(aux, lA, lF);
            }
        lA.eliminar(lA.tamanio());
    }

    private void clonar(ListaGenerica<Integer> lA,ListaGenerica<Integer> lF){
        lA.comenzar();
        while(!lA.fin()){
            lF.agregarFinal(lA.proximo());
        }
    }
    
}
