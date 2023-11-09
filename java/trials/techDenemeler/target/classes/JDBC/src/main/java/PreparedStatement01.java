import java.sql.*;

/*
preparedstatement Statement interface ini extend eder.
PreparedStatement interface, birden çok kez çalıştırılabilen önceden derlenmiş bir SQL kodunu temsil eder.
Paremetrelendirilmiş SQL sorguları(query) ile çalışır. Bur sorguyu 0 veya daha fazla parametre ile kullanabiliriz

 */
public class PreparedStatement01 {
    public static void main(String[] args) throws SQLException {
        // database ebağlanma
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db", "dev_user", "password");

        // db ye iletim yapmak ve query çalıştırmak için oluşturulur.
        Statement st = con.createStatement();

        //ÖRNEK1:(Prepared Statement kullanarak) bolumler tablosunda Matematik bölümünün taban_puanı'nı
        // 475 olarak güncelleyiniz.

      //  String sql="uodate bolumler set taban_puani=475 where bolum ilike 'Matematik'";
      //  st.executeQuery(sql);

        // parametreli yazalım

        String sql="update bolumler set taban_puani=? where bolum ilike ?";

        PreparedStatement prst=con.prepareStatement(sql);
        prst.setInt(1,475);
        prst.setString(2,"Matematik");

        int updated= prst.executeUpdate();

        ResultSet rs=st.executeQuery("select * from bolumler");
        while (rs.next()){

            System.out.printf("%-6d %-21s %-6d\n",rs.getInt("bolum_id"),rs.getString("bolum"),rs.getInt("taban_puani"));
        }

         prst.setInt(1,455);
        prst.setString(2,"Edebiyat");

        int updated2= prst.executeUpdate();
        System.out.println("updated2: "+updated2);

        st.close();
        con.close();

    }

}
