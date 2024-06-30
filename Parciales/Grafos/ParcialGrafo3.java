public ListaGenerica<String> caminoDistanciaMaxima(Grafo<String> ciudades, String origen, String destino, int distanciaMaxima){
    Vertice<String> verticeO = buscarVertice(ciudades,origen);
    Vertice<String> verticeD = buscarVertice(ciudades,destino);
    boolean[] visitados = new boolean[ciudades.getListaVertices().tamanio()+1];
    for(int i= 1; i <= ciudades.getListaVertices().tamanio() ; i++){
        visitados[i] = false;
    }
    ListaGenerica<String> lisF = new ListaGenericaEnlazada<>();
    if(verticeO.getDato().equals(origen) && verticeD.getDato().equals(destino)){
        ListaGenerica<String> lisA = new ListaGenericaEnlazada<>();
        recorrerCiudades(verticeO,verticeD,distanciaMaxima,lisA,LisF,visitados);
    }

    return lisF;
}

private void recorrerCiudades(origen,destino,int distanciaMaxima, lisA, lisF, visitados){
    visitados[origen.getPosicion()] = true;
    lisA.agregarFinal(origen.getDato);
    if(origen.getDato().equals(destino.getDato())){
        copiar(lisA,lisF);
    } else {
        ListaGenerica<Arista<String>> ady = origen.getListaAdyacentes();
        Arista<String> a = null;
        while(!ady.fin()){
            a = ady.proximo();
            if((!visitados[a.getVerticeDestino().getPosicion()]) && a.getPeso() <= 80)
                recorrerCiudades(a.getVerticeDestino(),destino, distanciaMaxima, lisA, lisF, visitados);
        }
    }
    visitados[origen.getPosicion()] = false;
    lisA.eliminarEn(lisA.tamanio());
}


private void copiar(ListaGenerica<String> lisA, ListaGenerica<String> lisF){
    lisA.comenzar()
    while(!lisA.fin()){
        lisF.agregarFinal(lisA.proximo());
    }
}

private Vertice<String> buscarVertice(Grafo<String> ciudades, String ciudad){
    ListaGenerica<Vertice<String>> ciudades = ciudades.getListaVertices();
    Vertice<String> vertice = null;
    boolean ok = false;
    while(!ciudades.fin() && !ok){
        vertice = ciudades.proximo();
        if(vertice.getDato().equals(ciudad))
            ok = true;
    }
    return vertice;
}