package com.example.abriliryc.controllers;

import com.example.abriliryc.modules.Track;
import com.example.abriliryc.services.TrackService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrackController {
    private final TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping("/")
    public String tracks(Model model) {
        model.addAttribute("tracks", trackService.list());
        return "tracks";
    }

    @GetMapping("/tracks/{id}")
    public String trackInfo(@PathVariable long id, Model model) {
        model.addAttribute("track", trackService.getTrackByID(id));
        return "track-info";
    }

    @PostMapping("/track/add")
    public String addTrack(Track track) {
        trackService.addTrack(track);
        return "redirect:/";
    }

    @PostMapping("/track/delete/{id}")
    public String deleteTrack(@PathVariable long id) {
        trackService.deleteTrack(id);
        return "redirect:/";
    }
}
