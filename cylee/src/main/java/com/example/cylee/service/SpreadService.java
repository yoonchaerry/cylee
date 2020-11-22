package com.example.cylee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cylee.CommonModule;
import com.example.cylee.domain.RequestCatchMoney;
import com.example.cylee.domain.RequestGetMoneyInfo;
import com.example.cylee.domain.RequestSpreadMoney;
import com.example.cylee.domain.ResponseCatchMoney;
import com.example.cylee.domain.ResponseGetMoneyInfo;
import com.example.cylee.domain.ResponseSpreadMoney;

@Service
public class SpreadService {
	private CommonModule common = null;
	
	public ResponseSpreadMoney spreadMoney(RequestSpreadMoney spreadMoney, String userId, String roomId) {
		String strToken = null;
		ResponseSpreadMoney response = new ResponseSpreadMoney();
		List<Integer> list = new ArrayList<>();
		//헤더의 사용자아이디, 채팅방 확인 
		//토큰 생성
		common = new CommonModule();
		strToken = common.getToken();
		response.token = strToken;
		
		//인원별로 금액 나누기
		list = common.divideSpreanMoney(spreadMoney.shareMoney, spreadMoney.shareMemCnt);
		
		//[DB]뿌리기 정보 등록 
		return response;
	}
	
	public ResponseCatchMoney CatchMoeny(RequestCatchMoney catchMoney, String userId, String roomId) {
		ResponseCatchMoney response = new ResponseCatchMoney();
		//[DB]유효한 토큰인지 확인 
		//[DB]토큰 정보 가져오기 
		
		return response;
	}
	
	public ResponseGetMoneyInfo GetMoneyInfo(RequestGetMoneyInfo getMoneyInfo, String userId, String roomId) {
		ResponseGetMoneyInfo response = new ResponseGetMoneyInfo();
		
		return response;
	}
}
