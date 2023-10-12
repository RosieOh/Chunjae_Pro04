package kr.ed.haebeop.persistence;

import kr.ed.haebeop.domain.FileInfo;

import java.util.List;

public interface FileInfoMapper {
    List<FileInfo> getFileInfoByArticleNo(int articleno);
    FileInfo getFileInfoByNo(int no);
    void insertFileInfo(FileInfo fileInfo);
    void updateFileInfo(FileInfo fileInfo);
    void deleteFileInfo(int no);
}