<#--<#import "./my_test.ftl" as my >
<#import "./my_test.ftl" as foo >
<#import "./my_test.ftl" as bar >
-->
<#import "/spring.ftl" as spring >
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>test</title>
</head>
<body>

<#--

<p>${my.owner}</p>
<p>${foo.owner}</p>
<p>${bar.owner}</p>

<#assign owner = "Chen" in my>

<p>${my.owner}</p>
<p>${foo.owner}</p>
<p>${bar.owner}</p>
-->
<form action="/test" method="post">
    Name:

 <!--   <input type="text" name="name">-->
  <@spring.bind "userinfo.name"/>
  <input type="text"
           name="${spring.status.expression}"
           value="${spring.status.value?default("")}"/><br>

    ${spring.status.errorMessage!""}
  <#--<#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>-->
	<br/>

    age:
    <input type="text" name="age">

    <input type="submit" value="gogo">
<#--<@spring.bind "user.age"/>
    <input type="text"
           name="${spring.status.expression}"
           value="${spring.status.value?default("")}"/><br>
<#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>
-->

</form>



</body>
</html>