<!DOCTYPE html>
<html>

<head>
<title>Add Superhero</title>

<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet"
	href="css/add-superhero-style.css">
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>FooBar University</h2>
		</div>
	</div>

	<div id="container">
		<h3>Add Add Superhero</h3>

		<form action="SuperheroControllerServlet" method="GET">

			<input type="hidden" name="command" value="ADD" />

			<table>
				<tbody>
					<tr>
						<td><label>Secret Identity:</label></td>
						<td><input type="text" name="secretIdentity" /></td>
					</tr>

					<tr>
						<td><label>Alter Ego:</label></td>
						<td><input type="text" name="alterEgo" /></td>
					</tr>

					<tr>
						<td><label>Superpower(s):</label></td>
						<td><input type="text" name="superpower" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				</tbody>
			</table>
		</form>

		<div style="clear: both;"></div>

		<p>
			<a href="SuperheroControllerServlet">Back to List</a>
		</p>
	</div>
</body>

</html>











