package com.tnsif.userservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import jakarta.persistence.NoResultException;
@RestController
public class UserServiceController {
	@Autowired
	private UserServiceSer user;
	@GetMapping("/userservice")
	public List<UserService> list()
	{
		return user.listAll();
	}
	@PostMapping("/userservice")
	public void add(@RequestBody UserService user1)
	{
		user.save(user1);
	}
	@GetMapping("/ userservice/{id}")
	public ResponseEntity<UserService>get(@PathVariable Integer id)
	{
		try {
		UserService u=user.get(id);
		return new ResponseEntity<UserService>(u,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<UserService>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/ userservice/{id}")
	public void delete(@PathVariable Integer id)
	{
		user.delete(id);
	}
	
	@PutMapping("/ userservice/{id}")
	public ResponseEntity< UserService>update(@PathVariable Integer id,@RequestBody  UserService update_u)
	{
		try {
			UserService exist_u=user.get(id);
		exist_u.setName(update_u.getName());
		exist_u.setEmail(update_u.getEmail());
		exist_u.setPhonenumber(update_u.getPhonenumber());
		user.update(exist_u);
		return new ResponseEntity<UserService>(exist_u,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<UserService>(HttpStatus.NOT_FOUND);
		}
	}
}

