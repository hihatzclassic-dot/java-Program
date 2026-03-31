public class Population {
    public static void main(String[] args) {

        double population = 312032486;

        double yearlyChange = (31536000 / 7.0)
                            - (31536000 / 13.0)
                            + (31536000 / 45.0);

        // Year 1
        population = population + yearlyChange;
        System.out.println("Year 1: " + (int)population);

        // Year 2
        population = population + yearlyChange;
        System.out.println("Year 2: " + (int)population);

        // Year 3
        population = population + yearlyChange;
        System.out.println("Year 3: " + (int)population);

        // Year 4
        population = population + yearlyChange;
        System.out.println("Year 4: " + (int)population);

        // Year 5
        population = population + yearlyChange;
        System.out.println("Year 5: " + (int)population);
    }
}