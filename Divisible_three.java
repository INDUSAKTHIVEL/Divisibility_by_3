package Divisiblility;
import java.util.*;
public class Divisible_three {

	public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    System.out.println("Enter the length:");
			    int n = sc.nextInt();
			    int[] arr=new int[n];
			    System.out.println("Enter the array elements:");
			    for(int i = 0;i<n;i++){
			        arr[i] = sc.nextInt();
			    }
			    int sum = 0;
			    for(int j = 0; j<n; j++){
			        sum+=arr[j];
			    }
			    System.out.println("****");
			    if(sum%3==0){
			        System.out.println("1");
			    }
		        else{
		            System.out.println("0");

		        }
			    }

}
