package com.saidsalim.pdfGenerator.service;

import com.saidsalim.pdfGenerator.entities.FileEntity;
import com.saidsalim.pdfGenerator.reposetory.FileRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PDFGeneratorService {

    public final FileRepo fileRepo;

    public PDFGeneratorService(FileRepo fileRepo) {
        this.fileRepo = fileRepo;
    }

    public List<FileEntity> getAllFiles(){
        return fileRepo.findAll();
    }

}
