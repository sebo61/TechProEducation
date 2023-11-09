package com.tpe.hb05.manytoone_uni;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_student05")
public class Student05 {
    @Id
    private int id;
    private String name;
    private int grade;
    private LocalDateTime createOn;

    @PrePersist //bu classın objesi persist edilmeden (db ye eklenmeden) önce bu metodu çağırır.

    public void prePersist() {
        this.createOn = LocalDateTime.now();

    }
    @ManyToOne //student taplosunda FK oluşturur. defaut:university_id
    @JoinColumn(name = "uni_id")
    private University university;

    @Override
    public String toString() {
        return "Student05{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", createOn=" + createOn +
                ", university=" + university +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public LocalDateTime getCreateOn() {
        return createOn;
    }

   /* public void setCreateOn(LocalDateTime createOn) {
        this.createOn = createOn;
    }
*/
    public Student05(){

    }
    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Student05(int id, String name, int grade, University university) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.university = university;
    }
}
