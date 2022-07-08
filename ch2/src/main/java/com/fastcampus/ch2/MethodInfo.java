package com.fastcampus.ch2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.StringJoiner;

public class MethodInfo {
	public static void main(String[] args) throws Exception{

		//1.yoliTeller클래스 객체를 생성
		Class clazz = Class.forName("com.fastcampus.ch2.YoilTellerMVC");
		Object obj = clazz.newInstance();
		
		// 2.모든 매서드를 정보를 가져와서 배열을 저장
		Method[] methodArr = clazz.getDeclaredMethods();
		
		for(Method m : methodArr) {
			String name = m.getName(); //매서드 이름 
			Parameter[] paramArr = m.getParameters(); //매개변수목록
//			Class[] paramTypeArr = m.getParameterTypes();
			Class returnType = m.getReturnType(); // 반환 타입
			
			StringJoiner paramList = new StringJoiner(", ", "(", ")"); //구분자 접두사 접미사 
			
			for(Parameter param : paramArr) {
				String paramName = param.getName();
				Class  paramType = param.getType();
				
				paramList.add(paramType.getName() + " " + paramName);
			}
			
			System.out.printf("%s %s%s%n", returnType.getName(), name, paramList);
		}
	} // main
}