import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class Execute01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. adım: driverı kaydetme

        Class.forName("org.postgresql.Driver");
        // 2. adım: database e bağlanma

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db", "dev_user", "password");

        // 3. adım: statement oluşturma

        Statement st = con.createStatement();
        //   System.out.println("connection success");

        // 4.adım: query (sorgu) oluşturma

        // workers adında tablo oluşturma worker_id,worker_name, salary
        // boolean sql1= st.execute("create table workers(worker_id int, worker_name Varchar(50),salary real)");

        // System.out.println("sql1: "+sql1);

        // execute DDL(Data Definition Language veye DQL -DATA QUery language)

        // workers tablosuna  varchar(20) tipinde city sütununu ekleyiniz.

        // boolean sql1= st.execute("alter table workers  add city varchar(20)");
        // System.out.println("sql1: "+sql1);

        // workers tablopsunu shema'dan silin
        String sql2 = "drop table workers";
       // boolean sql = st.execute(sql2);
        //System.out.println(sql);

        // 5. adım: bağlantı ve statemenı kapama

        st.close();
        con.close();

    }
}
