package test;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class TestTess4j {

	public static final void main(String[] args) {
		File imageFile = new File(args[0]);
		
		ITesseract instance = new Tesseract();
		
		try {
			
			System.out.println(instance.doOCR(imageFile));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
