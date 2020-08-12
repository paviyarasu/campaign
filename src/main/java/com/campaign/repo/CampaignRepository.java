package com.campaign.repo;

import com.campaign.beans.CampaignTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<CampaignTest,Integer> {
}
