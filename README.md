# SSE User Notification with Flux 

A notification system using Spring Web Flux and Server sent Events. Whenever a user recieves a notification, an SSE is going to be pushed to the user.

![Image of sse and webflux](https://i.ibb.co/BNpvcCR/image.png)

# Table of contents
* [General info](#general-info)
* [Thought process and problem statement](#thought-process-and-problem-statement)
* [Screenshots](#screenshots)
* [Topics](#topics)
* [Demo](#demo)

## General info
Server-Sent-Events, or SSE for short, is an HTTP standard that allows a web application to handle a unidirectional event stream and receive updates whenever the server emits data.
In this project, we make use of implementations such as the Flux class provided by the Reactor library, or potentially the ServerSentEvent entity, which gives us control over the events metadata.

Flux is a reactive representation of a stream of events – it's handled differently based on the specified request or response media type. An SSE is a specification adopted by most browsers to allow streaming events unidirectionally at any time.
The **events** are just a stream of UTF-8 encoded text data that follow the format defined by the specification.

## Thought process and problem statement
This application is designed to provide the user with a real-time receiving of notifications that are relevant to him/her. The idea is to take advantage of the Reactive Stream Specification to build a non-blocking reactive application. In this case, I've achieved a non-blocking operation using Spring's web-flux framework and implemented Server-Sent-Events(SSE) in java spring. For the desired result I established a stream connection witha every incoming user and sent out notifications to the relevant active users.

## Screenshots
<img align="left" src="https://i.ibb.co/SX5nkmm/Notifications.png">
<img align="center" width="1000px" src="https://i.ibb.co/wyKjg8N/Swagger.png">

## Topics
- Spring 5
- Spring web flux 
- SSE
- Swagger
- Thymeleaf
- HTML,CSS,JS 

## Demo
The purpose of this application is to provide the user all the notification that the user receives through anyone or any broadcast messages that he/she subscribe.
In Order to subscribe as a particular user or see all the relevant notification for an user, replace the userName in the below URL("/?user=userName") and you will
be subscribed to receive notification of that user.
```
https://webfluxnotification.herokuapp.com/?userId=userName
```

In order to create a notification for a particular user try out it through below mentioned swagger ui.

```
https://webfluxnotification.herokuapp.com/swagger-ui.html 
```

</br>
Click on try out for /notifications for a POST call.
Use the below sample Json for creating the request.

```
{
"userId":"User1",
"notificationDetails":"First Notification"
}
```

