package in.nareshit.ajeet.hc.specialization;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import in.nareshit.ajeet.hc.entity.Specialization;
import in.nareshit.ajeet.hc.repo.SpecializationRepository;

@DataJpaTest(showSql=true)
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
//@TestMethodOrder(OrderAnnotation.class)
public class SpecializationRepositoryTest {
	@Autowired
	private SpecializationRepository repo;
	/***
	 * 1. Test Save Operation
	 * ***/
	@Disabled
	@Test
	@Order(1)
	public void testspecCreate() {
		Specialization spec=new Specialization(null,"CRDLS","Cardiologists",
				"They’re experts on the heart and blood vessels");
		Specialization specOutput=repo.save(spec);
		assertNotNull(spec.getId(),"Spec is not Created !!");
		
	}

	/***
	 * 2. Test Display All Operation
	 * ***/
	@Test
	@Order(2)
	public void testspecFetchAll() {
		List<Specialization> list = repo.findAll();
		assertNotNull(list);
		if(list.isEmpty())
		fail("No Data Exist in Database");
	}
	
	}

