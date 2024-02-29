package cola;

import java.util.Iterator;

/**
 *
 * @author linan
 */
public class Doble<Item> implements Iterable <Item> {

    //atributos
    Node primero, ultimo;

    private class Node {

        Item item;
        Node next,previous;

        //constructor
        private Node() {
            this.next = null;
            this.previous = null;
            this.item = null;
        }

        private Node(Item item) {
            this.item = item;
            this.next = null;
            this.previous = null;
        }

    }

    public Doble() {
        primero = null;
        ultimo = null;
        
    }
 public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        Node recorre = primero;
        return size(recorre);
    }

    public int size(Node temp) {
        if (temp == null) {
            return 0;
        }
        return 1 + size(temp.next);
    }

    public void adqueue(Item item) {
        Node nodo = new Node(item);
        if (this.isEmpty()) {
            primero = nodo;
            ultimo = nodo;
        } else {
            ultimo.next = nodo;
            nodo.previous=ultimo;
            ultimo = nodo;
            
        }
    }

    public Item dequeue() {
       
        if (primero == null) {
            System.out.println("La cola esta vacia");
            return null;
        }
        Node temp = primero;
  
        if (temp.next == null) {
            primero = null;
            ultimo = null;
            return temp.item;
        }
        Node penultimo= ultimo.previous;
        penultimo.next=null;
        ultimo.previous=null;
        Item item=ultimo.item;
        ultimo=penultimo;
        return item;
    }
    
        public Item dequeue2() {
       
        if (ultimo == null) {
            System.out.println("La cola esta vacia");
            return null;
        }
        Node temp = ultimo;
  
        if (temp.next == null) {
            primero = null;
            ultimo = null;
            return temp.item;
        }
        Node penultimo= primero.previous;
        penultimo.next=null;
        primero.previous=null;
        Item item=primero.item;
        primero=penultimo;
        return item;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {


        private Node actual = ultimo;

        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public Item next() {
            Item item = actual.item;
            actual = actual.previous;
            return item;
        }

    }

    //Mostrar lista
    public void mostrarLista() {
        Node temp = primero;
        mostrarLista(temp);
    }

    private void mostrarLista(Node temp) {
        if (temp == null) {
            return;
        }
        System.out.println("valor: " + temp.item.toString());
        mostrarLista(temp.next);
    }

}