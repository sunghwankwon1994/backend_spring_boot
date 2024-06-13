package com.mycompany.webapp.dto;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class Board {
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
	private int bhitcount;
	private MultipartFile battach;
	private String battachoname;
	private String battachsname;
	private String battachtype;
	private byte[] battachdata;
}
