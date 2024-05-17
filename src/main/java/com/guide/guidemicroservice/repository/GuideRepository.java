package com.guide.guidemicroservice.repository;

import com.guide.guidemicroservice.entities.Guide;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuideRepository extends JpaRepository<Guide, Integer> {
}
