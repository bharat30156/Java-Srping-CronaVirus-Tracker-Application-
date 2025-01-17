package com.Bharat.CronaVirusTrackerApplication.services.controllers;

import com.Bharat.CronaVirusTrackerApplication.services.CoronaVirusDataService;
import com.Bharat.CronaVirusTrackerApplication.services.models.LocationStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int TotalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("TotalReportedCases", TotalReportedCases);
        model.addAttribute("totalNewCases", totalNewCases);

        return "home";
    }

}
