package com.onpe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onpe.model.Total;

@Repository
public interface ITotal extends JpaRepository<Total, Integer> {

	@Query(value="{call sp_getResumen_CordovaManrique}", nativeQuery = true)
	Total getTotal();
}
