package org.example.service;

import org.example.dao.UserDao;
import org.example.model.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

@Service
public class GreetServiceImpl implements GreetService {

    @Autowired
    UserDao mydao;
//private final UserDao mydao ;
//
//    public GreetServiceImpl(UserDao mydao) {
//        this.mydao = mydao;
//    }

    @Override
    public String saveUserInformation(String username) {

        //call db function
        UserDetail user = new UserDetail();
        user.setUserName(username);
        user.setMobileNo("12345678");
        mydao.save(user);
        return "Information Saved for ---"+username;
    }
}
