package com.baghel.coronavirustracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.baghel.coronavirustracker.model.LocationStats;
import com.baghel.coronavirustracker.service.CoronaVirusDataService;

@Controller
public class HomeController {
	
	@Autowired
	CoronaVirusDataService coronaVirusDataService;
	
	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> allStats=coronaVirusDataService.getAllState();
		int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCase()).sum();
		int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDayCase()).sum();
		model.addAttribute("locationStats",coronaVirusDataService.getAllState());
		model.addAttribute("totalReportedCases",totalReportedCases);
		model.addAttribute("totalNewCases",totalNewCases);
		return "home";
	}
}
