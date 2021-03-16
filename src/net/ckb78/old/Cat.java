package net.ckb78.old;

public class Cat {
    public int age, weight, strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        double winChance = 0.75;
        winChance = winChance + ((double)this.strength / (double)anotherCat.strength);
        winChance = winChance + ((double)this.weight / (double)anotherCat.weight);
        winChance =  winChance + ((double)anotherCat.age / (double)this.age);
        winChance = (winChance / 4);
        return (winChance > 1);
    }

    public static void main(String[] args) {
        Cat oldCat = new Cat();
        oldCat.weight = 20;
        oldCat.strength = 22;
        oldCat.age = 4;

        Cat youngCat = new Cat();
        youngCat.weight = 20;
        youngCat.strength = 20;
        youngCat.age = 3;
    }
}