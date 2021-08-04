package ud.student.demo.resultservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ud.student.demo.dao.ResultRepo;
import ud.student.demo.entity.Result;

@Service
public class resultserviceimpl
{
	@Autowired
	private ResultRepo resultrepo;
	public Result getoneresult(Integer prn)
	{
		Result rs=resultrepo.findById(prn).orElse(new Result());
		return rs;
	}
	public List<Result> getalldata()
	{
		return (List<Result>) resultrepo.findAll();
	}
	
	public String saveresult(Result st)
	{
		resultrepo.save(st);
		return "PRN :"+st.getPRN()+" Student result stored";
	}
	
	
}
