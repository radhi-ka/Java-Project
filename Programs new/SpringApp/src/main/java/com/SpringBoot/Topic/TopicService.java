package com.SpringBoot.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TopicService {

	private List<Topic> topics =  new ArrayList<>(Arrays.asList(
			new Topic("1A", "Java", "JavaDesc" ),
			new Topic("2A", "c#", "C#Basics")
			));	

public List<Topic> getAllTopics(){
	return topics;
}
	
public Topic getTopic(String id) {
	return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
}

public void addTopic(Topic topic) {
	
	topics.add(topic);
}


public void deleteTopic(String id, Topic topic) {
	topics.removeIf(t->t.getId().equals(id));
}

/*public void updateTopic(String id, Topic topic) {

for(int i=0; i<topics.size(); i++) {
	Topic t= topics.get(i);
	if(t.getId().equals(id)) {
		topics.set(i, topic);
		return;		
	}
	
	  return topics.stream().filter(t->t.getId().equals(id))
  .map(t->topics.set(topics.indexOf(t), topic))
  .collect(Collectors.toList());﻿ */
		
}


