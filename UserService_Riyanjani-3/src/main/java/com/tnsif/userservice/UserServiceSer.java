package com.tnsif.userservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
@Service
@Transactional

public class UserServiceSer {
	@Autowired
	private UserServiceRepository repo;
	
	//Get all the records from the table
	
	public List<UserService> listAll()
	{
		return repo.findAll();
	}
//save the records
	public void save( UserService user)
{
		repo.save(user);
		}
//retrieving the particular data
	public  UserService get(Integer id)
	{
		return repo.findById(id).get();
		
	}
	//deleting the record
	
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	
	//updating the record
	
	public void update( UserService user)
	{
		repo.save(user);
	}
}

