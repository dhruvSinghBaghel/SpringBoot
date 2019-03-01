package com.intuit.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.app.model.Organization;
import com.intuit.app.repository.SpringBootDAO;

@RestController
public class SpringIntuitController {
	
	
    @Autowired
    public SpringBootDAO dao;

    @RequestMapping("/getcustInfo")
    public List<Organization> orgInformation() {
        List<Organization> orgs = dao.isData(); 
        return orgs;
    }
    @RequestMapping(value = "/org", method = RequestMethod.POST)
    public int saveOrganization(@RequestBody Organization org) {
    	return dao.saveOrg(org);
        }
 
	
	/*
	 * @RequestMapping("/") public String welcome() { return
	 * "Welcome to Spring Boot"; }
	 * 
	 * @RequestMapping("/hello") public String myData() { return
	 * "Hello Spring Boot"; }
	 */

}
