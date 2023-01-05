Feature: check out feature
    @checkout
    Scenario: test if check out feature is working 
        Given i open browser and navigate to demoblaze
        And i click "Log in" tab
        When i enter "evan1240" in "loginusername" colum
        And i enter "1234567890" in "loginpassword" colum
        Then i click "Log in" button
        When check if "nameofuser" is visible
        And i click "Cart" tab
        Then check if fist table is appear
        And get prize "before" delete
        When i click "delete" button
        Then check if fist table is appear
        And get prize "after" delete
        When check if prize after less than before
        Then i click "Place Order" button
        When check if form "placeOrder" is appear
        And i click "Purchase" button
        And check if alert message is same with "Please fill out Name and Creditcard."
        Then accept alert
        When i enter "username" in "name" colum
        And i click "Purchase" button
        And check if alert message is same with "Please fill out Name and Creditcard."
        Then accept alert
        When i enter "indonesia" in "country" colum
        And i click "Purchase" button
        And check if alert message is same with "Please fill out Name and Creditcard."
        Then accept alert
        When i enter "salatiga" in "city" colum
        And i click "Purchase" button
        And check if alert message is same with "Please fill out Name and Creditcard."
        Then accept alert
        When i enter "23424234624" in "card" colum
        And i enter "03" in "month" colum
        And i enter "99" in "year" colum
        Then i click "Purchase" button
        When item "Thank you for your purchase!" is opened
        And i click "OK" button
        And check if "nameofuser" is visible
        Then close browser