import java.util.Scanner;

class time{
public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
    System.out.println("Priyal Singhal 24csu161");
    System.out.println("enter minutes: ");
    int minutes = scan.nextInt();
    int totalDays = minutes / (60 * 24);       
        int years = totalDays / 365;               
        int remainingDaysAfterYears = totalDays % 365;
        int months = remainingDaysAfterYears / 30; 
        int days = remainingDaysAfterYears % 30;   
    System.out.println("YY-MM-DD"+ years + "-" + months + "-" + days );
}
}
