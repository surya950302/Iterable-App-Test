# Iterable-App-Test
This Iterable App Test application is a basic app which leverages the Iterable SDK to perform tasks given by an interviewer for grading purposes.

## Step-1
In this step given an Iterable API key the app should do the following:-

- Be initialized using the email id and
- By the click of a update user profile button should be able to send some data to Iterable.

*This has been achieved by initializing the SDK before the activity is launched. The 2nd portion is done using a button with an onClick method which in turn generates the JSON needed to be sent and calls the update user method of the Iterable API.*

## Step-2
In this step a Custom Event had to be sent given some Key value pairs and and Event Name.

*This was achieved by using Event tracking. The key thing to note was that the track method actually performs a post method request.*

## Step-3
In this step the application should be able to render an in-App message queued by the Iterable SDK and the interviewee should be able to screenshot it.

*This was achieved by first initializing the inAppManager and then getting a list of all queued up messages using the getMessages method. Then it was just a matter of looping through the messages and rendering them one by one using the showMessage method. The screenshot of the rendered message is actually a piece of art with a congratulations test for completeing the test*


![image](https://user-images.githubusercontent.com/20185352/116001624-577dcc80-a5c3-11eb-9980-3333847b1487.png)


