package jp.tuyano;
 
import java.net.URL;
import java.util.Date;
 
import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class OrderData {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
     
    @Persistent
    private String en;
    
    @Persistent
    private String kesi;
    
    @Persistent
    private String pen;
    
    @Persistent
    private String zyo;

    @Persistent
    private String con;
    
    /*@Persistent
    private String myform;
    
    @Persistent
    private String goukei;
    
    @Persistent
    private Date datetime;*/

    public OrderData(String en, String kesi,String pen, String zyo, String con) {
        super();
        this.en = en;
        this.kesi = kesi;
        this.pen = pen;
        this.zyo = zyo;
        this.con = con;
    }
    public String geten() {
        return en;
    }
 
    public void seten(String en) {
        this.en = en;
    }
    public String getkesi() {
        return kesi;
    }
 
    public void setkesi(String kesi) {
        this.kesi = kesi;
    }
    public String getpen() {
        return pen;
    }
 
    public void setpen(String pen) {
        this.pen = pen;
    }
    public String getzyo() {
        return zyo;
    }
 
    public void setzyo(String zyo) {
        this.zyo = zyo;
    }
    public String getcon() {
        return con;
    }
 
    public void setcon(String con) {
        this.con = con;
    }
    
}