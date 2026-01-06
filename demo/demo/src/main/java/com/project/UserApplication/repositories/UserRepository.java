package com.project.UserApplication.repositories;




import org.springframework.data.jpa.repository.JpaRepository;

import com.project.UserApplication.Entities.User;

public interface UserRepository extends JpaRepository <User, Long>{


}
//