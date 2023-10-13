package kr.ed.haebeop.persistence;

import kr.ed.haebeop.domain.FileInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FileInfoMapper {
    List<FileInfo> getFileInfoByArticleNo(int articleno);
    FileInfo getFileInfoByNo(int no);
    void insertFileInfo(FileInfo fileInfo);
    void updateFileInfo(FileInfo fileInfo);
    void deleteFileInfo(int no);
}