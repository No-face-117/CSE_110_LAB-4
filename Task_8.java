// Task_8



import java.util.Scanner;


public class Task_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n: ");
        int now = scan.nextInt();

        System.out.println();

        int pk = 0;
        int agk = 0;
        int ak = 0;
        int jk = 0;

        while(pk != now){
            
            if (pk <= now) {
                if (pk % 5 == 0) {
                    if (pk % 3 != 0) {
                        System.out.println(pk);
                    }else{}
                }else{}
            }else{}

            
            pk ++;
        }

        if (pk == now) {
            if (now % 5 == 0) {
                if (now % 3 != 0) {
                    System.out.println(now);
                }else{}
            }else{}
        }else{}

    }
}

