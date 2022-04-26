package com.saidsalim.pdfGenerator.controller;

import com.saidsalim.pdfGenerator.entities.FileEntity;
import com.saidsalim.pdfGenerator.service.PDFGeneratorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/api/v1/pdf")
public class PDFExportController {

    final PDFGeneratorService pdfGeneratorService;

    public PDFExportController(PDFGeneratorService pdfGeneratorService) {
        this.pdfGeneratorService = pdfGeneratorService;
    }

    @GetMapping("/generate")
    public String getIndex(Model model){
        model.addAttribute("text","mehdi salim");
        return "index1";
    }

    @GetMapping("/all-files")
    public String getAllFiles(Model model){
        List<FileEntity> files = pdfGeneratorService.getAllFiles();
        model.addAttribute("files",files);
        return "index";
    }

    @GetMapping("/file/id")
    public String getAllFiles(){
        //FileEntity fileUrl=pdfGeneratorService.getAllFiles().get(2);
        //new SetUpPdfFile(response, new URL(fileUrl.getFileUrl())).exportFile();
        return "index2";
    }

}
