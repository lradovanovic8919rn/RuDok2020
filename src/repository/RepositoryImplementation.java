
package repository;

import core.Repository;

public class RepositoryImplementation implements Repository{

	private Workspace rootWorkspace;
	
	
	
	public Workspace getRootWorkspace() {
		return rootWorkspace;
	}



	public void setRootWorkspace(Workspace rootWorkspace) {
		this.rootWorkspace = rootWorkspace;
	}



	public RepositoryImplementation() {
		rootWorkspace = new Workspace("Workspace");
	}



	@Override
	public Workspace getWorkspace() {
		return rootWorkspace;
	}

}
