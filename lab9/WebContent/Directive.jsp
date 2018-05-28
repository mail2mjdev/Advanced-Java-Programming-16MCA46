<%@ page import="java.util.*" %>
<%@ page language="java"%>
<%@ page buffer="16kb" %>
<%@ page autoFlush="true" %>
<%@ page isThreadSafe="true" %>
<%@ page errorPage="Error.jsp" %>

<html>
<body>
<h2>Todays Date is: <%=new Date() %></h2>
<% int n1=Integer.parseInt(request.getParameter("n1"));
 int n2=Integer.parseInt(request.getParameter("n2"));
 %>
<h2>Value of n1/n2 == <%=n1/n2 %></h2>
</body>
</html> 