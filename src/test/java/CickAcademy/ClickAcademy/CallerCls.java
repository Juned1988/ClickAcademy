package CickAcademy.ClickAcademy;

import org.testng.annotations.Test;

public class CallerCls extends UtilityCls {
	LibraryCls obj = new LibraryCls();
	@Test
	public void testcase1() {
		obj.openurl();
	obj.selectRadioButtion();
	obj.selectDropDown();
	}
	

}
