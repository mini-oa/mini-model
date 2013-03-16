/**
 * 
 */
package org.mini.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Administrator
 * 员工信息pojo
 */
/* 这个不解释，你要知道为什么要这样你就去问hibernate的作者吧  */
@Entity
/* 这个也一样，唯一要解释的就是里面的表名就是你要关联的表，刚才创建的  */
@Table(name="sys_employee")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4530492910481002995L;

	/* 然后就是把数据库里面涉及要的字段给填上  */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	/* 上面两行是用在主键上的，照着复制不需要解释  */
	/* 下面就是表示要关联的字段名了，你建表的时候取的  */
	@Column(name = "employee_id")
	private long employeeId;

	@Column(name = "login_name")
	private String loginName;
	
	/* 这里的field名称 ，如password不一样要和表字段名一样，关联正确就可以了  */
	@Column(name = "login_password")
	private String password;
	
	@Column(name = "chinese_name")
	private String chineseName;
	
	@Column(name = "english_name")
	private String englishName;
	
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getChineseName() {
		return chineseName;
	}

	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
}
