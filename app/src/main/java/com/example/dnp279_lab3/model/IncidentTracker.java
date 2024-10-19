package com.example.dnp279_lab3.model;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class IncidentTracker {
    // List to store Incident objects
    private ArrayList<Incident> incidents;

    // Constructor to initialize the incidents list
    public IncidentTracker() {
        this.incidents = new ArrayList<>();
    }

    // Method to load incidents from a CSV file located in the assets folder
    public void loadIncidents(Context context) {
        AssetManager assetManager = context.getAssets();
        String line;

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(assetManager.open("incidents.csv")))) {

            // Read each line from the CSV file
            while ((line = reader.readLine()) != null) {
                // Split the line by commas to extract incident details
                String[] delimiter = line.split(",");
                // Create a new Incident object with the extracted details
                Incident incident = new Incident(
                        delimiter[0], delimiter[1], delimiter[2],
                        delimiter[3], delimiter[4], delimiter[5]
                );
                // Add the Incident object to the incidents list
                incidents.add(incident);
            }
        } catch (IOException e) {
            // Handle any IO exceptions that occur during file reading
            throw new RuntimeException("Error reading incidents.csv", e);
        }
    }

    // Method to retrieve an Incident by its ID or type
    public Incident getIncident(String idOrType) {
        for (Incident incident : incidents) {
            // Check if the incident ID or type matches the provided idOrType
            if (incident.getId().equalsIgnoreCase(idOrType) ||
                    incident.getType().equalsIgnoreCase(idOrType)) {
                return incident;
            }
        }
        // Return null if no matching incident is found
        return null;
    }

    // Method to retrieve all incidents
    public ArrayList<Incident> getAllIncidents() {
        return incidents;
    }
}
