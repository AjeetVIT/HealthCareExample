package in.nareshit.ajeet.hc.service;

import java.util.List;

import in.nareshit.ajeet.hc.entity.Specialization;

public interface ISpecializationService {
	public long saveSpecialization(Specialization spec);
	public List<Specialization> getAllSpecializations();
	public void removeSpecialization(Long id);
	public Specialization getOneSpecialization(Long id);
	public void updateSpecialization(Specialization spec);

}
