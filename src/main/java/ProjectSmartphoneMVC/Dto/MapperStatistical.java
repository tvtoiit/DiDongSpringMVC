package ProjectSmartphoneMVC.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperStatistical implements RowMapper<StatisticalDto>{

	@Override
	public StatisticalDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		StatisticalDto statisticalDto = new StatisticalDto();
		statisticalDto.setSumMoney(rs.getDouble("sumMoney"));
		statisticalDto.setMonth(rs.getString("month"));
		return statisticalDto;
	}

}
