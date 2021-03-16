public class FormatText {
    public static void main(String[] args) {
        String text = "Everyone _said_ that it would not work. Then someone came, " + "#UNAWARE# of what everyone said, and just did it.";
        int firstIndexOfUppercase = text.indexOf("_");
        int lastIndexOfUppercase = text.lastIndexOf("_");
        String toUppercase = text.substring(firstIndexOfUppercase+1, lastIndexOfUppercase);
        text = text.replace("_" + toUppercase + "_", toUppercase.toUpperCase());
        int firstIndexOfLowercase = text.indexOf("#");
        int lastIndexOfLowercase = text.lastIndexOf("#");
        String toLowercase = text.substring(firstIndexOfLowercase+1, lastIndexOfLowercase);
        text = text.replace("#" + toLowercase + "#", toLowercase.toLowerCase());
        System.out.println(text); }
}