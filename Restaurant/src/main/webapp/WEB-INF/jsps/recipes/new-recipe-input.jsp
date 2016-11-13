<%--
  Created by IntelliJ IDEA.
  User: U0148394
  Date: 11/5/2016
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>New Recipes</title>
</head>
<body>
<div id="nav">
    <jsp:include page="/WEB-INF/jsps/shared/nav.jsp"/>
</div>
<div id="content">
    <h1>New Recipe</h1>
    <form action="new-recipe" method="post">
        <table>
            <s:if test="getFieldErrors().get('recipe.name') != null">
                <div class="error">
                    <s:property value="getFieldErrors().get('recipe.name')[0]"/>
                </div>
            </s:if>
            <tr>
                <td>Name</td>
                <td><input type="text" name="recipe.name" size="20" value="<s:property value="recipe.name"/> "></td>
            </tr>
            <s:if test="getFieldErrors().get('recipe.ingredients') != null">
                <div class="error">
                    <s:property value="getFieldErrors().get('recipe.ingredients')[0]"/>
                </div>
            </s:if>
            <tr>
                <td>ingredients</td>
                <td><input type="text" name="recipe.ingredients"
                value="<s:property value="recipe.ingredients"/> "> </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value = "submit"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
