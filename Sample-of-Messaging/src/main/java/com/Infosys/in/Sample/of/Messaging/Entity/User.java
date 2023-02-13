package com.Infosys.in.Sample.of.Messaging.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NonNull
	private Long userId;
	private String userName;
	private String userCode;
	private String userAddress;

}
