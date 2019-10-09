package com.smsys.myNdf;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

/**
 * Created by mohamed on 03/10/2019.
 */
public class TestOCR {

    public static void main(String [] args) throws Exception {
        final String inputFileSrc = "/Users/mohamed/Downloads/test.pdf";
        Tesseract tesseract =  new Tesseract();
        tesseract.setDatapath("/usr/local/Cellar/tesseract/4.1.0/share/tessdata");
        String fullText = tesseract.doOCR(new File(inputFileSrc));
        System.out.println(fullText);
    }


}