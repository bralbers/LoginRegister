<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" name="viewport"
	content="width=device-width, initial-scale=1">
<title>News</title>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Source+Code+Pro"
	rel="stylesheet">
<link rel="stylesheet" href="news.css">
</head>
<body>
	<header>
		<div class="row  row--no-pad-t-b">
			<a href="http://localhost:8088/LoginRegister"><img
				class="logo  imag-scaling" src="/WEB-INF/assets/News_logo.png"></a>
			<div class="search-container">
				<form action="/action_page.php">
					<input type="text" placeholder="Search.." name="search">
					<button type="submit">
						<i class="fa fa-search"></i>
					</button>
				</form>
			</div>
			<nav class="header-nav">
				<ul>
					<li><i class="fas fa-bars fa-2x"></i>
						<c:if test="${ empty sessionScope.status }">
							<li><a href="login">Log-In</a></li>
						</c:if> 
						<c:if test="${ not empty sessionScope.status }">
							<li><a href="logout">LogOut</a></li>
						</c:if>
					<li><a href="">US</a></li>
					<li><a href="">World</a></li>
					<li><a href="">Sports</a></li>
					<li><a href="">Entertainment</a></li>
				</ul>
			</nav>
		</div>
	</header>
	<section class="help--bg">
		<div class="row">
			<div class="col col2  turn-off">
				<h5>Live News</h5>
				<iframe src="https://giphy.com/embed/TgMNafqVnMaNumw0Vn" width="220"
					height="220" frameBorder="0" class="giphy-embed">
					<a href=""></a>
				</iframe>
				<h5>Latest Videos</h5>
				<div>
					<ul>
						<li><a class="decorator  added-padding" href="">Lorem
								ipsum dolor</a></li>
						<li><a class="decorator  added-padding" href="">Lorem
								ipsum dolor</a></li>
						<li><a class="decorator  added-padding" href="">Lorem
								ipsum dolor</a></li>
						<li><a class="decorator  added-padding" href="">Lorem
								ipsum dolor</a></li>
						<li><a class="decorator  added-padding" href="">Lorem
								ipsum dolor</a></li>
					</ul>
				</div>
			</div>
			<div class="col col8">
				<h1>Headline News</h1>
				<a class="decorator" href=""> <img class="imag-scaling"
					src="http://placeimg.com/1024/576/people">
					<p class="shape-change">Lorem ipsum dolor sit amet, consectetur
						adipiscing elit. Nullam diam dui, suscipit sed laoreet mollis,
						rhoncus vel mauris. Proin viverra arcu massa, eu maximus ipsum
						dictum vitae. Nullam egestas nec eros sed tempor. Interdum et
						malesuada fames ac ante ipsum primis in faucibus. Etiam risus
						felis, elementum quis finibus at, efficitur ut quam.</p>
				</a>
			</div>
		</div>
		<div class="row">
			<div class="col  col8">
				<h2>Latest News</h2>
				<div>
					<ul>
						<li>
							<div class="col  spacing">
								<a class="decorator  imag-scaling" href=""><p
										class="latest_news">
										<img src="http://placeimg.com/200/200/people">
									</p>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
										Nullam diam dui, suscipit sed laoreet mollis, rhoncus vel
										mauris. Proin viverra arcu massa, eu maximus ipsum dictum
										vitae. Nullam egestas nec eros sed tempor. Interdum et
										malesuada fames ac ante ipsum primis in faucibus. Etiam risus
										felis, elementum quis finibus at, efficitur ut quam. Nam eget
										porttitor libero. Donec vel imperdiet eros, a vulputate neque.
										Nullam a egestas ligula. Nullam sit amet fringilla odio, vitae
										tempor nisl. Aenean et est eget mi bibendum tempor. Nullam
										convallis nisl metus, sed varius tellus fringilla vel. Nullam
										gravida imperdiet dapibus.</p></a>
							</div>
						</li>
						<li>
							<div class="col  spacing">
								<a class="decorator  imag-scaling" href=""><p
										class="latest_news">
										<img src="http://placeimg.com/200/200/animals">
									</p>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
										Nullam diam dui, suscipit sed laoreet mollis, rhoncus vel
										mauris. Proin viverra arcu massa, eu maximus ipsum dictum
										vitae. Nullam egestas nec eros sed tempor. Interdum et
										malesuada fames ac ante ipsum primis in faucibus. Etiam risus
										felis, elementum quis finibus at, efficitur ut quam. Nam eget
										porttitor libero. Donec vel imperdiet eros, a vulputate neque.
										Nullam a egestas ligula. Nullam sit amet fringilla odio, vitae
										tempor nisl. Aenean et est eget mi bibendum tempor. Nullam
										convallis nisl metus, sed varius tellus fringilla vel. Nullam
										gravida imperdiet dapibus.</p></a>

							</div>
						</li>
						<li>
							<div class="col  spacing">
								<a class="decorator  imag-scaling" href=""><p
										class="latest_news">
										<img src="http://placeimg.com/200/200/arch">
									</p>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
										Nullam diam dui, suscipit sed laoreet mollis, rhoncus vel
										mauris. Proin viverra arcu massa, eu maximus ipsum dictum
										vitae. Nullam egestas nec eros sed tempor. Interdum et
										malesuada fames ac ante ipsum primis in faucibus. Etiam risus
										felis, elementum quis finibus at, efficitur ut quam. Nam eget
										porttitor libero. Donec vel imperdiet eros, a vulputate neque.
										Nullam a egestas ligula. Nullam sit amet fringilla odio, vitae
										tempor nisl. Aenean et est eget mi bibendum tempor. Nullam
										convallis nisl metus, sed varius tellus fringilla vel. Nullam
										gravida imperdiet dapibus.</p></a>
							</div>
						</li>
						<li>
							<div class="col  spacing">
								<a class="decorator  imag-scaling" href=""><p
										class="latest_news">
										<img src="http://placeimg.com/200/200/tech">
									</p>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
										Nullam diam dui, suscipit sed laoreet mollis, rhoncus vel
										mauris. Proin viverra arcu massa, eu maximus ipsum dictum
										vitae. Nullam egestas nec eros sed tempor. Interdum et
										malesuada fames ac ante ipsum primis in faucibus. Etiam risus
										felis, elementum quis finibus at, efficitur ut quam. Nam eget
										porttitor libero. Donec vel imperdiet eros, a vulputate neque.
										Nullam a egestas ligula. Nullam sit amet fringilla odio, vitae
										tempor nisl. Aenean et est eget mi bibendum tempor. Nullam
										convallis nisl metus, sed varius tellus fringilla vel. Nullam
										gravida imperdiet dapibus.</p></a>
							</div>
						</li>
					</ul>
				</div>
			</div>
			<div class="col  col4">
				<h5 class="section-heading">Editor Picks</h5>
				<div>
					<div class="row">
						<a class="decorator" href="">Lorem ipsum dolor sit amet,
							consectetur adipiscing elit. Integer sollicitudin.</a>
					</div>
					<div class="row">
						<a class="decorator" href="">Lorem ipsum dolor sit amet,
							consectetur adipiscing elit. Integer sollicitudin.</a>
					</div>
					<div class="row">
						<a class="decorator" href="">Lorem ipsum dolor sit amet,
							consectetur adipiscing elit. Integer sollicitudin.</a>
					</div>
					<div class="row">
						<a class="decorator" href="">Lorem ipsum dolor sit amet,
							consectetur adipiscing elit. Integer sollicitudin.</a>
					</div>
					<div class="row">
						<a class="decorator" href="">Lorem ipsum dolor sit amet,
							consectetur adipiscing elit. Integer sollicitudin.</a>
					</div>
					<div class="row">
						<a class="decorator" href="">Lorem ipsum dolor sit amet,
							consectetur adipiscing elit. Integer sollicitudin.</a>
					</div>
					<div class="row">
						<a class="decorator" href="">Lorem ipsum dolor sit amet,
							consectetur adipiscing elit. Integer sollicitudin.</a>
					</div>
					<div class="row">
						<a class="decorator" href="">Lorem ipsum dolor sit amet,
							consectetur adipiscing elit. Integer sollicitudin.</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<footer>
		<div class="row  row--no-pad-t-b">
			<p>Copyright 20XX</p>
			<nav class="footer-nav">
				<ul>
					<li><a href="">US</a></li>
					<li><a href="">World</a></li>
					<li><a href="">Sports</a></li>
					<li><a href="">Entertainment</a></li>
				</ul>
			</nav>
		</div>
	</footer>
</body>
</html>