<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>中正大學資管&醫資104</title>
<jsp:include page="/pages/header.jsp"></jsp:include>
</head>

<body>
	<div id="wrapper">
		<jsp:include page="/pages/nav.jsp"></jsp:include>
		<!-- Main -->
		<div id="main">

			<!-- Me -->
			<article id="me" class="panel">
				<header>
					<h1>CCU MIS 104</h1>
					<p>畢代&畢編抽籤網址</p>
				</header>
				<a href="#Ballot" class="jumplink pic"> <span
					class="arrow icon fa-chevron-right"><span>See my work</span></span>
					<img src="<%=request.getContextPath()%>/pages/images/me.jpg" alt="" />
				</a>
			</article>

			<!-- Ballot -->
			<article id="Ballot" class="panel">
				<header>
					<h2>亂數抽籤</h2>
				</header>
				<p>按下抽籤按鈕，系統將會抽出資管&醫資的畢代和畢編。</p>
				<div class="12u$">
					<form action="ballot_go" method="put">
						<input type="submit" value="點我抽籤" />
					</form>
				</div>
			</article>


			<article id="about" class="panel">
				<header>
					<h2>關於本網頁</h2>
				</header>
				<p>104 CCU MIS 畢業畢編抽籤測試</p>
				<p>目前只有資管所學生可提供抽籤</p>
				<p>作者：JunChiChen</p>
				<p>
					網頁原始碼：<a href="https://github.com/coljason2/ccumisgraduate"
						target="_blank">點我</a>
				</p>
			</article>
		</div>
		<jsp:include page="/pages/foot.jsp"></jsp:include>
	</div>
</body>
</html>
