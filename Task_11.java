// task_11



import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pk = 0;
        int agk = 1;
        int ak = 0;
        int jk = 0;
        int now = 0;

        System.out.println("Enter your number : ");
        pk = scan.nextInt();



        while(agk <= pk){

            if (pk % agk == 0) {
                System.out.println(agk); 
                if (agk < pk) {
                    now += agk; 
                }
                ak ++;
            }
            agk ++;

        }

        if (ak == 2) {
            System.out.println(pk + " is a prime number.");
        } else {
            System.out.println(pk + " is not a prime number.");
        }

        if (now == pk) {
            System.out.println(pk + " is a perfect number.");
        }else  {System.out.println(pk + " is not a perfect number.");}
        
        scan.close();
    }
}
