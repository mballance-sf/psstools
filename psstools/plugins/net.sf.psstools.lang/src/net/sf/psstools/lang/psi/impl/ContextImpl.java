package net.sf.psstools.lang.psi.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.mwe2.language.mwe2.impl.ComponentImplCustom;

import net.sf.psstools.lang.psi.IBinaryExpr;
import net.sf.psstools.lang.psi.IComponent;
import net.sf.psstools.lang.psi.IContext;
import net.sf.psstools.lang.psi.IExpr;
import net.sf.psstools.lang.psi.IPackage;
import net.sf.psstools.lang.psi.ITernaryExpr;
import net.sf.psstools.lang.psi.IUnaryExpr;

public class ContextImpl implements IContext {
	private IPackage			fGlobalPackage;
	private List<IComponent>	fComponentList;
	private List<IPackage>		fPackageList;
	
	public ContextImpl() {
		fGlobalPackage = new PackageImpl(null);
		fComponentList = new ArrayList<IComponent>();
		fPackageList = new ArrayList<IPackage>();
	}

	@Override
	public IPackage get_global_package() {
		return fGlobalPackage;
	}

	@Override
	public IPackage mk_package(String name) {
		return new PackageImpl(name);
	}
	
	public IComponent mk_component(String name, IComponent super_comp) {
		return null;
	}
	
	
	@Override
	public void add_component(IComponent comp) {
		fComponentList.add(comp);
	}

	@Override
	public void add_package(IPackage pkg) {
		fPackageList.add(pkg);
	}

	@Override
	public ITernaryExpr mk_ternary_expr(IExpr cond, IExpr true_e, IExpr false_e) {
		return new TernaryExprImpl(cond, true_e, false_e);
	}

	@Override
	public IBinaryExpr mk_binary_expr(IExpr lhs, IBinaryExpr.Op op, IExpr rhs) {
		return new BinaryExprImpl(lhs, op, rhs);
	}

	@Override
	public IUnaryExpr mk_unary_expr(net.sf.psstools.lang.psi.IUnaryExpr.Op op, IExpr expr) {
		return new UnaryExprImpl(op, expr);
	}
	

	
}
