import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String output ="";

        if(input.contains("+")){

            // 18 or 19

            if(Integer.parseInt(input.substring(0,2)) <39){
                output+=19+input.substring(0,2);
            }else{
                output+=18+input.substring(0,2);
            }
        }else {

            // 19 or 20
            if(Integer.parseInt(input.substring(0,2)) <20){
                output+=20+input.substring(0,2);
            }else{
                output+=19+input.substring(0,2);
            }
        }

        output+=input.substring(2,6)+input.substring(7,11);
        System.out.println(output);
    }
}
