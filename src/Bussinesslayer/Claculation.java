package Bussinesslayer;
import Datalayer.*;

public class Claculation  extends Datas {
	private double a,b;
	
	public Claculation()
	{
		a=b=0;
	}
	
	public void cal(Datas data)
	{
		
		switch(data.putsign())
		{
			case '+':a=data.fvalue();
					b=data.svalue();
					data.setresult(a+b);
					break;
			case '-':a=data.fvalue();
					 b=data.svalue();
					 data.setresult(a-b);
					 break;
			case '*':a=data.fvalue();
			 		b=data.svalue();
			 		data.setresult(a*b);
			 		break;
			case '/':a=data.fvalue();
			 		b=data.svalue();
			 		if(b==0)
			 		{
			 			System.out.println("Division not possible");
			 			return;
			 		}
			 		data.setresult(a/b);
			 		break;
			 default :System.out.println("Invalid sign:"+data.putsign());
		}
	}
}
