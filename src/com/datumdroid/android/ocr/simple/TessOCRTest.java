package com.datumdroid.android.ocr.simple;

import java.awt.Rectangle;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TessOCRTest {

	public static void main(String[] args) {
//		File imageFile = new File("C:/Users/wyest5/Desktop/ocr-test-images/es2.helvetica.exp0.tif");
		File imageFile = new File("C:/Users/wyest5/Desktop/ocr-test-images/uibill/Uilan.helvetica.exp0.tif");
		Tesseract instance = Tesseract.getInstance(); //
		BufferedImage img = null;//added
		try {//added
			img = ImageIO.read(imageFile);//added
		} catch (IOException e1) {//added
			// TODO Auto-generated catch block//added
			e1.printStackTrace();//added
		}
        //BufferedImageOp grayscaleConv =  new ColorConvertOp(colorFrame.getColorModel().getColorSpace(), grayscaleConv.filter(colorFrame, grayFrame);//added
//        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);  //added
//        ColorConvertOp op = new ColorConvertOp(cs, null);//added
//        op.filter(img, img); // gray scaling the image//added
        instance.setDatapath("data");
        int xPos = 50;
        int yPos = 0;
        int width = 50;
        int height = 56;
        Rectangle rect = new Rectangle(xPos,yPos,width,height);
		try {

			String result = instance.doOCR(imageFile);
//			String result = instance.doOCR(img,rect);//added
		System.out.println(result);

		} catch (TesseractException e) {
		System.err.println(e.getMessage());
		}
		
		
//		String lang = "eng";
//		String path = "./data/";
//		int w = 509;
//		int h = 56;
//		int bpp = 8;
//		
////		BufferedImage originalImage = null;
////		try {
////			originalImage = ImageIO.read(new File("C:/Users/wyest5/Desktop/ocr-test-images/uibill/Uilan.helvetica.exp0.tif"));
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		ByteArrayOutputStream baos = new ByteArrayOutputStream();
////		try {
////			ImageIO.write( originalImage, "tif", baos );
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		try {
////			baos.flush();
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		byte[] imageInByte = baos.toByteArray();
////		try {
////			baos.close();
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		ByteBuffer buf = ByteBuffer.wrap(imageInByte);
////		System.out.println("buf "+buf);
//		
//		File file = new File("C:/Users/wyest5/Desktop/ocr-test-images/uibill/Uilan.helvetica.exp0.tif");
//		 
//        FileInputStream fis = null;
//		try {
//			fis = new FileInputStream(file);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        //create FileInputStream which obtains input bytes from a file in a file system
//        //FileInputStream is meant for reading streams of raw bytes such as image data. For reading streams of characters, consider using FileReader.
// 
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//        byte[] buf1 = new byte[1024];
//        try {
//            for (int readNum; (readNum = fis.read(buf1)) != -1;) {
//                //Writes to this byte array output stream
//                bos.write(buf1, 0, readNum); 
//                System.out.println("read " + readNum + " bytes,");
//            }
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }
// 
//        byte[] bytes = bos.toByteArray();
//        
//        ByteBuffer buf = ByteBuffer.wrap(bytes);
//        
//		TessBaseAPI api = TessAPI1.TessBaseAPICreate();
////		TessAPI1.TessBaseAPISetRectangle(api, 0, 0, w, h);
//		
//		TessAPI1.TessBaseAPIInit3(api, path, lang);
//		TessAPI1.TessBaseAPISetPageSegMode(api, TessAPI1.TessPageSegMode.PSM_AUTO);
//		TessAPI1.TessBaseAPISetImage(api, buf, w, h, bpp, bpp*w);
//		TessAPI1.TessBaseAPIGetUTF8Text(api);
//		
//		TessResultIterator ri = TessAPI1.TessBaseAPIGetIterator(api);
//		TessPageIterator pi = TessAPI1.TessResultIteratorGetPageIterator(ri);
////		Pointer ptr = TessAPI1.TessResultIteratorGetUTF8Text(ri, TessPageIteratorLevel.RIL_WORD);
////		System.out.println("ptr "+ptr);
//		IntBuffer leftB = IntBuffer.allocate(1);
//		IntBuffer topB = IntBuffer.allocate(1);
//		IntBuffer rightB = IntBuffer.allocate(1);
//		IntBuffer bottomB = IntBuffer.allocate(1);
////		TessAPI1.TessPageIteratorBoundingBox(pi, TessPageIteratorLevel.RIL_WORD, leftB, topB, rightB, bottomB);
//		int left = leftB.get();
//		int top = topB.get();
//		int right = rightB.get();
//		int bottom = bottomB.get();
//		
//		System.out.println(String.format("left %d top %d right %d bottom %d", left,top,right,bottom));
		
//		BigDecimal P2PSum = new BigDecimal("276304.78");
//        BigDecimal average = P2PSum.divide(new BigDecimal(59),2, RoundingMode.HALF_UP);
//        System.out.println("average "+average);

	}

//	private static ByteBuffer readToBuffer(String filename) throws IOException
//	{
//	    File file = new File(filename);
//	    ByteBuffer bb = ByteBuffer.allocate((int) file.length());
//	    FileInputStream fis = new FileInputStream(filename);
//
//	    int bytesRead = 0;
//	    byte[] buf = new byte[BYTES_PER_READ];
//
//	    while (bytesRead != -1)
//	    {
//	        bb.put(buf, 0, bytesRead);
//	        bytesRead = fis.read(buf);
//	    }
//
//	    fis.close();
//
//	    return bb;
//	}
}
