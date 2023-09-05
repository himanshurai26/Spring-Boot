package com.Database.connection.JPA.Helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FIleUploadHelper {

	public final String upload_DIR="C:\\Users\\Himanshu Kumar\\Documents\\workspace-spring-tool-suite-4-4.19.1.RELEASE\\DatabaseConnectionJPA\\src\\main\\resources\\static\\image";
	
	public boolean uploadFile(MultipartFile multiPartfile) {
		
		boolean f = false;
		try {
			
			
//			// 
//			InputStream is = multiPartfile.getInputStream();
//		byte data[] = new byte[is.available()];
//		
//		is.read(data);
//		
//		//write
//		
//		FileOutputStream fos = new FileOutputStream(upload_DIR + File.separator + multiPartfile.getOriginalFilename());
//		
//	
//		fos.write(data);
//		fos.close();
//		fos.close();
			
			// Onother method 
			
			Files.copy(multiPartfile.getInputStream(), Paths.get(upload_DIR + File.separator + multiPartfile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
		
	f = true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return f;
	}
}
