package hu.bme.mit.pdeim.partialmodel.design.helpers;

import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import partialmodel.*;


public class PartialitySolver implements IExternalJavaAction {

	
	@Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		EObject source = (EObject) parameters.get("parent");
//		PartialmodelFactory p = PartialmodelFactory.eINSTANCE;
		EcoreUtil.delete(source);
    }

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

}
