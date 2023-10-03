public class Parcial1{
   
    public ListaGenerica<Character> caminosPares(ArbolGeneral<Character> arbol){
        ListaGenerica<Integer> lisF= new ListaGenericaEnlazada<>();
        ListaGenerica<Integer> lisAct = new ListaGenericaEnlazada<>();
        if(!a.esVacio()){
            caminosPares(arbol,lisAct,lisF);
        }
        return lisF;
    }


    private void caminosPares(ArbolGeneral<Character> a,ListaGenerica<Character> lA,ListaGenerica<Character> lF ){
        lA.agregarFinal(a.getDato());
        if(a.esHoja()){
            if((lA.tamanio() % 2) = 0){
                lF.agregarFinal(lA);
            }
       } else {
            ListaGenerica<Character> l = a.getHijos();
            l.comenzar();
            ArbolGeneral<Character> aux;
            while(!l.fin()){
                aux = l.proximo();
                caminosPares(aux,lA,lF);
            }
       }
       lA.eliminar();
    }


}

/*
 * 
    public ListaGenerica<Integer> crearLista(ArbolGeneral<Integer> a, int n){
        ListaGenerica<Integer> lis = new ListaGenericaEnlazada<>();
        if(!a.esVacio()){
            crearLista(a,n,lis);
        }
    }
    
    private boolean crearLista(ArbolGeneral<Integer> a, int n, ListaGenerica<Integer> l){
        ListaGenerica<ArbolGeneral<Integer>> lis = a.getHijos();
        boolean ok = false;
        if(a.esHoja()){
            if(a.getDato() > n){ 
                l.agregarFinal(a.getDato());
                return true;
            }
        } else {
            ArbolGeneral<Integer> aux;
            while(!lis.fin() && !ok){
                aux = lis.proximo();
                ok = crearLista(aux,n,l);
            }   
        }
        return false;
 */
/*
 recorrerPosOrdenAG(ArbolGeneral<Integer> a){
        ListaGenerica<ArbolGeneral<Integer>> lis = a.getHijos();

        ArbolGeneral<Integer> aux;
        while(!lis.fin()){
            aux = lis.proximo();
            recorrerPosOrdenAG(aux);
        }
         System.out.println(a.getDato());
    }
*/

/*
    recorrerPreOrdenAG(ArbolGeneral<Integer> a){
        ListaGenerica<ArbolGeneral<Integer>> lis = a.getHijos();
       
        System.out.println(a.getDato());

        ArbolGeneral<Integer> aux;
        while(!lis.fin()){
            aux = lis.proximo();
            recorrerPosOrdenAG(aux);
        }
           
    }
 */

 /*   public void recorrerPreOrdenAB (ArbolBinario<Integer> a){
        
        System.out.println(a.getDato());

        if(a.tieneHI())
            recorrerPreOrden(a.getHI())
        
        if(a.tieneHD())
            recorrerPreOrden(a.getHD())

*/

 /*   public void recorrerPosOrdenAB (ArbolBinario<Integer> a){   

        if(a.tieneHI())
            recorrerPreOrden(a.getHI())
        
        if(a.tieneHD())
            recorrerPreOrden(a.getHD())

        System.out.println(a.getDato());

        }

*/

 /*   public void recorrerInOrdenAB (ArbolBinario<Integer> a){   

        if(a.tieneHI())
            recorrerPreOrden(a.getHI())

        System.out.println(a.getDato());

        if(a.tieneHD())
            recorrerPreOrden(a.getHD())        
        }
*/
