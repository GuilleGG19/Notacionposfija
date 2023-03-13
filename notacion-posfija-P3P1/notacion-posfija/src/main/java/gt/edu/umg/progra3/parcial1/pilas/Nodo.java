package gt.edu.umg.progra3.parcial1.pilas;

import javax.xml.soap.Node;

public class Nodo {
    public String valor;
    public Node siguiente;

    public Nodo(String valor, Nodo cima){
        this.valor = valor;
        this.siguiente = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }

    public String getItem() {
        return valor;
    }
}
