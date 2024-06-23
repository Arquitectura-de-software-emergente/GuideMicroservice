package com.guide.guidemicroservice.service;

import com.guide.guidemicroservice.domain.model.Guide;
import com.guide.guidemicroservice.domain.persistence.GuideRepository;
import com.guide.guidemicroservice.domain.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuideServiceImpl implements GuideService {

    @Autowired
    private GuideRepository _guideRepository;
    @Override
    public Guide createGuide(Guide _guide) {
        return _guideRepository.save(_guide);
    }

    @Override
    public List<Guide> getAllGuide() {
        return (List<Guide>) _guideRepository.findAll();
    }

    @Override
    public void updateGuide(Guide _guide) {
        _guideRepository.save(_guide);
    }

    @Override
    public void deleteGuide(int _id) {
        _guideRepository.deleteById(_id);

    }

    @Override
    public Guide getGuideById(int _id) {
        if(_guideRepository.findById(_id).isPresent()){
            return _guideRepository.findById(_id).get();
        }else{
            throw new RuntimeException("Guide not found");
        }
    }
    @Override
    public List<Guide> getGuidesByAgencyId(int _agencyId) {
        return _guideRepository.findByAgencyId(_agencyId);
    }
}
