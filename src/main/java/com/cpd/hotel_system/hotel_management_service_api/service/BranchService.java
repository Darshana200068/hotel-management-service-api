package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestBranchDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseBranchDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.BranchPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.HotelPaginateResponseDto;

public interface BranchService {
    public void crate(RequestBranchDto dto);
    public void update(RequestBranchDto dto, String branchId);
    public void delete(String branchId);
    public ResponseBranchDto findById(String branchId);
    public BranchPaginateResponseDto findAllByHotelId(int page, int size,String hotelId, String searchText);
    public BranchPaginateResponseDto findAll(int page, int size, String searchText);
}
