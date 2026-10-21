package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewFavouriteStepDefintion extends BaseClass {
	
	@When("Click on the favourite button")
	public void click_on_the_favourite_button() {
	    driver.findElement(By.xpath("//div[@data-testid='menu-favorites']")).click();    
	}
	@When("Click on the business saved as favourite")
	public void click_on_the_business_saved_as_favourite(){
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//img[@alt='Naga Biryani House']")).click();
		WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds(25));
	    WebElement savedBusiness=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Naga Biryani House']")));
	    savedBusiness.click();
	}
	@When("Click on the saved button")
	public void click_on_the_saved_button() {
	   WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(30));
	   WebElement savedButton=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Saved']")));
	   savedButton.click();
	}
	@Then("Display the message as removed from favourites")
	public void display_the_message_as_removed_from_favourites() throws InterruptedException {
		Thread.sleep(1000);
	    WebElement removeMessage=driver.findElement(By.xpath("//div[text()='Removed from favorites']"));
	    System.out.println(removeMessage.getText());
	}

}
