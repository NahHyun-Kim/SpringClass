package poly.persistance.mapper;

import config.Mapper;
import poly.dto.MovieDTO;

@Mapper("MovieMapper")
public interface IMovieMapper {

	//수집된 내용 DB에 등록
	int InsertMovieInfo(MovieDTO pDTO) throws Exception;
}
