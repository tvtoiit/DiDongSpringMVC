package ProjectSmartphoneMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ProjectSmartphoneMVC.Dto.MapperUserManage;
import ProjectSmartphoneMVC.Dto.UsersManageDto;
import ProjectSmartphoneMVC.Entity.MapperUsers;
import ProjectSmartphoneMVC.Entity.Users;

@Repository
public class UsersManageDao extends BaseDao{
	
	public List<UsersManageDto> getDataUsers(){
		List<UsersManageDto> list = new ArrayList<UsersManageDto>();
		String sqlString = "SELECT u.*,r.name AS role_name FROM user u INNER JOIN role r ON u.role_id = r.id ORDER BY u.created_at DESC";
		list = _jdbcTemplate.query(sqlString, new MapperUserManage());
		return list;
	}
	public List<UsersManageDto> getDataUsers(String id){
		List<UsersManageDto> list = new ArrayList<UsersManageDto>();
		String sqlString = "SELECT u.*,r.name AS role_name FROM user u INNER JOIN role r ON u.role_id = r.id WHERE u.id ="+id;
		list = _jdbcTemplate.query(sqlString, new MapperUserManage());
		return list;
	}
	
	
	
	public List<UsersManageDto> getDataUsers(String userName, String password){
		List<UsersManageDto> list = new ArrayList<UsersManageDto>();
		String sqlString = "SELECT u.*,r.name AS role_name FROM user u INNER JOIN role r ON u.role_id = r.id WHERE u.userName ='"+userName+"' AND u.password=md5('"+password+"')";
		list = _jdbcTemplate.query(sqlString, new MapperUserManage());
		return list;
	}
	public int Update(Users users) {
		String sql = "UPDATE user SET fullname='"+users.getFullname()+"',email='"+users.getEmail()+"',phone_number='"+users.getPhone_number()+"'"
				+ ",address='"+users.getAddress()+"',role_id='"+users.getRole_id()+"' WHERE id="+users.getId();
		int count = _jdbcTemplate.update(sql);
		return count;
	}
	
	public int insert(Users users) {
		String sql = "INSERT INTO user(fullname, email, phone_number, address, userName, password, role_id) "
				+ "VALUES ('"+users.getFullname()+"','"+users.getEmail()+"','"+users.getPhone_number()+"','"+users.getAddress()+"','"+users.getUserName()+"',md5('"+users.getPassword()+"'),'"+users.getRole_id()+"')";
		int count = _jdbcTemplate.update(sql);
		return count;
	}
	
	public int UpdatePass(Users users) {
		String sql = "UPDATE user set password= md5('"+users.getPassword()+"') WHERE id="+users.getId();
		int countUp = _jdbcTemplate.update(sql);
		return countUp;
	}
	
	public List<Users> getDataByUsers(String id, String pass){
		List<Users> list = new ArrayList<Users>();
		String sqlString = "SELECT u.* FROM user u WHERE u.id = '"+id+"' AND password=md5('"+pass+"')";
		list = _jdbcTemplate.query(sqlString, new MapperUsers());
		return list;
	}
}
