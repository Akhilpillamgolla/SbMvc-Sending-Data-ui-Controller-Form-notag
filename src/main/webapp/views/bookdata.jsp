<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Saving Station</title>
</head>
<body>

		<table>
			<tr>
				<td>Book Name :</td>
				<td>${book.bookName}</td>
			</tr>

			<tr>
				<td>Author Name :</td>
				<td>${book.authorName}</td>
			</tr>

			<tr>
				<td>Book Price :</td>
				<td>${book.bookPrice}</td>
			</tr>


			<tr>
				<td></td>
				<td></td>
			</tr>
		</table>

<a href = "LoadForm">GO Back</a>    


</body>
</html>