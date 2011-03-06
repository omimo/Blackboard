package bb.ontology;

import jade.content.Concept;

public class Box implements Concept {
	
	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	
	public Integer getId()
	{
		return this.Id;
	}
	
	public void setId(Integer id)
	{
		this.Id=id;
	}
	
}
