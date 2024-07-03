// task_3



import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pk = 0;
        int agk = 1;
        int ak = 0;
       // double jk = 0;

        while(agk != 0 ){
            System.out.println("Enter number : ");
            pk = scan.nextInt();

            if (pk > -1){
                ak = (int) Math.pow(pk , 2);

                System.out.println(pk + " ^ 2 = " + ak);
            }
            else{
                System.out.println("Negative number detected !!!!!!!!!!!!!!!!!!!!!!!");
                break;
            }


        }
    }
}




