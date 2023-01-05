Feature: logout feature

    Scenario: user login and logout
        Given i open browser and navigate to demoblaze
        And i click "Log in" tab
        When i enter "evan1240" in "loginusername" colum
        And i enter "1234567890" in "loginpassword" colum
        Then i click "Log in" button
        When check if "nameofuser" is visible
        Then i click "Log out" tab
        When check if "signin2" is visible
        Then close browser
        