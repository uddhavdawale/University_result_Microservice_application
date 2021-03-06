package ud.student.demo.resultcontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ud.student.demo.entity.Result;
import ud.student.demo.resultservice.resultserviceimpl;

@RestController
public class ResultController 
{
	@Autowired
	resultserviceimpl serv;
	@RequestMapping(path="/result/getall")
	public List<Result> getalldataresultt()
	{
		return serv.getalldata();
	}
	@PostMapping(path="/result/store",consumes = "application/json")
	public String saveresult(@RequestBody Result rs)
	{
		return serv.saveresult(rs);
	}
	
	@PostMapping(path="/result/update",consumes = "application/json")
	public String updateresult(@RequestBody Result rs)
	{
		return serv.saveresult(rs);
	}	
	@RequestMapping("/result/get/{id}")
	public Result check(@PathVariable("id") String id)
	{
		return serv.getoneresult(Integer.parseInt(id));
	}
}
