import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        int bills = 0;

        StringBuilder c = new StringBuilder();

        for(int i = String.valueOf(num).length(); i > 0; i--){

            c.append("1".repeat(i));

            if(i == 1){
                bills+=num;
            }else {

                int a = (int) num / Integer.parseInt(c.toString());
                bills += a;
                num = (int) num % Integer.parseInt(c.toString());
            }
            c.setLength(0);
        }

        System.out.println(bills);

    }
}
