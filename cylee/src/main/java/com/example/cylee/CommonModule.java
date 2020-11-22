package com.example.cylee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CommonModule {
	//3자리 문자 토큰 생성 
	public String getToken() {
		String strToken = "";
		
		Random random = new Random();
		StringBuffer stringBuffer = new StringBuffer();
		
		for(int i = 0; i < 3; i++) {
			int intIdx = random.nextInt(3);
			
			switch(intIdx){
			case 0:
				stringBuffer.append((char)(random.nextInt(26) + 97));
				break;
			case 1:
				stringBuffer.append((char)(random.nextInt(26) + 65));
				break;
			}
		}
		
		strToken = stringBuffer.toString();
		
		return strToken;
	}
	
	//금액 나누기 
	public List<Integer> divideSpreanMoney(int spreadAmt, int SpreadCnt) {
		List<Integer> lstSpreadAmt = new ArrayList<Integer>();
		int intRemainderAmt = spreadAmt;
		
		for(int i = 1; i < SpreadCnt; i++) {
			int intSpreadAmt = 0;
			
			intSpreadAmt = Math.round(spreadAmt/2);
			intRemainderAmt = intRemainderAmt - intSpreadAmt;
			
			if(i == SpreadCnt- 1) {
				lstSpreadAmt.add(intSpreadAmt);
				lstSpreadAmt.add(intRemainderAmt);
			}
			else {
				lstSpreadAmt.add(intSpreadAmt);
			}			
		}
	
		return lstSpreadAmt;
	}
}
