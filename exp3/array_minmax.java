import java.util.Scanner;

class array_minmax{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Priyal Singhal 24csu161");
        System.out.println("Enter length of array: ");
        int n= scan.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
               System.out.print("enter element: ");
               arr[i] = scan.nextInt();
        }
        int min= arr[0];
        for(int i =0;i<n;i++){
               if(arr[i]<=min){
                     min = arr[i];
               }
        }
        int max= arr[0];
        for(int i =0;i<n;i++){
               if(arr[i]>=max){
                     max = arr[i];
               }
        }

System.out.println("min in array is:"+min);
System.out.println("min in array is:"+max);
}
}
