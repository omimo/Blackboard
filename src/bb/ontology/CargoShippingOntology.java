//the test comment
package bb.ontology;

import jade.content.onto.BasicOntology;
import jade.content.onto.Ontology;
import jade.content.onto.OntologyException;
import jade.content.schema.ConceptSchema;
import jade.content.schema.PrimitiveSchema;

public class CargoShippingOntology extends Ontology {
	private static final long serialVersionUID = 1L;
	
	   public static final String ONTOLOGY_NAME = "Cargo-Shipping-Ontology";
	   
	   // Vocabulary
	   
	   public static final String BOX = "Box";
	   public static final String BOX_ID = "Id";
	   public static final String BOX_WEIGHT = "Weight";
	   
	   public static Ontology theInstance = new CargoShippingOntology();
	   
	   public static Ontology getInstance()
	   {
		   return theInstance;
	   }
	   
	   private CargoShippingOntology()
	   {
		   super(ONTOLOGY_NAME, BasicOntology.getInstance());
		   
		   try {
			   add(new ConceptSchema(BOX),Box.class);
			   
			   ConceptSchema cs = (ConceptSchema) getSchema(BOX);			   
			   cs.add(BOX_ID, (PrimitiveSchema) getSchema(BasicOntology.INTEGER));
			   cs.add(BOX_WEIGHT, (PrimitiveSchema) getSchema(BasicOntology.INTEGER));
		   } catch (OntologyException oe) {
			   oe.printStackTrace();
		   }
		   
	   }
}
