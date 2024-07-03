// Task_9



import java.util.Scanner;


public class Task_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number : ");
        int now = scan.nextInt();

        System.out.println();

        int pk = 1;
        int agk = 10;
        int ak = 0;
        int jk = 1;

        while(pk != 0){
            
            ak = now / agk;

            if (ak != 0) {
                agk *= 10;
            }else{break;}


           jk ++;
           pk ++;
        }

        System.out.println("Total digits = " + jk);
        scan.close(); 
    }
   
}

