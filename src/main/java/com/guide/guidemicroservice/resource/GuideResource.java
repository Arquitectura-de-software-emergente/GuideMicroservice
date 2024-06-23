package com.guide.guidemicroservice.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GuideResource {
    private int Id;
    private int agencyId;
    private String Name;
    private String Specilization;
    private String Experience;
    private String Certifications;
}
