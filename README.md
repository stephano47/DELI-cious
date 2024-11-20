# DELI-cious [A Sandwich ordering Application]

## Introduction:
Welcome to the DELI-cious application! This app is currently responsible for making the order process for any Deli easier for the customer, allowing them to Order from this client generating a receipt if they choose to Checkout.

## User Interface:

![User Menu]("C:\Users\sayia\Downloads\Screenshot 2024-11-18 102421.png")
* This will be what the User First sees when they create a new order.
* They will be able to choose either Adding a Sandwich, Chips, or a Drink to their liking
* They also will have the option to either Checkout which will show them what they have ordered and will ask if they wish to confirm what is displayed to them
* Or they will be able to Cancel the order and return to the Main Method.

## Sandwich Class














## Comments:
These were comments written by me showing my thought process through out the creation of this project

NOTE - It is not updated to the current date 
   File Writer should be working the moment the user makes the new order
   It will first get the bread then the size.
   The regular toppings next but the question is how can I allow the writer to put more than one topping in the same text.
   I realised im thinking of this as a csv file this is not what we are doing it will be a txt file at the end.
   The premium topping should first be considered a boolean if the user would like meats and/or cheese it calls the premium method.
   If premium is chosen they will cost more and there are extra options (extra can be a boolean).
   If not it is considered false and will print out "None" or maybe just not have it there at all so return null perhaps.
   After the toppings are chosen by the user it will then ask for toasted option if no it will return null if yes then the console will printout Toasted or (T)
   after that return to the Order loop.
   Since the Drinks and Chips method would be very similar to the sandwich method some majority of the code could be pasted in those classes
   When the user is ready for checkout the file reader shows what they will order.
   A simple boolean for Y/N will be good enough
   Then it goes back to the main loop and do it all over again if needed.



