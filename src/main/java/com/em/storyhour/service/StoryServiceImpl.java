package com.em.storyhour.service;

import com.em.storyhour.entity.Story;
import com.em.storyhour.repository.StoryRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryServiceImpl implements StoryService {

    private StoryRepository storyRepository;

    public StoryServiceImpl(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    @Override
    public List<Story> fetchStoryList() {
        return storyRepository.findAll();
    }

    @Override
    public Story fetchStory(int id) {
        return storyRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(""));
    }
}
