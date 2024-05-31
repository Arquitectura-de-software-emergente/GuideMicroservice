package com.guide.guidemicroservice.service;

import com.guide.guidemicroservice.entities.Guide;

import java.util.List;

public interface GuideService {
    public abstract Guide createGuide(Guide _guide);
    public abstract List<Guide> getAllGuide();
    public abstract void updateGuide(Guide _guide);
    public abstract void deleteGuide(int _id);
    public abstract Guide getGuideById(int _id);
    public abstract List<Guide> getGuidesByAgencyId(int _agencyId);

}
