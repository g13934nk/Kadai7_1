package jp.tuyano;
 
import java.net.URL;
import java.util.Date;
 
import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
     
    @Persistent
    private String user;
    
    @Persistent
    private String name;
    
    @Persistent
    private String pass;
    
    @Persistent
    private String add;
    
    /*@Persistent
    private String myform;
    
    @Persistent
    private String goukei;
    
    @Persistent
    private Date datetime;*/

    public LinkData(String user, String name,String pass, String add) {
        super();
        this.user = user;
        this.name = name;
        this.pass = pass;
        this.add = add;
    }
    public String getuser() {
        return user;
    }
 
    public void setuser(String user) {
        this.user = user;
    }
    public String getname() {
        return name;
    }
 
    public void setname(String name) {
        this.name = name;
    }
    public String getpass() {
        return pass;
    }
 
    public void setpass(String pass) {
        this.pass = pass;
    }
    public String getadd() {
        return add;
    }
 
    public void setadd(String add) {
        this.add = add;
    }
    
 /*
    public Long getMyform() {
        return id;
    }
 
    public void setMyform(String myform) {
        this.myform = myform;
    }
 
    public String getGoukei() {
        return goukei;
    }
 
    public void setGoukei(String goukei) {
        this.goukei = goukei;
    }
 
 
    public Date getDatetime() {
        return datetime;
    }
 
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }*/
}
