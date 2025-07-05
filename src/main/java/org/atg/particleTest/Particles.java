package org.atg.particleTest;

import org.bukkit.Location;

import java.util.UUID;

public class Particles {

    private UUID uuid;
    private Location location;

//    public void Particle(){}

    public void createParticles(UUID uuid, Location location){
        this.uuid = uuid;
        this.location = location;
    }

}
