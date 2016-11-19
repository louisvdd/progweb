package com.spring.henallux.dataAccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import com.spring.henallux.dataAccess.entity.*;

@Repository
@Transactional
public interface LanguageRepository extends JpaRepository<LanguageEntity, String> //doit être un int
{

}