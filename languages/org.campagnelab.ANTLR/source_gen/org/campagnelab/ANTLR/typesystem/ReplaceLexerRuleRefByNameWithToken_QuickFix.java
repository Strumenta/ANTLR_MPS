package org.campagnelab.ANTLR.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.campagnelab.ANTLR.behavior.HasOptionalParams__BehaviorDescriptor;

public class ReplaceLexerRuleRefByNameWithToken_QuickFix extends QuickFix_Runtime {
  public ReplaceLexerRuleRefByNameWithToken_QuickFix() {
    super(new SNodePointer("r:605281ab-5c41-4f2b-8300-326aa196a028(org.campagnelab.ANTLR.typesystem)", "558881339884319081"));
  }
  public String getDescription(SNode node) {
    return "Replace LexerRuleRef by Name with Token";
  }
  public void execute(SNode node) {
    SNode tokenRef = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x7c18b9e172f3f03L, "org.campagnelab.ANTLR.structure.TokenRef")));
    SLinkOperations.setTarget(tokenRef, MetaAdapterFactory.getReferenceLink(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x7c18b9e172f3f03L, 0x7c18b9e172f3f04L, "token"), ((SNode) ReplaceLexerRuleRefByNameWithToken_QuickFix.this.getField("token")[0]));
    HasOptionalParams__BehaviorDescriptor.setParams_id4L89IP4ZWUV.invoke(tokenRef, ((SNode) ReplaceLexerRuleRefByNameWithToken_QuickFix.this.getField("refByName")[0]));
    SNodeOperations.replaceWithAnother(node, tokenRef);
  }
}
