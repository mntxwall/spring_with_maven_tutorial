<#import "./my_test.ftl" as my >
<#import "./my_test.ftl" as foo >
<#import "./my_test.ftl" as bar >

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>test</title>
</head>
<body>


<p>${my.owner}</p>
<p>${foo.owner}</p>
<p>${bar.owner}</p>

<#assign owner = "Chen" in my>

<p>${my.owner}</p>
<p>${foo.owner}</p>
<p>${bar.owner}</p>


</body>
</html>