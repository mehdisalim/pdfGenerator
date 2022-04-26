package com.saidsalim.pdfGenerator.reposetory;

import com.saidsalim.pdfGenerator.entities.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileRepo extends JpaRepository<FileEntity,Long> {

    List<FileEntity> findAll();

}
