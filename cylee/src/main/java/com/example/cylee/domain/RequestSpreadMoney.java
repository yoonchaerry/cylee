package com.example.cylee.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RequestSpreadMoney {
	public String userId;
	public String roomId;
	public int shareMemCnt;
	public int shareMoney;
}
