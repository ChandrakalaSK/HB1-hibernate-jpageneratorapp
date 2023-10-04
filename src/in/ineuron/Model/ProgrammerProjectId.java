package in.ineuron.Model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ProgrammerProjectId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer pid;
	private Integer projId;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	@Override
	public String toString() {
		return "ProgrammerProjectId [pid=" + pid + ", projId=" + projId + "]";
	}

}
