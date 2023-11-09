import java.sql.*;

public class ExecuteQuery01 {
    public static void main(String[] args) throws SQLException {

        // database ebağlanma
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db", "dev_user", "password");

        // db ye iletim yapmak ve query çalıştırmak için oluşturulur.
        Statement st = con.createStatement();
       /*
        String query="select country_name from countries where id between 5 and 10";
        boolean sql1= st.execute(query);

        System.out.println("sql1:"+sql1);
         kayıtları görmek için executeQuery() kullanmalıyız.

         ResultSet resultSet= st.executeQuery(query);
         while ( resultSet.next()) {

             System.out.println(resultSet.getString("country_name"));


        } */

        // phone_codu  u 550 den büyük phone_code v country_name
        String query = "select phone_code,country_name from countries where phone_code>550";

        ResultSet resultSet = st.executeQuery(query);
        while (resultSet.next()) {

            System.out.println(resultSet.getString("phone_code") + " " + resultSet.getString("country_name"));
        }
        System.out.println("**************örnek 3*****************");

        // en düşük salary
        String query2 = "select * from developers where salary=(select min(salary) from developers)";
        ResultSet resultSet1 = st.executeQuery(query2);

        while (resultSet1.next()) {

            System.out.println(resultSet1.getInt("id") + " " + resultSet1.getString("name") + " " + resultSet1.getInt("salary") + " " + resultSet1.getString("prog_lang"));


        }
        System.out.println("****************** 4 ****************");
        // puanı bölümlerin taban puanlarının ortalamasından yüksek olan öğrencilerin isim ve puanlarını listeleyiniz.

        //String query3 = "select o.isim,o.puan from ogrenciler o  inner join bolumler b on o.bolum = b.bolum where o.puan>(select sum(taban_puani) from bolumler)/(select count(bolum_id) from bolumler)\n";
        String query3= "select isim,puan from ogrenciler where puan>(select avg(taban_puani) from bolumler)";
        ResultSet resultSet3 = st.executeQuery(query3);

        while (resultSet3.next()) {

            System.out.println(resultSet3.getString("isim") + " -- " + resultSet3.getInt("puan"));

        }
        st.close();
        con.close();
    }
}
