package poly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import poly.dto.UserInfoDTO;
import poly.persistance.mapper.IUserInfoMapper;
import poly.service.IUserInfoService;
import poly.util.CmmUtil;

@Service("UserInfoService")
public class UserInfoService implements IUserInfoService {

	@Resource(name="UserInfoMapper")
	private IUserInfoMapper userInfoMapper;
	
	// 회원 가입
	@Override
	public int insertUserInfo(UserInfoDTO pDTO) throws Exception {

		//회원가입 성공 : 1,아이디 중복으로 인한 가입 취소 : 2, 기타 에러 발생 : 0
		int res = 0;
		
		//Controller에서 값이 정상적으로 못 넘어오는 경우를 대비하기 위해 사용함
		if (pDTO == null) {
			pDTO = new UserInfoDTO();
		}
		
		//회원 가입 중복 방지를 위해 DB에서 데이터 조회
		UserInfoDTO rDTO = userInfoMapper.getUserExists(pDTO);
		
		//mapper에서 값이 정상적으로 못 넘어오는 경우를 대비하기 위해 사용함
		if (rDTO == null) {
			rDTO = new UserInfoDTO();
		}
		
		//중복된 회원정보가 있는 경우, 결과값을 2로 변경하고, 더 이상 작업을 진행하지 않음
		if (CmmUtil.nvl(rDTO.getExists_yn()).equals("Y")) {
			res = 2;
			
		//회원가입이 중복이 아니므로, 회원가입을 진행함
		}else {
			
			//회원 가입
			int success = userInfoMapper.insertUserInfo(pDTO);
			
			//db에 데이터가 등록되었다면,
			if (success > 0) {
				res = 1;
			}else {
				res = 0;
			}
		}
		return res;
	}

}
