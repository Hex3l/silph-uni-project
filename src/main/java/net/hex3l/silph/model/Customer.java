package net.hex3l.silph.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter
	private Long id;
	@Getter @Setter
	private String firstName;
	@Getter @Setter
	private String lastName;
	@Getter @Setter
	private String mail;
	@Transient
	@Setter @Getter
	private UsageRequest usageRequest;
}
