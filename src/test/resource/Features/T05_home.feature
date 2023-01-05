Feature: home feature
    @home
    Scenario: check if all element in home is visible
        Given i open browser and navigate to demoblaze
        And i click "Log in" tab
        Then check if form "login" is appear
        When i enter "evan1240" in "loginusername" colum
        And i enter "1234567890" in "loginpassword" colum
        Then i click "Log in" button
        And check if "nameofuser" is visible
        When i click "Home" tab
        And i click "carousel-control-next-icon" class button
        And i click "carousel-control-prev-icon" class button
        Then check if elemen "head" is appear
        And check if elemen "phone" is appear
        And check if elemen "laptop" is appear
        And check if elemen "monitor" is appear
        When i click elemen "phone"
        Then check if item "Samsung galaxy s6" is appear
        And check if item "Nokia lumia 1520" is appear
        And check if item "Nexus 6" is appear
        And check if item "Samsung galaxy s7" is appear
        And check if item "Iphone 6 32gb" is appear
        And check if item "Sony xperia z5" is appear
        And check if item "HTC One M9" is appear
        When i click elemen "laptop"
        Then check if item "Sony vaio i5" is appear
        And check if item "Sony vaio i7" is appear
        And check if item "MacBook air" is appear
        And check if item "Dell i7 8gb" is appear
        And check if item "2017 Dell 15.6 Inch" is appear
        And check if item "MacBook Pro" is appear
        When i click elemen "monitor"
        Then check if item "Apple monitor 24" is appear
        And check if item "ASUS Full HD" is appear
        When i click "Previous" button
        Then i click "Next" button
        Then close browser