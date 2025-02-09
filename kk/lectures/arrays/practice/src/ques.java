public class ques {
    public static void main(String[] args) {
        int totalPeople = 100;
        int coffeeLovers = 70;
        int teaLovers = 60;
        int bothLovers = 50;

        int onlyCoffee = coffeeLovers - bothLovers;
        int onlyTea = teaLovers - bothLovers;

        int eitherButNotBoth = onlyCoffee + onlyTea;

        System.out.println("Number of people who like either coffee or tea, but not both: " + eitherButNotBoth);
    }
}
