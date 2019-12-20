package hcl.DepartmentInsert;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource =(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String cmd="Insert into department values(?,?,?,?,?)";
		jt.update(cmd,new Object[] {10,"Peter","Delhi","Capital","Gauranteed"});
		System.out.println("****  Record Successfully Inserted ****");

	}

}
