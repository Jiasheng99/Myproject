<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tienda</title>
<style>
	body{
		text-align: center;
	}
	h3{
		background-color: skyblue;
	}
	.img{
		width: 100px;
		height: 60px;
		border: 1px solid black;
		display: inline-block;
		margin-left: 10px;
		background-color: lightgrey;
		padding-top: 40px;
	}
	#grande{
		width: 100%;
	}
	#cbox1{
	margin-left:30px;
	}
	#cbox2{
	margin-left:100px;
	}
	#cbox3{
	margin-left:100px;
	}
	#cbox4{
	margin-left:100px;
	}
	#cbox5{
	margin-left:100px;
	}
	#pagar{
	background-color: orange;
	margin-bottom: 30px;
	}
	p{
	display: inline-block;
	margin-top: -10px;
	margin-left: 10px;
	background-color: orange;
	}
	#blanco{
	width: 100px;
	height: 100px;
	border: 1px solid black;
	margin-left: 650px;
	margin-top: -100px;
	}
</style>
</head>
<body>
	<h3>FORM Products Available</h3>
	<div class="img" id="img1">img1</div>
	<div class="img" id="img2">img2</div>
	<div class="img" id="img3">img3</div>
	<div class="img" id="img4">img4</div>
	<div class="img" id="img5">img5</div>
	<div id="grande">
		<input type="checkbox" id="cbox1" value="first_checkbox">
		<input type="checkbox" id="cbox2" value="second_checkbox">
		<input type="checkbox" id="cbox3" value="third_checkbox">
		<input type="checkbox" id="cbox4" value="four_checkbox">
		<input type="checkbox" id="cbox5" value="five_checkbox">
	</div>
	<div id="pagar">
		<h3>Payment Mode</h3>
		<p>Cash<input type="radio" id="Cash" name="pay" value="Cash"
         checked></p>
        <p>Credit Card
        <input type="radio" id="Creditcard" name="pay" value="Credit Card"
         checked></p>
        <p>PayPal
        <input type="radio" id="Paypal" name="pay" value="Paypal"
         checked></p>
	</div>
	<div>
		<p>NICK</p>
		<input type="text" name="text" />
		<p>Comments</p>
	</div>
	<div>
		<p>Quantity</p>
		<select name="select">
		  <option value="value1">Value 1</option> 
		  <option value="value2" selected>Value 2</option>
		  <option value="value3">Value 3</option>
		</select>
		<p>SEND</p>
		<p>DEL</p>
	</div>
	<div>Credits</div>
	<div id="blanco"></div>
</body>
</html>