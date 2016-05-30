<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>hello</title>
</head>
<body>
	<p>this is ${name} from freeMarker</p>

	<ul>
    <#list fruits as fruit>
      <li>${fruit}
    </#list>
    </ul>

</body>
</html>