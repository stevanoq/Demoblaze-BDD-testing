Feature: about us feature
    @aboutus
    Scenario: this testing to make sure that about us video is avalable
        Given i open browser and navigate to demoblaze
        And i click "About us" tab
        Then check if video is avalaible
        When i click close "aboutUs" button
        And check if form "aboutUs" is gone
        And i click "About us" tab
        Then check if video is avalaible
        When i click x "aboutUs" button
        And check if form "aboutUs" is gone
        And i click "Log in" tab
        When i enter "evan1240" in "loginusername" colum
        And i enter "1234567890" in "loginpassword" colum
        Then i click "Log in" button
        When check if "nameofuser" is visible
        Then i click "About us" tab
        And check if video is avalaible
        Then close browser