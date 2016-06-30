<%--
  Created by IntelliJ IDEA.
  User: jeremy
  Date: 2016/6/30
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Understanding the JSP!</title>
</head>
<body>
<%--
you can insert many functions as you want when you use the tag <%! %>
<%! %> is referring the definition tag
--%>
<%!
   public int add(int a, int b)
   {
       return a+b;
   }

    public int sub(int a, int b)
    {
        return a-b;
    }
%>
<%
   int k=add(789546, 3365478);
    int m = sub(321, 100);
   out.println("The added two number is 789546 and 3365478<br/>");
%>
The result is: <%=k%><br/>
the result is: <%=m%>
<div>
    <% for (int i=0; i<=9; i++){ %>
        i=<%=i%>,
    <%}%>
</div>
</body>
</html>
