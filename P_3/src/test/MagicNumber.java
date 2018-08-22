package test;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This assumes that there are only two integers in the input separated by space
		System.out.println("Enter two numbers 1<= A< B < 10000 separated by space");
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
			
		boolean flag=false;
		for (int i=Integer.parseInt(input.split(" ")[0]);i<=Integer.parseInt(input.split(" ")[1]);i++)
		{
			flag=checkMagic(i)||flag;
			}
		
		if(!flag){
			System.out.println("-1");
		}

	}

	
	public static boolean checkMagic(int number){
		
		int[]nums=Integer.toString(number).chars().map(c -> c -'0').toArray();
		int[] visited=new int[nums.length];
			
		if(noDup(nums) &&(((nums[nums.length-1]+ (nums.length -1))%(nums.length))==0)){
			
			for(int i=0;i<nums.length;i++)
			{
				visited[(i+nums[i])%nums.length]=1;		
			}
			for(int i:visited){
				if(i==0){
					return false;
				}
			}
			System.out.print(number + " ");
			return true;	
				
			}
			
		return false;
		
			
		}
		
		
	public static boolean noDup(int[] nums) {
		// TODO Auto-generated method stub
		
		int []cons=new int[10];
		for(int i:nums){
			if(cons[i]!=0){
				return false;	
			}
			cons[i]=1;
			
		}	
		return true;
	}
	
	
	
	
	
}
