/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.book.repo;

import com.demo.book.model.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author Michael
 */
@NoRepositoryBean
public interface AbstractRepo<T extends AbstractEntity> extends JpaRepository<T, Integer> {

}
