<%--
  Created by IntelliJ IDEA.
  User: U0148394
  Date: 11/5/2016
  Time: 11:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<s:url namespace="/" action="home" />">Home</a>
<a href="<s:url namespace="/recipes" action="list"/>">List Recipes</a>
<a href="<s:url namespace="/recipes" action="new-recipe-input"/>">New Recipes</a>
<a href="<s:url namespace="/recipes" action="search"/>">Search Recipes</a>
<a href="<s:url namespace="/shopping" action="list"/>">Shopping List</a>

</body>
</html>
