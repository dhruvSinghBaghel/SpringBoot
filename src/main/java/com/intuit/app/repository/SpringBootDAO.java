package com.intuit.app.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.intuit.app.model.Organization;


@Repository
public class SpringBootDAO {
	
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    private static final String SQL = "select * from org";

    public List<Organization> isData() {

         List<Organization> Organizations = new ArrayList<Organization>();
         List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

         for (Map<String, Object> row : rows) 
         {
              Organization Organization = new Organization();
              Organization.setOrg_id((int)row.get("org_id"));
              Organization.setOrg_name((String)row.get("org_name"));
              Organization.setOrg_reg_date((String)row.get("org_reg_date"));
              Organization.setOrg_remove_date((Date)row.get("org_rem_date"));

              Organizations.add(Organization);
          }

        return Organizations;
    }
    
    public int saveOrg(Organization org) {
    	int rows = jdbcTemplate.update("INSERT INTO org(org_id,org_name,org_reg_date,org_rem_date)VALUES("+ org.getOrg_id()+","+ org.getOrg_name()+", "+org.getOrg_reg_date()+","+org.getOrg_remove_date()+")");
    
     return rows;
     }
    
    
    

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


}
