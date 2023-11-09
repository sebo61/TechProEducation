import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// 4- db ile iletişimde olan class(connection,statement, prepared statement )
public class StudentRepository {
    private Connection con;
    private Statement st;
    private PreparedStatement prst;

    // 5- connection için metot.

    private void getConnection() {

        try {
            this.con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db", "dev_user", "password");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    // 6- statement için metod.

    private void getStatement() {
        try {
            this.st = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    // 7- premaredStaement için metod oluştur.
    private void getPreperedStatement(String sql) {
        try {
            this.prst = con.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    // 8- tablo oluşturma

    public void createTable() {
        getConnection();
        getStatement();
        try {
            st.execute("create table if not exists t_student(id serial, name varchar(50), lastname varchar(50),city varchar(50),age int)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }

    }

    // 12 - tabloya veri ekleme
    public void save(Student student) {
        getConnection();
        String sql = "insert into t_student (name,lastname,city,age) values (?,?,?,?)";
        getPreperedStatement(sql);

        try {
            prst.setString(1, student.getName());
            prst.setString(2, student.getLastname());
            prst.setString(3, student.getCity());
            prst.setInt(4, student.getAge());

            prst.executeUpdate();
            System.out.println("Kayıt başarı ile gerçekleşti...");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }


    }

    // 14- tüm kayıtları listeleme
    public void findAll() {
        getConnection();
        getStatement();

        String sql = "select * from t_student";

        try {
            ResultSet resultSet = st.executeQuery(sql);
            System.out.println("+" + "-".repeat(80) + "+");

            System.out.printf("| %-5s | %-20s | %-20s | %-20s | %-5s\n", "id", "ad", "soyad", "şehir", "yaş");
            while (resultSet.next()) {
                System.out.printf("| %-5d | %-20s | %-20s | %-20s | %-5d\n",
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("lastname"),
                        resultSet.getString("city"),
                        resultSet.getInt("age"));

            }
            System.out.println("+" + "-".repeat(80) + "+");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }


    }

    // 16- tablodan veri silme
    public void delete(int id) {
        getConnection();
        String sql = "delete from t_student where id=?";

        getPreperedStatement(sql);

        try {
            prst.setInt(1, id);
            int deleted = prst.executeUpdate();

            if (deleted > 0) {
                System.out.println("id: " + id + " olan kayıt silinmiştir...");
            } else {
                System.out.println("id: " + id + " şeklinde kayıt bulunamadı");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                prst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }


    }

    // 18 -id ile kayıt dönme
    public Student findStudentById(int id) {
        Student student = null;
        getConnection();
        String sql = "select * from t_student where id=?";
        getPreperedStatement(sql);
        try {
            prst.setInt(1, id);
            ResultSet resultSet = prst.executeQuery();
            if (resultSet.next()) {
                student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setLastname(resultSet.getString("lastname"));
                student.setCity(resultSet.getString("city"));
                student.setAge(resultSet.getInt("age"));


            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                prst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        return student;


    }

    // 20- db de veri güncelleme
    public void updateStudent(Student student) {
        getConnection();
        String sql = "update t_student set name=?, lastname=?, city=?, age=? where id=? ";
        getPreperedStatement(sql);

        try {
            prst.setString(1, student.getName());
            prst.setString(2, student.getLastname());
            prst.setString(3, student.getCity());
            prst.setInt(4, student.getAge());
            prst.setInt(5, student.getId());
            int updated = prst.executeUpdate();
            if (updated > 0) {
                System.out.println("güncelleme işlemi başarı ile gerçekleşti..");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                prst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }


        }
    }
    // 22- name veya lastname sutununa girilen kelimelri içeren kayıtların dönmesi

    public List<Student> findStudentByNameOrLastName(String nameOrLastName) {
        List<Student> list = new ArrayList<>();
        getConnection();
        String searched = "%" + nameOrLastName + "%"; // aranan ay ise searched=%ay%
        String sql = "select * from t_student where name ilike ? or lastname  ilike ?";
        getPreperedStatement(sql);
        try {
            prst.setString(1, searched);
            prst.setString(2, searched);
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setLastname(rs.getString("lastname"));
                student.setCity(rs.getString("city"));
                student.setId(rs.getInt("age"));
                list.add(student);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                prst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }


        }
        return list;
    }
}