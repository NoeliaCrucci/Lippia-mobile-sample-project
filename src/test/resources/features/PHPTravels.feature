Feature: As a traveler user I want to interact with the mobile application to find and book a hotel in Argentina

  @Demo
  Scenario Outline: The user books a hotel room in Argentina
    Given The user is in 'HOTELS' search page
    When The user clicks over Destination field and selects <City> ARG
    And Clicks on Search
    And Selects <Hotel> in the results list
    And Books a room
    And Completes Card info with <CC Num>, <CC Name>, <ExpMMYY>, and <CVV> 
    And Completes Personal info with <Name>, <LastName>, <Email> and <Phone> and clicks Continue button
    Then The user gets the payment confirmation message: 'successfull'
    Examples:
	    |City					|Hotel								|CC Num						|CC Name		|ExpMMYY	|CVV	|Name		|LastName	|Email					|Phone			|
	    |Buenos Aires	|Hilton Buenos Aires	|4263982640269299	|Noe Test		|0223			|837	|Noelia	|Crucci		|test@test.com	|156404040	|	
	  	|Rosario			|Hotel Solans Riviera	|4263982640269298	|Noe Test2	|0226			|937	|Juan		|Godoy		|test@test2.com	|155404040	|	