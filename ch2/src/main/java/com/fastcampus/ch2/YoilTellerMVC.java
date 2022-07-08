package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//년월일을 입력하면 요일을 알려주는 프로그램 이다.
@Controller
public class YoilTellerMVC { //http://localhost:6060/ch2/getYoilMVC?year=2021&month=10&day=1
	@RequestMapping("/getYoilMVC")
//		public  void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
		public  void main(int year, int month, int day, HttpServletResponse response) throws IOException {

		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);
		
		int dayOfweek = cal.get(Calendar.DAY_OF_WEEK); //1:월요일, 2:월요일 ...
		char yoil = " 일월화수목금토".charAt(dayOfweek);
		
		// 3.출력
//		response.setContentType("text/html");
//		response.setCharacterEncoding("utf-8");
//		PrintWriter out = response.getWriter(); //response 객체에서 브라우저로 출력 스트림을 얻는다.
//		out.println(year + "년" + month + "월" + day + "일은 ");
//		out.println(yoil + "요일입니다.");
//		
		
	}

}
