/**
 */
package partialmodel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import partialmodel.util.PartialmodelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PartialmodelItemProviderAdapterFactory extends PartialmodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialmodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link partialmodel.PartialModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialModelItemProvider partialModelItemProvider;

	/**
	 * This creates an adapter for a {@link partialmodel.PartialModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartialModelAdapter() {
		if (partialModelItemProvider == null) {
			partialModelItemProvider = new PartialModelItemProvider(this);
		}

		return partialModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link partialmodel.PSObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSObjectItemProvider psObjectItemProvider;

	/**
	 * This creates an adapter for a {@link partialmodel.PSObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPSObjectAdapter() {
		if (psObjectItemProvider == null) {
			psObjectItemProvider = new PSObjectItemProvider(this);
		}

		return psObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link partialmodel.VarType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarTypeItemProvider varTypeItemProvider;

	/**
	 * This creates an adapter for a {@link partialmodel.VarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVarTypeAdapter() {
		if (varTypeItemProvider == null) {
			varTypeItemProvider = new VarTypeItemProvider(this);
		}

		return varTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link partialmodel.MayType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MayTypeItemProvider mayTypeItemProvider;

	/**
	 * This creates an adapter for a {@link partialmodel.MayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMayTypeAdapter() {
		if (mayTypeItemProvider == null) {
			mayTypeItemProvider = new MayTypeItemProvider(this);
		}

		return mayTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link partialmodel.AbsType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsTypeItemProvider absTypeItemProvider;

	/**
	 * This creates an adapter for a {@link partialmodel.AbsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbsTypeAdapter() {
		if (absTypeItemProvider == null) {
			absTypeItemProvider = new AbsTypeItemProvider(this);
		}

		return absTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link partialmodel.PSString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSStringItemProvider psStringItemProvider;

	/**
	 * This creates an adapter for a {@link partialmodel.PSString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPSStringAdapter() {
		if (psStringItemProvider == null) {
			psStringItemProvider = new PSStringItemProvider(this);
		}

		return psStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link partialmodel.PSInteger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSIntegerItemProvider psIntegerItemProvider;

	/**
	 * This creates an adapter for a {@link partialmodel.PSInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPSIntegerAdapter() {
		if (psIntegerItemProvider == null) {
			psIntegerItemProvider = new PSIntegerItemProvider(this);
		}

		return psIntegerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link partialmodel.PSBoolean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSBooleanItemProvider psBooleanItemProvider;

	/**
	 * This creates an adapter for a {@link partialmodel.PSBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPSBooleanAdapter() {
		if (psBooleanItemProvider == null) {
			psBooleanItemProvider = new PSBooleanItemProvider(this);
		}

		return psBooleanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link partialmodel.PSOtherAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSOtherAttributeItemProvider psOtherAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link partialmodel.PSOtherAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPSOtherAttributeAdapter() {
		if (psOtherAttributeItemProvider == null) {
			psOtherAttributeItemProvider = new PSOtherAttributeItemProvider(this);
		}

		return psOtherAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link partialmodel.PSReferenceToObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSReferenceToObjectItemProvider psReferenceToObjectItemProvider;

	/**
	 * This creates an adapter for a {@link partialmodel.PSReferenceToObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPSReferenceToObjectAdapter() {
		if (psReferenceToObjectItemProvider == null) {
			psReferenceToObjectItemProvider = new PSReferenceToObjectItemProvider(this);
		}

		return psReferenceToObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link partialmodel.PSReferenceToAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSReferenceToAttributeItemProvider psReferenceToAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link partialmodel.PSReferenceToAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPSReferenceToAttributeAdapter() {
		if (psReferenceToAttributeItemProvider == null) {
			psReferenceToAttributeItemProvider = new PSReferenceToAttributeItemProvider(this);
		}

		return psReferenceToAttributeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (partialModelItemProvider != null) partialModelItemProvider.dispose();
		if (psObjectItemProvider != null) psObjectItemProvider.dispose();
		if (varTypeItemProvider != null) varTypeItemProvider.dispose();
		if (mayTypeItemProvider != null) mayTypeItemProvider.dispose();
		if (absTypeItemProvider != null) absTypeItemProvider.dispose();
		if (psStringItemProvider != null) psStringItemProvider.dispose();
		if (psIntegerItemProvider != null) psIntegerItemProvider.dispose();
		if (psBooleanItemProvider != null) psBooleanItemProvider.dispose();
		if (psOtherAttributeItemProvider != null) psOtherAttributeItemProvider.dispose();
		if (psReferenceToObjectItemProvider != null) psReferenceToObjectItemProvider.dispose();
		if (psReferenceToAttributeItemProvider != null) psReferenceToAttributeItemProvider.dispose();
	}

}
