
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
	<body>

		<h1> Welcome to Spring integration with struts demo</h1>

		<html:form action="/login">

			UserName<html:text property="userName"/><br>
			Password<html:password property="password"/><br>
			<html:submit value="Login"/>
			<html:reset value="Clear"/><br>

		</html:form>
	</body>
</html>