package net.hex3l.silph.controller.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import net.hex3l.silph.model.data.Photo;

@Component
public class PhotoValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Photo.class.equals(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "albumid", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "imageid", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "imageext", "required"); 
		//Validate album and image as numbers and imageext as png/jpeg
	}
}