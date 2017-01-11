<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inscription</title>
<link type="text/css" rel="stylesheet"
	href="<c:url value="css/style.css"/>" />
</head>
<body>
	<form method="post" action="inscription">
		<fieldset>
			<legend>Inscription</legend>
			<p>Formulaire d'inscription.</p>

			<label for="email">Adresse email <span class="required">*</span></label>
			<input type="email" id="email" name="email"
				value="<c:out value="${ requestScope.person.email }"/>" size="20"
				maxlength="60" /> <span class="error">${ form.errors['email'] }</span>
			<br /> <label for="password">Mot de passe <span
				class="required">*</span></label> <input type="password" id="password"
				name="password" value="" size="20" maxlength="20" /> <span
				class="error">${ form.errors['password'] }</span> <br /> <label
				for="confirmation">Confirmation du mot de passe <span
				class="required">*</span></label> <input type="password" id="confirmation"
				name="confirmation" value="" size="20" maxlength="20" /> <span
				class="error">${ form.errors['confirmation'] }</span> <br /> <label
				for="name">Nom d'utilisateur</label> <input type="text" id="name"
				name="name" value="<c:out value="${ requestScope.person.name }"/>"
				size="20" maxlength="20" /> <span class="error">${ form.errors['name'] }</span>
			<br /> <input type="submit" value="Inscription" class="withoutLabel" />
			<br />

			<p class="${ empty form.errors ? 'success' : 'error' }">
				<c:out value="${ requestScope.form.result }" />
			</p>
			<p>
				<c:out value="${ requestScope.person.email }"></c:out>
		</fieldset>

	</form>
</body>
</html>