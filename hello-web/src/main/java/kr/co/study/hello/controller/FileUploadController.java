package kr.co.study.hello.controller;


import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/bbs")
public class FileUploadController {
	@PostMapping("/upload")
	public String upload(@RequestParam("file1") MultipartFile file,
			@RequestParam("name") String fileName, Model model) {

		System.out.print("funtion in");
		if(file.isEmpty()) {
			System.out.print("funtion exists");
			File f = new File("c:\\", file.getOriginalFilename() );
			try {
				file.transferTo(f);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.print("funtion storey");
		}
		System.out.print("funtion file name - " + fileName);

		model.addAttribute("fileName", fileName);
		return "upload_ok";
	}

}
