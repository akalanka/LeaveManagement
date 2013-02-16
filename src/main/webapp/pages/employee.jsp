<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
</head>
 
<body>

<h2>Add Employee</h2>
<s:form action="addEmployeeAction" theme="xhtml">
      <s:textfield name="employeeName" label="Name" value="" />
      <s:textarea name="address" label="Address" value=""  cols="50" rows="5" />
      <s:submit value="Save" effect="highlight" button="true" targets="result" />
</s:form>

<h2>All Employees</h2>

<s:if test="employees.size() > 0">
hello world
<table border="1px" cellpadding="8px">
	<tr>
		<th>Employee Id</th>
		<th>Name</th>
		<th>Address</th>
		<th>Created Date</th>
	</tr>
	<s:iterator value="employees" status="userStatus">
		<tr>
			<td><s:property value="employeeId" /></td>
			<td><s:property value="employeeName" /></td>
			<td><s:property value="address" /></td>
			<td><s:date name="createdDate" format="dd/MM/yyyy" /></td>
		</tr>
	</s:iterator>
</table>
</s:if>

<br/>
<br/>

</body>
</html>