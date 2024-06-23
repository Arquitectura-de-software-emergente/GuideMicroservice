package com.guide.guidemicroservice.domain.persistence;

import com.guide.guidemicroservice.domain.model.Guide;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.stereotype.Repository;

public interface GuideRepository extends JpaRepository<Guide, Integer> {
    List<Guide> findByAgencyId(int agencyId);
}
