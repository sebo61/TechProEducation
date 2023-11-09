import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. adım: driverı kaydet
            Class.forName("org.postgresql.Driver"); //java 7 ile birlikte gerek yok

        // 2. adım : database bağlanma
        Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db","dev_user","password");
        // 3. adım: Statement oluşturma
        Statement st=con.createStatement();
        // System.out.println("Connection succes");

        /* 4. adım: query (sorgu) oluşturma */

        // boolean sql1=st.execute("create table workers (worker_id int,worker_name varchar(50),salary real)");
        // System.out.println("sql 1 : tablo oluşturuldu"+ sql1);
        /*  execute DDL(data defination language) veya DQL (data query language)
         DQL için kullanılırsa ResultSet nesnesi alırsa true, almazsa false döner.
         DDL için kullanılırsa false döner. */

        /* ÖRNEK 2:"workers" tablosuna VARCHAR(20) tipinde "city" sütununu ekleyiniz.*/

       //boolean sql2=st.execute("alter table workers add column city varchar(20)");
        //System.out.println("sql 2: sütun eklendi."+ sql2);
        /* ÖRNEK 3:"workers" tablosunu SCHEMAdan siliniz.*/

        //String query3="drop table workers ";
       //  st.execute(query3);
        /* 5. adım: bağlantı ve statementı kapatma*/


        st.close();
        con.close();


    }


}
