package upcasting;

class Animal {

    void emiteSom() {
        System.out.println("emite");
    }
}

class Cachorro extends Animal {

    void latir() {
        System.out.println("AU");
    }

}

class Gato extends Animal {

    @Override
    void emiteSom() {
        System.out.println("Miau");
    }
}

class Main {
    public static void main(String[] args) {

        Animal animal = new Cachorro();

        Animal animal2 = new Gato();
        animal2.emiteSom();
    }
}
