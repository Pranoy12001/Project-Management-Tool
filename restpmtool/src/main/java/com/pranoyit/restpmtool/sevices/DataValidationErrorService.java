package com.pranoyit.restpmtool.sevices;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import java.util.Map;

public interface DataValidationErrorService {
    public ResponseEntity<Map> getDataValidationErrors(BindingResult result);
}
