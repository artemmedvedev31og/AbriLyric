package com.example.abriliryc.services;

import com.example.abriliryc.modules.Track;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrackService {
    private List<Track> tracks = new ArrayList<>();
    private long ID = 0;

    {
        tracks.add(new Track(++ID, "Kanye West", "Fuck Flowers", "", 2022));
        tracks.add(new Track(++ID, "Ty Dolla Sign", "Vultures", "", 2022));
    }

    public List<Track> list() {return tracks;}

    public void addTrack(Track track) {
        track.setId(++ID);
        tracks.add(track);
    }

    public void deleteTrack(long id) {
        tracks.removeIf(track -> track.getId().equals(id));
    }


    public Track getTrackByID(long id) {
        for(Track track : tracks) {
            if(track.getId().equals(id)) {return track;}
        }
        return null;
    }
}
