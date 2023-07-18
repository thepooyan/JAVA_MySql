import java.util.Scanner;

public class MyScanner {
    private Scanner scn = new Scanner(System.in);

    public String scanString(String msg) {
        System.out.print(msg);
       return this.scn.next();
    }
    public int scanInt(String msg) {
        System.out.print(msg);
        return this.scn.nextInt();
    }
}
