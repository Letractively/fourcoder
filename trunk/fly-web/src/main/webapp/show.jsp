<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type='text/javascript' src='/DWRStudy/dwr/interface/loginService.js'></script>
<script type='text/javascript' src='/DWRStudy/dwr/engine.js'></script>
<script type='text/javascript' src='/DWRStudy/dwr/util.js'></script>


<script type="text/javascript">
  function aaa() {
    var name=document.getElementById("name").value;
    loginService.login(name,showResult);
  }
  function showResult(data){
    var root=${"loginResult"};
    var str=data;
    root.innerHTML=str;
  }

  
</script>
<title>Insert title here</title>
</head>

<body>
<form name="form1" method="post" action="">
  <table width="400" border="0" cellpadding="0">
    <tr>
      <td height="25">
      Name: <input name="name" type="text" id="name">&nbsp;
      <input name="login" type="button" id="login" value="log in" onClick="aaa();">&nbsp;<br>    
      <span id="loginResult"></span>
      </td>
    </tr>
  </table>
</form>
</body>
</html>