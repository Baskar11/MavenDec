Feature: Logging into Leaftaps

Scenario Outline: Positive flow

Given Logs into the Leaftaps application
And Enters the Company name <Company name>
And Enters the Firstname and Surname <Forename> <Surname>
When The user clicks on Create lead
Then The new lead should be created

Examples:
|Company name|Forename|Surname|
|Queen Consolidated|Walter|Steele|
|Smoak Tech|Felicity|Smoak|
|Palmer Tech|Raymond|Palmer|
|Accenture|Jimmy|Anderson|
|Accenture|Joe|Denly|
|Accenture|Joe|Root|
|Accenture|Jos|Buttler|
|Accenture|Jonny|Bairstow|
|Accenture|Jason|Roy|
|Accenture|Jonathan|Trott|
|Accenture|John|Campbell|
