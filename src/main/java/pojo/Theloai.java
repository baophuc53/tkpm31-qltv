package pojo;// default package
// Generated Aug 2, 2020 8:53:50 PM by Hibernate Tools 5.4.14.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Theloai generated by hbm2java
 */
public class Theloai implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String matheloai;
	private String tentheloai;
	private Set<Sach> saches = new HashSet<Sach>(0);

	public Theloai() {
	}

	public Theloai(String matheloai) {
		this.matheloai = matheloai;
	}

	public Theloai(String matheloai, String tentheloai, Set<Sach> saches) {
		this.matheloai = matheloai;
		this.tentheloai = tentheloai;
		this.saches = saches;
	}

	public String getMatheloai() {
		return this.matheloai;
	}

	public void setMatheloai(String matheloai) {
		this.matheloai = matheloai;
	}

	public String getTentheloai() {
		return this.tentheloai;
	}

	public void setTentheloai(String tentheloai) {
		this.tentheloai = tentheloai;
	}

	public Set<Sach> getSaches() {
		return this.saches;
	}

	public void setSaches(Set<Sach> saches) {
		this.saches = saches;
	}

}