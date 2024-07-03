// Task_5



import java.util.Scanner;


public class Task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter an int : ");
        int now = scan.nextInt();
        int pk = 0;
        int agk = 0;
        int ak = 0;
        int jk = 0;

        while(pk != now){
            System.out.println("Please enter a number");
            jk = scan.nextInt();

           if (jk < 0) {
            agk ++;
           }
           else if (jk > 0) {
            ak ++;
           }
           
            pk ++;
        }

        System.out.println(ak + " Non-negative Numbers.");
        System.out.println(agk + " Negative Numbers.");

    }
}

