package in.ineuron.Model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ProgrammerprojectInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private ProgrammerProjectId id;
	private String pname;
	private Integer deptNo;
	private String projName;
	
	public ProgrammerProjectId getId() {
		return id;
	}
	public void setId(ProgrammerProjectId id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	@Override
	public String toString() {
		return "ProgrammerprojectInfo [id=" + id + ", pname=" + pname + ", deptNo=" + deptNo + ", projName=" + projName
				+ "]";
	}

}
