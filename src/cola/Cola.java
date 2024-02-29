package cola;

/**
 *
 * @author linan
 */
public class Cola {
    
    public static void main(String[] args) {
        Doble<String> cola = new Doble<>();
        System.out.println("La cola esta vacia? " + cola.isEmpty());
        System.out.println("El tamano es " + cola.size());
        cola.adqueue("Libro 1");
        cola.adqueue("Libro 2");

        System.out.println("La cola esta vacia? " + cola.isEmpty());
        System.out.println("El tamaño " + cola.size());

        for (String s : cola) {
            System.out.println(s.toString());
        }
        //Se elimina el ultimo   
        System.out.println("Se elimino toda la cola" + cola.dequeue2());
        for (String s : cola) {
            System.out.println(s.toString());
        }
        //revisa si esta llena o no 
        System.out.println("Se atendio a  " + cola.dequeue());
        for (String s : cola) {
            System.out.println(s.toString());
        }
        
        cola.adqueue("Libro 3");
        cola.adqueue("Libro 4");
        cola.adqueue("Libro 5");
        cola.adqueue("Libro 6");
        System.out.println("La cola esta vacia? " + cola.isEmpty());
        System.out.println("El tamaño " + cola.size());

        for (String s : cola) {
            System.out.println(s.toString());
        }
        //eliminamos el primero 
        System.out.println("Se atendio a  " + cola.dequeue());
        for (String s : cola) {
            System.out.println(s.toString());
        }

    }
}