Feature: add to cart feature
    @cart
    Scenario: add item to cart one by one
        Given i open browser and navigate to demoblaze
        And i click "Log in" tab
        When i enter "evan1240" in "loginusername" colum
        And i enter "1234567890" in "loginpassword" colum
        Then i click "Log in" button
        When check if "nameofuser" is visible
        And check if elemen "phone" is appear
        When i click elemen "phone"
        Then check if item "Samsung galaxy s6" is appear
        And check if item "Nokia lumia 1520" is appear
        And check if item "Nexus 6" is appear
        And check if item "Samsung galaxy s7" is appear
        And check if item "Iphone 6 32gb" is appear
        And check if item "Sony xperia z5" is appear
        And check if item "HTC One M9" is appear
        Then i click item "Samsung galaxy s6"
        When item "Samsung galaxy s6" is opened
        Then i click item "Add to cart"
        When check if alert message is same with "Product added."
        And accept alert
        Then navigate back "2" times
        And i click item "Nokia lumia 1520"
        When item "Nokia lumia 1520" is opened
        Then i click item "Add to cart"
        When check if alert message is same with "Product added."
        And accept alert
        Then navigate back "2" times
        And i click item "Nexus 6"
        When item "Nexus 6" is opened
        Then i click item "Add to cart"
        When check if alert message is same with "Product added."
        And accept alert
        Then navigate back "2" times
        And i click item "Samsung galaxy s7"
        When item "Samsung galaxy s7" is opened
        Then i click item "Add to cart"
        When check if alert message is same with "Product added."
        And accept alert
        Then navigate back "2" times
        And i click item "Iphone 6 32gb"
        When item "Iphone 6 32gb" is opened
        Then i click item "Add to cart"
        When check if alert message is same with "Product added."
        And accept alert
        Then navigate back "2" times
        And i click item "Sony xperia z5"
        When item "Sony xperia z5" is opened
        Then i click item "Add to cart"
        When check if alert message is same with "Product added."
        And accept alert
        Then navigate back "2" times
        And i click item "HTC One M9"
        When item "HTC One M9" is opened
        Then i click item "Add to cart"
        When check if alert message is same with "Product added."
        And accept alert
        Then navigate back "2" times
        And check if elemen "laptop" is appear
        When i click elemen "laptop"
        Then check if item "Sony vaio i5" is appear
        And check if item "Sony vaio i7" is appear
        And check if item "MacBook air" is appear
        And check if item "Dell i7 8gb" is appear
        And check if item "2017 Dell 15.6 Inch" is appear
        And check if item "MacBook Pro" is appear
        Then i click item "Sony vaio i5"
        When item "Sony vaio i5" is opened
        Then i click item "Add to cart"
        When check if alert message is same with "Product added."
        And accept alert
        Then navigate back "2" times
        And i click item "Sony vaio i7"
        When item "Sony vaio i7" is opened
        Then i click item "Add to cart"
        When check if alert message is same with "Product added."
        And accept alert
        Then navigate back "2" times
        And i click item "MacBook air"
        When item "MacBook air" is opened
        Then i click item "Add to cart"
        When check if alert message is same with "Product added."
        And accept alert
        Then navigate back "2" times
        And i click item "Dell i7 8gb"
        When item "Dell i7 8gb" is opened
        Then i click item "Add to cart"
        When check if alert message is same with "Product added."
        And accept alert
        Then navigate back "2" times
        And i click item "2017 Dell 15.6 Inch"
        When item "2017 Dell 15.6 Inch" is opened
        Then i click item "Add to cart"
        When check if alert message is same with "Product added."
        And accept alert
        Then navigate back "2" times
        And i click item "MacBook Pro"
        When item "MacBook Pro" is opened
        Then i click item "Add to cart"
        When check if alert message is same with "Product added."
        And accept alert
        Then navigate back "2" times
        And check if elemen "monitor" is appear
        When i click elemen "monitor"
        Then check if item "Apple monitor 24" is appear
        And check if item "ASUS Full HD" is appear
        Then i click item "Apple monitor 24"
        When item "Apple monitor 24" is opened
        Then i click item "Add to cart"
        When check if alert message is same with "Product added."
        And accept alert
        Then navigate back "2" times
        And i click item "ASUS Full HD"
        When item "ASUS Full HD" is opened
        Then i click item "Add to cart"
        When check if alert message is same with "Product added."
        And accept alert
        Then navigate back "2" times
        When i click "Cart" tab
        And check if fist table is appear
        And check if cart is not empty
        Then close browser