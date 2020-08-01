/**
 * 
 */
package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Documents;

/**
 * @author Pallavi
 *
 */
@Repository
public interface DocumentRepository extends JpaRepository<Documents, Integer> {

}
