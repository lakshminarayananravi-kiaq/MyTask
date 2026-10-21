package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WriteReviewStepDefintion extends BaseClass {
	
	
	@When("Click on the explore button")
	public void click_on_the_explore_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@data-testid='mobile-menu-btn']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Explore')]")).click();
	    	}

	@When("Click the All categories dropdown and select the business")
	public void click_the_all_categories_dropdown_and_select_the_business() {
		driver.findElement(By.xpath("//span[contains(text(),'All categories')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Beauty & Spa')]")).click();
		
	}

	@When("Click the SortBy dropdown and select the option")
	public void click_the_sort_by_dropdown_and_select_the_option() {
	    driver.findElement(By.xpath("//span[contains(text(),'Recently added')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'Top rated')]")).click();
	    
	}

	@When("Click the Rating dropdown and select the rating")
	public void click_the_rating_dropdown_and_select_the_rating() {
	    
	}

	@When("click the Business")
	public void click_the_business() {
	   
	}

	@When("Click the Write a review button")
	public void click_the_write_a_review_button() {
	   
	}

	@When("Click the rating star")
	public void click_the_rating_star() {
	    
	}

	@When("Enter the comment")
	public void enter_the_comment() {
	    
	}

	@When("Click the post review button")
	public void click_the_post_review_button() {
	    
	}

	@Then("Display the toast message as review posted")
	public void display_the_toast_message_as_review_posted() {
	    
	}



}
