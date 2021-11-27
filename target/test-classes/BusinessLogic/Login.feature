Feature: Login Functionality

Background: User is on Flipkart main page and mouse over on Login button
Given User open "chrome" browser with exe "D:\\Automation Support\\chromedriver.exe"
Given User enter url as "https://www.flipkart.com/"
Given User cancle initial Login window
Given User move on Login button

@SmokeTest
Scenario: Login functionality with valid credentials
When User click on my profile
When User enter "9665023244" as username
When User enter "Harshu@9696" as password
When User click on Login button
Then Application shows profile to user
