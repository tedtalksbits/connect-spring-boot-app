<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Connect | Connecting people worldwide🌍</title>
        <link rel="stylesheet" href="/css/style.css" />
        <link rel="preconnect" href="https://fonts.googleapis.com" />
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
        <link
            href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,300;1,400;1,700&display=swap"
            rel="stylesheet"
        />
    </head>
    <body>
        <header>
            <nav>
                <div class="logo">
                    <a href="/home"
                        ><img src="/images/connect.svg" alt="connect logo"
                    /></a>
                </div>
                <ul class="links">
                    <li><a href="/home">Home</a></li>
                    <li><a href="">About</a></li>
                    <li><a href="">Contact</a></li>
                    <li><a href="/goToBlog">Blogs</a></li>
                </ul>
            </nav>
        </header>
        <main class="main">
        	<h1 class="heading" style="text-align: center;">Register</h1>
            <div >
	           <form:form class="auth-form" action="/registerUser" method="post" modelAttribute="newuser">
		            <div class="form-field">		            
		            	<label for="firstName">First Name *</label>
		                <form:input type="text" path="firstName" id="firstName" required="true" />
		            </div>
		            <div class="form-field">		            
		            	<label for="lastName">Last Name *</label>
		                <form:input type="text" path="lastName" id="lastName" required="true"/>
		            </div>
		            <div class="form-field">		            
		            	<label for="email">Email</label>
		                <form:input type="email" path="email" id="email" />
		            </div>
		            <div class="form-field">		            
		            	<label for="username">Username *</label>
		                <form:input type="text" path="username" id="username" required="true" />
		                <form:errors path="username" cssClass="error" />
		            </div>			            	            
		            <div class="form-field">		            
		            	<label for="password1">Password *</label>
		                <form:input type="password" path="password" id="password1" required="true" />
		                <form:errors path="password" cssClass="error" />
		            </div>
		            <div class="form-field">		            
		            	<label for="password2">Confirm Password *</label>
		                <input type="password" name="password2" id="password2" required/>
		            </div>			            
		            <a href="/goToLogin">Already have an account? Login</a>
		            <div class="form-field">		            
		                <input type="submit" value="Register" >
		            </div>	           			                          
	            </form:form>                
            </div>
        </main>
    </body>
</html>
