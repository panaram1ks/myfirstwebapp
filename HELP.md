# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

<html>
<head>
    <title>My first HTML Page</title>
</head>
<body>
My first HTML page with body
</body>
</html>

## JSP default path in springboot application
/src/main/resources/META-INF/resources/META-INF/jsp/

## Login JSP
/login => com.in28minutes.springboot.myfirstwebapp.welcome.WelcomeController => login.jsp

## localhost:8080/login
B1: Identifies correct Controller method
/login => LoginController.gotoLoginPage
B2: Executes Controller method
=> Put data into model
=> Returns view name => login
B3: Identifies correct View
/WEB-INF/jsp/login.jsp => View Resolver
B4: Executes view

## Todo
id
username
description
targetDate
done

## TodoController
listTodos.jsp

## Request vs Model vs Session

/META-INF/resources/webjars/bootstrap/5.1.3/css/bootstrap.min.css
/META-INF/resources/webjars/bootstrap/5.1.3/js/bootstrap.min.js
/META-INF/resources/webjars/jquery/3.6.0/jquery.min.js



