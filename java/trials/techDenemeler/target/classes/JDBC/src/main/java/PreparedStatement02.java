import java.sql.*;

public class PreparedStatement02 {
    public static void main(String[] args) throws SQLException {
        // database ebağlanma
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db", "dev_user", "password");

        // db ye iletim yapmak ve query çalıştırmak için oluşturulur.
        Statement st = con.createStatement();

        // preparedstatment kullanarak ogrenciler tablosundan matematik bölümünde okyanları siliniz.

       /* String sql="delete from ogrenciler where bolum ilike ?";

        PreparedStatement prst= con.prepareStatement(sql);

        prst.setString(1,"Matematik");
        int updated=  prst.executeUpdate();

        System.out.println("updated: "+updated);*/

       //ÖRNEK2:Prepared Statement kullanarak bolumler tablosuna
        // Yazılım Mühendisliği(id=107,taban_puani=475, kampus='Merkez') bölümünü ekleyiniz.

        String sql2="insert into bolumler (bolum_id,bolum,taban_puani,kampus) values (?,?,?,?)";

        PreparedStatement prst2= con.prepareStatement(sql2);
        prst2.setInt(1,107);
        prst2.setString(2,"Yazılım Mühendisliği");
        prst2.setInt(3,475);
        prst2.setString(4,"Merkez");

        int inserted= prst2.executeUpdate();

        System.out.println("inserted: "+ inserted);


        prst2.close();
        con.close();
        st.close();



    }
}
