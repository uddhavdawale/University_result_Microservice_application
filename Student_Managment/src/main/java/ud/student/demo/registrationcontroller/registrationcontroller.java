package ud.student.demo.registrationcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ud.student.demo.bean.Student_Regdup;
import ud.student.demo.bean.Result;
import ud.student.demo.entity.Student_Reg;
import ud.student.demo.regservice.RegistrationService;
@CrossOrigin(origins = "http://localhost:8083")
@RestController()
public class registrationcontroller 
{
	@Autowired
	RegistrationService serve;
	
	@Autowired
	RestTemplate rt;
	
	@PostMapping(path="/student/register",consumes = {"application/json"} )
	public String registerUser(@RequestBody Student_Reg rinfo)
	{
		return serve.saveRegistration(rinfo);
	}
	
	
	@RequestMapping("/student/getall")
	public List<Student_Reg> getregisteredusersact()
	{
		return serve.getRegisteredUser();
	}
	@RequestMapping("/student/get/{id}")
	public Student_Reg getbyid(@PathVariable("id") String id)
	{
		return serve.getstudbyid(Integer.parseInt(id));
	}
	@GetMapping("/student/data/{id}")
	public Student_Regdup getallonestudent(@PathVariable("id") String id)
	{
		//int id1=Integer.parseInt(id);
		//Student_Reg ug=new Student_Reg();
		//Result rs=new Result();
		Student_Reg user=serve.getstudbyid(Integer.parseInt(id));
		//registration-service
		//RESULT-SERVICE
		//String url="RESULT-SERVICE";//http://localhost:8082/result/get/
		Result result=rt.getForObject("http://RESULT-SERVICE/result/get/"+id, Result.class);
		//Student_Regdup obj=new Student_Regdup(ug,rs);
		Student_Regdup obj=new Student_Regdup(user,result);
		
		return obj;
	}
	
	
}
