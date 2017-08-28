package test;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class TestTess4j {

	public static final void main(String[] args) {
		File imageFile = new File(args[0]);
		
		ITesseract instance = new Tesseract();
		
		instance.setDatapath(args[1]);
		
		if(args.length>2) {
			System.out.println("Using oem : "+args[2]);
			int ocrEngineMode = Integer.valueOf(args[2]);
			
			ocrEngineMode = (ocrEngineMode>2 || ocrEngineMode<0) ? 3 : ocrEngineMode;
			instance.setOcrEngineMode(ocrEngineMode);
		}

		try {
			
			System.out.println(instance.doOCR(imageFile));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
