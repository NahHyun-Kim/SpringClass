package poly.service;

import poly.dto.UserInfoDTO;

public interface IUserInfoService {

	// 회원 가입하기(회원정보 등록하기)
	int insertUserInfo(UserInfoDTO pDTO) throws Exception;
}
