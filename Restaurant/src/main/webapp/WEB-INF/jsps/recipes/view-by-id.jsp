<%--
  Created by IntelliJ IDEA.
  User: U0148394
  Date: 11/13/2016
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>view by id</title>
</head>
<body>
    <s:form action="view-by-id-process">
        <s:textfield key="recipe.id"/>
        <s:submit/>
    </s:form>
</body>
</html>
