package com.gerenciador_estoque.gerenciador_estoque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gerenciador_estoque.gerenciador_estoque.enumm.Powers;
import com.gerenciador_estoque.gerenciador_estoque.model.User;

public interface RepositoruUser extends JpaRepository<User, Long > {
    
    @Query(value = "Select * from tb_user where = :powers", nativeQuery = true)
    public List<User> locateByPower(@Param("powers")Powers powers);
}
