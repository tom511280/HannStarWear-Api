package com.hannStar.restful.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "會員資料")
@RestController
@RequestMapping(value = "/Member")
@CrossOrigin
public class MemberController {
	
	@ApiOperation(value = "建立或會員(使用外部登入)", notes = "建立或會員(使用外部登入)")
	@GetMapping(value = "/CreateOrLoginMemberOnForeign")
	public String CreateOrLoginMemberOnForeign(){
		return null;
	}
}
