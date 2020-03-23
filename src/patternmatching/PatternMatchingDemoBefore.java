package patternmatching;

public class PatternMatchingDemoBefore {

    public static void main(String[] args) {

        var bello = new Dog();
        pet(bello);

        var kitty = new Cat();
        pet(kitty);
    }

    private static void pet(Animal animal) {
        if(animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.bark();
        } else if(animal instanceof Cat) {
            Cat cat = (Cat)animal;
            cat.meow();
        }
    }
}
