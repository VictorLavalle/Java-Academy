<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<title>Superheroes Web Project</title>

<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Java Academy | Xideral</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">

			<!-- put new button: Add superhero -->

			<input type="button" value="Add Superhero"
				onclick="window.location.href='add-superhero-form.jsp'; return false;"
				class="add-superhero-button" />

			<table>

				<tr>
					<th>Secret Identity</th>
					<th>Alter Ego</th>
					<th>Superpower(s)</th>
					<th>Action</th>
				</tr>

				<c:forEach var="tempSuperhero" items="${SUPERHEROES_LIST}">

					<!-- set up a link for each superhero -->
					<c:url var="tempLink" value="SuperheroControllerServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="superheroId" value="${tempSuperhero.id}" />
					</c:url>

					<!--  set up a link to delete a superhero -->
					<c:url var="deleteLink" value="SuperheroControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="superheroId" value="${tempSuperhero.id}" />
					</c:url>

					<tr>
						<td>${tempSuperhero.secretIdentity}</td>
						<td>${tempSuperhero.alterEgo}</td>
						<td>${tempSuperhero.superpower}</td>
						<td><a href="${tempLink}">Update</a> | <a
							href="${deleteLink}"
							onclick="if (!(confirm('Are you sure you want to delete this superhero?'))) return false">
								Delete</a></td>
					</tr>

				</c:forEach>

			</table>

		</div>

	</div>
</body>


</html>








