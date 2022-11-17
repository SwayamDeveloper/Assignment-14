package com.springdemo1.Entity;

import org.springframework.jdbc.core.JdbcTemplate;

public class AgentDao {
	private JdbcTemplate jdbcTemplate;
	
//	public JdbcTemplate getJdbctemplate() {
//		return jdbcTemplate;
//	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	
	
	public int saveAgent(Agent e )
	{
		String query="insert into Agent(id ,name ,Area,commission) values(?,?,?,?)";
		return jdbcTemplate.update(query,e.getId(),e.getName(),e.getArea(),e.getCommission());    }

	
	
	
	public int updateAgent(Agent e)
	
	{
		String query="update Agent set name='"+e.getName()+"',Area='"+e.getArea()+"' ,commission='"+e.getCommission()+"' where id='"+e.getId()+"' ";
		return jdbcTemplate.update(query);
	}

	
	
	//	
		
	public int deleteAgent(Agent e)
	{
		String query="delete From Agent where id='"+e.getId()+"' ";;
		return jdbcTemplate.update(query);
	}


}
