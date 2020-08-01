/**
 * 
 */
package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Documents;
import com.repository.DocumentRepository;

/**
 * @author Pallavi
 *
 */
@Service
public class ServiceImpl implements ServiceI {
	
	@Autowired
	private DocumentRepository dd;

	@Override
	public void addDocumnet(Documents d) {

		System.out.println("Data Of Documne :" +d.getId()+  "   " +d.getName());
		dd.save(d);
		System.out.println("Document Store in Database with ");		
	}

}
