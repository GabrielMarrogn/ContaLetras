import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 0; i <a; i++){
            String p =sc.next();

            double plenght = p.length();
            double total = plenght /100;

            System.out.printf("%.2f\n", total);
        }

        sc.close();
    }
}
