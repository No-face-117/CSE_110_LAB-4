// Task_2 


import java.util.Scanner;


public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter N : ");
        int now = scan.nextInt();
        int pk = 0;
        int agk = 0;
        int ak = 0;
        double jk = 0;

        while(agk != now){
            System.out.println("Enter number : ");
            pk = scan.nextInt();

            ak += pk;
            jk = ak/now;

            agk ++;
        }

        System.out.println("The sum of " + now + " no is:" + ak);
        System.out.println("The average of " + now + " no is:" + jk);

    }
}



