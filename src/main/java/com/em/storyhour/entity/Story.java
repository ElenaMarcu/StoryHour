package com.em.storyhour.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Story")
public class Story {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "story_name")
    private String storyName;
    @Column(name = "description")
    private String description;
    @Column(name = "audio_link")
    private String audioLink;
    @Column(name = "youtube_link")
    private String youtubeLink;

    public Story() {

    }

    public Story(String storyName, String description, String audioLink, String youtubeLink) {
        this.storyName = storyName;
        this.description = description;
        this.audioLink = audioLink;
        this.youtubeLink = youtubeLink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStoryName() {
        return storyName;
    }

    public void setStoryName(String storyName) {
        this.storyName = storyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAudioLink() {
        return audioLink;
    }

    public void setAudioLink(String audioLink) {
        this.audioLink = audioLink;
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    @Override
    public String toString() {
        return "Story{" +
                "id=" + id +
                ", storyName='" + storyName + '\'' +
                ", description='" + description + '\'' +
                ", audioLink='" + audioLink + '\'' +
                ", youtubeLink='" + youtubeLink + '\'' +
                '}';
    }
}
