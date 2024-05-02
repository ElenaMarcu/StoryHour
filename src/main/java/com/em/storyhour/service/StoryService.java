package com.em.storyhour.service;

import com.em.storyhour.entity.Story;

import java.util.List;

public interface StoryService {
    List<Story> fetchStoryList();

    Story fetchStory(int id);
}
