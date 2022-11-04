<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        	<div class="success">${dataSaved}</div>
        	<h1 class="heading" style="text-align: center;">Login</h1>
            <div>
	           <form class="auth-form" action="#" method="get">
		            <div class="form-field">		            
		            	<label for="username">Username *</label>
		                <input type="text" name="username" id="username" value="${newUsername}" required>
		            </div>
		            <div class="form-field">		            
		            	<label for="password">Password *</label>
		                <input type="password" name="password" id="password" required>
		            </div>
		            <div class="remember-me">		            
		            	<label for="remeber">Remember me</label>
		                <input type="checkbox" name="remember" id="remember" >
		            </div>
		            <a href="/goToRegister">Register for an account</a>
		            <div class="form-field">		            
		                <input type="submit" value="Login" >
		            </div>	           			                          
	            </form>                
            </div>
        </main>
    </body>
</html>
