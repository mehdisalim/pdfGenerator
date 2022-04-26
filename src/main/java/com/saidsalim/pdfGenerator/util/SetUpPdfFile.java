package com.saidsalim.pdfGenerator.util;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;

import javax.servlet.http.HttpServletResponse;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SetUpPdfFile {

    HttpServletResponse response;
    URL url;

    public SetUpPdfFile(HttpServletResponse response, URL url) {
        this.response = response;
        this.url = url;
    }

    public void createFile() throws Exception {
        Image img = Image.getInstance(url);

        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, this.response.getOutputStream());
        document.open();
        for (int i = 0; i < 1000; i++) {
            document.add(img);
        }
        document.close();
    }

    public void exportFile() throws Exception {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=pdf_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);
        createFile();
    }

}
