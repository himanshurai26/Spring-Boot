package com.FileUploading.API.Helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploaderHelper {
	public final String upload_file_DIR = "C:\\Users\\Himanshu Kumar\\Documents\\workspace-spring-tool-suite-4-4.19.1.RELEASE\\FileUploadingAPI\\src\\main\\resources\\static\\image"; 
	
	public boolean uploadFile(MultipartFile multipartFile) {
		
		boolean f = false;
		
		try {
			
			InputStream isinp = multipartFile.getInputStream();
			
			byte data[] = new byte[isinp.available()];
			
			//reading the data
			
			isinp.read(data);
			
			//writing 
			
			FileOutputStream fos = new FileOutputStream (upload_file_DIR + File.separator + multipartFile.getOriginalFilename());
		
			fos.write(data);
			fos.close();
			
			
			
			f = true;
			
		}
		
		
		
	catch(Exception e) {
		e.printStackTrace();
	}
		
		
		
		return false;
		
	}

}
