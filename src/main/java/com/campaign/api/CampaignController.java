package com.campaign.api;

import com.campaign.beans.CampaignException;
import com.campaign.beans.CampaignService;
import com.campaign.beans.CampaignTest;
import com.campaign.repo.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/campaign")
public class CampaignController {

    @Autowired
    private CampaignService campaignService;

    @GetMapping()
    public List<CampaignTest> getAllCampaign() {
        return campaignService.findAllCampaign();
    }

    @GetMapping("/{id}")
    public CampaignTest getCampaignByID(@PathVariable String id) {
        int campaignId = Integer.parseInt(id);
        return campaignService.findCampaignByID(campaignId);
    }

    @GetMapping("/get/{name}")
    public CampaignTest getCampaignByName(@PathVariable String name){
        return campaignService.findByCampaignName(name);
    }

    @PostMapping("/create")
    public CampaignTest saveCampaign(@RequestBody CampaignTest campaign) {
        return campaignService.saveCampaign(campaign);
    }

    @PutMapping("/update")
    public CampaignTest updateCampaign(@RequestBody CampaignTest campaignTest) {
        return campaignService.updateCampaign(campaignTest);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCampaign(@PathVariable String id){
        int campaignId = Integer.parseInt(id);
        campaignService.deleteCampaign(campaignId);
        return "Campaign Deleted Successfully";
    }
}
