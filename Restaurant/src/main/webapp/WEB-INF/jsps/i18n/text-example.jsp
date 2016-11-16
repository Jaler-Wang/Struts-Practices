<%--
  Created by IntelliJ IDEA.
  User: U0148394
  Date: 11/6/2016
  Time: 11:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>i18n</title>
    <script type="text/javascript">
        var jsFromTag1 = '<s:property value="javascriptExample"
            escapeJavaScript="false"/>';
        document.writeln(jsFromTag1);
    </script>
</head>
<body>
<dl>
    <dt>get text:</dt><br/>
    <dd><s:property value="text1"/> </dd>
</dl>
<s:property value="testValue" escape="false"/>
<s:property value="javascriptExample"/>
</body>
</html>
