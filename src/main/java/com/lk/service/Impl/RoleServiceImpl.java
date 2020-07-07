package com.lk.service.Impl;

import com.lk.model.Role;
import com.lk.repository.RoleRepository;
import com.lk.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public List<Role> findAll() {
        return (List<Role>) roleRepository.findAll();
    }

    @Override
    public Role findOne(Long id) {
        return roleRepository.findOne(id);
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role delete(Long id) {
        Role role = roleRepository.findOne(id);
        roleRepository.delete(role);
        return role;
    }
}
