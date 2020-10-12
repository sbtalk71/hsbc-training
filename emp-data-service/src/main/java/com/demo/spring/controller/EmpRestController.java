package com.demo.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.data.EmpDb;
import com.hsbc.tr.spring.entity.Emp;

@RestController
public class EmpRestController {

	@Autowired
	private EmpDb datastore;

	// @RequestMapping(path="/emp/find/{id}",method = RequestMethod.GET,produces =
	// MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(path = "/emp/find/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getEmpDetails(@PathVariable("id") int id) {
		if (datastore.getDb().containsKey(id)) {
			return ResponseEntity.ok(datastore.getDb().get(id));
		} else {
			return ResponseEntity.ok("Emp Not Found");
		}
	}

	@GetMapping(path = "/emp", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Emp>> listAll() {

		ArrayList<Emp> empList = new ArrayList<>(datastore.getDb().values());
		return ResponseEntity.ok(empList);
	}

}
