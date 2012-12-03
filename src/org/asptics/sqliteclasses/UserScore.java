/**
 * 
 */
package org.asptics.sqliteclasses;

import java.io.Serializable;

/**
 * @author marcfly
 *
 */
public class UserScore implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String email;
	private String userName;
	private int highScore;
	
	/*Geters and Seters*/
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getUserName(){
		return this.userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public int getHighScore(){
		return this.highScore;
	}
	public void setHighScore(int highScore){
		this.highScore=highScore;
	}
}
