Feature: Find the business and write a review funtionality of Infoez application 

Scenario: Login with valid credentials
Given Launch the browser
And Load the url
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
Then it should be navigated to the login page
When Click on the explore button
And Click the All categories dropdown and select the business
And Click the SortBy dropdown and select the option
And Click the Rating dropdown and select the rating
And click the Business
And Click the Write a review button
And Click the rating star
And Enter the comment
When Click the post review button
Then Display the toast message as review posted