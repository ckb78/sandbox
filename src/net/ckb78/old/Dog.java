package net.ckb78.old;

public class Dog {
    String breed;
    boolean hasOwner;
    int age;
    String color;

    public Dog(String dogBreed, boolean dogOwned, int dogYears, String furColor) {
        System.out.println("Constructor invoked!");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
        color = furColor;
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        System.out.println();
        Dog fido = new Dog("poodle", false, 4, "white");
        Dog nunzio = new Dog("shiba inu", true, 12, "brown");
        Dog satan = new Dog("hellhound", false, 1000, "black as night itself");

        boolean isFidoOlder = fido.age > nunzio.age;
        int totalDogYears = nunzio.age + fido.age;
        int totalDogYears2 = totalDogYears + satan.age;

        System.out.println();
        System.out.println("Three dogs created: a " + fido.breed + ", a " + nunzio.breed + " and a " + satan.breed + ".");
        System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
        System.out.println("The total age of the normal dogs is: " + totalDogYears);
        System.out.println("However, since Satan is " + satan.age + " years old, the total age of all dogs is " + totalDogYears2 + ".");
        System.out.println("Satan, being a " + satan.breed + ", has a fur color of " + satan.color + ".");
        System.out.println("Main method finished");
    }
}




