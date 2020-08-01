/**
 * 
 */
package com.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.model.Documents;
import com.service.ServiceI;

/**
 * @author Pallavi
 *
 */
@RestController
public class DocumentController {
	
	@Autowired
	private ServiceI s;
	
	@GetMapping("/m1")
	public String getm1()
	{
		return "hii";
	}
	
	public static String upload_dir="F:\\reports\\new\\";

	
//	@RequestMapping(value = "/fileupload",method = RequestMethod.POST)
	@PostMapping("/fileupload")
	public String m1(@RequestParam("file") MultipartFile file) throws IOException
	{
	
		System.out.println("Data Of Documents :     "+file.getOriginalFilename());
	  int id=0;
		Documents d=new Documents(id,file.getOriginalFilename(),file.getBytes());
		Path p=Paths.get(upload_dir+file.getOriginalFilename());
		Files.write(p, file.getBytes());
		System.out.println("File Write in new Folder");
		System.out.println(p);
		s.addDocumnet(d);
		
		return "Successfully FileUpload";
	}

}
