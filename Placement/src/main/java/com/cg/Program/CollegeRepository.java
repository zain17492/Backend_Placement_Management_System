package com.cg.Program;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


 @Repository
 public interface CollegeRepository extends JpaRepository<College, Long>{

}