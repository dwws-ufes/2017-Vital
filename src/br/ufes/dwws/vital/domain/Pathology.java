package br.ufes.dwws.vital.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

@Entity
public class Pathology extends PersistentObjectSupport {

	private static final long serialVersionUID = 1L;

	@NotNull
	private String name;

	@Lob
	@NotNull
	private String description;

	@OneToMany(mappedBy = "pathology")
	private Set<Diagnosis> diagnostics;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Diagnosis> getDiagnostics() {
		return diagnostics;
	}

	public void setDiagnostics(Set<Diagnosis> diagnostics) {
		this.diagnostics = diagnostics;
	}

}
