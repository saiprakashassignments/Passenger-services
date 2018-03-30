<!DOCTYPE html>
<%-- <%@page import="com.imcs.customer.bean.LoginDao,java.util.List"%>  --%> 
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
  
<html lang="en">
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <style>
  .labelClass{
    float: left;
    width: 113px;
	margin-bottom: 10px;
  }
</style>
  
</head>
<body>
Welcome ${userName}
<form class="form-horizontal" >

<br><br>

<%-- Your customer list is:
<jsp:useBean id="dao" class="com.imcs.customer.bean.LoginDao"/>
 <% List<LoginBean> lb=(LoginBean)dao.mappedCustomerList(${sessionScope.obj}) %>
<c:forEach items="${sessionScope.custlist}" var="custlist">
    ${custlist.getFirst_name()}<br>
   
</c:forEach>
 --%>
<div class="container" style="width:800px; margin:0 auto;">
<div class="col-lg-12" style="margin-top:10px;margin-bottom:10px;">
<h1> Landing Page</h1>

 <a id="btnClick" href="<c:url value="findInformation"/>">Get Passenger</a>
   
<a id="singleclk" href="<c:url value="redirecttoinfo"/>">Add Passenger</a>

<a id="singleclk" href="<c:url value="updateInformation"/>">update Passenger</a>

<a id="singleclk" href="<c:url value="deleteInformation"/>">delete Passenger</a>

 
</div>
  <br>
  <br>

</div>
  </form>


</body>
</html>