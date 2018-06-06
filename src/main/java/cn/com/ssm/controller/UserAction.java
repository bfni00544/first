package cn.com.ssm.controller;

import cn.com.ssm.model.UserInfo;
import cn.com.ssm.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserAction {

	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping("/login.do")
	public ModelAndView login(HttpServletRequest request) throws Exception {
		System.out.println("aaaaaa");

		ModelAndView model = new ModelAndView("redirect:/fail.html");

		UserInfo userInfo = userInfoService.selectByPrimaryKey("f4aab0ae958b4ffebe635d03f123e49c");
		if(userInfo !=null){
			model = new ModelAndView("redirect:/success.html");
		}
		return model;
	}
}
