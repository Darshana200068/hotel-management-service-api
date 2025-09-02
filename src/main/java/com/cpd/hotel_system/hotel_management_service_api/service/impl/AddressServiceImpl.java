package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestAddressDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseAddressDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.AddressPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Override
    public void crate(RequestAddressDto dto) {

    }

    @Override
    public void update(RequestAddressDto dto, String addressId) {

    }

    @Override
    public void delete(String addressId) {

    }

    @Override
    public ResponseAddressDto findById(String addressId) {
        return null;
    }

    @Override
    public AddressPaginateResponseDto findAllByBranchId(String branchId) {
        return null;
    }
}
