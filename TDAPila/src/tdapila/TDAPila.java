package tdapila;

public class TDAPila {

    public static void main(String[] args) {
        ListaPila<String> miPila = new ListaPila<>();

        System.out.println("" + miPila.empty()); 

        miPila.push("uno");
        miPila.push("dos");
        miPila.push("Tres");
        miPila.push("jejes");

        System.out.println("Total de elementos: " + miPila.getNelementos()); 
        System.out.println("Cima: " + miPila.peek()); 

        System.out.println("Extraido: " + miPila.pop()); 
        System.out.println("Nueva Cima: " + miPila.peek()); 
    }
    
}
