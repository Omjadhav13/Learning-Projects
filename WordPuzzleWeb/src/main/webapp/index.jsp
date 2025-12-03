<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Word Puzzle Game</title>

<style>
    body {
        font-family: Arial, sans-serif;
        text-align: center;
        padding-top: 100px;
    }
    .box {
        width: 350px;
        margin: auto;
        padding: 20px;
        border-radius: 10px;
    }
    button {
        background-color: #008CBA;
        color: white;
        border: none;
        padding: 10px 20px;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
    }
    button:hover {
        background-color: #005f73;
    }
</style>

</head>
<body>

<div class="box">
    <h2>Word Puzzle Game</h2>
    <form action="startGame" method="post">
        <p>Enter your name:</p>
        <input type="text" name="user" required><br><br>
        <button type="submit">Start Game</button>
    </form>
</div>

</body>
</html>
