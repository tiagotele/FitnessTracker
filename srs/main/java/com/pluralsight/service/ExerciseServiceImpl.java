package com.pluralsight.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pluralsight.model.Activity;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

	@Override
	public List<Activity> findAllActivities() {
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
