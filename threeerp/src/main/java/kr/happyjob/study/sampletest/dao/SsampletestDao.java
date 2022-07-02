package kr.happyjob.study.sampletest.dao;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import kr.happyjob.study.sampletest.model.Sam6list;

public interface SsampletestDao {
	
	/** 목록 */	
	public List<Sam7list> samplepage7list(Map<String, Object> paramMap) throws Exception;

	/** 건수 */	
	public int samplepage7listtotcant(Map<String, Object> paramMap) throws Exception;
	
	// 한건조회
	public Sam7list samplepage7selectone(Map<String, Object> paramMap) throws Exception;
	
	// 등록
	public void samplepage7insert(Map<String, Object> paramMap) throws Exception;
	
	// 수정
	public void samplepage7update(Map<String, Object> paramMap) throws Exception;
	
	//삭제
	public void samplepage7delete(Map<String, Object> paramMap) throws Exception;
			
	
}
