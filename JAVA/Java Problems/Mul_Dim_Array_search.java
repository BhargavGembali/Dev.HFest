//Question: Write a java program to give the information about the multi dimensional array and then search the target element.  


import java.util.Scanner;
import java.util.Arrays;

public class Multi_Dim_find {
    static void find(int[][] arr,int x){
        for(int i=0; i<arr[0].length;i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j]==x){
                    System.out.println("got the target! it's at row:"+i+" and column:"+j+".");
                    return;
                }
            }
        }
        System.out.println("Did not get the target!");
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print("Enter a value for row "+(i+1)+" column "+(j+1)+" :");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.print("Enter the number you want to find:");
        int x= sc.nextInt();
        find(arr, x);
    }
}
//The time complexity is O(r*c)
//The space required for a 2D array is proportional to the product of the number of rows and the number of columns, resulting in O(r * c) space complexity.
