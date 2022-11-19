package com.global.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.global.Entity.LoginPage;

@Repository
public interface LoginPageRepos  extends JpaRepository<LoginPage, Long>{

}
