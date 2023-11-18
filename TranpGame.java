import java.util.Scanner;

public class TranpGame {
    public static void main(String[] args) {
        System.out.println("************");
        System.out.println("*High & Low*");
        System.out.println("************");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int leftCard = (int) (Math.random() * 9) + 1;
            int rightCard = (int) (Math.random() * 9) + 1;
            System.out.println(" [問題表示] ");
            System.out.println("*****    *****");
            System.out.println("*   *    * * *");
            System.out.println("* " + leftCard + " *    * * *");
            System.out.println("*   *    * * *");
            System.out.println("*****    *****");
            System.out.println(" High  or  Low?(h/l)>");
            String select = sc.nextLine();
            if (select.equals("h")) {
                System.out.println("→Highを選択しました。");
            } else {
                System.out.println("→Lowを選択しました。");
            }
            System.out.println("");
            System.out.println("  [結果表示]  ");
            System.out.println("*****    *****");
            System.out.println("*   *    * * *");
            System.out.println("* " + leftCard + " *    * " + rightCard + " *");
            System.out.println("*   *    * * *");
            System.out.println("*****    *****");
            String result = null;
            if (leftCard < rightCard) {
                result = "h";
            } else if (leftCard > rightCard) {
                result = "l";
            } else {
                result = select;
            }
            if (select.equals(result)) {
                System.out.println("→You Win!!!!");
            } else {
                System.out.println("→You Lose...");
                System.out.println("--ゲーム終了--");
                break;
            }
        }
    }
}
