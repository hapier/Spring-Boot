package com.example.demo.service.impl;

import com.example.demo.dao.CityMapper;
import com.example.demo.domain.City;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public City getCityById(Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }
}
