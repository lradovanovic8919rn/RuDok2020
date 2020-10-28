
package repository;

import core.Repository;

public class RepositoryImplementation implements Repository{

	private Workspace rootWorkspace;
	
	
	
	public RepositoryImplementation(Workspace rootWorkspace) {
		rootWorkspace = new Workspace("Workspace");
	}



	@Override
	public Workspace getWorkspace() {
		return rootWorkspace;
	}

}
