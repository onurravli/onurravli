import java.util.Scanner; 

public class Main {
    public static double AreaOfCircle(double radius) {
        return 3.14 * radius * radius;
    }
    public static int AreaOfSquare(int edgeLength) {
        return edgeLength * edgeLength;
    }
    public static int AreaOfRectangle(int shortEdge, int longEdge) {
        return shortEdge * longEdge;
    }
    public static void main(String args[]) {
        Scanner oku = new Scanner(System.in);
        char secim = oku.next().charAt(0);
        switch (secim) {
            case 'c':
                int c_ = oku.nextInt();
                System.out.println(AreaOfCircle(c_));
                break;
            case 's':
                int s_ = oku.nextInt();
                System.out.println(AreaOfSquare(s_));
                break;
            case 'r':
                int r_1 = oku.nextInt();
                int r_2 = oku.nextInt();
                System.out.println(AreaOfRectangle(r_1, r_2));
                break;
        }
    }
}
