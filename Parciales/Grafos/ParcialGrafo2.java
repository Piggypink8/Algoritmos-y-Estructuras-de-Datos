public ListaGenericaEnlazada<String> tactica(Grafo<String> jugadores, String arquero, String delantero, double potencia){
    boolean[] visitados = new boolean[Grafo.getListaVertices().tamanio()+1];
    Vertice<String> inicio = buscarVertice(arquero);
    Vertice<String> destino = buscarVertice(delantero);
    ListaGenerica<String> lisF = new ListaGenericaEnlazada<>();
    if(inicio.getDato().equals(arquero) && destino.getDato().equals(delantero)){
        ListaGenerica<String>> lisA = new ListaGenericaEnlazada<>();
        double suma = 0;
        
        encontrarCaminos(inicio, destino, potencia, suma, visitados, lisA, lisF,)
    }

    return lisF;
}

public boolean encontrarCaminos(Vertice<String> vertice, Vertice<String> destino, double potencia,
                            double suma, boolean[] visitados, ListaGenerica<String> lisA, ListaGenerica<String> lisF){
    visitados[vertice.getPosicion()] = true;
    lisA.agregarFinal(vertice.getDato());
    boolean ok = false;
    if(vertice.getDato().equals(destino.getDato())){
        if((suma / lisA.tamanio()) >= potencia)
            clonar(lisF,lisA);
            return true;
    } else{
        ListaGenerica<Arista<String>> ady = vertice.getListaAdyacentes();
        ady.comenzar()
        Arista<T> arista = null;
        while(!ady.fin()){
            arista = ady.proximo();
            if((!visitados[arista.getVerticeDestino().getPosicion()]))
                ok = encontrarCaminos(arista.getVerticeDestino(), destino, potencia, (suma + arista.getPeso()), visitados, lisA, lisF);

        }
    }
    lisA.eliminarEn(lisA.tamanio());
    visitados[vertice.getPosicion()] = false;
    return ok;
}