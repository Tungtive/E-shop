package edu.scdx.entity;

public class Cart {
	
			int Cid;// INT auto_increment primary key,  -- ���ﳵid
			int Uid;// INT,  -- �û�id
		 	int Pid;// INT,  -- ��Ʒid
			int num;// int,   -- ��������
			public int getCid() {
				return Cid;
			}
			public void setCid(int cid) {
				Cid = cid;
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
			public int getNum() {
				return num;
			}
			public void setNum(int num) {
				this.num = num;
			}
			@Override
			public String toString() {
				return "Cart [Cid=" + Cid + ", Uid=" + Uid + ", Pid=" + Pid + ", num=" + num + "]";
			}
	
}
