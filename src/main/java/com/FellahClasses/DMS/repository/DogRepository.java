package com.FellahClasses.DMS.repository;

/**
*
* @author Udaykiran Kolla 

*/

import java.util.List;

/**
*
* @author Praveen Krishnamaneni
*/

import org.springframework.data.repository.CrudRepository;

import com.FellahClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}