<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 재설정</title>
 <script  src="http://code.jquery.com/jquery-latest.min.js"></script> 
<script type="text/javascript">
	function passConfirm() {
		var pw = document.getElementById('pw').value;
		var pwConfirm = document.getElementById('pwConfirm').value;
		var confirmMsg = document.getElementById('confirmMsg').value;
		var correctColor = "#00ff00";
		var wrongColor = "#ff0000";
		
		if(document.getElementById('pw').value != "&& document.getElementById('pwConfirm').value !=") {
			if (document.getElementById('pw').value==document.getElementById('pwConfirm').value) 
			confirmMsg.style.color = correctColor;
			confirmMsg.innerHTML = "비밀번호 일치";
		} else {
			confirmMsg.style.color = wrongColor
			confirmMsg.innerHTML = "비밀번호 불일치";
		}
	}

    function fn_modify_article(obj){
       obj.action="/shop/ylhqlalfqjsghwotjdwjdfldzmwlfhd";
       obj.submit();
    }
    

 </script>
</head>
<body>

<form name="frmArticle" action="/shop/ylhqlalfqjsghwotjdwjdfldzmwlfhd" method="post">
<table>
<tr>
  <th>새 비밀번호</th>
  <td> <input type="text" name="pw" id="pw" maxlength="10" onchange="passConfirm()" required ></td>
</tr>
<tr>
  <th>새 비밀번호 확인</th>
  <td> <input type="text" name="pwConfirm" id="pwConfirm" maxlength="10" onchange="passConfirm()" required>
  &nbsp;<span id="check"></span>
  </td>
</tr>

</table>

<tr   id="tr_btn_modify"  >
      <td colspan="2"   align="center" >
          <input type=button value="비밀번호 재설정"   onClick="fn_modify_article(frmArticle)"  >
          
      </td>   
  </tr>
</form>

</body>
</html>