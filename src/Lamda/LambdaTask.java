package Lamda;

import java.util.Scanner;

public class LambdaTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        if(option.equals("1")){
            String word = sc.nextLine();
            make((str)->{
                StringBuilder sb = new StringBuilder(str);
                sb = sb.reverse();
                return sb.toString();
            }, word);
        }
        else if(option.equals("2")){
            String n = sc.nextLine();
            make((num)->{
                int number = Integer.parseInt(num);
                int factorial = 1;
                if(number==0||number==1) return factorial+"";
                if(number<0) return "Your number should be positive";
                for(int i =1; i <= number; i++)
                    factorial*=i;
                return factorial+"";
            }, n);
        }
        else System.out.println("Не разбираюсь в опции "+option);
    }

    private static void make(ConsoleDoer doer, String arg) {
        System.out.println(doer.doThing(arg));
    }
}
