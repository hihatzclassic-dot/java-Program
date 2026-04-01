public class Convert {
    public static void main(String[] args) {
        double miles = 100;
        final double KILOMETER_PER_HOUR = 1.609;
        double kilometers = miles * KILOMETER_PER_HOUR;
        System.out.println(kilometers);
    }
}