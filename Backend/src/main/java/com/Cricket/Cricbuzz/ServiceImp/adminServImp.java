package com.Cricket.Cricbuzz.ServiceImp;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Cricket.Cricbuzz.Exception.emailAlreadyExists;
import com.Cricket.Cricbuzz.Service.adminService;
import com.Cricket.Cricbuzz.model.admin;
import com.Cricket.Cricbuzz.payload.adminDto;
import com.Cricket.Cricbuzz.payload.registerRespDto;
import com.Cricket.Cricbuzz.repositories.adminRepo;


@Service
public class adminServImp implements adminService{
	
	@Autowired
	private adminRepo Ap;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public registerRespDto createAdmin(adminDto AdminDto) {
		try {
			AdminDto.setPassword(passwordEncoder.encode(AdminDto.getPassword()));
		
			admin Admin=modelMapper.map(AdminDto, admin.class);
			admin savedAdmin=Ap.save(Admin);
			registerRespDto rrd=new registerRespDto();
			rrd.setId(savedAdmin.getId());
			rrd.setStatus("Admin account succesfully created");
			rrd.setStatus_code(200);
			return rrd;
		}catch(Exception e) {
			throw new emailAlreadyExists("Email already Exists");
		}
	}

}
