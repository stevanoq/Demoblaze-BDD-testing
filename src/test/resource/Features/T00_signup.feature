Feature: sign up feature
    @signup
    Scenario: test sign up feature functional
        Given i open browser and navigate to demoblaze
        And i click sign up tab
        When check if form "signup" is appear
        Then i click "Sign up" button
        When check if alert message is same with "Please fill out Username and Password."
        Then accept alert
        When i enter "evan1240" in "sign-username" colum
        Then i click "Sign up" button
        When check if alert message is same with "Please fill out Username and Password."
        Then accept alert
        When i clear "sign-username" colum
        And i enter "1234567890" in "sign-password" colum
        Then i click "Sign up" button
        When check if alert message is same with "Please fill out Username and Password."
        Then accept alert
        When i enter "evan1240" in "sign-username" colum
        Then i click "Sign up" button
        When check if alert message is same with "This user already exist."
        Then accept alert
        When i clear "sign-username" colum
        And i enter "evan1246" in "sign-username" colum
        Then i click "Sign up" button
        #When check if alert message is same with "Sign up successful."
        Then accept alert
        #When check if form "signup" is gone
        Then close browser

        #note :
        #line number 26 and 28 i make it to commen because sign up will success if we make new user evrytime when testing prosses