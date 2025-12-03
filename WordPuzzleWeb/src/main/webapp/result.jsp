	<%@ page language="java" contentType="text/html; charset=UTF-8"
	    pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>Word Puzzle Game</title>
	<style>
    body {
        font-family: Arial, sans-serif;
        background:#e8f5e9;
        text-align:center;
        padding-top:100px;
    }
    button {
        padding:10px 18px;
        font-size:16px;
        border-radius:5px;
        cursor:pointer;
        background:#2196F3;
        color:white;
        border:none;
    }
   
</style>
	</head>
	<body style="text-align:center;">
		<%
			String guess = request.getParameter("word");
		String username=(String)session.getAttribute("user");
			String actual = (String) session.getAttribute("actualWord");
		%>
		<h2>
		<% 
			if (guess!=null && actual!=null && !guess.equalsIgnoreCase(actual)) { 
				session.setAttribute("wrongGuess", "❌ Wrong guess — Try again!");
				  response.sendRedirect("Play.jsp");
			        return;
			}
		%>
			<h2> Congratulations! <%=username %>
			</h2>
			Correct! You solved the puzzle!
			<br><br>
			
			
		<%
			session.removeAttribute("actualWord");
		
		
		%>
	</h2>
	<a href="index.jsp">Play Again</a>
	</body>
	</html>