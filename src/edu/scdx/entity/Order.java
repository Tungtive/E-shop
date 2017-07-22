package edu.scdx.entity;

public class Order {

	private int Oid ;//auto_increment primary key,  -- ����id
	private int Uid ; //,  -- �û�id
 	private int Pid ; //  -- ��Ʒid
 	private String sendName; //varchar(20),  -- �ջ�������
	private String sendAddress ;// text,  -- �ջ��ַ
	private String sendTel;// varchar(11),   -- �ջ��˵绰
	private String payment;//  varchar(10),   -- ���ʽ����������/֧����/΢�ţ�
 	private String memo;//  varchar(50),  -- ��ע
 	private String time;// date, -- ��������ʱ��
 	private int tag;//  int, -- ���������� 0/1
 	
	public int getOid() {
		return Oid;
	}
	public void setOid(int oid) {
		Oid = oid;
	}
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getSendName() {
		return sendName;
	}
	public void setSendName(String sendName) {
		this.sendName = sendName;
	}
	public String getSendAddress() {
		return sendAddress;
	}
	public void setSendAddress(String sendAddress) {
		this.sendAddress = sendAddress;
	}
	public String getSendTel() {
		return sendTel;
	}
	public void setSendTel(String sendTel) {
		this.sendTel = sendTel;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	@Override
	public String toString() {
		return "Order [Oid=" + Oid + ", Uid=" + Uid + ", Pid=" + Pid + ", sendName=" + sendName + ", sendAddress="
				+ sendAddress + ", sendTel=" + sendTel + ", payment=" + payment + ", memo=" + memo + ", time=" + time
				+ ", tag=" + tag + "]";
	}
	
}
