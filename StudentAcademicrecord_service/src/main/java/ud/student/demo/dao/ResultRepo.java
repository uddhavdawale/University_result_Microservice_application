package ud.student.demo.dao;

import org.springframework.data.repository.CrudRepository;

import ud.student.demo.entity.Result;

public interface ResultRepo extends CrudRepository<Result, Integer>
{

}
