package com.em.storyhour.rest;

import com.em.storyhour.entity.Story;
import com.em.storyhour.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StoryhourController {
    private StoryService storyService;

   /* @Autowired
    public StoryhourController(StoryService storyService) {
        this.storyService = storyService;
    }
*/
    @GetMapping("/povesti")
//    public List<Story> getStoryList() {
//        return storyService.fetchStoryList();
//    }
    public  String getsss(){
        return "AS";
    }
}
