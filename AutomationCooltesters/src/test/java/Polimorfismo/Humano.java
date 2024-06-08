package Polimorfismo;

public class Humano extends Animal{
    @Override // Annotation
    public void speak() {
        System.out.println("Habla");
    }
}
