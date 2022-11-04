<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Connect | Connecting people worldwide🌍</title>
        <link rel="stylesheet" href="/css/style.css" />
        <link rel="preconnect" href="https://fonts.googleapis.com" />
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
        <link
            href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,300;1,400;1,700&display=swap"
            rel="stylesheet"
        />
        <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
        
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
          			<li><a href="/goToLogin">Login</a></li>
                </ul>
            </nav>
        </header>
        <main class="main">
	        <h1 class="heading">Blogs <i class='bx bx-news' ></i></h1>
	        <form action="/blog" method="get">
	          <div class="search">	          		
	              	<input type="search" placeholder="Search" name="search" required />	                            
	              	<input type="submit" value="Seach"/>	              
	          </div>
	        </form>
	        
	        <div class="blogs">
	        		<h1>Based on Search Results</h1>
	         	<c:if test="${!empty(articles)}">
	         		<div class="blog-wrapper">
	         			<c:forEach var="article" items="${articles}">
	          			<div class="blog">
	           			<div class="img-container">
	           				<c:if test="${article.image == ''}">
	           					<img src="https://via.placeholder.com/250" />
	           				</c:if>
	           				<c:if test="${!article.image == ''}">
	           					<img class="blog-img" src="${article.img}" />
	           				</c:if>
	           			</div>
	          				<small class="blog-date">${article.date} by ${article.author}</small>
	          				<h3 class="blog-title">${article.title}</h3>
	          				<p class="blog-content">${article.content}</p>
	          			</div>
	         			</c:forEach>
	         		</div>
	         	</c:if>
	         	<c:if test="${empty(articles)}"> no result</c:if>
	        </div>         
        </main>
    </body>

</html>
