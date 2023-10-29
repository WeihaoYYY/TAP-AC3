package com.example.tapac3.repository;

import com.example.tapac3.entity.CancerRisk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CancerRiskRepo extends JpaRepository<CancerRisk, Long> {
    public CancerRisk findCancerRiskByAge (Long age);

    List<CancerRisk> findByAgeBetween(Long age1, Long age2);

    List<CancerRisk> findCancerRiskByTypeAndAgeBetween(String type, Long age1, Long age2);



}
