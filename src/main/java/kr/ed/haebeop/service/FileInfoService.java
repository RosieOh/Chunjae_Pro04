package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.FileInfo;

import java.util.List;

public interface FileInfoService {
    public List<FileInfo> getFileInfoByArticleNo(int articleno);
    public FileInfo getFileInfoByNo(int no);
    public void insertFileInfo(FileInfo fileInfo);
    public void updateFileInfo(FileInfo fileInfo);
    public void deleteFileInfo(int no);
}
