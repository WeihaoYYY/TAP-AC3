package com.example.tapac3.service;

import com.example.tapac3.entity.CancerRisk;


import com.example.tapac3.repository.CancerRiskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CancerRiskService {

    @Autowired
    CancerRiskRepo repo;

    public List<CancerRisk> listAll() {
        return repo.findAll();
    }

    public CancerRisk findByAge(Long age) {
        return repo.findCancerRiskByAge(age);
    }

    public List<CancerRisk> findByAgeBetween(Long age1, Long age2) {
        return repo.findByAgeBetween(age1, age2);
    }

    public List<CancerRisk> findByTypeAndAgeBetween(String type, Long age1, Long age2) {
        return repo.findCancerRiskByTypeAndAgeBetween(type, age1, age2);
    }

}
