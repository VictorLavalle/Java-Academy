public class Principal {

    public static void main(String[] args) {

        // A classic example of a division by zero 

        int x = 5;
        int y = 0;
        int result = 0;

        result = calculateDivision(x,y);
        System.out.println(result);

        System.out.println("Program successfully finished");
    }

    private static int calculateDivision(int x, int y) {
        return x/y;
    }

}
