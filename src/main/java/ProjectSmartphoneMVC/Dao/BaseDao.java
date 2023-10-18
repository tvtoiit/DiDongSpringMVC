package ProjectSmartphoneMVC.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class BaseDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
}
