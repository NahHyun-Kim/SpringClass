package poly.persistance.mapper;

import config.Mapper;
import poly.dto.UserInfoDTO;

@Mapper("UserInfoMapper")
public interface IUserInfoMapper {

	//회원 가입하기(회원정보 등록하기)
	int insertUserInfo(UserInfoDTO pDTO) throws Exception;
	
	//회원 가입 전 중복 체크하기(DB 조회하기)
	UserInfoDTO getUserExists(UserInfoDTO pDTO) throws Exception;
	
}
