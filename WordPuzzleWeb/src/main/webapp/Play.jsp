<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.Timer" %>
<%@ page import="org.yccait.service.WordService" %>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
<style>
    body {
        font-family: Arial, sans-serif;
        background:#eef2f3;
        text-align:center;
        padding-top:30px;
        justify-content:center;	
    }
    table {
/*         margin:auto; */
        border-collapse:collapse;
    }
    td {
        width:50px;
        height:50px;
        background:white;
        text-align:center;
        font-size:24px;
        font-weight:bold;
        border:2px solid #555;
        border-radius:8px;
    }
    input {
        padding:8px;
        font-size:18px;
        border-radius:5px;
        border:1px solid #888;
    }
    button {
        margin-top:10px;
        padding:10px 18px;
        font-size:16px;
        border-radius:5px;
        cursor:pointer;
        background:#28a745;
        color:white;
        border:none;
    }
    button:hover {
        background:#1e7a34;
    }
</style>
	</head>
	<body style="text-align:center;">
		<%
	    	String msg=(String) session.getAttribute("wrongGuess");
	    	if (msg!=null) {
		%>
	        <h3 style="color:red;">
	        <%=	msg%>
	        </h3>
		<%
	        session.removeAttribute("wrongGuess"); 
	    	}
		%>
		<h3> Time 
		<% Timer t=new Timer();
			
		%>
		</h3>
		<%
			
		
		    String word = (String) session.getAttribute("actualWord");
	
		    if (word == null) {  
		        word = WordService.pickWord();
		        session.setAttribute("actualWord", word);
		    }
			char[] arr=WordService.shuffle(word.toCharArray());
		
			String[][] grid =new String[3][3];
			int k=0;
			for(int i=0;i<3;i++) {
			    for(int j=0;j<3;j++) {
			        grid[i][j]=String.valueOf(arr[k++]);
			    }
			}
			
			
		%>
			<h3>Rearrange the letters to guess the word:</h3>
			<table border="1" cellpadding="10" style="margin:auto;">	
		<% 
			for(int i=0;i<3;i++) { 
		%>	
			<tr>
	    <%
	    	for(int j=0;j<3;j++) { 
	    %>
	    	<td>
	    	<%= 
	    		grid[i][j] 
	    	%>
	    	</td>
	    <%
	    	} 
	    %>
			</tr>
		<% 
			} 
	
		%>
		<form action="result.jsp" method="post">
		<pre>
		<input type="text" name="word"/>
		<button type="submit">Guessed</button>
		</pre>
		</form>
	</body>
	</html>