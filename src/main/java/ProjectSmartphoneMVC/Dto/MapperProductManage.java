package ProjectSmartphoneMVC.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperProductManage implements RowMapper<ProductManageDto>{

	@Override
	public ProductManageDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductManageDto productManageDto = new ProductManageDto();
		productManageDto.setId(rs.getInt("id"));                           
		productManageDto.setProduct_type(rs.getInt("product_type"));
		productManageDto.setName(rs.getString("name"));
		productManageDto.setTitle(rs.getString("title"));                  
		productManageDto.setPrice(rs.getDouble("price"));                  
		productManageDto.setDiscount(rs.getInt("discount"));               
		productManageDto.setNum(rs.getInt("num"));                         
		productManageDto.setThumnail(rs.getString("thumnail"));            
		productManageDto.setDescription(rs.getString("description"));      
		productManageDto.setDescription2(rs.getString("description2"));    
		productManageDto.setCreated_at(rs.getDate("created_at"));          
		return productManageDto;
	}

}
