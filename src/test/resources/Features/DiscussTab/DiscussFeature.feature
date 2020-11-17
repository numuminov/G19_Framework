Feature: Manage Discuss module
@channel
  Scenario: Creating new channel

Given user is on the Discuss page
When user clicks on plus icon in a front of the Channel
Then empty input box should be displayed
And user should be able to type a channel name
Then newly created channel name should be visible under Channels