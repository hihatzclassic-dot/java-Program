public class Table {
    public static void main(String[] args) {
        System.out.println("a  a^2  a^3  a^4");

        for (int a = 1; a <= 4; a++) {
            System.out.println(a + "  " + (a*a) + "  " + (a*a*a) + "  " + (a*a*a*a));
        }
    }
}