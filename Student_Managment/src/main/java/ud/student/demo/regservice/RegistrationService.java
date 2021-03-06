package ud.student.demo.regservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import ud.student.demo.entity.Student_Reg;
import ud.student.demo.repo.Registrationrepo;


@Service
public class RegistrationService  
{
	@Autowired
	Registrationrepo repo;
	public String saveRegistration(Student_Reg user)
	{
		repo.save(user);
		//repo.save(new Student_Reg(1, "Santosh", "Dashrath", "darade", "BE", "Com", "9999"));
		//null;
		return " Registred";
	}
	public List<Student_Reg> getRegisteredUser()
	{
		return (List<Student_Reg>) repo.findAll();
	}
	public Student_Reg getstudbyid(Integer id)
	{
		Student_Reg user=repo.findById(id).orElse(new Student_Reg());;
		return user;
	}
	public String updateRegistration(Student_Reg user)
	{
		repo.save(user);
		//repo.save(new Student_Reg(1, "Santosh", "Dashrath", "darade", "BE", "Com", "9999"));
		//null;
		return " Registred";
	}
		
}
