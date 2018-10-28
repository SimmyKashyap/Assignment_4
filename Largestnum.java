import java.util.*;
class Largestnum{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter the 10 elements in array: ");
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
	for(int i=0;i<10;i++){
		System.out.print(a[i]+" ");
			//a[i]=sc.nextInt();
		}
		
		
		System.out.println("The second largest number in array is : "+a[8]);
	}
}