package pojo;// default package
// Generated Aug 2, 2020 8:53:50 PM by Hibernate Tools 5.4.14.Final

/**
 * Sachmuon generated by hbm2java
 */
public class Sachmuon implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SachmuonId id;
	private Phieumuonsach phieumuonsach;
	private Sach sach;

	public Sachmuon() {
	}

	public Sachmuon(SachmuonId id, Phieumuonsach phieumuonsach) {
		this.id = id;
		this.phieumuonsach = phieumuonsach;
	}

	public Sachmuon(SachmuonId id, Phieumuonsach phieumuonsach, Sach sach) {
		this.id = id;
		this.phieumuonsach = phieumuonsach;
		this.sach = sach;
	}

	public SachmuonId getId() {
		return this.id;
	}

	public void setId(SachmuonId id) {
		this.id = id;
	}

	public Phieumuonsach getPhieumuonsach() {
		return this.phieumuonsach;
	}

	public void setPhieumuonsach(Phieumuonsach phieumuonsach) {
		this.phieumuonsach = phieumuonsach;
	}

	public Sach getSach() {
		return this.sach;
	}

	public void setSach(Sach sach) {
		this.sach = sach;
	}

}
