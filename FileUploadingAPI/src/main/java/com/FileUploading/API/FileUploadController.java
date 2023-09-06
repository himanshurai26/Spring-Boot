package com.FileUploading.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.FileUploading.API.Helper.FileUploaderHelper;

@RestController
public class FileUploadController {
	
	@Autowired
	private FileUploaderHelper helperfile;
	
	@PostMapping("/file-upload")
	public ResponseEntity<String> fileUpload(@RequestParam("file") MultipartFile file){
		
		
		try {
			
			if(file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File Must cotains  file");
			}
			
			if(!file.getContentType().equals("image/jpeg")){
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("file must be  Jpeg formate");
			}
			
			
			
			boolean f =  helperfile.uploadFile(file);
			
			if(f) {
				return ResponseEntity.ok("Uploaded Successfully");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		
		}
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong please check");
		
		
		
	}

}
