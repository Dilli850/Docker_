package com.nt.wipro.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.wipro.Entity.Student;
import com.nt.wipro.service.IStudentMgmtService;
@Component
public class StudentRunner implements CommandLineRunner {
@Autowired
private IStudentMgmtService iStudentMgmtService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student=new Student();
//		student.setSid(1144);
//		student.setSfee(554553.52);
//	student.setSname(" koti ramesh");
//	student.setSid(1155);
//	student.setSfee(55432353.52);
//student.setSname("rahul");student.setSid(1133);
//student.setSfee(554553.52);
//student.setSname("lokesh");
//		String msg=iStudentMgmtService.registerStudent(student);
//		System.out.println(msg);
//	
		
		System.out.println(iStudentMgmtService.studCount());
		System.out.println(iStudentMgmtService.studIsavailble(1122
				));
		System.out.println(iStudentMgmtService.showAllStudent());
		
		
		System.out.println(iStudentMgmtService.findByid(1122));

	}

}
