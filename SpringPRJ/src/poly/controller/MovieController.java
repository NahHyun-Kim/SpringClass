package poly.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.service.IMovieService;

/*
 * Controller 선언해야만 Spring 프레임워크에서 Controller 인지 인식 가능
 * 자바 서블릿 역할 수행
 * */
@Controller("MovieController")
public class MovieController {
	private Logger log = Logger.getLogger(this.getClass());
	
	/*
	 * 비즈니스 로직(중요 로직을 수행하기 위해 사용되는 서비스를 메모리에 적재(싱글톤패턴 적용됨)
	 * */
	@Resource(name="MovieService")
	private IMovieService movieService;
	
	/**
	 * CGV 영화 수집을 위한 URL 호출
	 * */
	@RequestMapping(value = "movie/getMovieInfoFromWEB")
	public String getMovieInfoFromWEB(HttpServletRequest request, HttpServletResponse response, ModelMap model) 
			throws Exception {
		
		log.info(this.getClass().getName() + ".getMovieInfoFromWEB Start!");
		
		int res = movieService.getMovieInfoFromWEB();
		
		//크롤링 결과를 넣어주기
		model.addAttribute("res", String.valueOf(res));
		
		log.info(this.getClass().getName() + ".getMovieInfoFromWEB End!");
		
		return "/movie/RankForWEB";
	}
}
