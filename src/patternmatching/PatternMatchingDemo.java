package patternmatching;

public class PatternMatchingDemo {

    public static void main(String[] args) {

        var bello = new Dog();
        pet(bello);

        var kitty = new Cat();
        pet(kitty);
    }

    private static void pet(Animal animal) {
        if(animal instanceof Dog dog) {
            dog.bark();
        } else if(animal instanceof Cat cat) {
            cat.meow();
        }
    }
}
