package UserInterface;
import Datalayer.*;

public class UI extends Datas {
	public UI() {}

	public void output(Datas data)
	{
		System.out.println("X="+data.fvalue()+"Y="+data.svalue());
		System.out.println("Result is:"+data.putresult());
	}
}
