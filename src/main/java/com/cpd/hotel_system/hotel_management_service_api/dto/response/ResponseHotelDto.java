package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import com.cpd.hotel_system.hotel_management_service_api.entity.Branch;
import com.cpd.hotel_system.hotel_management_service_api.entity.Room;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ResponseHotelDto {
    private String hotelId;
    private String hotelName;
    private boolean activesStatus;
    private LocalDateTime createdAt;
    private String description;
    private int starRating;
    private BigDecimal startingAt;
    private LocalDateTime updatedAt;

    private List<ResponseBranchDto> branches;

}
