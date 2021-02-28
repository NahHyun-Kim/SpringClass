package poly.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.util.CmmUtil;


@Controller
public class MainController {
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value="index")
	public String Index() {
		log.info(this.getClass());
		
		return "/index";
	}
			
	@RequestMapping(value="login")
	public String Login() {
		log.info(this.getClass());
		
		return "/loginform";
	}
	
	@RequestMapping(value="userReg")
	public String UserReg() {
		log.info(this.getClass());
		
		return "/userRegform";
	}
	

}
