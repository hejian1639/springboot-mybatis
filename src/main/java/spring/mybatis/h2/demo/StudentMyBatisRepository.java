package spring.mybatis.h2.demo;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMyBatisRepository {
    @Select("SELECT * FROM student WHERE id = #{id}")
    Student findById(long id);

    @Select("select * from student")
    public List<Student> findAll();

    @Delete("DELETE FROM student WHERE id = #{id}")
    public int deleteById(long id);

    @Insert("INSERT INTO student(id, name, passport_number) VALUES (#{id}, #{name}, #{passportNumber})")
    public int insert(Student student);

    @Update("Update student set name=#{name}, passport_number=#{passportNumber} where id=#{id}")
    public int update(Student student);
}