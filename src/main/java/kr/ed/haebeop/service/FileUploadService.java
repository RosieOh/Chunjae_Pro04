package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.FileDTO;

public interface FileUploadService {
    public void uploadFile(FileDTO file);
    public FileDTO getFileByBno(int bno);
    public void deleteFileByBno(int bno);
}
