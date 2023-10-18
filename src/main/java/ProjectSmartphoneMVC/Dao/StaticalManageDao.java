package ProjectSmartphoneMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ProjectSmartphoneMVC.Dto.MapperStatistical;
import ProjectSmartphoneMVC.Dto.StatisticalDto;

@Repository
public class StaticalManageDao extends BaseDao{
	public List<StatisticalDto> getDataStatisticalByNow(){
		List<StatisticalDto> list = new ArrayList<StatisticalDto>();
		String sql = "SELECT SUM(money) AS sumMoney, MONTH(created_at) AS month FROM orders WHERE YEAR(created_at) = YEAR(NOW()) GROUP BY MONTH(created_at)";
		list = _jdbcTemplate.query(sql, new MapperStatistical());
		return list;
	}
}
