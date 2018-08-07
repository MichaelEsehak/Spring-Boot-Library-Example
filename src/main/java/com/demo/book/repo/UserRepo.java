/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.book.repo;

import com.demo.book.model.User;

/**
 *
 * @author Michael
 */
public interface UserRepo extends AbstractRepo<User>{
    public User findByUsername(String username);
}
