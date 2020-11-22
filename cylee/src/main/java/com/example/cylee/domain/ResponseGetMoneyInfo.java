package com.example.cylee.domain;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class ResponseGetMoneyInfo {
	public SpreadInfo spreadInfo;
	
	//뿌린시각,뿌린금액,받기완료된금액,받기완료된정보([받은금액,받은사용자 아이디] 리스트)
	public class SpreadInfo{
		public Date spreadTime;
		public int spreadMoney;
		public int completedMoney;
		public List<CompletedMoneyInfo> completedMoneyInfo;
	}
	
	public class CompletedMoneyInfo{
		public int catchedMoney;
		public String userId;
	}
}
