<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
<style>
	.container{
		width : 30%;
		border: 4px solid black;
		margin : auto;
		padding : 20px;
		font-size : 20px;
		}
		#myform table tr td input{
			font-size : 20px;
		}
</style>
</head>

<body>
	<div class="container" >
	<h1 style="text-align : center">Login Form</h1>
	<form id="myform" action="RegisterServlet" method="post">
		<table>
			<tr>
				<td>Enter Name :</td>
				<td><input type="text" name="user_name" placeholder="Enter here..."></td>			
			</tr>
			
			<tr>
				<td>Enter Password  :</td>
				<td><input type="password" name="user_password" placeholder="Enter here..."></td>			
			</tr>
			
			<tr>
				<td>Enter Email  :</td>
				<td><input type="email" name="user_email" placeholder="Enter here..."></td>			
			</tr>
			
			<tr>
				<td>Select Gender</td>
				<td><input type="radio" name="user_gender" value="male"> Male &nbsp; &nbsp; <input type="radio" name="user_gender" value="female"> Female </td>			
			</tr>
			
			<tr>
				<td>Select your Course</td>
				<td style="text-align : center ">
					<select name="user_course">
						<option value="Java">Java</option>
						<option value="Html">Html</option>
						<option value="CSS">CSS</option>
						<option value="Javascript">Javascript</option>
					</select>
				</td>
			</tr>				
			
			<tr>
				<td style="text-align : right "><input type="checkbox" value="checked" name="condition" /></td>			
				<td>*Agree terms and conditions.</td>	
			</tr>
			
			<tr>	
				<td>
				
				</td>	
				<td>
					<button type="reset">Reset</button>
  					<button type="submit">Submit</button>
				</td>	
			</tr>
			
		 </table>
		</form>
	</div>
</body>
</html>