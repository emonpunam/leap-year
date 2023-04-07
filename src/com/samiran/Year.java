package com.samiran;
import java.util.Scanner;
public class Year {

	public static void main(String[] args) {
		int y;
		System.out.println("enter any year");
		Scanner r=new Scanner(System.in);
		y=r.nextInt();
		if (((y%4==0) &&( y%100!=0) )||(y%400==0))
		{
			System.out.println("leap year");
		}
		else
		System.out.println("not leap year");	
		}
	}

