package whileloopusingaclass;
import java.util.Scanner;
public class WhileLoopUsingAClass {

    public static void main(String[] args) {
        Scanner rikki = new Scanner(System.in);
        int number;
        Apples apples = new Apples();
        System.out.println("Enter FirstNumber: ");
        number = rikki.nextInt();
        apples.addNum(number);
        apples.returnSum();
    }

}
