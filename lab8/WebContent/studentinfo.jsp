<html>
<body>
<jsp:useBean id="stud" scope="session" class="com.Student">
<jsp:setProperty name="stud" property="*" />
</jsp:useBean> 

<p> Name  :<jsp:getProperty name="stud" property="name" /></p>
<p> USN :<jsp:getProperty name="stud" property="usn" /></p>
<p> Department : <jsp:getProperty name="stud" property="dept" /></p>
</body>
</html> 