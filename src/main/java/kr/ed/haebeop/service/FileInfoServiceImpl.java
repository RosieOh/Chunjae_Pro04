package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.FileInfo;
import kr.ed.haebeop.persistence.FileInfoMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileInfoServiceImpl implements FileInfoService {

    @Autowired
    private FileInfoMapper fileInfoMapper;

    private SqlSession sqlSession;


    @Override
    public List<FileInfo> getFileInfoByArticleNo(int articleno) {
        return null;
    }

    @Override
    public FileInfo getFileInfoByNo(int no) {
        return null;
    }

    @Override
    public void insertFileInfo(FileInfo fileInfo) {

    }

    @Override
    public void updateFileInfo(FileInfo fileInfo) {

    }

    @Override
    public void deleteFileInfo(int no) {

    }
}
