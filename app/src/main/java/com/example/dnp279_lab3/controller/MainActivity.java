package com.example.dnp279_lab3.controller;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dnp279_lab3.R;
import com.example.dnp279_lab3.model.Incident;
import com.example.dnp279_lab3.model.IncidentTracker;

public class MainActivity extends AppCompatActivity {
    private IncidentTracker tracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the IncidentTracker
        tracker = new IncidentTracker();

        // Load incidents using the app's context
        tracker.loadIncidents(this);

        // Set up buttons for different types of incidents
        Button dataBreachButton = findViewById(R.id.dataBreachButton);
        Button malwareButton = findViewById(R.id.malwareButton);
        Button ddosButton = findViewById(R.id.ddosButton);
        Button ransomwareButton = findViewById(R.id.ransomwareButton);

        // Set click listeners for each button
        dataBreachButton.setOnClickListener(v -> showIncidentInfo("Data Breach"));
        malwareButton.setOnClickListener(v -> showIncidentInfo("Malware"));
        ddosButton.setOnClickListener(v -> showIncidentInfo("DDoS Attack"));
        ransomwareButton.setOnClickListener(v -> showIncidentInfo("Ransomware"));
    }

    // Helper method to show incident information in a Toast
    private void showIncidentInfo(String incidentType) {
        Incident incident = tracker.getIncident(incidentType);
        if (incident != null) {
            Toast.makeText(this, incident.toString(), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Incident not found!", Toast.LENGTH_SHORT).show();
        }
    }
}
