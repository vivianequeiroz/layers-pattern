package com.vivianequeiroz.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vivianequeiroz.dto.UserDTO;
import com.vivianequeiroz.entities.User;
import com.vivianequeiroz.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		User entity = userRepository.findById(id).get();
		UserDTO userDTO = new UserDTO(entity);

		return userDTO;
	}
}
