import java.sql.*;

public class PreparedStatement01 {
    /*
        PreparedStatement interfaceine extend eder.

        PreparedStatement interface, birden çok kez çalıştırılabilen önceden derlenmiş bir SQL kodunu temsil eder.
Paremetrelendirilmiş SQL sorguları(query) ile çalışır. Bur sorguyu 0 veya daha fazla parametre ile kullanabiliriz.
         */

    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db","dev_user","password");
        Statement st=con.createStatement(); // db ye iletim yapmak ve query calistirmak için oluşturulur.

        //ÖRNEK1:(Prepared Statement kullanarak) bolumler tablosunda Matematik bölümünün taban_puanı'nı
        // 475 olarak güncelleyiniz.

        // String sql="update bolumler set taban_puani=475 where bolum ilike 'matematik'";
        // st.executeUpdate(sql);
        // preparedStatement için parametreli query yazalım.

        String sql="update bolumler set taban_puani=? where bolum ilike ?";
        // prepared oluştur

        PreparedStatement prst=con.prepareStatement(sql);
        // parametre değerlerini gir

        prst.setInt(1,475);
        prst.setString(2,"Matematik");

        // preparedstatement ile query i çalıştır.
        int updated= prst.executeUpdate();
        // eğer tabloyu tekrar yazdırmak istersek

        ResultSet rs=st.executeQuery("select * from bolumler");
        while(rs.next()){
            System.out.printf("%-6d %-25s %-6d\n",rs.getInt("bolum_id"),rs.getString("bolum"),rs.getInt("taban_puani"));

        }
        //ÖRNEK2:Prepared Statement kullanarak bolumler tablosunda Edebiyat bölümünün
        // taban_puanı'nı 455 olarak güncelleyiniz.
        // tekrar oluşturmama gerek yok, sadece parametreleri gireceğiz.

        prst.setInt(1,455);
        prst.setString(2,"Edebiyat");

        int updated2=prst.executeUpdate();
        System.out.println("updated2: "+updated2);
        prst.close();
        st.close();
        con.close();


    }
}
