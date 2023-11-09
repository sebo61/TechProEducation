import java.sql.*;

public class ExecuıteQuery02 {
    public static void main(String[] args) throws SQLException {
        // database ebağlanma
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db", "dev_user", "password");

        // db ye iletim yapmak ve query çalıştırmak için oluşturulur.
        Statement st = con.createStatement();

        // bolumler tab. taban puanı en yüksek 2. bölümün ismini ve puanını yazdırınız.
        String sql="select bolum,taban_puani from bolumler order by taban_puani desc offset 1 limit 1";

        ResultSet resultSet =st.executeQuery(sql);

        while (resultSet.next()){

            System.out.println(resultSet.getString("bolum")+" "+resultSet.getInt("taban_puani"));
        }
        System.out.println("*************************************");

        // bölüm isimleri, kampüsleri ve her bölümde okuyan öğrencilerin en yüksek puanları
        String sql2="select bolum,kampus,(select max(puan) from ogrenciler o where o.bolum=b.bolum) max_puan from bolumler b";
        ResultSet rs2= st.executeQuery(sql2);

        while (rs2.next()){
            System.out.println(rs2.getString("bolum")+ " " +rs2.getString("kampus")+" "+rs2.getInt("max_puan"));


        }
        st.close();
        con.close();

    }

}
