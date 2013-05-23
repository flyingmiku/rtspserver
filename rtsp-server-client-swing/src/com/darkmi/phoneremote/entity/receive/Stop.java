package com.darkmi.phoneremote.entity.receive;

import com.darkmi.phoneremote.tool.MessageType;

public class Stop extends ResponseEntityBase{

	public Stop(MessageType msgType) {
		super.msgType = msgType;
	}
	
	private ResponseHeader rh;
	private String msgID;
	private String operationCode;
	private String reserve;
	
	
	public ResponseHeader getRh() {
		return rh;
	}
	public void setRh(ResponseHeader rh) {
		this.rh = rh;
	}

	
	public String getMsgID() {
		return msgID;
	}
	public void setMsgID(String msgID) {
		this.msgID = msgID;
	}
	public String getOperationCode() {
		return operationCode;
	}
	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
	}
	public String getReserve() {
		return reserve;
	}
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}
	
}
