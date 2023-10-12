package kr.ed.haebeop.persistence;

import kr.ed.haebeop.domain.FileDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FileUploadMapper {
    void uploadFile(FileDTO file);
    FileDTO getFileByBno(int bno);
    void deleteFileByBno(int bno);
}