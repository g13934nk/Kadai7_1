package jp.tuyano;
 
import java.io.*;
import java.util.*;
 
import javax.jdo.*;
import javax.servlet.http.*;
 
@SuppressWarnings("serial")
public class Kadai7_1Servlet extends HttpServlet {
    public void doGet(HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException {
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        req.setCharacterEncoding("utf-8");
        String param1 = req.getParameter("id");
        PrintWriter out = resp.getWriter();
        List<LinkData> list = null;
        List<OrderData> list2 = null;
        if (param1 == null || param1 ==""){
            String query = "select from " + LinkData.class.getName();
            String query2 = "select from " + OrderData.class.getName();
            try {
                list = (List<LinkData>)manager.newQuery(query).execute();
                list2 = (List<OrderData>)manager.newQuery(query).execute();
            } catch(JDOObjectNotFoundException e){}
       } else {
            try {
                LinkData data = (LinkData)manager.getObjectById(LinkData.class,Long.parseLong(param1));
                list = new ArrayList();
                list.add(data);
                
                OrderData data2 = (OrderData)manager.getObjectById(OrderData.class,Long.parseLong(param1));
                list2 = new ArrayList();
                list2.add(data2);
                
                
            } catch(JDOObjectNotFoundException e){}
      }
        String res = "[";
        if (list != null){
            for(LinkData data:list){
                /*res += "{myform:" + data.getMyform() + ",goukei:'" + data.getGoukei() + "',date:'" + data.getDatetime() +
                    "'},";*/
                res += "{user:" + data.getuser() + ",name:'" + data.getname() + "',pass:'" + data.getpass() + "',add:'" + data.getadd() +
                        "'},";
            }
        }
        if (list2 != null){
            for(OrderData data2:list2){
                res += "{en:" + data2.geten() + ",kesi:'" + data2.getkesi() + "',pen:'" + data2.getpen() + "',zyo:'" + data2.getzyo() + "',con:'" + data2.getcon() +
                        "'},";
            }
        }
        res += "]";
        out.println(res);
        manager.close();
    }
}
