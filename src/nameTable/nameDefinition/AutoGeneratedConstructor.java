package nameTable.nameDefinition;

import nameTable.nameScope.NameScope;
import util.SourceCodeLocation;

/**
 * This class is used as automatically generated default constructor for those classes without any constructor
 * @author Zhou Xiaocong
 * @since 2015��10��2��
 * @version 1.0
 */
public class AutoGeneratedConstructor extends MethodDefinition {

	public AutoGeneratedConstructor(String simpleName, String fullQualifiedName, SourceCodeLocation location,
			NameScope scope, SourceCodeLocation endLocation) {
		super(simpleName, fullQualifiedName, location, scope, endLocation);
		setConstructor();
	}

	@Override
	public boolean isAutoGenerated() {
		return true;
	}
	
	@Override
	public boolean isAbstract() {
		return true;
	}
}