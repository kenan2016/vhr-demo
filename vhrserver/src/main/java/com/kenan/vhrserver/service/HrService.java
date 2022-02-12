package com.kenan.vhrserver.service;

import com.kenan.vhrserver.mapper.HrMapper;
import com.kenan.vhrserver.model.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class HrService implements UserDetailsService  {

    @Autowired
    HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(username);
        if (Objects.isNull(hr)) {
            throw new UsernameNotFoundException("username not exist");
        }
        return hr;
    }
}
