package com.lune.calculation_example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class GuestDataRepository implements DataRepository {

	@Override
	public int[] retrieveData() {
		return new int[] { 1, 2, 3, 4, 5 };
	}

}
