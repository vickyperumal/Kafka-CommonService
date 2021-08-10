package com.kafka.common.model;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ServiceResponse<T> {
	
	
	T body;
	int status;
	
	public ServiceResponse() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServiceResponse<T> other = (ServiceResponse<T>) obj;
		return Objects.equals(body, other.body) && status == other.status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(body, status);
	}
}
