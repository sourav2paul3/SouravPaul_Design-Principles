package MainBody;

import UserInterface.*;
import Bussinesslayer.*;
import Datalayer.Datas;

public class Calculator {

	public static void main(String[] args) {
		UI ui=new UI();
		Datas data=new Datas();
		Claculation cal=new Claculation();
		data.input();
		cal.cal(data);
		ui.output(data);
	}

}
