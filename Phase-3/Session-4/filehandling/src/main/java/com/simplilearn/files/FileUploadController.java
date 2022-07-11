package com.simplilearn.files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {

	@PostMapping("/upload")
	public String fileUpload(@RequestParam("file") MultipartFile file) {
		String msg="";
		try {
			byte bytes[]= file.getBytes();
			Path path=Paths.get("D://files/"+file.getOriginalFilename());
			Files.write(path, bytes);
			msg= "File uploaded successfully";
		} catch (Exception e) {
			msg="error occured "+e.getMessage();
		}
		return msg;
	}
}
