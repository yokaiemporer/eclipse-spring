package com.example.demo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public interface AlienRepository extends CrudRepository<Alien,Integer> {
	
	

}
