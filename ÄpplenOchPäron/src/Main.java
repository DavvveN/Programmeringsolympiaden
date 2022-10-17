import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = (scanner.nextInt())*7;
        int p = (scanner.nextInt())*13;


        if(a > p ){
            System.out.println("Axel");
        }else if(a <p ){
            System.out.println("Petra");
        }else if(a==p){
            System.out.println("lika");
        }
    }
}
