public class Main {
    public static void main(String[] args) {
        int a,b,c;
        for (a = 1; a < 11; a++) {
            for(b = a; b < 11; b++) {
                System.out.print(" ");
            }
            for (c = 1; c <= a; c++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

}

