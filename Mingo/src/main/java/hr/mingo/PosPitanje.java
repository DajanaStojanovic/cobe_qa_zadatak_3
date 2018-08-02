package hr.mingo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import hr.mingo.Browser;
import org.openqa.selenium.support.ui.Select;
import hr.mingo.variables.GlobalVariables;

public class PosPitanje extends GlobalVariables{
	//Open page
	public void goTo() {
		Browser.goTo(url);
	}
	
	//Input fields
	public void inputFields() {
		JavascriptExecutor js = (JavascriptExecutor) Browser.driver;
		
	   	//Find element by id 'Zapitanjce'      		
        	WebElement element = Browser.driver.findElement(By.id("Zapitanjce"));

		//Scroll till element vidible		
		js.executeScript("arguments[0].scrollIntoView();", element);

        	//Click on element with id 'Zapitanjce'
		Browser.driver.findElement(By.id("Zapitanjce")).click();
		
		//Wait for form to be visible
		WebDriverWait wait = new WebDriverWait(Browser.driver, wait10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pitanjce")));
		
		//Select value from dropdown 'U koju domenu pripada vaše pitanje' but don't select 
		//first element because first element is selected by default
		if(getDomPitanja() != 1) {
			Select vasPit = new Select(Browser.driver.findElement(By.id("e1")));
			String dompitanje = String.valueOf(getDomPitanja());
			System.out.println(dompitanje);
			vasPit.selectByValue(dompitanje);
		}
		
		//Select 'Tip poruke' but don't select first element because first element
		//is selected by default
		if(getTipPoruke() != 1) {
			String tipporuke = String.valueOf(getTipPoruke());
			System.out.println(tipporuke);
			String tipporukeid = "//*[@id=\"demoR\"]/div[" + tipporuke + "]";
			System.out.println(tipporukeid);
			Browser.driver.findElement(By.xpath(tipporukeid)).click();
		}	
		//Click on off for 'Želim da me kontaktira netko iz ministarstva u vezi mog upita'
		Browser.driver.findElement(By.xpath("//*[@id=\"demo1\"]/div/a")).click();
		
		//Write message
		Browser.driver.findElement(By.xpath("//*[@id=\"pitanjce\"]/textarea")).sendKeys(getPoruka());
		
		//Click on off for 'Pristajem...'
		Browser.driver.findElement(By.xpath("//*[@id=\"demo2\"]/div/a")).click();
		
		//Input in field 'Ime i prezime'
		Browser.driver.findElement(By.id("imePrezime")).sendKeys(getImePrezime());
		
		//Input in field 'Kontakt telefon'
		Browser.driver.findElement(By.id("kontakt")).sendKeys(getKontakt());
				
		//Input in field 'Kontakt email'
		Browser.driver.findElement(By.id("email")).sendKeys(getEmail());
	}

	public void validations() { 
		//Input in field 'Ime i prezime'
		Browser.driver.findElement(By.id("imePrezime")).clear();
		
		//Click on 'Pošalji'
		Browser.driver.findElement(By.xpath("//*[@id=\"salji\"]/button")).click();
		
		//Verify if error message is visible and equal to expected text
		WebElement msgIme=Browser.driver.findElement(By.id("error"));
        	String textIme=msgIme.getText();
		String expectedTextIme = "Ime je obavezan parametar";
		Assert.assertEquals(textIme,expectedTextIme);
		
		//Input in field 'Ime i prezime' again
		Browser.driver.findElement(By.id("imePrezime")).sendKeys(getImePrezime());
						
		//Input in field 'Kontakt telefon'
		Browser.driver.findElement(By.id("kontakt")).clear();
		
		//Click on 'Pošalji'
		Browser.driver.findElement(By.xpath("//*[@id=\"salji\"]/button")).click();
		
		//Verify if error message is visible and equal to expected text
		WebElement msgKon=Browser.driver.findElement(By.id("error"));
        	String textKon=msgKon.getText();
		String expectedTextKon = "Kontakt je obavezan parametar";
		Assert.assertEquals(textKon,expectedTextKon);
		
		//Input in field 'Kontakt telefon' again
		Browser.driver.findElement(By.id("kontakt")).sendKeys(getKontakt());
					
		//Input in field 'Kontakt email'
		Browser.driver.findElement(By.id("email")).clear();
		
		//Verify if error message is visible and equal to expected text
		WebElement msgMail=Browser.driver.findElement(By.id("error"));
        	String textMail=msgMail.getText();
		String expectedTextMail = "Pogrešno upisan e-mail !";
		Assert.assertEquals(textMail,expectedTextMail);
		
		//Click on 'Pošalji'
		Browser.driver.findElement(By.xpath("//*[@id=\"salji\"]/button")).click();
		
		//Input in field 'Kontakt email' again
		Browser.driver.findElement(By.id("email")).sendKeys(getEmail());
	}

	public void send() { 
		//Click on 'Pošalji'
		Browser.driver.findElement(By.xpath("//*[@id=\"salji\"]/button")).click();
	}
}
