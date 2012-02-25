<%@ page language="java" pageEncoding="GBK"%>  
<html>  
    <head>  
        <title>chat</title>  
        <meta http-equiv="pragma" content="no-cache">  
        <meta http-equiv="cache-control" content="no-cache">  
        <meta http-equiv="expires" content="0">  
        <script type='text/javascript' src='dwr/interface/ChatManager.js'></script>  
        <script type='text/javascript' src='dwr/engine.js'></script>  
        <script type='text/javascript' src='dwr/util.js'></script>  
        <script type="text/javascript" src="chat.js"></script>  
    </head>  
    <body>  
        <input type="hidden" name="userid" id="userid"/>  
        <br>  
        昵称:  
        <input type="text" name="username" id="username"/>  
        <input type="button" value="注册" onclick="register(this);" />  
        <br />  
        <br />  
        我要对  
        <select name="receiver" id="receiver" disabled=true" >  
        </select>  
        说:  
        <input type="text" name="message" id="message" disabled="true" />  
        <input type="button" value="发送" id="send" name="send" disabled="true"  
            onclick="send();" />  
        <br />  
        <br />  
		<textarea rows="20" cols="60" id="info" readonly="readonly"></textarea>
        在线用户列表:  
        <ul id="users">  
        </ul>  
		-------------:
		<ul id="ms">  
        </ul>  
  
        <div id="showMessage" style="display: none">
			<span id="test"></span>
            <span id="sender"></span>对你说:  
            <span id="msg"></span>  
        </div>  
    </body>  
</html>  