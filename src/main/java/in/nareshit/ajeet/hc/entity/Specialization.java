package in.nareshit.ajeet.hc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Specialization_tab")
public class Specialization {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Spec_id_col")
	private Long id;

	
	@Column(name="Spec_code_col")
	private String specCode;
	
	@Column(name="Spec_name_col")
	private String specName;
	
	@Column(name="Spec_note_col")
	private String specNote;
	

}
