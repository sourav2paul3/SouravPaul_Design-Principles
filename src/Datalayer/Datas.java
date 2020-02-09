package Datalayer;

import java.util.Scanner;

public class Datas {
	private double num1,num2,result;
	char sign;

	public Datas() {
		num1=num2=0;
		sign='\0';
	}
	public void input()
	{
		
		Scanner sc=new Scanner(System.in);
		try {
        System.out.print("Enter first number:");
        num1 = sc.nextDouble();
        System.out.print("Enter second number:");
        num2 = sc.nextDouble();
        System.out.print("Enter an operator:");
        sign = sc.next().charAt(0);
	}catch(NumberFormatException e)
		{
		e.printStackTrace();
		}
	}
	public void setresult(double result)
	{
		this.result=result;
	}
	public char putsign()
	{
		return sign;
	}
	public double fvalue()
	{
		return num1;
	}
	public double svalue()
	{
		return num2;
	}
	public double putresult()
	{
		return result;
	}
}