/**
 * @Class Name : User.java
 * @Description : 
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2019-08-19           최초생성
 *
 * @author 개발프레임웍크 실행환경 개발팀
 * @since 2019-08-19 
 * @version 1.0
 * @see
 *
 *  Copyright (C) by H.R. KIM All right reserved.
 */
package com.ehr;

import com.ehr.com.DTO;

/**
 * @author sist
 *
 */
/**
 * @author sist
 *
 */
public class User extends DTO {

	/**사용자ID */
	private String u_id      ;
	/**사용자이름 */
	private String name      ;
	/**비번 */
	private String passwd    ;
	/**level*/
	private Level hLevel ; 
	/**로그인*/
	private int login;
	/**추천*/
	private int recommend;
	/**이메일*/
	private String email;
	/**등록일*/
	private String regDt;
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Level gethLevel() {
		return hLevel;
	}
	public void sethLevel(Level hLevel) {
		this.hLevel = hLevel;
	}
	public int getLogin() {
		return login;
	}
	public void setLogin(int login) {
		this.login = login;
	}
	public int getRecommend() {
		return recommend;
	}
	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegDt() {
		return regDt;
	}
	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}
	
	
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", name=" + name + ", passwd=" + passwd + ", hLevel=" + hLevel + ", login="
				+ login + ", recommend=" + recommend + ", email=" + email + ", regDt=" + regDt + ", toString()="
				+ super.toString() + "]";
	}
	public User(String u_id, String name, String passwd, Level hLevel, int login, int recommend, String email,
			String regDt) {
		super();
		this.u_id = u_id;
		this.name = name;
		this.passwd = passwd;
		this.hLevel = hLevel;
		this.login = login;
		this.recommend = recommend;
		this.email = email;
		this.regDt = regDt;
	}
	public User() {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((hLevel == null) ? 0 : hLevel.hashCode());
		result = prime * result + login;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((passwd == null) ? 0 : passwd.hashCode());
		result = prime * result + recommend;
		result = prime * result + ((regDt == null) ? 0 : regDt.hashCode());
		result = prime * result + ((u_id == null) ? 0 : u_id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (hLevel != other.hLevel)
			return false;
		if (login != other.login)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (passwd == null) {
			if (other.passwd != null)
				return false;
		} else if (!passwd.equals(other.passwd))
			return false;
		if (recommend != other.recommend)
			return false;
		if (regDt == null) {
			if (other.regDt != null)
				return false;
		} else if (!regDt.equals(other.regDt))
			return false;
		if (u_id == null) {
			if (other.u_id != null)
				return false;
		} else if (!u_id.equals(other.u_id))
			return false;
		return true;
	}
	
}