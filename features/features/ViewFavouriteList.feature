Feature: View Favourite list of Infoez application 

Scenario:  Search the favourite business and remove if present 

Given Launch the browser
And Load the url
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
Then The Welcome message should be displayed
When  Click on the username button
And Click on the favourite button
And Click on the business saved as favourite
And Click on the saved button
Then Display the message as removed from favourites

