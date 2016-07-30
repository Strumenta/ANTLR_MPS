package org.campagnelab.antlr.tomps.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;

public final class ToIntDestination__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x443e8c43ffc0edbfL, "org.campagnelab.antlr.tomps.structure.ToIntDestination");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> name_id2uLbzznpwAh = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("name").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2uLbzznpwAh").registry(REGISTRY).build();
  public static final SMethod<SNode> to_idWSCumwYo$I = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("to").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("WSCumwYo$I").registry(REGISTRY).build();
  public static final SMethod<SNode> type_id5qM9mr9Mqo7 = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("type").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5qM9mr9Mqo7").registry(REGISTRY).build();
  public static final SMethod<SNode> cellModel_id1AEWcuffMHI = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("cellModel").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1AEWcuffMHI").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""));
  public static final SMethod<SNode> textGenAppendPart_id3V2IUSqzmkO = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("textGenAppendPart").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("3V2IUSqzmkO").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(name_id2uLbzznpwAh, to_idWSCumwYo$I, type_id5qM9mr9Mqo7, cellModel_id1AEWcuffMHI, textGenAppendPart_id3V2IUSqzmkO);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String name_id2uLbzznpwAh(@NotNull SNode __thisNode__) {
    return (String) Destination__BehaviorDescriptor.name_id2uLbzznpwAh.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x443e8c43ffc0edbfL, 0x443e8c43ffc0edc0L, "toConvert")));
  }
  /*package*/ static SNode to_idWSCumwYo$I(@NotNull SNode __thisNode__) {
    return (SNode) Destination__BehaviorDescriptor.to_idWSCumwYo$I.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x443e8c43ffc0edbfL, 0x443e8c43ffc0edc0L, "toConvert")));
  }
  /*package*/ static SNode type_id5qM9mr9Mqo7(@NotNull SNode __thisNode__) {
    return _quotation_createNode_ohs6ez_a0a2();
  }
  /*package*/ static SNode cellModel_id1AEWcuffMHI(@NotNull SNode __thisNode__, String cardinality) {
    return Destination__BehaviorDescriptor.cellModel_id1AEWcuffMHI.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x443e8c43ffc0edbfL, 0x443e8c43ffc0edc0L, "toConvert")), cardinality);
  }
  /*package*/ static SNode textGenAppendPart_id3V2IUSqzmkO(@NotNull SNode __thisNode__, String cardinality) {
    return Destination__BehaviorDescriptor.textGenAppendPart_id3V2IUSqzmkO.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x443e8c43ffc0edbfL, 0x443e8c43ffc0edc0L, "toConvert")), cardinality);
  }

  /*package*/ ToIntDestination__BehaviorDescriptor() {
    super(REGISTRY);
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((String) name_id2uLbzznpwAh(node));
      case 1:
        return (T) ((SNode) to_idWSCumwYo$I(node));
      case 2:
        return (T) ((SNode) type_id5qM9mr9Mqo7(node));
      case 3:
        return (T) ((SNode) cellModel_id1AEWcuffMHI(node, (String) parameters[0]));
      case 4:
        return (T) ((SNode) textGenAppendPart_id3V2IUSqzmkO(node, (String) parameters[0]));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }
  private static SNode _quotation_createNode_ohs6ez_a0a2() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d22479L, "jetbrains.mps.baseLanguage.structure.IntegerType"), null, null, false);
    return quotedNode_1;
  }
}
