/**
 */
package com.devepos.adt.base.model.adtbase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see com.devepos.adt.base.model.adtbase.IAdtBaseFactory
 * @model kind="package"
 * @generated
 */
public interface IAdtBasePackage extends EPackage {
  /**
   * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  String eNAME = "adtbase";

  /**
   * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  String eNS_URI = "http://www.devepos.com/adt/base";

  /**
   * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  String eNS_PREFIX = "adtbase";

  /**
   * The singleton instance of the package. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @generated
   */
  IAdtBasePackage eINSTANCE = com.devepos.adt.base.model.adtbase.impl.AdtBasePackage.init();

  /**
   * The meta object id for the
   * '{@link com.devepos.adt.base.model.adtbase.impl.AdtObjRef <em>Adt Obj
   * Ref</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see com.devepos.adt.base.model.adtbase.impl.AdtObjRef
   * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getAdtObjRef()
   * @generated
   */
  int ADT_OBJ_REF = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_OBJ_REF__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_OBJ_REF__NAME = 1;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_OBJ_REF__PACKAGE_NAME = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_OBJ_REF__TYPE = 3;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_OBJ_REF__URI = 4;

  /**
   * The feature id for the '<em><b>Owner</b></em>' attribute. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_OBJ_REF__OWNER = 5;

  /**
   * The feature id for the '<em><b>Tadir Type</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_OBJ_REF__TADIR_TYPE = 6;

  /**
   * The number of structural features of the '<em>Adt Obj Ref</em>' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_OBJ_REF_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Adt Obj Ref</em>' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_OBJ_REF_OPERATION_COUNT = 0;

  /**
   * The meta object id for the
   * '{@link com.devepos.adt.base.model.adtbase.impl.AdtObjRefList <em>Adt Obj Ref
   * List</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see com.devepos.adt.base.model.adtbase.impl.AdtObjRefList
   * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getAdtObjRefList()
   * @generated
   */
  int ADT_OBJ_REF_LIST = 1;

  /**
   * The feature id for the '<em><b>Object References</b></em>' containment
   * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_OBJ_REF_LIST__OBJECT_REFERENCES = 0;

  /**
   * The number of structural features of the '<em>Adt Obj Ref List</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_OBJ_REF_LIST_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Adt Obj Ref List</em>' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_OBJ_REF_LIST_OPERATION_COUNT = 0;

  /**
   * The meta object id for the
   * '{@link com.devepos.adt.base.model.adtbase.impl.User <em>User</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see com.devepos.adt.base.model.adtbase.impl.User
   * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getUser()
   * @generated
   */
  int USER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int USER__NAME = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int USER__TEXT = 1;

  /**
   * The number of structural features of the '<em>User</em>' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int USER_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>User</em>' class. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int USER_OPERATION_COUNT = 0;

  /**
   * The meta object id for the
   * '{@link com.devepos.adt.base.model.adtbase.impl.AdtPluginFeature <em>Adt
   * Plugin Feature</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see com.devepos.adt.base.model.adtbase.impl.AdtPluginFeature
   * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getAdtPluginFeature()
   * @generated
   */
  int ADT_PLUGIN_FEATURE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_PLUGIN_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Endpoint</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_PLUGIN_FEATURE__ENDPOINT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_PLUGIN_FEATURE__TYPE = 2;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_PLUGIN_FEATURE__ENABLED = 3;

  /**
   * The feature id for the '<em><b>Category</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_PLUGIN_FEATURE__CATEGORY = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_PLUGIN_FEATURE__DESCRIPTION = 5;

  /**
   * The number of structural features of the '<em>Adt Plugin Feature</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_PLUGIN_FEATURE_FEATURE_COUNT = 6;

  /**
   * The number of operations of the '<em>Adt Plugin Feature</em>' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_PLUGIN_FEATURE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the
   * '{@link com.devepos.adt.base.model.adtbase.impl.AdtPluginFeatureList <em>Adt
   * Plugin Feature List</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @see com.devepos.adt.base.model.adtbase.impl.AdtPluginFeatureList
   * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getAdtPluginFeatureList()
   * @generated
   */
  int ADT_PLUGIN_FEATURE_LIST = 4;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_PLUGIN_FEATURE_LIST__FEATURES = 0;

  /**
   * The number of structural features of the '<em>Adt Plugin Feature List</em>'
   * class. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_PLUGIN_FEATURE_LIST_FEATURE_COUNT = 1;

  /**
   * The operation id for the '<em>Get Features By Endpoint</em>' operation. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_PLUGIN_FEATURE_LIST___GET_FEATURES_BY_ENDPOINT__STRING = 0;

  /**
   * The number of operations of the '<em>Adt Plugin Feature List</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ADT_PLUGIN_FEATURE_LIST_OPERATION_COUNT = 1;

  /**
   * The meta object id for the
   * '{@link com.devepos.adt.base.model.adtbase.AdtPluginFeatureType <em>Adt
   * Plugin Feature Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @see com.devepos.adt.base.model.adtbase.AdtPluginFeatureType
   * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getAdtPluginFeatureType()
   * @generated
   */
  int ADT_PLUGIN_FEATURE_TYPE = 5;

  /**
   * The meta object id for the
   * '{@link com.devepos.adt.base.model.adtbase.AdtPluginFeatureCategory <em>Adt
   * Plugin Feature Category</em>}' enum. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @see com.devepos.adt.base.model.adtbase.AdtPluginFeatureCategory
   * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getAdtPluginFeatureCategory()
   * @generated
   */
  int ADT_PLUGIN_FEATURE_CATEGORY = 6;

  /**
   * The meta object id for the '<em>IAdt Plugin Features</em>' data type. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @see com.devepos.adt.base.plugin.features.IAdtPluginFeatures
   * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getIAdtPluginFeatures()
   * @generated
   */
  int IADT_PLUGIN_FEATURES = 7;

  /**
   * Returns the meta object for class
   * '{@link com.devepos.adt.base.model.adtbase.IAdtObjRef <em>Adt Obj Ref</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Adt Obj Ref</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtObjRef
   * @generated
   */
  EClass getAdtObjRef();

  /**
   * Returns the meta object for the attribute
   * '{@link com.devepos.adt.base.model.adtbase.IAdtObjRef#getDescription
   * <em>Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtObjRef#getDescription()
   * @see #getAdtObjRef()
   * @generated
   */
  EAttribute getAdtObjRef_Description();

  /**
   * Returns the meta object for the attribute
   * '{@link com.devepos.adt.base.model.adtbase.IAdtObjRef#getName
   * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtObjRef#getName()
   * @see #getAdtObjRef()
   * @generated
   */
  EAttribute getAdtObjRef_Name();

  /**
   * Returns the meta object for the attribute
   * '{@link com.devepos.adt.base.model.adtbase.IAdtObjRef#getPackageName
   * <em>Package Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtObjRef#getPackageName()
   * @see #getAdtObjRef()
   * @generated
   */
  EAttribute getAdtObjRef_PackageName();

  /**
   * Returns the meta object for the attribute
   * '{@link com.devepos.adt.base.model.adtbase.IAdtObjRef#getType
   * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtObjRef#getType()
   * @see #getAdtObjRef()
   * @generated
   */
  EAttribute getAdtObjRef_Type();

  /**
   * Returns the meta object for the attribute
   * '{@link com.devepos.adt.base.model.adtbase.IAdtObjRef#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtObjRef#getUri()
   * @see #getAdtObjRef()
   * @generated
   */
  EAttribute getAdtObjRef_Uri();

  /**
   * Returns the meta object for the attribute
   * '{@link com.devepos.adt.base.model.adtbase.IAdtObjRef#getOwner
   * <em>Owner</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Owner</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtObjRef#getOwner()
   * @see #getAdtObjRef()
   * @generated
   */
  EAttribute getAdtObjRef_Owner();

  /**
   * Returns the meta object for the attribute
   * '{@link com.devepos.adt.base.model.adtbase.IAdtObjRef#getTadirType <em>Tadir
   * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Tadir Type</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtObjRef#getTadirType()
   * @see #getAdtObjRef()
   * @generated
   */
  EAttribute getAdtObjRef_TadirType();

  /**
   * Returns the meta object for class
   * '{@link com.devepos.adt.base.model.adtbase.IAdtObjRefList <em>Adt Obj Ref
   * List</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Adt Obj Ref List</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtObjRefList
   * @generated
   */
  EClass getAdtObjRefList();

  /**
   * Returns the meta object for the containment reference list
   * '{@link com.devepos.adt.base.model.adtbase.IAdtObjRefList#getObjectReferences
   * <em>Object References</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the containment reference list '<em>Object
   *         References</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtObjRefList#getObjectReferences()
   * @see #getAdtObjRefList()
   * @generated
   */
  EReference getAdtObjRefList_ObjectReferences();

  /**
   * Returns the meta object for class
   * '{@link com.devepos.adt.base.model.adtbase.IUser <em>User</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>User</em>'.
   * @see com.devepos.adt.base.model.adtbase.IUser
   * @generated
   */
  EClass getUser();

  /**
   * Returns the meta object for the attribute
   * '{@link com.devepos.adt.base.model.adtbase.IUser#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.devepos.adt.base.model.adtbase.IUser#getName()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_Name();

  /**
   * Returns the meta object for the attribute
   * '{@link com.devepos.adt.base.model.adtbase.IUser#getText <em>Text</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see com.devepos.adt.base.model.adtbase.IUser#getText()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_Text();

  /**
   * Returns the meta object for class
   * '{@link com.devepos.adt.base.model.adtbase.IAdtPluginFeature <em>Adt Plugin
   * Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Adt Plugin Feature</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtPluginFeature
   * @generated
   */
  EClass getAdtPluginFeature();

  /**
   * Returns the meta object for the attribute
   * '{@link com.devepos.adt.base.model.adtbase.IAdtPluginFeature#getName
   * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtPluginFeature#getName()
   * @see #getAdtPluginFeature()
   * @generated
   */
  EAttribute getAdtPluginFeature_Name();

  /**
   * Returns the meta object for the attribute
   * '{@link com.devepos.adt.base.model.adtbase.IAdtPluginFeature#getEndpoint
   * <em>Endpoint</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Endpoint</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtPluginFeature#getEndpoint()
   * @see #getAdtPluginFeature()
   * @generated
   */
  EAttribute getAdtPluginFeature_Endpoint();

  /**
   * Returns the meta object for the attribute
   * '{@link com.devepos.adt.base.model.adtbase.IAdtPluginFeature#getType
   * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtPluginFeature#getType()
   * @see #getAdtPluginFeature()
   * @generated
   */
  EAttribute getAdtPluginFeature_Type();

  /**
   * Returns the meta object for the attribute
   * '{@link com.devepos.adt.base.model.adtbase.IAdtPluginFeature#getDescription
   * <em>Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtPluginFeature#getDescription()
   * @see #getAdtPluginFeature()
   * @generated
   */
  EAttribute getAdtPluginFeature_Description();

  /**
   * Returns the meta object for the attribute
   * '{@link com.devepos.adt.base.model.adtbase.IAdtPluginFeature#isEnabled
   * <em>Enabled</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtPluginFeature#isEnabled()
   * @see #getAdtPluginFeature()
   * @generated
   */
  EAttribute getAdtPluginFeature_Enabled();

  /**
   * Returns the meta object for the attribute
   * '{@link com.devepos.adt.base.model.adtbase.IAdtPluginFeature#getCategory
   * <em>Category</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Category</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtPluginFeature#getCategory()
   * @see #getAdtPluginFeature()
   * @generated
   */
  EAttribute getAdtPluginFeature_Category();

  /**
   * Returns the meta object for class
   * '{@link com.devepos.adt.base.model.adtbase.IAdtPluginFeatureList <em>Adt
   * Plugin Feature List</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Adt Plugin Feature List</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtPluginFeatureList
   * @generated
   */
  EClass getAdtPluginFeatureList();

  /**
   * Returns the meta object for the containment reference list
   * '{@link com.devepos.adt.base.model.adtbase.IAdtPluginFeatureList#getFeatures
   * <em>Features</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the containment reference list
   *         '<em>Features</em>'.
   * @see com.devepos.adt.base.model.adtbase.IAdtPluginFeatureList#getFeatures()
   * @see #getAdtPluginFeatureList()
   * @generated
   */
  EReference getAdtPluginFeatureList_Features();

  /**
   * Returns the meta object for the
   * '{@link com.devepos.adt.base.model.adtbase.IAdtPluginFeatureList#getFeaturesByEndpoint(java.lang.String)
   * <em>Get Features By Endpoint</em>}' operation. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @return the meta object for the '<em>Get Features By Endpoint</em>'
   *         operation.
   * @see com.devepos.adt.base.model.adtbase.IAdtPluginFeatureList#getFeaturesByEndpoint(java.lang.String)
   * @generated
   */
  EOperation getAdtPluginFeatureList__GetFeaturesByEndpoint__String();

  /**
   * Returns the meta object for enum
   * '{@link com.devepos.adt.base.model.adtbase.AdtPluginFeatureType <em>Adt
   * Plugin Feature Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for enum '<em>Adt Plugin Feature Type</em>'.
   * @see com.devepos.adt.base.model.adtbase.AdtPluginFeatureType
   * @generated
   */
  EEnum getAdtPluginFeatureType();

  /**
   * Returns the meta object for enum
   * '{@link com.devepos.adt.base.model.adtbase.AdtPluginFeatureCategory <em>Adt
   * Plugin Feature Category</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for enum '<em>Adt Plugin Feature Category</em>'.
   * @see com.devepos.adt.base.model.adtbase.AdtPluginFeatureCategory
   * @generated
   */
  EEnum getAdtPluginFeatureCategory();

  /**
   * Returns the meta object for data type
   * '{@link com.devepos.adt.base.plugin.features.IAdtPluginFeatures <em>IAdt
   * Plugin Features</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for data type '<em>IAdt Plugin Features</em>'.
   * @see com.devepos.adt.base.plugin.features.IAdtPluginFeatures
   * @model instanceClass="com.devepos.adt.base.plugin.features.IAdtPluginFeatures"
   * @generated
   */
  EDataType getIAdtPluginFeatures();

  /**
   * Returns the factory that creates the instances of the model. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the factory that creates the instances of the model.
   * @generated
   */
  IAdtBaseFactory getAdtBaseFactory();

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each operation of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   *
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the
     * '{@link com.devepos.adt.base.model.adtbase.impl.AdtObjRef <em>Adt Obj
     * Ref</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see com.devepos.adt.base.model.adtbase.impl.AdtObjRef
     * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getAdtObjRef()
     * @generated
     */
    EClass ADT_OBJ_REF = eINSTANCE.getAdtObjRef();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ADT_OBJ_REF__DESCRIPTION = eINSTANCE.getAdtObjRef_Description();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ADT_OBJ_REF__NAME = eINSTANCE.getAdtObjRef_Name();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ADT_OBJ_REF__PACKAGE_NAME = eINSTANCE.getAdtObjRef_PackageName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ADT_OBJ_REF__TYPE = eINSTANCE.getAdtObjRef_Type();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ADT_OBJ_REF__URI = eINSTANCE.getAdtObjRef_Uri();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ADT_OBJ_REF__OWNER = eINSTANCE.getAdtObjRef_Owner();

    /**
     * The meta object literal for the '<em><b>Tadir Type</b></em>' attribute
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ADT_OBJ_REF__TADIR_TYPE = eINSTANCE.getAdtObjRef_TadirType();

    /**
     * The meta object literal for the
     * '{@link com.devepos.adt.base.model.adtbase.impl.AdtObjRefList <em>Adt Obj Ref
     * List</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see com.devepos.adt.base.model.adtbase.impl.AdtObjRefList
     * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getAdtObjRefList()
     * @generated
     */
    EClass ADT_OBJ_REF_LIST = eINSTANCE.getAdtObjRefList();

    /**
     * The meta object literal for the '<em><b>Object References</b></em>'
     * containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    EReference ADT_OBJ_REF_LIST__OBJECT_REFERENCES = eINSTANCE.getAdtObjRefList_ObjectReferences();

    /**
     * The meta object literal for the
     * '{@link com.devepos.adt.base.model.adtbase.impl.User <em>User</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see com.devepos.adt.base.model.adtbase.impl.User
     * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getUser()
     * @generated
     */
    EClass USER = eINSTANCE.getUser();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute USER__NAME = eINSTANCE.getUser_Name();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute USER__TEXT = eINSTANCE.getUser_Text();

    /**
     * The meta object literal for the
     * '{@link com.devepos.adt.base.model.adtbase.impl.AdtPluginFeature <em>Adt
     * Plugin Feature</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see com.devepos.adt.base.model.adtbase.impl.AdtPluginFeature
     * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getAdtPluginFeature()
     * @generated
     */
    EClass ADT_PLUGIN_FEATURE = eINSTANCE.getAdtPluginFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ADT_PLUGIN_FEATURE__NAME = eINSTANCE.getAdtPluginFeature_Name();

    /**
     * The meta object literal for the '<em><b>Endpoint</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ADT_PLUGIN_FEATURE__ENDPOINT = eINSTANCE.getAdtPluginFeature_Endpoint();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ADT_PLUGIN_FEATURE__TYPE = eINSTANCE.getAdtPluginFeature_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ADT_PLUGIN_FEATURE__DESCRIPTION = eINSTANCE.getAdtPluginFeature_Description();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ADT_PLUGIN_FEATURE__ENABLED = eINSTANCE.getAdtPluginFeature_Enabled();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ADT_PLUGIN_FEATURE__CATEGORY = eINSTANCE.getAdtPluginFeature_Category();

    /**
     * The meta object literal for the
     * '{@link com.devepos.adt.base.model.adtbase.impl.AdtPluginFeatureList <em>Adt
     * Plugin Feature List</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see com.devepos.adt.base.model.adtbase.impl.AdtPluginFeatureList
     * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getAdtPluginFeatureList()
     * @generated
     */
    EClass ADT_PLUGIN_FEATURE_LIST = eINSTANCE.getAdtPluginFeatureList();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment
     * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EReference ADT_PLUGIN_FEATURE_LIST__FEATURES = eINSTANCE.getAdtPluginFeatureList_Features();

    /**
     * The meta object literal for the '<em><b>Get Features By Endpoint</b></em>'
     * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EOperation ADT_PLUGIN_FEATURE_LIST___GET_FEATURES_BY_ENDPOINT__STRING = eINSTANCE
        .getAdtPluginFeatureList__GetFeaturesByEndpoint__String();

    /**
     * The meta object literal for the
     * '{@link com.devepos.adt.base.model.adtbase.AdtPluginFeatureType <em>Adt
     * Plugin Feature Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see com.devepos.adt.base.model.adtbase.AdtPluginFeatureType
     * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getAdtPluginFeatureType()
     * @generated
     */
    EEnum ADT_PLUGIN_FEATURE_TYPE = eINSTANCE.getAdtPluginFeatureType();

    /**
     * The meta object literal for the
     * '{@link com.devepos.adt.base.model.adtbase.AdtPluginFeatureCategory <em>Adt
     * Plugin Feature Category</em>}' enum. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see com.devepos.adt.base.model.adtbase.AdtPluginFeatureCategory
     * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getAdtPluginFeatureCategory()
     * @generated
     */
    EEnum ADT_PLUGIN_FEATURE_CATEGORY = eINSTANCE.getAdtPluginFeatureCategory();

    /**
     * The meta object literal for the '<em>IAdt Plugin Features</em>' data type.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see com.devepos.adt.base.plugin.features.IAdtPluginFeatures
     * @see com.devepos.adt.base.model.adtbase.impl.AdtBasePackage#getIAdtPluginFeatures()
     * @generated
     */
    EDataType IADT_PLUGIN_FEATURES = eINSTANCE.getIAdtPluginFeatures();

  }

} // IAdtBasePackage
