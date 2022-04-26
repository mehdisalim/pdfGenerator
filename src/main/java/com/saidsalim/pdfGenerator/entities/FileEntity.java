package com.saidsalim.pdfGenerator.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "files_Information")
public class FileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long Id;

    @Column(name = "fileName")
    String fileName;

    @Column(name = "fileDescription")
    String fileDescription;

    @Column(name = "fileUrl")
    String fileUrl;
}
