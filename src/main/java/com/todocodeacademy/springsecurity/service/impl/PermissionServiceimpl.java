package com.todocodeacademy.springsecurity.service.impl;

import com.todocodeacademy.springsecurity.model.Permission;
import com.todocodeacademy.springsecurity.repository.IPermissionRepository;
import com.todocodeacademy.springsecurity.service.IPermissionService;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PermissionServiceimpl implements IPermissionService {

    private final IPermissionRepository permissionRepository;

    @Override
    public List findAll() {
        return permissionRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return permissionRepository.findById(id);
    }

    @Override
    public Permission save(Permission permission) {
        return permissionRepository.save(permission);
    }

    @Override
    public void deleteById(Long id) {
        permissionRepository.deleteById(id);
    }

    @Override
    public Permission update(Permission permission) {
        return permissionRepository.save(permission);
    }
}

