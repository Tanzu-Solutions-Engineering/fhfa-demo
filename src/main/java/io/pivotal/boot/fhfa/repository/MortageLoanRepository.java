package io.pivotal.boot.fhfa.repository;

import java.util.List;

import io.pivotal.boot.fhfa.domain.MortgageLoan;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Vinicius Carvalho
 */
@RepositoryRestResource(path = "mortgages")
public interface MortageLoanRepository extends PagingAndSortingRepository<MortgageLoan,Integer>{

	@Query(nativeQuery = true, value = "SELECT SellSt, avg(Income) as total from ama_pudb_export_123114 group by SellSt order by total DESC")
	public List<Object[]> averageIncomePerState();

	@Query(nativeQuery = true, value = "SELECT SellSt, avg(Amount) as total from ama_pudb_export_123114 group by SellSt order by total DESC")
	public List<Object[]> averageAmountPerState();

}
