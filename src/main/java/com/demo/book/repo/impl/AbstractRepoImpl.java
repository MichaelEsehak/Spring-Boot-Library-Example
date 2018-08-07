/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.book.repo.impl;

import com.demo.book.model.AbstractEntity;
import com.demo.book.repo.AbstractRepo;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

/**
 *
 * @author Michael
 */
@Transactional
public class AbstractRepoImpl<T extends AbstractEntity> extends SimpleJpaRepository<T, Integer> implements AbstractRepo<T> {

    private final EntityManager entityManager;

    public AbstractRepoImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

}
