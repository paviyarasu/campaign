package com.campaign.beans;

import com.campaign.repo.CampaignRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class CampaignService {
    @Autowired
    private CampaignRepository campaignRepository;
    public CampaignTest findByCampaignName(String name){
        return campaignRepository.findAll().stream().filter(camp -> camp.getCampaignName().equals(name)).findFirst().get();
    }

    public List<CampaignTest> findAllCampaign(){
       return campaignRepository.findAll();
    }

    public CampaignTest findCampaignByID(int campaignID){
        return campaignRepository.findById(campaignID).orElseThrow(() -> new CampaignException(campaignID));
    }

    public CampaignTest saveCampaign(CampaignTest campaignTest){
        campaignTest.createDefaultValues();
       return campaignRepository.save(campaignTest);
    }

    public CampaignTest updateCampaign(CampaignTest campaignTest){
        CampaignTest record = findCampaignByID(campaignTest.getCampaignId());
        record.setCampaignName(campaignTest.getCampaignName());
        record.setCampaignCalls(campaignTest.getCampaignCalls());
        record.setDescription(campaignTest.getDescription());
        record.setCampaignEmail(campaignTest.getCampaignEmail());
        record.setTargetGroupId(campaignTest.getTargetGroupId());
        record.updateDefaultValues();
        return campaignRepository.save(record);
    }

    public void deleteCampaign(int campaignID){
        campaignRepository.deleteById(campaignID);
    }
}
