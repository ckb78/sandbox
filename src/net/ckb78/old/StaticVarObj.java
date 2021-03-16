public class StaticVarObj {

    static int staticNumber = 0;
    static int objectCounter = 0;
    String name;

    public StaticVarObj(String name) {
        this.name = name;
        objectCounter++;
    }

    public static void main(String[] args) {

        System.out.println("Static number is " + staticNumber);
        staticNumber = 2;

        System.out.println("Static number is now " + staticNumber);
        StaticVarObj obj1 = new StaticVarObj("Object 1");
        System.out.println(obj1.callOutStaticNumbers());
        StaticVarObj obj2 = new StaticVarObj("Object 2");
        System.out.println(obj2.callOutStaticNumbers());
    }


    public String callOutStaticNumbers() {

        return "The value of the static number is: " + staticNumber +
                "\nThe value of the static objectCounter is: " + objectCounter;

    }
}