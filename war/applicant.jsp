<html>
<link rel="stylesheet" href="css/colstyle1.css">
<head>
<script lang="javascript">
function s2()
{
	alert('HAI');
	document.getElementById('content2').src = "home.html";	
}
</script>
</head>
<body  background="image/clg1.jpg">
	<table class="applicant1" >
		<th>NEW APPLICANT</th>
		<th>OLD APPLICANT</th>	
		<tr><td>
		<form name="newapplicant" class="newapplicant" method="post" action="/Applicanttable">
			<table border="0">
				<tr><td class="two"> User Name :</td>
   				<td><input type="text" id="demo" name="userid"></td>
				<tr><td class="two"> Pass Word :</td>
   				<td><input type="password" name="userpass"></td>
				<tr><td class="two">Conform Password:</td>
    			<td><input type="password" name="usercfmpass"></td>
				<tr><td><!-- <a href="home.html" class="w3-right w3-btn">SIGN UP</a></td>  -->
  						<input type="submit" value="SAVE" class="button"></input>
    				<td><input type="reset" class="button" name="clear1" value="CLEAR"></td></tr>	<!-- class="w3-right w3-btn" -->
			</table>
			</form>
		</td>
		
		
		<hr>
		
		<td>
	<form name="oldapplicant" method="post" action="/Oldapplicanttable">
			<table class="oldapplicant" >
			<!-- border=1 width=30% height=5% align="center"> --> 
				<tr><td class="two">User Name :</td>
   				<td><input type="text" name="userid"></td></tr>
				<tr><td class="two">Pass Word :</td>
				<td><input type="password" name="userpass"></td></tr>
					<tr><td>
					<input type="submit" class="button" name="signin" value="SIGNIN" onclick="alert('conform test')"></input>
					<!-- <a href="home.html" class="w3-right w3-btn" onclick="alert('conform test')" target="content2" type="submit">SIGN IN</a> -->
					</td>
			    <td><input type="reset" class="w3-right w3-btn" name="clear2" value="RESET"></input></td></tr>
			    </table>
			    </form>
		 </td>
			   
			   </tr>
			   <tr>
			   <td style="color: red; text-align: center;"><%=request.getAttribute("message") %>
			   </td>
			   </tr>
			</table>
			

</body>
</html>