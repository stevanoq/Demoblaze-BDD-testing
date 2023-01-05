Feature: contact feature
    @contact1
    Scenario: testing contact feature is working
        Given i open browser and navigate to demoblaze
        And i click "Log in" tab
        Then check if form "login" is appear
        When i enter "evan1240" in "loginusername" colum
        And i enter "1234567890" in "loginpassword" colum
        Then i click "Log in" button
        And check if "nameofuser" is visible
        Then i click "Contact" tab
        And check if form "contact" is appear
        When i click "Send message" button
        And check if alert message is same with "Thanks for the message!!"
        Then accept alert
        When i click "Contact" tab
        And check if form "contact" is appear
        And i enter "user@gmail.com" in "recipient-email" colum
        And i enter "username" in "recipient-name" colum
        And i enter "user message" in "message-text" colum
        Then i click "Send message" button
        When check if alert message is same with "Thanks for the message!!"
        Then accept alert
        When i click "Contact" tab
        Then check if form "contact" is appear
        And i enter "user@gmail.com" in "recipient-email" colum
        Then i click "Send message" button
        When check if alert message is same with "Thanks for the message!!"
        Then accept alert
        When i click "Contact" tab
        Then check if form "contact" is appear
        And i enter "username" in "recipient-name" colum
        Then i click "Send message" button
        When check if alert message is same with "Thanks for the message!!"
        Then accept alert
        When i click "Contact" tab
        Then check if form "contact" is appear
        And i enter "user message" in "message-text" colum
        Then i click "Send message" button
        When check if alert message is same with "Thanks for the message!!"
        Then accept alert
        When i click "Contact" tab
        And check if form "contact" is appear
        Then i click x "contact" button
        And check if form "contact" is gone
        When i click "Contact" tab
        Then check if form "contact" is appear
        And i click close "contact" button
        Then close browser