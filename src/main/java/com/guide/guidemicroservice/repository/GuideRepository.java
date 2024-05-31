package com.guide.guidemicroservice.repository;

import com.guide.guidemicroservice.entities.Guide;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.stereotype.Repository;

public interface GuideRepository extends JpaRepository<Guide, Integer> {
    List<Guide> findByAgencyId(int agencyId);
}
