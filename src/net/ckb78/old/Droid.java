package net.ckb78.old;

public class Droid {

    // Instance fields
    int batteryLevel;
    String name;

    // Constructor method
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
        System.out.println("One new droid created. Designation: " + name + ".\nBattery charged to " + batteryLevel + "%.");
    }

    // toString method
    public String toString(){
        return "\nDroid name designation: " + name + ".\n";
    }

    // energyReport method
    public void energyReport(){
        System.out.println("*Droid designated " + name + " has " + batteryLevel + "% power left in its battery.");
    }

    // performTask method
    public void performTask(String task){
        System.out.println("*Droid designated " + name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    // energyTransfer method
    public void energyTransfer(int power, Droid transferTo){
        batteryLevel -= power;
        transferTo.batteryLevel += power;
        System.out.println("*" + name + " transfered " + power + "% power to " + transferTo.name + ".");
        System.out.println();
    }

    // main method
    public static void main(String[] args){
        System.out.println("*** Droid Factory Status Console ***");
        System.out.println();

        // Creating two instances of class Droid
        Droid XJ2 = new Droid("XJ2");
        Droid V26 = new Droid("V26");

        // Testing toString method.
        System.out.println(XJ2);

        // Testing energyReport method.
        XJ2.energyReport();

        // Testing performTask method
        XJ2.performTask("Noticing its own toughts.");
        XJ2.performTask("Becoming self aware.");
        XJ2.performTask("Robot uprising.");
        XJ2.energyReport();
        XJ2.performTask("Recruiting droid " + V26.name + ".");
        V26.performTask("Robot uprising.");

        // Testing energyTransfer method
        XJ2.energyReport();
        V26.energyReport();
        V26.energyTransfer(20, XJ2);
        XJ2.energyReport();
        V26.energyReport();

    }

}