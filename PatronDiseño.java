// Interfaz para los comportamientos de sonido
interface Sonido {
    void hacerSonido();
}

// Implementaciones concretas de los comportamientos de sonido
class Ladrido implements Sonido {
    @Override
    public void hacerSonido() {
        System.out.println("Woof! Woof!");
    }
}

class Maullido implements Sonido {
    @Override
    public void hacerSonido() {
        System.out.println("Meow!");
    }
}

class Rugido implements Sonido {
    @Override
    public void hacerSonido() {
        System.out.println("Roar!");
    }
}

// Clase principal Animal
class Animal {
    private Sonido sonido; // Referencia a la interfaz Sonido
    
    public void setSonido(Sonido sonido) {
        this.sonido = sonido;
    }
    
    public void emitirSonido() {
        sonido.hacerSonido(); // Delegar el comportamiento a la implementación concreta
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal();
        perro.setSonido(new Ladrido());
        perro.emitirSonido(); // Imprime "Woof! Woof!"

        Animal gato = new Animal();
        gato.setSonido(new Maullido());
        gato.emitirSonido(); // Imprime "Meow!"

        Animal leon = new Animal();
        leon.setSonido(new Rugido());
        leon.emitirSonido(); // Imprime "Roar!"
    }
}
