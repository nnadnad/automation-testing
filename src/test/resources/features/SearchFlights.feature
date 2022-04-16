@Mobile
  Feature: As a user i want to search flight from Jakarta to Padang

    Scenario: User Search Flight from Jakarta to Padang
#      Given user already on landing page and the title is "Hello! Welcome to Traveloka."
      When user choose location indonesia
      And user click continue onboard button
      And user click skip information landing button
      And user click skip for now in sign in page
      And user click nextToolTip button
      And user click button later for enable location
      And user click flight search icon
      And user click all jakarta flight option
      And user click all padang flight option
      Then user click search flight button
