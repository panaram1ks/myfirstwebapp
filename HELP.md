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
/login => com.in28minutes.springboot.myfirstwebapp.login.LoginController => login.jsp

## localhost:8080/login
B1: Identifies correct Controller method
/login => LoginController.gotoLoginPage
B2: Executes Controller method
=> Put data into model
=> Returns view name => login
B3: Identifies correct View
/WEB-INF/jsp/login.jsp => View Resolver
B4: Executes view


