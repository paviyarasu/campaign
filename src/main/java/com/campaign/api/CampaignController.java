package com.campaign.api;

import com.campaign.beans.CampaignException;
import com.campaign.beans.CampaignTest;
import com.campaign.repo.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/campaign")
public class CampaignController {

    @Autowired
    private CampaignRepository campaignRepository;

    @GetMapping()
    public List<CampaignTest> getAllCampaign() {
        return campaignRepository.findAll();
    }

    @GetMapping("/{id}")
    public CampaignTest getCampaignByID(@PathVariable String id) {
        int campaignId = Integer.parseInt(id);
        return campaignRepository.findById(campaignId).orElseThrow(() -> new CampaignException(campaignId));
    }

    @PostMapping("/create")
    public CampaignTest saveCampaign(@RequestBody CampaignTest campaign) {
        campaign.createDefaultValues();
        return campaignRepository.save(campaign);
    }

    @PutMapping("/update/{id}")
    public CampaignTest updateCampaign(@PathVariable String id, @RequestBody CampaignTest campaignTest) {
        CampaignTest record = getCampaignByID(id);
        record.setCampaignName(campaignTest.getCampaignName());
        record.setCampaignCalls(campaignTest.getCampaignCalls());
        record.setDescription(campaignTest.getDescription());
        record.setCampaignEmail(campaignTest.getCampaignEmail());
        record.setTargetGroupId(campaignTest.getTargetGroupId());
        record.updateDefaultValues();
        return campaignRepository.save(record);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCampaign(@PathVariable String id){
        int campaignId = Integer.parseInt(id);
        campaignRepository.deleteById(campaignId);
        return "Campaign Deleted Successfully";
    }
}
