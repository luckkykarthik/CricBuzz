package com.Cricket.Cricbuzz.Security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Cricket.Cricbuzz.Exception.UserNotFound;
import com.Cricket.Cricbuzz.model.admin;
import com.Cricket.Cricbuzz.repositories.adminRepo;


@Service
public class CustomUserDetailService implements UserDetailsService{
	
	@Autowired
	private adminRepo ap;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		admin user=ap.findByUsername(username).orElseThrow(
				() -> new UserNotFound(String.format("User with Username: %s not found", username)) 
				);
		Set<String> roles=new HashSet<String>();
		roles.add("ROLE_ADMIN");
		return new User(user.getUsername(),user.getPassword(),userAuthorities(roles));
	}
	private Collection<? extends GrantedAuthority> userAuthorities(Set<String> roles){
		return roles.stream().map(
				role->new SimpleGrantedAuthority(role)).collect(Collectors.toList());
	}
}
