package poly.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import poly.util.CmmUtil;

@Controller
public class PracticeController {
	
	@RequestMapping(value="get")
	public String getName(HttpServletRequest request, ModelMap model) throws Exception {
		String name = CmmUtil.nvl(request.getParameter("name"));
		
		model.addAttribute("name", name);
		return "/getName";
	}
	
	@RequestMapping(value="post")
	public String post() {
		return "/postForm";
	}
	
	@RequestMapping(value="doPost", method=RequestMethod.POST)
	public String doPost(HttpServletRequest request, ModelMap model)
	throws Exception {
		String name = CmmUtil.nvl(request.getParameter("name"));
		
		model.addAttribute("name", name);
		return "/getName";
	}
}
