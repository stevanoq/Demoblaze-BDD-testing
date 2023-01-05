Feature: login feature
    @login
    Scenario: to test login feature is working
        Given i open browser and navigate to demoblaze
        When i click "Log in" tab
        Then check if form "login" is appear
        And i click "Log in" button
        When check if alert message is same with "Please fill out Username and Password."
        Then accept alert
        When i click close "login" button
        And check if form "login" is gone
        Then i click "Log in" tab
        And  check if form "login" is appear
        When i enter "evan1240" in "loginusername" colum
        And i click "Log in" button
        When check if alert message is same with "Please fill out Username and Password."
        Then accept alert
        When i click x "login" button
        And check if form "login" is gone
        Then i click "Log in" tab
        And check if form "login" is appear
        When i enter "12345" in "loginpassword" colum
        And i click "Log in" button
        When check if alert message is same with "Wrong password."
        Then accept alert
        When i clear "loginusername" colum
        Then i click "Log in" button
        And check if alert message is same with "Please fill out Username and Password."
        Then accept alert
        When i clear "loginpassword" colum
        And i enter "evan12" in "loginusername" colum
        Then i enter "1234567890" in "loginpassword" colum
        And i click "Log in" button
        When check if alert message is same with "User does not exist."
        Then accept alert
        When i clear "loginusername" colum
        And i enter "evan1240" in "loginusername" colum
        Then i click "Log in" button
        When check if "nameofuser" is visible
        Then close browser
