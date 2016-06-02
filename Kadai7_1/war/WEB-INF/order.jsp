<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>文具ショップ</title>
<SCRIPT language="JavaScript">
<!--
function calc_total(){
  kingaku = 0;
  for (i=0; i<document.myform.length-1; i++){
    if (document.myform.elements[i].checked){
      kingaku += eval(document.myform.elements[i].value);
    }
  }
  document.myform.goukei.value = kingaku + "　円";
}
//-->
</SCRIPT>
    </head>
    <body background="hasami.jpg">
        <h1>文具ショップ</h1>
        <form name="myform" action="/ad3436/OrderServlet" method="post">
  <table border=2 cellpadding=4>
  <tr><td><h2>
  <input type="checkbox" value="100" onClick="calc_total()">
  　えんぴつ（100円）</td></tr>
  <tr><td><h2>
  <input type="checkbox" value="100" onClick="calc_total()">
  　消しゴム（100円）</td></tr>
  <tr><td><h2>
  <input type="checkbox" value="100" onClick="calc_total()">
  ボールペン（100円）</td></tr>
  <tr><td><h2>
  <input type="checkbox" value="500" onClick="calc_total()">
  　定規セット（500円）</td></tr>
  <tr><td><h2>
  <input type="checkbox" value="200" onClick="calc_total()">
  　コンパス（200円）</td></tr>
  <tr><td align="center"><h2>
  合計金額：
  <input type="text" name="goukei">
  </td></tr>
  </table>
     <input type="submit" value="注文する">

 </form>     
    </body>
</html>