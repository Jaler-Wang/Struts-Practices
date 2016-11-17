<%--
  Created by IntelliJ IDEA.
  User: U0148394
  Date: 11/6/2016
  Time: 9:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Iterator</title>
    <style>
        table {border-collapse: collapse;}
        td {padding: 0.24em;}
        .firstTrue{ border-top: 2px solid black;}
        .lastTrue{ border-bottom: 2px solid black;}
        .firstFalse{}
        .lastFalse{}
        .row0{background: #fff;}
        .row1{background: #aaa;}
        .row2{background: #555; color: white;}
        .row3{background: #000; color: white;}
    </style>
</head>
<body>
    <table>
        <s:iterator value="data" status="stat">
            <tr class="row${stat.count % 2} first${stat.first} last${stat.last}">
                <td>${stat.count}</td>
                <td><s:property/></td>
                <td class="row${stat.count % 4}">${stat.count % 4}</td>
            </tr>
        </s:iterator>
    </table>
<br/>
    <s:generator val="'1, 2, 3, 4'" separator="," var = "test">
        <ul>
            <s:iterator value="test">
                <li><s:property/></li>
            </s:iterator>
        </ul>
    </s:generator>
</body>
</html>
