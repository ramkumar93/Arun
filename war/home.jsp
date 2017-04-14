<html>

<% 
if(session.getAttribute("username") == null)
{
	response.sendRedirect("/applicant.jsp");
}
%>
<link rel="stylesheet" href="css/colstyle1.css" type="text/css">
<frameset rows="14%,86%" class="frameset1" border=0 scrolling="no">
<frame name="fr1" src="details_1.html" class="frame1">
<frame name="fr2" src="personal.jsp" class="frame2">
</frameset>

</html>