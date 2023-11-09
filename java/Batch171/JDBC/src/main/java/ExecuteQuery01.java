import javax.management.Query;
import java.sql.*;

public class ExecuteQuery01 {
    public static void main(String[] args) throws SQLException {
        // 1. adım : database bağlanma
        Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db","dev_user","password");
        // 2. adım: Statement oluşturma

        Statement st=con.createStatement(); // db ye iletim yapmak ve query calistirmak için oluşturulur.
        // System.out.println("Connection succes");


        String query1="  select country_name from countries where id between 5 and 10";
        boolean sql1= st.execute(query1);

        System.out.println("sql 1: "+sql1);

        // kayıtları görmek için executeQuery() kullanmalıyız.

        ResultSet resultset=st.executeQuery(query1); //select

//        resultset.next();
//        System.out.println(resultset.getString("country_name"));
        //Resultset in first(),last(),next() gibi methodları vardır
        //Resultset in geriye donusu yoktur

        while(resultset.next()){
            System.out.println("Ülke ismi : "+resultset.getString("country_name"));
        }

        System.out.println("---------------------------------------");
        //ÖRNEK 2: phone_code'u 550 den büyük olan ülkelerin "phone_code" ve "country_name" bilgisini l

        String query2="select phone_code,country_name from countries where phone_code>550";
        ResultSet resultSet2=st.executeQuery(query2);

        while (resultSet2.next()){
            System.out.println(resultSet2.getInt("phone_code")+"--"+resultSet2.getString("country_name"));
        }
        System.out.println("----------------örnek3------------");
        //ÖRNEK 3:developers tablosunda "salary" değeri en düşük salary olan developerların tüm bilgilerini gösteriniz

        String query3="select * from developers where salary=(select min(salary) from developers )";
        ResultSet rs3=st.executeQuery(query3);

        while (rs3.next()){
            System.out.println(rs3.getInt("id")+"--"+rs3.getString("name")+"--"+rs3.getInt("salary")+"--"+rs3.getString("prog_lang"));


        }
        System.out.println("------------ÖRNEK4-------------");
        //ÖRNEK 4:Puanı bölümlerin taban puanlarının ortalamasından yüksek olan öğrencilerin isim ve puanlarını listeleyiniz

        String query4="select ogrenciler.bolum,ogrenciler.isim,ogrenciler.puan,bolumler.taban_puani\n" +
                "from ogrenciler \n" +
                "full join bolumler\n" +
                "on bolumler.bolum=ogrenciler.bolum\n" +
                "where ogrenciler.puan>(select avg(taban_puani) from bolumler)";

        ResultSet rs4= st.executeQuery(query4);
        while (rs4.next()){
            System.out.println(rs4.getString("isim")+"--"+rs4.getInt("puan"));

        }



        st.close();
        con.close();
    }
}
