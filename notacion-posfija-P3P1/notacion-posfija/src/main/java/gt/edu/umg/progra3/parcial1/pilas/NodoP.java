package gt.edu.umg.progra3.parcial1.pilas;

import java.util.ArrayList;
import java.util.List;

public class NodoP implements Pila{

    private List<String> pivote = new ArrayList<>();

    @Override
    public void push(String item) {
        pivote.add(item);
    }

    @Override
    public String pop() {
        return pivote.remove(pivote.size()-1);
    }

    @Override
    public String peek() {
        return pivote.remove(pivote.size()-1);
    }

    @Override
    public int size() {
        return pivote.size();
    }

    @Override
    public boolean isEmpty() {
        return pivote.isEmpty();
    }
}
