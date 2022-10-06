Feature: FbLogin

@Smoke
 Scenario: Login with valid credential
  Given User lauch chrome browser
  When User open url "https://www.facebook.com/login/"
  And  User enter email as "shitalbirajdar09@gmail.com" and password as "king.@2001"
  And User click on Login button
  Then Page Title should be "Facebook"
  And close browser.
 
 @Sanity 
 Scenario Outline: Login Data Driven
  Given User lauch chrome browser
  When User open url "https://www.facebook.com/login/"
  And  User enter email as "<email>" and password as "<password>"
  And User click on Login button
  Then Page Title should be "Facebook"
  And close browser.
  
  Examples:
  |email|password|
  |shitalbirajdar09@gmail.com|king.@2001|
  |shitalbirajdar09@gmail.com|1234|