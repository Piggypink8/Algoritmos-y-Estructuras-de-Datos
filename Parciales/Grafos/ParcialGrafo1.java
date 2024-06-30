public ListaGenerica<String> resolver(Grafo<String> sitios, String origen, int maxTiempo){
    boolean[] marca = new boolean[sitios.listaDeVertices().tamanio()+1];
    ListaGenerica<Vertice<String>> lis = null;
    Vertice<String> vertice = existeOrigen(sitios,origen);
    if(vertice.getDato().equals(origen)){
        for(int i = 1; i <= sitios.listaDeVertices().tamanio(); i++){
            marca[i] = false;
        }
        ListaGenerica<String> listA = new ListaGenericaEnlazada<>();
        ListaGenerica<String> listF = new ListaGenericaEnlazada<>();
        Resultado resul = new Resultado();
        recorrerGrafo(sitios,vertice,maxTiempo,listA,ListF,marca);
    }
    return listF
}

private void recorrerGrafo(resul,sitios,v,maxTiempo,listA,listF,marca){
    marca[v.getPosicion()] = true;
    listA.agregarFinal(v);
    if(listA.tamanio() > listF.tamanio()){
        if(resul.getTiempo() < maxTiempo){  //no importa el tiempo si una es mas larga que la otra, solo si son iguales
            resul.getListF().clonar(listA);
            resul.setTiempo(maxTiempo);
        }
    ListaGenerica<Arista<T>> ady = v.getListaAdyacentes();
    ady.comenzar();
    Arista<T> a = null;
    while(!ady.fin()){
        a = ady.proximo();
        if(!marca[a.getVerticeDestino().getPosicion()] && ((maxTiempo - a.getDato()) >= 0))
            recorrerGrafo(resul,sitios,a.getVerticeDestino(),maxTiempo-a.getPeso(),listA,marca)

    }
    /*  SOLUCION 2: ta mal, puede que el camino pase por un vertice de peso mayor pero que termine siendo mas largo
    int menorMax = 99999;
    int menor;
    Arista<T> aristaMin= null;
    while(!ady.fin()){
        a = ady.proximo();
        menor = a.getDato().getTiempo();
        if(!marca[a.getVerticeDestino().getPosicion] && (a.getVerticeDestino().getTiempo() < menorMax))
            menorMax = menor;
            aristaMin = a;
    }
    recorrerGrafo(resul,sitios,a.getVerticeDestino(),maxTiempo-a.getPeso(),listA,marca);
    */
    marca[v.getPosicion()] = false; 
    listA.eliminarEn(listA.tamanio());

}