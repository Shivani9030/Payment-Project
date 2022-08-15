package tech.keshav.payment.paymentproject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
	 public AuthResponse(String generateToken) {
		// TODO Auto-generated constructor stub
	}

	String jwt;
	}