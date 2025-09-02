package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseAddressDto {
    private String addressId;
    private String addressLine;
    private String city;
    private String country;
    private BigDecimal latitude;
    private BigDecimal longitude;

    private String branchId;
}
