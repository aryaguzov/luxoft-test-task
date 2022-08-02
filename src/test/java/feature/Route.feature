Feature: Route functionality

  Scenario: Validate successful route search

    Given The user accesses the OpenStreetMap home page
    When The user clicks on the directions button
    And The user enters the location into the route-from field
    And The user enters the location into the route-to field
    And The user chooses Bicycle (OSRM) as a desired type of transport
    And The user clicks on the go button
    Then The script should verify total distance of the route
