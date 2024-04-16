package com.Cricket.Cricbuzz.Service;

import com.Cricket.Cricbuzz.payload.adminDto;
import com.Cricket.Cricbuzz.payload.registerRespDto;

public interface adminService {
	public registerRespDto createAdmin(adminDto AdminDto);
}
