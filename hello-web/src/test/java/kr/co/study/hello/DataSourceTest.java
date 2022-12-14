package kr.co.study.hello;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mariadb.jdbc.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/web.xml","file:src/main/resources/*.xml","file:src/main/resources/mappers/*.xml"})
public class DataSourceTest {
	
	@Autowired
	private DataSource dataSource;
	@Test
	public void testConnection() {
		try (Connection con = (Connection) dataSource.getConnection())
		{
			//log.info(con);
			System.out.print("test ok");
		}
		catch(Exception e) {
			fail(e.getMessage());
		}
	}

}
