<html lang="en">
 <meta http-equiv="content-type" content="text/html; charset=UTF-8">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
     <title>college online application form</title>
     
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
   
   <% 
if(session.getAttribute("username") == null)
{
	response.sendRedirect("/applicant.jsp");
}
%>

<link rel="stylesheet" href="css/colstyle1.css" type="text/css">

<script lang="javascript" type="text/javascript">
function agecalc()
	{
		var k=2017-(document.getElementById('year').value);
		alert(k);
   		document.getElementById('age').value=k;		
	}
function sayHello()
        {
		alert("Hello there!");
        }
function validatepersonal(personal)
	{
		error1="1";
		error2="2";
		if(personal.firstname.value=="")
			error1+="first name";
		if(personal.middlename.value=="")
			error1+="\nmiddle name";
		if(personal.lastname.value=="")
			error1+="\nlast name";
		if(personal.day.value=="")
			error1+="\nday";
		if(personal.month.value=="---selectone---")
			error1+="\n month";
		if(personal.year.value=="")
			error1+="\nyear";
		if(personal.age.value=="")
			error1+="\nage"
		if(personal.fathername.value=="")
			error1+="\nfather name";
		if(personal.mothername.value=="")
			error1+="\nmother name";
		if(personal.annualincome.value=="")
			error1+="\nannual income";
		if(personal.fatheroccupation.value=="")
			error1+="\nfather occupation";
		if((personal.gender[0].checked == false)&&(personal.gender[1].checked==false))
			error1+="\nchoose your Gender: Male or Female";
		if(personal.religion.value=="---selectone---")
			error1+="\nselect religion";
		if(personal.caste.value=="---selectone---")
			error1+="\nselect caste";
		if((personal.stp[0].checked==false)&&(personal.stp[1].checked==false))
			error1+="\nselect option if you are special talented person or not";
		if((personal.exserviceman[0].checked==false)&&(personal.exserviceman[1].checked==false))
			error1+="\nselect yes or no for ex-serviceman";
		if(personal.bloodgroup.value=="")
			error1+="\nselect BLOOD GROUP";
		if(error2=="2")
			{
				alert('hai');
			    
			}
		alert(error1+error2);
}	
</script>
<script type="text/javascript">
$(document).ready(function(){
   
	$("#update").click(function(){
    	alert("Update");
    	var firstname 			= $("input[name=firstname]").val();
    	var middlename 			= $("input[name=middlename]").val();
    	var lastname 			= $("input[name=lastname]").val();
    	var day 				= $("input[name=day]").val();
    	var month 				= $("input[name=month]").val();
    	var year 				= $("input[name=year]").val();
    	var age 				= $("input[name=age]").val();
    	var gender 				= $("input[name=gender]").val();
    	var fathername 			= $("input[name=fathername]").val();
    	var fatheroccupation 	= $("input[name=fatheroccupation]").val();
    	var mothername 			= $("input[name=mothername]").val();
    	var annualincome 		= $("input[name=annualincome]").val();
    	var religion 			= $("input[name=religion]").val();
    	var caste 				= $("input[name=caste]").val();
    	var stp 				= $("input[name=stp]").val();
    	var exserviceman 		= $("input[name=exserviceman]").val();
    	var bloodgroup 			= $("input[name=bloodgroup]").val();
    	
    	alert(firstname);
    	alert(lastname);
    	
    	
        $.ajax({
        	url: "/update",
        	type: "post",
        	data: {firstname : firstname, lastname : lastname, middlename : middlename, day : day, month : month, year : year, age : age
        		, gender : gender, fathername : fathername, fatheroccupation : fatheroccupation, mothername : mothername, annualincome : annualincome
        		, religion : religion, caste : caste, stp : stp, exserviceman : exserviceman, bloodgroup : bloodgroup},
        	success: function(result){
           alert("done");
        			},
   			error: function(result){
   			}
        	});
    });
    
 $("#recover").click(function(){
    	alert("retrieve");
        $.ajax({
        	url: "/retrieve",
        	type: "post",
        	success: function(result){
        		alert(result);
           			data = $.parseJSON(result);
             		$("input[name=firstname]").val(data.firstname);
             		$("input[name=lastname]").val(data.lastname);
             		$("input[name=middlename]").val(data.middlename);
                	$("input[name=day]").val(data.day);
                	$("input[name=month]").val(data.month);
                	$("input[name=year]").val(data.year);
                	$("input[name=age]").val(data.age);
                	$("input[name=gender]").val(data.gender);
                	$("input[name=fathername]").val(data.fathername);
                	$("input[name=fatheroccupation]").val(data.fatheroccupation);
                	$("input[name=mothername]").val(data.mothername);
                	$("input[name=annualincome]").val(data.annualincome);
                	$("input[name=religion]").val(data.religion);
                	$("input[name=caste]").val(data.caste);
                	$("input[name=stp]").val(data.stp);
                	$("input[name=exserviceman]").val(data.exserviceman);
                	$("input[name=bloodgroup]").val(data.bloodgroup);
           },
   			error: function(result){
   	            $("#div1").html(result);
   			}
        	});
    });
});
</script>
</head>

<body class="one">
  <form name="personal" method="post" action="">
  <section id="personal">

</section><table class="personal1">
 <tr><td><input type="button" class="button" id="recover" value="recover" />
<tr><td class="one"> Username : </td><td class="one"><label><%=session.getAttribute("username")%></label>
	</td><td rowspan="3"><section><img src="image/SIBILION.BMP" id="photo">
	<input type="button" class="button" name="setphoto" value="UPLOAD" onclick="document.getElementById('photo').src='image/PERSONAL.BMP'"></input>
<tr><td class="one"> First Name:  </td><td class="one"><input type="text" name="firstname">

</td></tr><tr><td class="one"> Middle Name: </td><td class="one"><input type="text" name="middlename" style="height: 35px; ">
</td></tr><tr><td class="one"> Last Name:   </td><td class="one"><input type="text" name="lastname">
</td></tr><tr><td class="one"> D.O.B :      </td><td class="one"><input type="text" name="day" size="2" placeholder="DD">-
                         <select name="month">
			  <option>---select one---
                          </option><option>JAN
                          </option><option>FEB
                          </option><option>MAR
                          </option><option>APR
                          </option><option>MAY
                          </option><option>JUN
                          </option><option>JUL
                          </option><option>AGU
                          </option><option>SEP
                          </option><option>OCT                                                              
                          </option><option>NOV
                          </option><option>DEC                          
                         </option></select>-
                          <input type="text" id="year" name="year" placeholder="YYYY" size="4">
</td></tr><tr><td class="one"> AGE:         </td><td class="one"><input type="text" name="age" id="age">
							<input class="button" type="button" value="age" onclick="agecalc()">
</td></tr><tr><td class="one"> GENDER :     </td><td class="one"><input type="radio" name="gender"> MALE<input type="radio" name="gender"> FEMALE</td></tr>  
<tr><td class="one">Father's Name :</td><td class="one"><input type="text" name="fathername">
</td></tr><tr><td class="one">Father's Occupation :</td><td class="one"><input type="text" name="fatheroccupation">
</td></tr><tr><td class="one"> Mother's Name :</td><td class="one"><input type="text" name="mothername">
</td></tr><tr><td class="one"> Annual Income :</td><td class="one"><input type="text" name="annualincome">
</td></tr><tr><td class="one"> Religion :    </td><td class="one"><select name="religion">
			<option>---select one---
                        </option><option>Hindu</option>
                        <option>Christian</option>
                        <option>Muslim</option>
                        </select>
</td></tr><tr><td class="one"> Caste:        </td><td class="one"><select name="caste">
			<option>---selectone---
                        </option><option>BC
                        </option><option>MBC
                        </option><option>SC/ST
                        </option><option>OC
                        </option></select> 
</td></tr><tr><td class="one">If applicant is a special<br> talented  person :</td><td class="one"><input type="radio" name="stp"> YES
<input type="radio" name="stp"> NO
</td></tr><tr><td class="one">If applicant father<br> is Ex-serviceman :</td><td class="one"><input type="radio" name="exserviceman"> YES
<input type="radio" name="exserviceman"> NO
</td></tr><tr><td class="one">Blood Group:<font></font>  </td><td class="one"><input type="text" name="bloodgroup" placeholder="example O+">
</td></tr>
<tr><td class="one"> <!-- <input type="submit" class="button" name="b1" value="SAVE" onclick="validatepersonal(personal)"> -->
      <input type="button" class="button" id="update" value="Update" >
    </td><td> <input type="reset" name="b2" value="CLEAR" class="button" > 
</td></tr></section></td></tr></table>

</form>
</body>
</html>