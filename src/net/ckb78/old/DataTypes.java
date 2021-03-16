class DataTypes {
    public static void main(String[] args) {
        // 1. Your initials
        char[] initials = new char[] { 'C', 'B' }; String initialsStr = "CB";
        // 2. Population in my country
        int population = 5328000;
        // 3. Population on earth
        long people = 7470000000L;
        // 4. The week day of today
        String day = "Wednesday";
        // 5. Duration in weeks of the java course
        short weeks = 12;
        // 6. The mathematical number PI
        double pi = 3.14159265359;
        // Alle variablene slått sammen.
        System.out.println("My initials: " + initials[0] + initials[1]);
        System.out.println("Population in Norway: " + population);
        System.out.println("People on earth: " + people);
        System.out.println("Week day of today: " + day);
        System.out.println("Duration in weeks of the java course: " + weeks);
        System.out.println("The mathematical number PI: " + pi);
    } }