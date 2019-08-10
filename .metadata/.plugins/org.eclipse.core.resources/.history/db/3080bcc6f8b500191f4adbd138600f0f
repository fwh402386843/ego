package com.ego.controller;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ego.util.FtpUtil;
import com.ego.util.IDUtils;

@Controller
public class PicController {
	@Value("${ftpclient.host}")
	private String host;
	@Value("${ftpclient.port}")
	private int port;
	@Value("${ftpclient.username}")
	private String username;
	@Value("${ftpclient.password}")
	private String password;
	@Value("${ftpclient.basepath}")
	private String basePath;
	@Value("${ftpclient.filepath}")
	private String filePath;
	
	@RequestMapping("pic/upload")
	@ResponseBody
	public Map<String, Object> uplode(MultipartFile uploadFile) throws Exception{
		Map<String, Object> map = new HashMap<>() ;
		//设置文件名
		String name = IDUtils.genImageName();
		String filename = uploadFile.getOriginalFilename();
		String newName = name + filename.substring(filename.lastIndexOf("."));
		
		boolean flag = FtpUtil.uploadFile(host, port, username, password, basePath, filePath, newName, uploadFile.getInputStream());
		System.out.println(host);
		if(flag){
			map.put("error", 0);
			map.put("url","http://"+host+"/"+newName);
		}else {
			map.put("error", 1);
			map.put("message", "图片上传失败");
		}
		return map;
	}
}
