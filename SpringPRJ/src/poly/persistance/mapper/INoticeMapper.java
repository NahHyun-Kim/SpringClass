package poly.persistance.mapper;

import java.util.List;

import config.Mapper;
import poly.dto.NoticeDTO;

@Mapper("NoticeMapper")
public interface INoticeMapper {

	//게시판 리스트
	List<NoticeDTO> getNoticeList() throws Exception;
}
