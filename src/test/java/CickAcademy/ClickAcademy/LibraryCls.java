package CickAcademy.ClickAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class LibraryCls extends UtilityCls{
public void openurl() {
	Driver.get("http://www.qaclickacademy.com/practice.php");
		
	System.out.println("Site opened");
}

public void selectRadioButtion()  {
	Driver.findElement(By.xpath("//input[@value='radio1']")).click();
System.out.println("Radio button Selected");
}
public void selectDropDown() {
	Select abc= new  Select( Driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
abc.selectByIndex(2);
System.out.println("Drop Down Selected");
}
public void SelectCheckBox() {
	Driver.findElement(By.xpath("//input[@value='option1']")).click();
System.out.println("CheckBoxSelected");
}

}
