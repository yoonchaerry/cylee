package com.example.cylee.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cylee.ResponseMap;
import com.example.cylee.domain.RequestCatchMoney;
import com.example.cylee.domain.RequestGetMoneyInfo;
import com.example.cylee.domain.RequestSpreadMoney;
import com.example.cylee.domain.ResponseCatchMoney;
import com.example.cylee.domain.ResponseGetMoneyInfo;
import com.example.cylee.domain.ResponseSpreadMoney;
import com.example.cylee.service.SpreadService;

@RestController
public class SpreadController {
	public ResponseMap<?> objResponseMap = null;
	@RequestMapping("/test")
	public String testMoney() {
		return "test";
	}
	@RequestMapping(value = "/spreadMoney", method = RequestMethod.POST)
	public ResponseSpreadMoney spreadMoney(HttpServletRequest request, @RequestParam RequestSpreadMoney requestSpreadMoney) {
		ResponseSpreadMoney response = null;
		String strUserId = "";
		String strRoomId = "";
		
		SpreadService spreadService = new SpreadService();
		
		//header 정보 읽기 
		strUserId = request.getHeader("X-USER-ID");
		strRoomId = request.getHeader("X-ROOM-ID");
		
		response = spreadService.spreadMoney(requestSpreadMoney, strUserId, strRoomId);
		
		return response;
	}
	@RequestMapping(value = "/catchMoney", method = RequestMethod.POST)
	public ResponseCatchMoney catchMoney(HttpServletRequest request, @RequestParam RequestCatchMoney requestCatchMoney) {
		ResponseCatchMoney response = null;
		String strUserId = null;
		String strRoomId = null;
		SpreadService spreadService = new SpreadService();
		
		//header 정보 읽기 
		strUserId = request.getHeader("X-USER-ID");
		strRoomId = request.getHeader("X-ROOM-ID");
		
		response = spreadService.CatchMoeny(requestCatchMoney, strUserId, strRoomId);
		
		return response;
	}
	@RequestMapping(value = "/getMoneyInfo", method = RequestMethod.GET)
	public ResponseGetMoneyInfo getMoneyInfo(HttpServletRequest request, @RequestParam RequestGetMoneyInfo requestGetMoneyInfo) {
		ResponseGetMoneyInfo response = null;
		String strUserId = null;
		String strRoomId = null;
		SpreadService spreadService = new SpreadService();
		
		//header 정보 읽기 
		strUserId = request.getHeader("X-USER-ID");
		strRoomId = request.getHeader("X-ROOM-ID");
		
		response = spreadService.GetMoneyInfo(requestGetMoneyInfo, strUserId, strRoomId);
		
		return response;
	}
}
