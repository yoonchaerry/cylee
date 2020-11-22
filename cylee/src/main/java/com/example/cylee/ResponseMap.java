package com.example.cylee;

import lombok.Data;

@Data
public class ResponseMap<T> {
	public int ResultCode;
	public String ResultMsg;
	public Class<T> data;
}
