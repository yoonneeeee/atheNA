package org.atheNA.day12.collection.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManageStudent implements ManageInterface {
	
	private List<Student> sList;
	
	public ManageStudent() {
		sList = new ArrayList<Student>();
	}

	@Override
	public void registerStudent(Student student) {
		sList.add(student);
	}

	@Override
	public List<Student> searchListByName(String name) {
		if(name != null) {
			List<Student> searchList = new ArrayList<Student>();
			for(Student std : sList) {
				if(name.equals(std.getName())) {
					// 찾았다!!
					searchList.add(std);
				}
			}
			return searchList;
		}
		return null;
	}

	public Student searchOneByName(String name) {
		if(name != null) {
			for(Student std : sList) {
				if(name.equals(std.getName())) {
					// 찾았다!!
					return std;
				}
			}
		}
		return null;
	}
	@Override
	public List<Student> selectAllStudents() {
//		if(sList.isEmpty()) {
//			return null;
//		}
		return sList;
	}

	@Override
	public void modifyStudent(int index, Student student) {
//		sList.add(student);
		sList.set(index, student);
	}

	@Override
	public void deleteStudent(int index) {
		sList.remove(index);
	}

	public Map<String, Object> searchModifyStudent(String name) {
		if(name != null) {
			Map<String, Object> result 
						= new HashMap<String, Object>();
			for(int i = 0; i < sList.size(); i++) { // 전체에서
				Student student = sList.get(i);
				if(name.equals(student.getName())) { // 이름이 같으면
					result.put("student", student);
					result.put("index", i);
					return result;
				}
			}
		}
		return null;
	}

	public int searchIndexByName(String name) {
		if(name != null) {
			int count = 0;
			for(Student student : sList) {	// sList에서
				if(name.equals(student.getName())) { // 이름 같으면
					return count;
				}
				count++;
			}
		}
		return 0;
	}


//	public String checkPass(Student student) {
//	int first = student.getFirstScore();
//	int second = student.getSecondScore();
//	// 평균이 60점이 넘으면 통과
//	// 평균이 60점이 안되면 재평가;
//	double avg = (first+second)/(double)2;
//	if(avg>=60) {	//pass
//		if(first<40) {
//			System.out.println("1차 시험 재평가");
//		}else if (second<40) {
//			System.out.println("2차 시험 재평가");
//		}else {
//			System.out.println("모두 통과입니다.");
//		}
//	}else {		//fail
//		if(first<60) {	// 1차 시험이 60점 이하인지
//			System.out.println("1차 시험 재평가");
//		}
//		if(second<60) {		// 2차 시험이 60점 이하인지
//			System.out.println("2차 시험 재평가");
//			
//		}
//	}
//		return null;
//	}


}













