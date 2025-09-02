package com.cpd.hotel_system.hotel_management_service_api.dto.response;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseFacilityDto {
    private long id;
    private String name;

    private String roomId;
}
