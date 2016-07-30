package org.campagnelab.ANTLR.migration;

/*Generated by MPS */

import jetbrains.mps.lang.migration.runtime.base.MigrationScriptBase;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.core.behavior.PropertyAttribute__BehaviorDescriptor;
import jetbrains.mps.lang.migration.runtime.base.MigrationScriptReference;

public class Move_property_isOptional extends MigrationScriptBase {
  public String getCaption() {
    return "Move_property_isOptional";
  }
  @Override
  public boolean isRerunnable() {
    return false;
  }
  public SNode execute(final SModule m) {
    Iterable<SModel> models = (Iterable<SModel>) m.getModels();
    Iterable<SNode> nodes = Sequence.fromIterable(models).where(new IWhereFilter<SModel>() {
      public boolean accept(SModel model) {
        return !(LanguageAspect.MIGRATION.is(model));
      }
    }).translate(new ITranslator2<SModel, SNode>() {
      public Iterable<SNode> translate(SModel model) {
        return SModelOperations.nodes(model, MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d843L, "org.campagnelab.ANTLR.structure.ParserRuleBlock"));
      }
    });
    Sequence.fromIterable(nodes).visitAll(new IVisitor<SNode>() {
      public void visit(SNode node) {
        SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x797c10c6e517ac38L, 0x797c10c6e517b02cL, "isOptional"), "" + (SPropertyOperations.getBoolean(node, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d843L, 0x631eebe3113c4245L, "isOptional_old"))));
        node.setProperty(MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d843L, 0x631eebe3113c4245L, "isOptional_old"), null);
      }
    });

    Iterable<SNode> attributes = Sequence.fromIterable(models).translate(new ITranslator2<SModel, SNode>() {
      public Iterable<SNode> translate(SModel model) {
        return SModelOperations.nodes(model, MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute"));
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return eq_v0fgub_a0a0a0a0a0a4a2(PropertyAttribute__BehaviorDescriptor.getProperty_id1avfQ4BBzOo.invoke(it), MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d843L, 0x631eebe3113c4245L, "isOptional_old"));
      }
    });
    Sequence.fromIterable(attributes).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        PropertyAttribute__BehaviorDescriptor.setProperty_id6Gg5Klvu8CV.invoke(it, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x797c10c6e517ac38L, 0x797c10c6e517b02cL, "isOptional"));
      }
    });
    return null;
  }
  public MigrationScriptReference getDescriptor() {
    return new MigrationScriptReference(MetaAdapterFactory.getLanguage(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, "org.campagnelab.ANTLR"), 0);
  }

  private static boolean eq_v0fgub_a0a0a0a0a0a4a2(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }
}
