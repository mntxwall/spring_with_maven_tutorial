<#import "/spring.ftl" as spring >
<#import "./my_test.ftl" as my >
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>hello</title>
</head>
<body>
  <p>this is ${name} from freeMarker</p>
  <p>${name?string[0]}</p>
  <p>${name[0..3]}</p>
  <p>${name[0..<4]}</p>

  <p>${mouse!"Eated"}</p>
  <#assign mouse = "jerry"/>
  <p>${mouse!"Eated"}</p>

  <#if mouse??>
    Mouse Found
  </#if>

  <#if cat??>
    Cat Found
  <#else/>
    Cat NotFound
  </#if>

<#macro gree person>
  <p>Hello ${person}</p>
</#macro>


  <@gree person="Fred"/> and <@gree person="BatMan"/>


  <#macro repeat count>
    <#list 1..count as x>
      <p><#nested x, x/2, x==count/></p>
    </#list>
  </#macro>

  <@repeat count=4 ; c, halfc, last>
    ${c} . ${halfc}<#if last> LAST !</#if>
  </@repeat>

	<ul>
    <#list fruits as fruit>
      <li>${fruit}
    </#list>
    </ul>
  <@my.company name="China Telecom"/>
  <p>This is from my_test.ftl ${my.owner}</p>
</body>
</html>
