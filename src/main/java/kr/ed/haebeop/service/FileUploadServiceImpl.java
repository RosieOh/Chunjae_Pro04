package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.FileDTO;
import kr.ed.haebeop.persistence.FileUploadMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileUploadServiceImpl implements FileUploadService{

    @Autowired
    private FileUploadMapper fileUploadMapper;
    private SqlSession sqlSession;

    @Override
    public void uploadFile(FileDTO file) {

    }

    @Override
    public FileDTO getFileByBno(int bno) {
        return null;
    }

    @Override
    public void deleteFileByBno(int bno) {

    }
}
