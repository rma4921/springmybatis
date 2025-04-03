package com.estsoft.springmybatis.repository;

import com.estsoft.springmybatis.model.Students;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    // 각 쿼리의 id를 메서드로 만들기
    int countStudents();

    List<Students> selectStudents(Long id);

    // 작성해본 코드
    void insertStudent(Students students);
    // 실습 코드
    int saveStudent(Students students);

    int updateStudent(Students students);

    int deleteStudent(Long id);
}
