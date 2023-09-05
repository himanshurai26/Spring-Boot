package com.Database.connection.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Database.connection.JPA.Helper.FIleUploadHelper;

@RestController
public class FileUploadController {
	
	@Autowired
	private FIleUploadHelper fileuploadHelper;

	@PostMapping("/upload-file")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file)
	{
		
//		  System.out.println(file.getOriginalFilename());
//		  System.out.println(file.getSize());
//		 System.out.println(file.getContentType());
//		 System.out.println(file.isEmpty()); 
//		 System.out.println(file.getName());
		
		try{
			
		
		
		if(file.isEmpty()) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must contains files");
		}
		
		if(!file.getContentType().equals("image/jpeg")) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only JPEG content type are allowed");
		}
		
		//now file uploading coe ...
		
		
		boolean f = fileuploadHelper.uploadFile(file);
		
		if(f) {
			return ResponseEntity.ok("File uploaded successfully");
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong, Try Again..");
	}
}
