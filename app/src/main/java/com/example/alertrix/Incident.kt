package com.example.alertrix

data class Incident(
    val id: Int,
    val title: String,
    val description: String,
    val severity: String,
    val reported_at: String // ISO 8601 format
)

val sampleIncidents: MutableList<Incident> = listOf(
    Incident(
        id = 1,
        title = "Power Outage",
        description = "A power outage has been reported in Sector 7.",
        severity = "High",
        reported_at = "2025-04-01T14:30:00Z"
    ),
    Incident(
        id = 2,
        title = "Water Leakage",
        description = "Water leakage detected in Building B, Floor 3.",
        severity = "Medium",
        reported_at = "2025-04-01T15:00:00Z"
    ),
    Incident(
        id = 3,
        title = "Fire Drill",
        description = "Scheduled fire drill at 4 PM in the main lobby.",
        severity = "Low",
        reported_at = "2025-04-01T16:00:00Z"
    )
).toMutableList() 