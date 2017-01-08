package com.pluralsight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		
		System.out.println("exercise: " + exercise.getMinutes());
		
		return "addMinutes";
	}
	
	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		
		Activity swim = new Activity();
		swim.setDesc("Swim");

		activities.add(run);
		activities.add(bike);
		activities.add(swim);
		
		return activities;
	}

}
