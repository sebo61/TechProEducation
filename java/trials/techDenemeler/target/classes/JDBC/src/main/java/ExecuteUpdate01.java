import java.sql.*;

public class ExecuteUpdate01 {
    public static void main(String[] args) throws SQLException {
        // database ebağlanma
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db", "dev_user", "password");

        // db ye iletim yapmak ve query çalıştırmak için oluşturulur.
        Statement st = con.createStatement();
        // developers tablosundaki maaşı ortalama maaştan az olanların maaşını ortalama maaiş ile güncelleyiniz.
       /* String sql="update developers set salary=(select avg(salary) from developers) where salary< (select avg(salary) from developers)\n";

         int updated= st.executeUpdate(sql); // update eden sayı
        System.out.println("güncellenen kayıt sayısı:"+ updated);*/

       /* ResultSet rs= st.executeQuery("select id,name,salary from developers");

        while (rs.next()){
            System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("salary"));
        }
        // developers tablosuna yeni bir developer ekleyiniz.

        String sql2="insert into developers (name,salary,prog_lang) values ('sebahattin köse',4800,'C++')";

         int inserted= st.executeUpdate(sql2);
        System.out.println("eklenen kayıt: "+inserted);*/

        //id si 11 olanı sil
/*
        String sql3="delete from developers where id=12";

        int inserted= st.executeUpdate(sql3);

        System.out.println("silinen kayır sayısı: "+inserted);*/

        //ÖRNEK4:developers tablosundan prog_lang css olanları siliniz.

        String sql="delete from developers where prog_lang='CSS'";

        int deleted= st.executeUpdate(sql);

        System.out.println("silinen  kayıt sayısı: "+ deleted);

        st.close();
        con.close();
    }

}
