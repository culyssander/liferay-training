<%@page import="com.liferay.training.portlet.employeemanager.portlet.model.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.training.portlet.employeemanager.portlet.repo.EmployeeRepository"%>
<%@ include file="/init.jsp" %>

<%
	List<Employee> employees = (List)request.getAttribute("employees");
%>
<c:if test="<%= !employees.isEmpty() %>">
<table class="table table-bordered table-hover table-striped">
  <tr>
    <th>#</th>
    <th>Name</th>
    <th>Email</th>
    <th>Job title</th>
  </tr>
  	
  	<c:forEach var="e" items="<%= employees%>">
  		<tr >
  			<td>${e.id}</td>
  			<td>${e.name}</td>
  			<td>${e.email}</td>
  			<td>${e.jobTitle}</td>
  	 	</tr>
  	</c:forEach>
    
</table>
</c:if>
<hr/>

<portlet:actionURL name="handleForm" var="actionURL" />

<aui:form action="<%=actionURL %>">
	<aui:fieldset>
    	<aui:input type="text" name="name"></aui:input>
        <aui:input type="email" name="email"></aui:input>
    </aui:fieldset>
    
    <aui:select name="jobTitle">
        <aui:option label="Job Title"/>
        <aui:option label="Programmer"/>
        <aui:option label="Software developer"/>
        <aui:option label="Front End Developer" />
        <aui:option label="Software Architect" />
        <aui:option label="Tech leader" />
    </aui:select>
    
	<aui:button-row>
		<aui:button type="submit" value="Save"/>
	</aui:button-row>
</aui:form>