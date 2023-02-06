<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Recruiters</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - LinkedIn Recruiters</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add recruiter -->
		
			<input type="button" value="Add Recruiter"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Company</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our recruiters -->
				<c:forEach var="tempRecruiter" items="${recruiters}">
				
					<!-- construct an "update" link with recruiter id -->
					<c:url var="updateLink" value="/recruiter/showFormForUpdate">
						<c:param name="recruiterId" value="${tempRecruiter.id}" />
					</c:url>					

					<!-- construct an "delete" link with recruiter id -->
					<c:url var="deleteLink" value="/recruiter/delete">
						<c:param name="recruiterId" value="${tempRecruiter.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempRecruiter.firstName} </td>
						<td> ${tempRecruiter.lastName} </td>
						<td> ${tempRecruiter.company} </td>
						<td> ${tempRecruiter.email} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this recruiter?'))) return false">Delete</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>