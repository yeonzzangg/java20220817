package ch16.book.s161101;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import ch07.book.s0703.Student;

public class ToListExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE),
				new Student("김수애", 6, Student.Sex.FMALE),
				new Student("신용권", 10, Student.Sex.MALE),
				new Student("박수미", 6, Student.Sex.FMALE)
				);
		
		//남학생들만 묶어 List 생성
		List<Student> maleList = totalList.stream()
				.filter(s -> s.getSex()==Student.Sex.MALE)
				.collect(Collectors.toList());
				
	}
}
