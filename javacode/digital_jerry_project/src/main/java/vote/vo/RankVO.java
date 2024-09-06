package vote.vo;

public class RankVO {
	private String m_no;
	private String m_name;
	private int count;
	
	public RankVO(String m_no, String m_name, int count) {
		this.m_no = m_no;
		this.m_name = m_name;
		this.count = count;
	}

	public String getM_no() {
		return m_no;
	}

	public void setM_no(String m_no) {
		this.m_no = m_no;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
